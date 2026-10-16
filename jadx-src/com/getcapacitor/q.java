package com.getcapacitor;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class q extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final C0101f f1458a;

    public q(C0101f c0101f) {
        this.f1458a = c0101f;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C0101f c0101f = this.f1458a;
        if (c0101f.f1410A == null || webView.getProgress() != 100) {
            return;
        }
        Iterator it = c0101f.f1410A.iterator();
        if (it.hasNext()) {
            throw androidx.fragment.app.x.a(it);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C0101f c0101f = this.f1458a;
        c0101f.getClass();
        c0101f.f1431w = new HashMap();
        Iterator it = c0101f.f1430v.values().iterator();
        while (it.hasNext()) {
            ((G) it.next()).f1371e.removeAllListeners();
        }
        ArrayList arrayList = c0101f.f1410A;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw androidx.fragment.app.x.a(it2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C0101f c0101f = this.f1458a;
        ArrayList arrayList = c0101f.f1410A;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw androidx.fragment.app.x.a(it);
            }
        }
        String strA = c0101f.a();
        if (strA == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        webView.loadUrl(strA);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C0101f c0101f = this.f1458a;
        ArrayList arrayList = c0101f.f1410A;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw androidx.fragment.app.x.a(it);
            }
        }
        String strA = c0101f.a();
        if (strA == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        webView.loadUrl(strA);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        ArrayList arrayList = this.f1458a.f1410A;
        if (arrayList == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw androidx.fragment.app.x.a(it);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f1458a.f1413c.f(webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f1458a.c(webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f1458a.c(Uri.parse(str));
    }
}
