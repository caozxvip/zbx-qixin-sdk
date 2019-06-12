package com.qixin.openapi.client.common;

import java.lang.reflect.*;
import com.qixin.openapi.model.common.*;
import com.qixin.openapi.conf.*;
import com.huize.qixin.api.util.*;
import com.qixin.openapi.util.*;
import com.fasterxml.jackson.databind.*;

public class RemoteInvoker
{
    private static final ObjectMapper objectMapper;
    
    public static <T> CommonResult<T> invoke(final Type returnType, final String api, final Object obj) {
        RemoteInvoker.objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        String qxUrl = Configure.Request.baseUrl + api;
        try {
            String requestBody = RemoteInvoker.objectMapper.writeValueAsString(obj);
            System.out.println("\u8bf7\u6c42\u53c2\u6570\uff1a" + requestBody);
            requestBody = new String(requestBody.getBytes("UTF-8"), "UTF-8");
            qxUrl = sign(qxUrl, requestBody);
            System.out.println("\u8bf7\u6c42url\u4e3a\uff1a" + qxUrl);
            final String httpResult = HttpUtil.post(qxUrl, requestBody);
            if (httpResult.equals("error")) {
                throw new RuntimeException("\u8c03\u7528\u670d\u52a1\u5931\u8d25");
            }
            final CommonResult<T> res = (CommonResult<T>)RemoteInvoker.objectMapper.readValue(httpResult.toString(), getResponseType(returnType));
            return res;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    private static String sign(String api, String body) {
        if (Configure.Channel.channelKey == null) {
            throw new RuntimeException("\u8bf7\u5148\u914d\u7f6e\u6e20\u9053\u5bc6\u94a5:" + Configure.Channel.class + "#channelKey");
        }
        body = Configure.Channel.channelKey + body;
        final String sign = Md5Utils.getUtf8MD5String(body);
        api = api + "?sign=" + sign;
        return api;
    }
    
    private static JavaType getResponseType(final Type type) {
        return RemoteInvoker.objectMapper.getTypeFactory().constructType(type);
    }
    
    static {
        objectMapper = new ObjectMapper();
    }
}
