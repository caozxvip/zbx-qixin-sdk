package com.qixin.openapi.conf;

public class Configure
{
    public static class Channel
    {
        public static Integer partnerId;
        public static String channelKey;
        
        static {
            Channel.partnerId = 5214;
            Channel.channelKey = "5214^*#%";
        }
    }
    
    public static class Request
    {
        public static String baseUrl;
        
        static {
            Request.baseUrl = "https://tuneapi.qixin18.com/api/";
        }
    }
}
