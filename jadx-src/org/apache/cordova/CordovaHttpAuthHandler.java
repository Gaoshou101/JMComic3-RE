package org.apache.cordova;

import N0.D;
import android.webkit.HttpAuthHandler;

/* loaded from: classes.dex */
public class CordovaHttpAuthHandler implements D {

    /* renamed from: a, reason: collision with root package name */
    public final HttpAuthHandler f2524a;

    public CordovaHttpAuthHandler(HttpAuthHandler httpAuthHandler) {
        this.f2524a = httpAuthHandler;
    }

    public void cancel() {
        this.f2524a.cancel();
    }

    public void proceed(String str, String str2) {
        this.f2524a.proceed(str, str2);
    }
}
