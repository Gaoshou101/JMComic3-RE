package c0;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC0095b {
    String name() default "";

    c[] permissions() default {};

    int[] requestCodes() default {};
}
