package org.apache.cordova;

import N0.C;
import N0.E;
import N0.F;
import N0.H;
import N0.I;
import N0.K;
import N0.L;
import N0.m;
import N0.o;
import N0.q;
import N0.s;
import N0.t;
import N0.u;
import N0.v;
import N0.w;
import N0.x;
import N0.y;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.cordova.engine.SystemWebViewEngine;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CordovaWebViewImpl implements t {
    public static final String TAG = "CordovaWebViewImpl";

    /* renamed from: a, reason: collision with root package name */
    public K f2533a;

    /* renamed from: b, reason: collision with root package name */
    public final v f2534b;

    /* renamed from: c, reason: collision with root package name */
    public m f2535c;

    /* renamed from: e, reason: collision with root package name */
    public s f2536e;

    /* renamed from: f, reason: collision with root package name */
    public q f2537f;

    /* renamed from: g, reason: collision with root package name */
    public CoreAndroid f2538g;
    public H h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2540j;

    /* renamed from: k, reason: collision with root package name */
    public String f2541k;

    /* renamed from: l, reason: collision with root package name */
    public y f2542l;

    /* renamed from: m, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f2543m;
    public int d = 0;

    /* renamed from: i, reason: collision with root package name */
    public final EngineClient f2539i = new EngineClient();

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f2544n = new HashSet();

    public class EngineClient implements u {
        public EngineClient() {
        }

        @Override // N0.u
        public void clearLoadTimeoutTimer() {
            CordovaWebViewImpl.this.d++;
        }

        @Override // N0.u
        public Boolean onDispatchKeyEvent(KeyEvent keyEvent) {
            int keyCode = keyEvent.getKeyCode();
            boolean z2 = keyCode == 4;
            int action = keyEvent.getAction();
            CordovaWebViewImpl cordovaWebViewImpl = CordovaWebViewImpl.this;
            if (action == 0) {
                if (z2 && cordovaWebViewImpl.f2542l != null) {
                    return Boolean.TRUE;
                }
                if (cordovaWebViewImpl.f2544n.contains(Integer.valueOf(keyCode))) {
                    return Boolean.TRUE;
                }
                if (z2) {
                    return Boolean.valueOf(cordovaWebViewImpl.f2534b.canGoBack());
                }
            } else if (keyEvent.getAction() == 1) {
                if (z2 && cordovaWebViewImpl.f2542l != null) {
                    cordovaWebViewImpl.hideCustomView();
                    return Boolean.TRUE;
                }
                if (cordovaWebViewImpl.f2544n.contains(Integer.valueOf(keyCode))) {
                    String str = keyCode != 4 ? keyCode != 82 ? keyCode != 84 ? keyCode != 24 ? keyCode != 25 ? null : "volumedownbutton" : "volumeupbutton" : "searchbutton" : "menubutton" : "backbutton";
                    if (str != null) {
                        cordovaWebViewImpl.a(str);
                        return Boolean.TRUE;
                    }
                } else if (z2) {
                    return Boolean.valueOf(cordovaWebViewImpl.f2534b.goBack());
                }
            }
            return null;
        }

        @Override // N0.u
        public boolean onNavigationAttempt(String str) throws URISyntaxException {
            K k2 = CordovaWebViewImpl.this.f2533a;
            synchronized (k2.f485b) {
                try {
                    Iterator it = k2.f485b.values().iterator();
                    while (it.hasNext()) {
                        o oVar = (o) k2.f484a.get(((I) it.next()).f479a);
                        if (oVar != null && oVar.onOverrideUrlLoading(str)) {
                            return true;
                        }
                    }
                    if (CordovaWebViewImpl.this.f2533a.l(str)) {
                        return false;
                    }
                    if (CordovaWebViewImpl.this.f2533a.n(str).booleanValue()) {
                        CordovaWebViewImpl.this.showWebPage(str, true, false, null);
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // N0.u
        public void onPageFinishedLoading(String str) {
            clearLoadTimeoutTimer();
            CordovaWebViewImpl cordovaWebViewImpl = CordovaWebViewImpl.this;
            cordovaWebViewImpl.f2533a.k("onPageFinished", str);
            if (cordovaWebViewImpl.f2534b.getView().getVisibility() != 0) {
                new Thread(new b(this)).start();
            }
            if (str.equals("about:blank")) {
                cordovaWebViewImpl.f2533a.k("exit", null);
            }
        }

        @Override // N0.u
        public void onPageStarted(String str) {
            CordovaWebViewImpl.this.f2544n.clear();
            K k2 = CordovaWebViewImpl.this.f2533a;
            synchronized (k2.f484a) {
                try {
                    for (o oVar : k2.f484a.values()) {
                        if (oVar != null) {
                            oVar.onReset();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            CordovaWebViewImpl.this.f2533a.k("onPageStarted", str);
        }

        @Override // N0.u
        public void onReceivedError(int i2, String str, String str2) throws JSONException {
            clearLoadTimeoutTimer();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", i2);
                jSONObject.put("description", str);
                jSONObject.put("url", str2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            CordovaWebViewImpl.this.f2533a.k("onReceivedError", jSONObject);
        }
    }

    public CordovaWebViewImpl(v vVar) {
        this.f2534b = vVar;
    }

    public static v createEngine(Context context, q qVar) {
        try {
            return (v) Class.forName(qVar.b("webview", SystemWebViewEngine.class.getCanonicalName())).getConstructor(Context.class, q.class).newInstance(context, qVar);
        } catch (Exception e2) {
            throw new RuntimeException("Failed to create webview. ", e2);
        }
    }

    public final void a(String str) {
        if (this.f2538g == null) {
            this.f2538g = (CoreAndroid) this.f2533a.c(CoreAndroid.PLUGIN_NAME);
        }
        CoreAndroid coreAndroid = this.f2538g;
        if (coreAndroid == null) {
            return;
        }
        coreAndroid.fireJavascriptEvent(str);
    }

    @Override // N0.t
    public boolean backHistory() {
        return this.f2534b.goBack();
    }

    public boolean canGoBack() {
        return this.f2534b.canGoBack();
    }

    @Override // N0.t
    public void clearCache() {
        this.f2534b.clearCache();
    }

    @Override // N0.t
    public void clearHistory() {
        this.f2534b.clearHistory();
    }

    @Override // N0.t
    public Context getContext() {
        return this.f2534b.getView().getContext();
    }

    public C getCookieManager() {
        return this.f2534b.getCookieManager();
    }

    public v getEngine() {
        return this.f2534b;
    }

    @Override // N0.t
    public K getPluginManager() {
        return this.f2533a;
    }

    @Override // N0.t
    public q getPreferences() {
        return this.f2537f;
    }

    public s getResourceApi() {
        return this.f2536e;
    }

    public String getUrl() {
        return this.f2534b.getUrl();
    }

    public View getView() {
        return this.f2534b.getView();
    }

    @Override // N0.t
    public void handleDestroy() {
        if (isInitialized()) {
            this.d++;
            this.f2533a.e();
            loadUrl("about:blank");
            this.f2534b.destroy();
            hideCustomView();
        }
    }

    @Override // N0.t
    public void handlePause(boolean z2) {
        if (isInitialized()) {
            this.f2540j = true;
            this.f2533a.g(z2);
            a("pause");
            if (z2) {
                return;
            }
            this.f2534b.setPaused(true);
        }
    }

    @Override // N0.t
    public void handleResume(boolean z2) {
        if (isInitialized()) {
            this.f2534b.setPaused(false);
            this.f2533a.h(z2);
            if (this.f2540j) {
                a("resume");
            }
        }
    }

    @Override // N0.t
    public void handleStart() {
        if (isInitialized()) {
            this.f2533a.i();
        }
    }

    @Override // N0.t
    public void handleStop() {
        if (isInitialized()) {
            this.f2533a.j();
        }
    }

    @Override // N0.t
    @Deprecated
    public void hideCustomView() {
        y yVar = this.f2542l;
        if (yVar == null) {
            return;
        }
        yVar.setVisibility(8);
        v vVar = this.f2534b;
        ((ViewGroup) vVar.getView().getParent()).removeView(this.f2542l);
        this.f2542l = null;
        this.f2543m.onCustomViewHidden();
        vVar.getView().setVisibility(0);
        vVar.getView().requestFocus();
    }

    public void init(m mVar) {
        init(mVar, new ArrayList(), new q());
    }

    @Override // N0.t
    public boolean isButtonPlumbedToJs(int i2) {
        return this.f2544n.contains(Integer.valueOf(i2));
    }

    @Deprecated
    public boolean isCustomViewShowing() {
        return this.f2542l != null;
    }

    public boolean isInitialized() {
        return this.f2535c != null;
    }

    public void loadUrl(String str) {
        loadUrlIntoView(str, true);
    }

    public void loadUrlIntoView(String str, boolean z2) {
        if (str.equals("about:blank") || str.startsWith("javascript:")) {
            this.f2534b.loadUrl(str, false);
            return;
        }
        boolean z3 = z2 || this.f2541k == null;
        if (z3) {
            if (this.f2541k != null) {
                this.f2538g = null;
                this.f2533a.d();
            }
            this.f2541k = str;
        }
        int i2 = this.d;
        q qVar = this.f2537f;
        qVar.getClass();
        String str2 = (String) qVar.f524a.get("LoadUrlTimeoutValue".toLowerCase(Locale.ENGLISH));
        int iLongValue = str2 != null ? (int) Long.decode(str2).longValue() : 20000;
        w wVar = new w(this, iLongValue, i2, new D.a(this, str, 3, false));
        if (this.f2535c.getActivity() != null) {
            this.f2535c.getActivity().runOnUiThread(new x(this, iLongValue, wVar, str, z3));
        }
    }

    @Override // N0.t
    public void onNewIntent(Intent intent) {
        K k2 = this.f2533a;
        if (k2 != null) {
            k2.f(intent);
        }
    }

    public Object postMessage(String str, Object obj) {
        return this.f2533a.k(str, obj);
    }

    @Deprecated
    public void sendJavascript(String str) {
        H h = this.h;
        h.getClass();
        h.b(new F(str));
    }

    @Override // N0.t
    public void sendPluginResult(L l2, String str) {
        this.h.a(l2, str);
    }

    @Override // N0.t
    public void setButtonPlumbedToJs(int i2, boolean z2) {
        if (i2 != 4 && i2 != 82 && i2 != 24 && i2 != 25) {
            throw new IllegalArgumentException("Unsupported keycode: " + i2);
        }
        HashSet hashSet = this.f2544n;
        if (z2) {
            hashSet.add(Integer.valueOf(i2));
        } else {
            hashSet.remove(Integer.valueOf(i2));
        }
    }

    @Override // N0.t
    @Deprecated
    public void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.f2542l != null) {
            customViewCallback.onCustomViewHidden();
            return;
        }
        Context context = getContext();
        v vVar = this.f2534b;
        y yVar = new y(context, vVar);
        yVar.addView(view);
        this.f2542l = yVar;
        this.f2543m = customViewCallback;
        ViewGroup viewGroup = (ViewGroup) vVar.getView().getParent();
        viewGroup.addView(yVar, new FrameLayout.LayoutParams(-1, -1, 17));
        vVar.getView().setVisibility(8);
        viewGroup.setVisibility(0);
        viewGroup.bringToFront();
    }

    @Override // N0.t
    public void showWebPage(String str, boolean z2, boolean z3, Map<String, Object> map) throws URISyntaxException {
        Intent intent;
        if (z3) {
            this.f2534b.clearHistory();
        }
        if (!z2) {
            if (this.f2533a.l(str)) {
                loadUrlIntoView(str, true);
                return;
            }
            return;
        }
        if (!this.f2533a.n(str).booleanValue()) {
            return;
        }
        Intent intent2 = null;
        try {
            try {
                if (str.startsWith("intent://")) {
                    intent = Intent.parseUri(str, 1);
                } else {
                    intent = new Intent("android.intent.action.VIEW");
                    try {
                        intent.addCategory("android.intent.category.BROWSABLE");
                        Uri uri = Uri.parse(str);
                        if ("file".equals(uri.getScheme())) {
                            intent.setDataAndType(uri, this.f2536e.a(uri));
                        } else {
                            intent.setData(uri);
                        }
                    } catch (ActivityNotFoundException e2) {
                        intent2 = intent;
                        e = e2;
                        if (!str.startsWith("intent://") || intent2 == null || intent2.getStringExtra("browser_fallback_url") == null) {
                            Log.e(TAG, "Error loading url ".concat(str), e);
                            return;
                        } else {
                            showWebPage(intent2.getStringExtra("browser_fallback_url"), z2, z3, map);
                            return;
                        }
                    }
                }
                intent2 = intent;
                if (this.f2535c.getActivity() != null) {
                    this.f2535c.getActivity().startActivity(intent2);
                }
            } catch (ActivityNotFoundException e3) {
                e = e3;
            }
        } catch (URISyntaxException e4) {
            Log.e(TAG, "Error parsing url " + str, e4);
        }
    }

    public void stopLoading() {
        this.d++;
    }

    @Deprecated
    public void clearCache(boolean z2) {
        this.f2534b.clearCache();
    }

    public void init(m mVar, List<I> list, q qVar) {
        if (this.f2535c != null) {
            throw new IllegalStateException();
        }
        this.f2535c = mVar;
        this.f2537f = qVar;
        this.f2533a = new K(this, this.f2535c, list);
        v vVar = this.f2534b;
        this.f2536e = new s(vVar.getView().getContext(), this.f2533a);
        H h = new H();
        this.h = h;
        h.f478c.add(new E() { // from class: org.apache.cordova.NativeToJsMessageQueue$NoOpBridgeMode
            @Override // N0.E
            public void onNativeToJsMessageAvailable(H h2) {
            }
        });
        H h2 = this.h;
        h2.f478c.add(new NativeToJsMessageQueue$LoadUrlBridgeMode(vVar, mVar));
        if (qVar.a("DisallowOverscroll", false)) {
            vVar.getView().setOverScrollMode(2);
        }
        s sVar = this.f2536e;
        K k2 = this.f2533a;
        H h3 = this.h;
        this.f2534b.init(this, mVar, this.f2539i, sVar, k2, h3);
        K k3 = this.f2533a;
        k3.getClass();
        k3.f485b.put(CoreAndroid.PLUGIN_NAME, new I(CoreAndroid.PLUGIN_NAME, "org.apache.cordova.CoreAndroid", false));
        this.f2533a.d();
    }
}
