package com.getcapacitor;

import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public C0101f f1492a;

    /* renamed from: b, reason: collision with root package name */
    public WebView f1493b;

    /* renamed from: c, reason: collision with root package name */
    public N0.K f1494c;
    public X.g d;

    public final void a(String str, String str2, final String str3, w wVar) {
        final E e2 = new E(this, str2, str, str3, wVar);
        final C0101f c0101f = this.f1492a;
        c0101f.getClass();
        try {
            final G g2 = (G) c0101f.f1430v.get(str2);
            if (g2 == null) {
                L.c.o("unable to find plugin : " + str2);
                e2.a("unable to find plugin : " + str2);
                return;
            }
            if (L.c.E()) {
                String str4 = "callback: " + str + ", pluginId: " + g2.d + ", methodName: " + str3 + ", methodData: " + wVar.toString();
                if (L.c.E()) {
                    Log.v("Capacitor", str4);
                }
            }
            c0101f.f1427s.post(new Runnable() { // from class: com.getcapacitor.a
                @Override // java.lang.Runnable
                public final void run() {
                    G g3 = g2;
                    String str5 = str3;
                    E e3 = e2;
                    C0101f c0101f2 = c0101f;
                    c0101f2.getClass();
                    try {
                        g3.a(e3, str5);
                        if (e3.f1366f) {
                            c0101f2.f1431w.put(e3.f1364c, e3);
                        }
                    } catch (H e4) {
                        e = e4;
                        L.c.p("Unable to execute plugin method", e);
                    } catch (t e5) {
                        e = e5;
                        L.c.p("Unable to execute plugin method", e);
                    } catch (Exception e6) {
                        L.c.p("Serious error executing plugin", e6);
                        throw new RuntimeException(e6);
                    }
                }
            });
        } catch (Exception e3) {
            L.c.q(L.c.F("callPluginMethod"), "error : " + e3, null);
            e2.a(e3.toString());
        }
    }

    public final void b(K k2) {
        final String str = "window.Capacitor.fromNative(" + k2.f1375a.toString() + ")";
        final WebView webView = this.f1493b;
        webView.post(new Runnable() { // from class: com.getcapacitor.x
            @Override // java.lang.Runnable
            public final void run() {
                webView.evaluateJavascript(str, null);
            }
        });
    }

    public final void c(E e2, K k2, K k3) {
        X.g gVar;
        C0101f c0101f = this.f1492a;
        try {
            K k4 = new K();
            w wVar = k4.f1375a;
            boolean z2 = e2.f1366f;
            String str = e2.f1364c;
            k4.a("save", Boolean.valueOf(z2));
            k4.a("callbackId", str);
            k4.a("pluginId", e2.f1363b);
            k4.a("methodName", e2.d);
            if (k3 != null) {
                k4.a("success", Boolean.FALSE);
                k4.a("error", k3.f1375a);
                L.c.j("Sending plugin error: " + wVar.toString());
            } else {
                k4.a("success", Boolean.TRUE);
                if (k2 != null) {
                    k4.a("data", k2.f1375a);
                }
            }
            if (str.equals("-1")) {
                Z.a aVar = (Z.a) c0101f.f1424p.f615c;
                if (aVar != null) {
                    aVar.f724a.lambda$load$1(k4);
                }
            } else if (c0101f.f1411a.f1470n || !P0.b.r("WEB_MESSAGE_LISTENER") || (gVar = this.d) == null) {
                b(k4);
            } else {
                String string = wVar.toString();
                if (!X.l.f718c.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                gVar.f712a.postMessage(string);
            }
        } catch (Exception e3) {
            L.c.o("sendResponseMessage: error: " + e3);
        }
        if (e2.f1366f) {
            return;
        }
        e2.f1366f = false;
        c0101f.getClass();
        c0101f.f1431w.remove(e2.f1364c);
    }

    @JavascriptInterface
    public void postMessage(String str) {
        try {
            w wVar = new w(str);
            String string = wVar.getString("type");
            boolean z2 = false;
            boolean z3 = string != null;
            boolean z4 = z3 && string.equals("cordova");
            if (z3 && string.equals("js.error")) {
                z2 = true;
            }
            final String string2 = wVar.getString("callbackId");
            if (z4) {
                final String string3 = wVar.getString("service");
                final String string4 = wVar.getString("action");
                final String string5 = wVar.getString("actionArgs");
                String strF = L.c.F("Plugin");
                String str2 = "To native (Cordova plugin): callbackId: " + string2 + ", service: " + string3 + ", action: " + string4 + ", actionArgs: " + string5;
                if (L.c.E()) {
                    Log.v(strF, str2);
                }
                this.f1492a.f1427s.post(new Runnable() { // from class: com.getcapacitor.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1488b.f1494c.a(string3, string4, string2, string5);
                    }
                });
                return;
            }
            if (z2) {
                L.c.o("JavaScript Error: " + str);
                return;
            }
            String string6 = wVar.getString("pluginId");
            String string7 = wVar.getString("methodName");
            w wVarA = wVar.a("options", new w());
            String strF2 = L.c.F("Plugin");
            String str3 = "To native (Capacitor plugin): callbackId: " + string2 + ", pluginId: " + string6 + ", methodName: " + string7;
            if (L.c.E()) {
                Log.v(strF2, str3);
            }
            a(string2, string6, string7, wVarA);
        } catch (Exception e2) {
            L.c.p("Post message error:", e2);
        }
    }
}
