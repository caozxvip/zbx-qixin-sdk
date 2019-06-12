package com.huize.qixin.api.common;

public class HttpCommon
{
    public class HttpMimeType
    {
        public static final String APPLICATION_FORM_URLENCODED_VALUE = "application/x-www-form-urlencoded";
        public static final String APPLICATION_JSON_VALUE = "application/json";
        public static final String APPLICATION_OCTET_STREAM_VALUE = "application/octet-stream";
        public static final String APPLICATION_XHTML_XML_VALUE = "application/xhtml+xml";
        public static final String APPLICATION_XML_VALUE = "application/xml";
    }
    
    public class HttpTimeOut
    {
        public static final int DEF_CONNECTIMEOUT = 40000;
        public static final int DEF_READTIMEOUT = 50000;
    }
    
    public class HttpOther
    {
        public static final String DEF_ERROE = "error";
    }
}
