package com.a7m3p9xv.t6qk2z8.app;

import G.C0032h;
import G.D;
import L.c;
import N0.C0054e;
import N0.K;
import N0.q;
import Q.h;
import R.a;
import R.d;
import R.e;
import X.i;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import com.getcapacitor.C0100e;
import com.getcapacitor.C0101f;
import com.getcapacitor.CapacitorWebView;
import com.getcapacitor.E;
import com.getcapacitor.G;
import com.getcapacitor.H;
import com.getcapacitor.cordova.MockCordovaInterfaceImpl;
import com.getcapacitor.cordova.MockCordovaWebViewImpl;
import com.getcapacitor.w;
import g.AbstractActivityC0137i;
import g.C0136h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class MainActivity extends AbstractActivityC0137i {

    /* renamed from: A, reason: collision with root package name */
    public int f1347A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f1348B;

    /* renamed from: C, reason: collision with root package name */
    public final C0100e f1349C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1350D;

    /* renamed from: E, reason: collision with root package name */
    public long f1351E;

    /* renamed from: z, reason: collision with root package name */
    public C0101f f1352z;

    public MainActivity() {
        ((d) this.d.f615c).e("androidx:appcompat", new a(this));
        f(new C0136h(this));
        this.f1347A = 0;
        this.f1348B = new ArrayList();
        this.f1349C = new C0100e(this);
        this.f1350D = false;
        this.f1351E = 0L;
    }

    public final void n(Bundle bundle) throws XmlPullParserException, IOException {
        super.onCreate(bundle);
        C0100e c0100e = this.f1349C;
        c0100e.f1406a = bundle;
        getApplication().setTheme(R.style.AppTheme_NoActionBar);
        setTheme(R.style.AppTheme_NoActionBar);
        try {
            setContentView(R.layout.capacitor_bridge_layout_main);
            try {
                Iterator it = new i(18, getAssets()).G().iterator();
                while (it.hasNext()) {
                    c0100e.f1407b.add((Class) it.next());
                }
            } catch (H e2) {
                c.p("Error loading plugins.", e2);
            }
            c.j("Starting BridgeActivity");
            Iterator it2 = this.f1348B.iterator();
            while (it2.hasNext()) {
                c0100e.f1407b.add((Class) it2.next());
            }
            C0054e c0054e = new C0054e();
            MainActivity mainActivity = c0100e.d;
            c0054e.c(mainActivity.getApplicationContext());
            q qVar = c0054e.f501a;
            mainActivity.getIntent().getExtras();
            qVar.getClass();
            ArrayList arrayList = c0054e.f502b;
            MockCordovaInterfaceImpl mockCordovaInterfaceImpl = new MockCordovaInterfaceImpl(mainActivity);
            Bundle bundle2 = c0100e.f1406a;
            if (bundle2 != null) {
                mockCordovaInterfaceImpl.restoreInstanceState(bundle2);
            }
            WebView webView = (WebView) mainActivity.findViewById(R.id.webview);
            MockCordovaWebViewImpl mockCordovaWebViewImpl = new MockCordovaWebViewImpl(mainActivity.getApplicationContext());
            mockCordovaWebViewImpl.init(mockCordovaInterfaceImpl, arrayList, qVar, webView);
            K pluginManager = mockCordovaWebViewImpl.getPluginManager();
            mockCordovaInterfaceImpl.onCordovaInit(pluginManager);
            C0101f c0101f = new C0101f(c0100e.d, webView, c0100e.f1407b, c0100e.f1408c, mockCordovaInterfaceImpl, pluginManager, qVar);
            if (webView instanceof CapacitorWebView) {
                CapacitorWebView capacitorWebView = (CapacitorWebView) webView;
                capacitorWebView.setBridge(c0101f);
                String str = c0101f.f1411a.f1476t;
                if (!str.equals("disable")) {
                    boolean zEquals = str.equals("force");
                    boolean z2 = false;
                    if (Build.VERSION.SDK_INT >= 35 && str.equals("auto")) {
                        TypedValue typedValue = new TypedValue();
                        boolean zResolveAttribute = capacitorWebView.getContext().getTheme().resolveAttribute(android.R.attr.windowOptOutEdgeToEdgeEnforcement, typedValue, true);
                        boolean z3 = typedValue.data != 0;
                        if (!zResolveAttribute || !z3) {
                            z2 = true;
                        }
                    }
                    if (zEquals || z2) {
                        C0032h c0032h = new C0032h();
                        WeakHashMap weakHashMap = G.K.f146a;
                        D.i(capacitorWebView, c0032h);
                    }
                }
            }
            c0101f.f1421m = mockCordovaWebViewImpl;
            c0101f.f1410A = c0100e.f1409e;
            Bundle bundle3 = c0100e.f1406a;
            if (bundle3 != null) {
                String string = bundle3.getString("capacitorLastActivityPluginId");
                String string2 = bundle3.getString("capacitorLastActivityPluginMethod");
                String string3 = bundle3.getString("capacitorLastPluginCallOptions");
                if (string != null) {
                    if (string3 != null) {
                        try {
                            c0101f.f1432y = new E(c0101f.f1425q, string, "-1", string2, new w(string3));
                        } catch (JSONException e3) {
                            c.p("Unable to restore plugin call, unable to parse persisted JSON object", e3);
                        }
                    }
                    Bundle bundle4 = bundle3.getBundle("capacitorLastPluginCallBundle");
                    G g2 = (G) c0101f.f1430v.get(string);
                    if (bundle4 == null || g2 == null) {
                        c.o("Unable to restore last plugin call");
                    } else {
                        g2.f1371e.restoreState(bundle4);
                    }
                }
            }
            this.f1352z = c0101f;
            c0101f.f1422n.a("KeepRunning", true);
            onNewIntent(getIntent());
        } catch (Exception unused) {
            setContentView(R.layout.no_webview);
        }
    }

    public final void o() throws JSONException {
        super.onResume();
        C0101f c0101f = this.f1352z;
        if (c0101f != null) {
            e eVar = c0101f.f1424p;
            eVar.f613a = true;
            Z.a aVar = (Z.a) eVar.f614b;
            if (aVar != null) {
                aVar.f724a.lambda$load$0(Boolean.TRUE);
            }
            C0101f c0101f2 = this.f1352z;
            Iterator it = c0101f2.f1430v.values().iterator();
            while (it.hasNext()) {
                ((G) it.next()).f1371e.handleOnResume();
            }
            MockCordovaWebViewImpl mockCordovaWebViewImpl = c0101f2.f1421m;
            if (mockCordovaWebViewImpl != null) {
                mockCordovaWebViewImpl.handleResume(c0101f2.f1422n.a("KeepRunning", true));
            }
            c.j("App resumed");
        }
    }

    @Override // g.AbstractActivityC0137i, androidx.activity.o, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        boolean zOnActivityResult;
        com.getcapacitor.D d;
        E e2;
        C0101f c0101f = this.f1352z;
        if (c0101f == null) {
            return;
        }
        G gB = c0101f.b(i2);
        if (gB == null || (d = gB.f1371e) == null) {
            c.j("Unable to find a Capacitor plugin to handle requestCode, trying Cordova plugins " + i2);
            zOnActivityResult = c0101f.f1420l.onActivityResult(i2, i3, intent);
        } else {
            if (d.getSavedCall() == null && (e2 = c0101f.f1432y) != null) {
                gB.f1371e.saveCall(e2);
            }
            gB.f1371e.handleOnActivityResult(i2, i3, intent);
            c0101f.f1432y = null;
            zOnActivityResult = true;
        }
        if (zOnActivityResult) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // g.AbstractActivityC0137i, androidx.activity.o, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0101f c0101f = this.f1352z;
        if (c0101f == null) {
            return;
        }
        Iterator it = c0101f.f1430v.values().iterator();
        while (it.hasNext()) {
            ((G) it.next()).f1371e.handleOnConfigurationChanged(configuration);
        }
    }

    @Override // g.AbstractActivityC0137i, androidx.activity.o, v.f, android.app.Activity
    public final void onCreate(Bundle bundle) throws XmlPullParserException, IOException {
        n(bundle);
        Window window = getWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            C.a.d(window);
        } else if (i2 >= 30) {
            C.a.c(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
        if (i2 >= 30) {
            WindowInsetsController insetsController = getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsBehavior(1);
            }
        } else {
            getWindow().getDecorView().setSystemUiVisibility(1284);
        }
        WebView webView = this.f1352z.f1419k;
        if (webView != null) {
            webView.getSettings().setSupportZoom(true);
            webView.getSettings().setBuiltInZoomControls(true);
            webView.getSettings().setDisplayZoomControls(false);
            webView.getSettings().setUseWideViewPort(true);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setSupportMultipleWindows(true);
            webView.setDownloadListener(new Y.a(this));
            webView.setWebChromeClient(new Y.c(this, this.f1352z));
            webView.addJavascriptInterface(new Y.e(this), "AndroidBridge");
            webView.setWebViewClient(new Y.d(this.f1352z));
        }
    }

    @Override // g.AbstractActivityC0137i, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C0101f c0101f = this.f1352z;
        if (c0101f != null) {
            Iterator it = c0101f.f1430v.values().iterator();
            while (it.hasNext()) {
                ((G) it.next()).f1371e.handleOnDestroy();
            }
            c0101f.f1426r.quitSafely();
            MockCordovaWebViewImpl mockCordovaWebViewImpl = c0101f.f1421m;
            if (mockCordovaWebViewImpl != null) {
                mockCordovaWebViewImpl.handleDestroy();
            }
            c.j("App destroyed");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WebView webView = this.f1352z.f1419k;
        webView.removeAllViews();
        webView.destroy();
    }

    @Override // g.AbstractActivityC0137i, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() > 0) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f1351E < 150) {
            return true;
        }
        this.f1351E = jCurrentTimeMillis;
        if (i2 == 24) {
            runOnUiThread(new h(this, 1, "up"));
            return true;
        }
        if (i2 != 25) {
            return super.onKeyDown(i2, keyEvent);
        }
        runOnUiThread(new h(this, 1, "down"));
        return true;
    }

    @Override // androidx.activity.o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C0101f c0101f = this.f1352z;
        if (c0101f != null) {
            Iterator it = c0101f.f1430v.values().iterator();
            while (it.hasNext()) {
                ((G) it.next()).f1371e.handleOnNewIntent(intent);
            }
            MockCordovaWebViewImpl mockCordovaWebViewImpl = c0101f.f1421m;
            if (mockCordovaWebViewImpl != null) {
                mockCordovaWebViewImpl.onNewIntent(intent);
            }
        }
    }

    @Override // g.AbstractActivityC0137i, android.app.Activity
    public final void onPause() {
        super.onPause();
        C0101f c0101f = this.f1352z;
        if (c0101f != null) {
            Iterator it = c0101f.f1430v.values().iterator();
            while (it.hasNext()) {
                ((G) it.next()).f1371e.handleOnPause();
            }
            if (c0101f.f1421m != null) {
                boolean z2 = true;
                if (!c0101f.f1422n.a("KeepRunning", true) && c0101f.f1420l.getActivityResultCallback() == null) {
                    z2 = false;
                }
                c0101f.f1421m.handlePause(z2);
            }
            c.j("App paused");
        }
    }

    @Override // g.AbstractActivityC0137i, androidx.activity.o, android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        C0101f c0101f = this.f1352z;
        if (c0101f == null) {
            return;
        }
        G gB = c0101f.b(i2);
        boolean zHandlePermissionResult = false;
        if (gB == null) {
            c.j("Unable to find a Capacitor plugin to handle permission requestCode, trying Cordova plugins " + i2);
            try {
                zHandlePermissionResult = c0101f.f1420l.handlePermissionResult(i2, strArr, iArr);
            } catch (JSONException e2) {
                c.j("Error on Cordova plugin permissions request " + e2.getMessage());
            }
        } else {
            gB.f1371e.handleRequestPermissionsResult(i2, strArr, iArr);
            zHandlePermissionResult = true;
        }
        if (zHandlePermissionResult) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        Iterator it = this.f1352z.f1430v.values().iterator();
        while (it.hasNext()) {
            ((G) it.next()).f1371e.handleOnRestart();
        }
        c.j("App restarted");
    }

    @Override // g.AbstractActivityC0137i, android.app.Activity
    public final void onResume() throws JSONException {
        o();
        if (this.f1350D) {
            this.f1350D = false;
            finishAffinity();
            finishAndRemoveTask();
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    @Override // androidx.activity.o, v.f, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C0101f c0101f = this.f1352z;
        c0101f.getClass();
        c.j("Saving instance state!");
        E e2 = c0101f.f1432y;
        if (e2 != null) {
            HashMap map = c0101f.f1430v;
            String str = e2.f1363b;
            G g2 = (G) map.get(str);
            if (g2 != null) {
                Bundle bundleSaveInstanceState = g2.f1371e.saveInstanceState();
                String str2 = e2.d;
                if (bundleSaveInstanceState != null) {
                    bundle.putString("capacitorLastActivityPluginId", str);
                    bundle.putString("capacitorLastActivityPluginMethod", str2);
                    bundle.putString("capacitorLastPluginCallOptions", e2.f1365e.toString());
                    bundle.putBundle("capacitorLastPluginCallBundle", bundleSaveInstanceState);
                    return;
                }
                c.o("Couldn't save last " + str + "'s Plugin " + str2 + " call");
            }
        }
    }

    @Override // g.AbstractActivityC0137i, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f1347A++;
        C0101f c0101f = this.f1352z;
        if (c0101f != null) {
            Iterator it = c0101f.f1430v.values().iterator();
            while (it.hasNext()) {
                ((G) it.next()).f1371e.handleOnStart();
            }
            MockCordovaWebViewImpl mockCordovaWebViewImpl = c0101f.f1421m;
            if (mockCordovaWebViewImpl != null) {
                mockCordovaWebViewImpl.handleStart();
            }
            c.j("App started");
        }
    }

    @Override // g.AbstractActivityC0137i, android.app.Activity
    public final void onStop() throws JSONException {
        super.onStop();
        if (this.f1352z != null) {
            int iMax = Math.max(0, this.f1347A - 1);
            this.f1347A = iMax;
            if (iMax == 0) {
                e eVar = this.f1352z.f1424p;
                eVar.f613a = false;
                Z.a aVar = (Z.a) eVar.f614b;
                if (aVar != null) {
                    aVar.f724a.lambda$load$0(Boolean.FALSE);
                }
            }
            C0101f c0101f = this.f1352z;
            Iterator it = c0101f.f1430v.values().iterator();
            while (it.hasNext()) {
                ((G) it.next()).f1371e.handleOnStop();
            }
            MockCordovaWebViewImpl mockCordovaWebViewImpl = c0101f.f1421m;
            if (mockCordovaWebViewImpl != null) {
                mockCordovaWebViewImpl.handleStop();
            }
            c.j("App stopped");
        }
    }
}
