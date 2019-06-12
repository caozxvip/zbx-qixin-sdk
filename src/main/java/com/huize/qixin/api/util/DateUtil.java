package com.huize.qixin.api.util;

import java.text.*;
import java.util.*;

public class DateUtil
{
    private static final Object locker;
    private static Map<String, ThreadLocal<SimpleDateFormat>> formaterMap;
    private static final String date_time_pattern = "yyyy-MM-dd HH:mm:ss";
    
    private static SimpleDateFormat getFormater(final String pattern) {
        ThreadLocal<SimpleDateFormat> formaterLocalMap = DateUtil.formaterMap.get(pattern);
        if (formaterLocalMap == null) {
            synchronized (DateUtil.locker) {
                formaterLocalMap = new ThreadLocal<SimpleDateFormat>() {
                    @Override
                    protected SimpleDateFormat initialValue() {
                        return new SimpleDateFormat(pattern);
                    }
                };
                DateUtil.formaterMap.put(pattern, formaterLocalMap);
            }
        }
        final SimpleDateFormat sdf = formaterLocalMap.get();
        System.out.println(sdf);
        return sdf;
    }
    
    public static String format(final String pattern, final Date value) {
        return getFormater(pattern).format(value);
    }
    
    public static Date parse(final String pattern, final String value) throws ParseException {
        return getFormater(pattern).parse(value);
    }
    
    public static String dateTimeFormat(final Date date) {
        return format("yyyy-MM-dd HH:mm:ss", date);
    }
    
    public static Date dateTimeParse(final String value) throws ParseException {
        return parse("yyyy-MM-dd HH:mm:ss", value);
    }
    
    static {
        locker = new Object();
        DateUtil.formaterMap = new HashMap<String, ThreadLocal<SimpleDateFormat>>();
    }
}
