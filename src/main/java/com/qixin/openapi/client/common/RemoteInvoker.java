package com.qixin.openapi.client.common;

import com.fasterxml.jackson.databind.JavaType;
import com.qixin.openapi.util.Md5Utils;
import com.huize.qixin.api.util.HttpUtil;
import com.qixin.openapi.conf.Configure;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.qixin.openapi.model.common.CommonResult;
import java.lang.reflect.Type;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RemoteInvoker
{
    private static final ObjectMapper objectMapper;
    
    public static <T> CommonResult<T> invoke(final Type returnType, final String api, final Object obj) {
        RemoteInvoker.objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        String qxUrl = Configure.Request.baseUrl + api;
        try {
            String requestBody = RemoteInvoker.objectMapper.writeValueAsString(obj);
            System.out.println("请求参数：" + requestBody);
            requestBody = new String(requestBody.getBytes("UTF-8"), "UTF-8");
            qxUrl = sign(qxUrl, requestBody);
            System.out.println("请求url为：" + qxUrl);
            final String httpResult = HttpUtil.post(qxUrl, requestBody);
            if (httpResult.equals("error")) {
                throw new RuntimeException("调用服务失败");
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
            throw new RuntimeException("请先配置渠道密钥:" + Configure.Channel.class + "#channelKey");
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
