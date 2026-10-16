package org.apache.cordova.engine;

import L.c;
import N0.A;
import N0.C;
import N0.C0056g;
import N0.H;
import N0.K;
import N0.m;
import N0.q;
import N0.s;
import N0.t;
import N0.u;
import N0.v;
import O0.a;
import O0.d;
import O0.f;
import X.i;
import android.app.AlertDialog;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import org.apache.cordova.NativeToJsMessageQueue$EvalBridgeMode;
import org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode;

/* loaded from: classes.dex */
public class SystemWebViewEngine implements v {
    public static final String TAG = "SystemWebViewEngine";

    /* renamed from: a, reason: collision with root package name */
    public final SystemWebView f2563a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2564b;

    /* renamed from: c, reason: collision with root package name */
    public q f2565c;
    public C0056g d;

    /* renamed from: e, reason: collision with root package name */
    public u f2566e;

    /* renamed from: f, reason: collision with root package name */
    public t f2567f;

    /* renamed from: g, reason: collision with root package name */
    public m f2568g;
    public K h;

    /* renamed from: i, reason: collision with root package name */
    public s f2569i;

    /* renamed from: j, reason: collision with root package name */
    public A f2570j;

    public SystemWebViewEngine(Context context, q qVar) {
        this(new SystemWebView(context), qVar);
    }

    @Override // N0.v
    public boolean canGoBack() {
        return this.f2563a.canGoBack();
    }

    @Override // N0.v
    public void clearCache() {
        this.f2563a.clearCache(true);
    }

    @Override // N0.v
    public void clearHistory() {
        this.f2563a.clearHistory();
    }

    @Override // N0.v
    public void destroy() {
        SystemWebView systemWebView = this.f2563a;
        AlertDialog alertDialog = (AlertDialog) systemWebView.f2561b.d.f20c;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
        systemWebView.destroy();
        if (this.f2570j != null) {
            try {
                systemWebView.getContext().unregisterReceiver(this.f2570j);
            } catch (Exception e2) {
                Log.e(TAG, "Error unregistering configuration receiver: " + e2.getMessage(), e2);
            }
        }
    }

    @Override // N0.v
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.f2563a.evaluateJavascript(str, valueCallback);
    }

    @Override // N0.v
    public C getCookieManager() {
        return this.f2564b;
    }

    public t getCordovaWebView() {
        return this.f2567f;
    }

    @Override // N0.v
    public String getUrl() {
        return this.f2563a.getUrl();
    }

    @Override // N0.v
    public View getView() {
        return this.f2563a;
    }

    @Override // N0.v
    public boolean goBack() {
        SystemWebView systemWebView = this.f2563a;
        if (!systemWebView.canGoBack()) {
            return false;
        }
        systemWebView.goBack();
        return true;
    }

    @Override // N0.v
    public void init(t tVar, m mVar, u uVar, s sVar, K k2, H h) {
        if (this.f2568g != null) {
            throw new IllegalStateException();
        }
        if (this.f2565c == null) {
            this.f2565c = tVar.getPreferences();
        }
        this.f2567f = tVar;
        this.f2568g = mVar;
        this.f2566e = uVar;
        this.f2569i = sVar;
        this.h = k2;
        SystemWebView systemWebView = this.f2563a;
        systemWebView.f2562c = this;
        if (systemWebView.f2560a == null) {
            systemWebView.setWebViewClient(new f(this));
        }
        if (systemWebView.f2561b == null) {
            systemWebView.setWebChromeClient(new d(this));
        }
        SystemWebView systemWebView2 = this.f2563a;
        systemWebView2.setInitialScale(0);
        systemWebView2.setVerticalScrollBarEnabled(false);
        WebSettings settings = systemWebView2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        String str = Build.MANUFACTURER;
        settings.setSaveFormData(false);
        if (this.f2565c.a("AndroidInsecureFileModeEnabled", false)) {
            settings.setAllowFileAccess(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        String path = systemWebView2.getContext().getApplicationContext().getDir("database", 0).getPath();
        settings.setDatabaseEnabled(true);
        if ((systemWebView2.getContext().getApplicationContext().getApplicationInfo().flags & 2) != 0) {
            try {
                WebView.setWebContentsDebuggingEnabled(true);
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        }
        settings.setGeolocationDatabasePath(path);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(true);
        String userAgentString = settings.getUserAgentString();
        String strB = this.f2565c.b("OverrideUserAgent", null);
        if (strB != null) {
            settings.setUserAgentString(strB);
        } else {
            String strB2 = this.f2565c.b("AppendUserAgent", null);
            if (strB2 != null) {
                settings.setUserAgentString(userAgentString + " " + strB2);
            }
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        if (this.f2570j == null) {
            this.f2570j = new A(1, settings);
            systemWebView2.getContext().registerReceiver(this.f2570j, intentFilter);
        }
        h.f478c.add(new NativeToJsMessageQueue$OnlineEventsBridgeMode(new i(11, this)));
        h.f478c.add(new NativeToJsMessageQueue$EvalBridgeMode(this, mVar));
        C0056g c0056g = new C0056g();
        c0056g.f509c = -1;
        c0056g.f507a = k2;
        c0056g.f508b = h;
        this.d = c0056g;
        this.f2563a.addJavascriptInterface(new a(c0056g), "_cordovaNative");
    }

    @Override // N0.v
    public void loadUrl(String str, boolean z2) {
        this.f2563a.loadUrl(str);
    }

    @Override // N0.v
    public void setPaused(boolean z2) {
        SystemWebView systemWebView = this.f2563a;
        if (z2) {
            systemWebView.onPause();
            systemWebView.pauseTimers();
        } else {
            systemWebView.onResume();
            systemWebView.resumeTimers();
        }
    }

    public void stopLoading() {
        this.f2563a.stopLoading();
    }

    public SystemWebViewEngine(SystemWebView systemWebView) {
        this(systemWebView, (q) null);
    }

    public SystemWebViewEngine(SystemWebView systemWebView, q qVar) {
        this.f2565c = qVar;
        this.f2563a = systemWebView;
        this.f2564b = new c(systemWebView);
    }
}
