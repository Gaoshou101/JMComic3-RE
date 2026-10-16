package com.getcapacitor.cordova;

import L.c;
import N0.C;
import N0.E;
import N0.F;
import N0.H;
import N0.I;
import N0.K;
import N0.L;
import N0.m;
import N0.q;
import N0.s;
import N0.t;
import N0.v;
import Q.d;
import Q.h;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.emoji2.text.k;
import com.getcapacitor.C0097b;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class MockCordovaWebViewImpl implements t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1396a;

    /* renamed from: b, reason: collision with root package name */
    public K f1397b;

    /* renamed from: c, reason: collision with root package name */
    public q f1398c;
    public s d;

    /* renamed from: e, reason: collision with root package name */
    public H f1399e;

    /* renamed from: f, reason: collision with root package name */
    public m f1400f;

    /* renamed from: g, reason: collision with root package name */
    public c f1401g;
    public WebView h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1402i;

    public static class CapacitorEvalBridgeMode extends E {

        /* renamed from: a, reason: collision with root package name */
        public final WebView f1403a;

        /* renamed from: b, reason: collision with root package name */
        public final m f1404b;

        public CapacitorEvalBridgeMode(WebView webView, m mVar) {
            this.f1403a = webView;
            this.f1404b = mVar;
        }

        @Override // N0.E
        public void onNativeToJsMessageAvailable(H h) {
            this.f1404b.getActivity().runOnUiThread(new h(this, 5, h));
        }
    }

    public MockCordovaWebViewImpl(Context context) {
        this.f1396a = context;
    }

    @Override // N0.t
    public boolean backHistory() {
        return false;
    }

    public boolean canGoBack() {
        return false;
    }

    @Override // N0.t
    public void clearCache() {
    }

    @Override // N0.t
    public void clearHistory() {
    }

    public void eval(String str, ValueCallback<String> valueCallback) {
        new Handler(this.f1396a.getMainLooper()).post(new k(this, str, valueCallback, 2));
    }

    @Override // N0.t
    public Context getContext() {
        return this.h.getContext();
    }

    public C getCookieManager() {
        return this.f1401g;
    }

    public v getEngine() {
        return null;
    }

    @Override // N0.t
    public K getPluginManager() {
        return this.f1397b;
    }

    @Override // N0.t
    public q getPreferences() {
        return this.f1398c;
    }

    public s getResourceApi() {
        return this.d;
    }

    public String getUrl() {
        return this.h.getUrl();
    }

    public View getView() {
        return this.h;
    }

    @Override // N0.t
    public void handleDestroy() {
        if (isInitialized()) {
            this.f1397b.e();
        }
    }

    @Override // N0.t
    public void handlePause(boolean z2) {
        if (isInitialized()) {
            this.f1402i = true;
            this.f1397b.g(z2);
            triggerDocumentEvent("pause");
            if (z2) {
                return;
            }
            setPaused(true);
        }
    }

    @Override // N0.t
    public void handleResume(boolean z2) {
        if (isInitialized()) {
            setPaused(false);
            this.f1397b.h(z2);
            if (this.f1402i) {
                triggerDocumentEvent("resume");
            }
        }
    }

    @Override // N0.t
    public void handleStart() {
        if (isInitialized()) {
            this.f1397b.i();
        }
    }

    @Override // N0.t
    public void handleStop() {
        if (isInitialized()) {
            this.f1397b.j();
        }
    }

    @Override // N0.t
    @Deprecated
    public void hideCustomView() {
    }

    public void init(m mVar, List<I> list, q qVar) {
        this.f1400f = mVar;
        this.f1398c = qVar;
        K k2 = new K(this, this.f1400f, list);
        this.f1397b = k2;
        this.d = new s(this.f1396a, k2);
        this.f1397b.d();
    }

    @Override // N0.t
    public boolean isButtonPlumbedToJs(int i2) {
        return false;
    }

    @Deprecated
    public boolean isCustomViewShowing() {
        return false;
    }

    public boolean isInitialized() {
        return this.f1400f != null;
    }

    public void loadUrl(String str) {
        loadUrlIntoView(str, true);
    }

    public void loadUrlIntoView(String str, boolean z2) {
        if (str.equals("about:blank") || str.startsWith("javascript:")) {
            this.h.loadUrl(str);
        }
    }

    @Override // N0.t
    public void onNewIntent(Intent intent) {
        K k2 = this.f1397b;
        if (k2 != null) {
            k2.f(intent);
        }
    }

    public Object postMessage(String str, Object obj) {
        return this.f1397b.k(str, obj);
    }

    @Deprecated
    public void sendJavascript(String str) {
        H h = this.f1399e;
        h.getClass();
        h.b(new F(str));
    }

    @Override // N0.t
    public void sendPluginResult(L l2, String str) {
        this.f1399e.a(l2, str);
    }

    @Override // N0.t
    public void setButtonPlumbedToJs(int i2, boolean z2) {
    }

    public void setPaused(boolean z2) {
        if (z2) {
            this.h.onPause();
            this.h.pauseTimers();
        } else {
            this.h.onResume();
            this.h.resumeTimers();
        }
    }

    @Override // N0.t
    @Deprecated
    public void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    @Override // N0.t
    public void showWebPage(String str, boolean z2, boolean z3, Map<String, Object> map) {
    }

    public void stopLoading() {
    }

    public void triggerDocumentEvent(String str) {
        eval(d.a("window.Capacitor.triggerEvent('", str, "', 'document');"), new C0097b());
    }

    @Deprecated
    public void clearCache(boolean z2) {
    }

    public void init(m mVar, List<I> list, q qVar, WebView webView) {
        this.f1400f = mVar;
        this.h = webView;
        this.f1398c = qVar;
        K k2 = new K(this, this.f1400f, list);
        this.f1397b = k2;
        this.d = new s(this.f1396a, k2);
        H h = new H();
        this.f1399e = h;
        h.f478c.add(new CapacitorEvalBridgeMode(webView, this.f1400f));
        this.f1399e.f(0);
        c cVar = new c(15);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        this.f1401g = cVar;
        this.f1397b.d();
    }
}
