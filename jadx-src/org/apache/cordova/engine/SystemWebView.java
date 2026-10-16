package org.apache.cordova.engine;

import N0.t;
import O0.d;
import O0.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public class SystemWebView extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public f f2560a;

    /* renamed from: b, reason: collision with root package name */
    public d f2561b;

    /* renamed from: c, reason: collision with root package name */
    public SystemWebViewEngine f2562c;

    public SystemWebView(Context context) {
        this(context, null);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean boolOnDispatchKeyEvent = this.f2562c.f2566e.onDispatchKeyEvent(keyEvent);
        return boolOnDispatchKeyEvent != null ? boolOnDispatchKeyEvent.booleanValue() : super.dispatchKeyEvent(keyEvent);
    }

    public t getCordovaWebView() {
        SystemWebViewEngine systemWebViewEngine = this.f2562c;
        if (systemWebViewEngine != null) {
            return systemWebViewEngine.getCordovaWebView();
        }
        return null;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f2561b = (d) webChromeClient;
        super.setWebChromeClient(webChromeClient);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        this.f2560a = (f) webViewClient;
        super.setWebViewClient(webViewClient);
    }

    public SystemWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
