package com.getcapacitor;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* renamed from: com.getcapacitor.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099d extends ServiceWorkerClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0101f f1405a;

    public C0099d(C0101f c0101f) {
        this.f1405a = c0101f;
    }

    public final WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f1405a.f1413c.f(webResourceRequest);
    }
}
