package com.huize.qixin.api.util;

import java.util.Collection;

public class CollectionUtils
{
    public static boolean isNullAndEmpty(final Collection<?> c) {
        return null == c || c.isEmpty();
    }
    
    public static boolean isNotNullAndEmpty(final Collection<?> c) {
        return !isNullAndEmpty(c);
    }
}
