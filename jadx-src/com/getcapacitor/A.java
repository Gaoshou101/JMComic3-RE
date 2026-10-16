package com.getcapacitor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface A {
    String name() default "";

    int permissionRequestCode() default 9000;

    String[] permissions() default {};

    int[] requestCodes() default {};
}
