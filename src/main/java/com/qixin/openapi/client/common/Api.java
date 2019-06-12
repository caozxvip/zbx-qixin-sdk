package com.qixin.openapi.client.common;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Api {
    String value() default "";
}
