package com.getcapacitor;

import android.content.Context;
import f0.AbstractC0116c;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1459a;

    /* renamed from: b, reason: collision with root package name */
    public String f1460b;

    /* renamed from: c, reason: collision with root package name */
    public String f1461c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f1462e;

    /* renamed from: f, reason: collision with root package name */
    public String f1463f;

    /* renamed from: g, reason: collision with root package name */
    public String f1464g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1465i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1466j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1467k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1468l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1469m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1470n;

    /* renamed from: o, reason: collision with root package name */
    public int f1471o;

    /* renamed from: p, reason: collision with root package name */
    public int f1472p;

    /* renamed from: q, reason: collision with root package name */
    public String f1473q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1474r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1475s;

    /* renamed from: t, reason: collision with root package name */
    public String f1476t;

    /* renamed from: u, reason: collision with root package name */
    public String f1477u;

    /* renamed from: v, reason: collision with root package name */
    public HashMap f1478v;

    /* renamed from: w, reason: collision with root package name */
    public JSONObject f1479w;

    public static r c(Context context) {
        String[] strArr;
        JSONArray jSONArray;
        r rVar = new r();
        rVar.f1459a = true;
        rVar.f1461c = "localhost";
        rVar.d = "https";
        rVar.f1465i = false;
        rVar.f1466j = false;
        rVar.f1467k = false;
        rVar.f1468l = true;
        rVar.f1469m = true;
        rVar.f1470n = false;
        int i2 = 60;
        rVar.f1471o = 60;
        int i3 = 10;
        rVar.f1472p = 10;
        rVar.f1474r = false;
        rVar.f1475s = true;
        rVar.f1476t = "disable";
        JSONObject jSONObject = null;
        rVar.f1478v = null;
        rVar.f1479w = new JSONObject();
        if (context == null) {
            L.c.o("Capacitor Config could not be created from file. Context must not be null.");
            return rVar;
        }
        try {
            rVar.f1479w = new JSONObject(P0.b.x(context.getAssets(), "capacitor.config.json"));
        } catch (IOException e2) {
            L.c.p("Unable to load capacitor.config.json. Run npx cap copy first", e2);
        } catch (JSONException e3) {
            L.c.p("Unable to parse capacitor.config.json. Make sure it's valid json", e3);
        }
        boolean z2 = (context.getApplicationInfo().flags & 2) != 0;
        rVar.f1459a = AbstractC0116c.a(rVar.f1479w, "server.html5mode", rVar.f1459a);
        rVar.f1460b = AbstractC0116c.e(rVar.f1479w, "server.url", null);
        rVar.f1461c = AbstractC0116c.e(rVar.f1479w, "server.hostname", rVar.f1461c);
        rVar.f1473q = AbstractC0116c.e(rVar.f1479w, "server.errorPath", null);
        rVar.f1477u = AbstractC0116c.e(rVar.f1479w, "server.appStartPath", null);
        String strE = AbstractC0116c.e(rVar.f1479w, "server.androidScheme", rVar.d);
        if (Arrays.asList("file", "ftp", "ftps", "ws", "wss", "about", "blob", "data").contains(strE)) {
            L.c.G(strE + " is not an allowed scheme.  Defaulting to https.");
        } else {
            if (!strE.equals("http") && !strE.equals("https")) {
                L.c.G("Using a non-standard scheme: " + strE + " for Android. This is known to cause issues as of Android Webview 117.");
            }
            rVar.d = strE;
        }
        try {
            jSONArray = AbstractC0116c.c("server.allowNavigation", rVar.f1479w).getJSONArray(AbstractC0116c.b("server.allowNavigation"));
        } catch (JSONException unused) {
        }
        if (jSONArray == null) {
            strArr = null;
        } else {
            int length = jSONArray.length();
            strArr = new String[length];
            for (int i4 = 0; i4 < length; i4++) {
                strArr[i4] = (String) jSONArray.get(i4);
            }
        }
        rVar.f1462e = strArr;
        JSONObject jSONObject2 = rVar.f1479w;
        rVar.f1463f = AbstractC0116c.e(jSONObject2, "android.overrideUserAgent", AbstractC0116c.e(jSONObject2, "overrideUserAgent", null));
        JSONObject jSONObject3 = rVar.f1479w;
        rVar.f1464g = AbstractC0116c.e(jSONObject3, "android.appendUserAgent", AbstractC0116c.e(jSONObject3, "appendUserAgent", null));
        JSONObject jSONObject4 = rVar.f1479w;
        rVar.h = AbstractC0116c.e(jSONObject4, "android.backgroundColor", AbstractC0116c.e(jSONObject4, "backgroundColor", null));
        JSONObject jSONObject5 = rVar.f1479w;
        rVar.f1465i = AbstractC0116c.a(jSONObject5, "android.allowMixedContent", AbstractC0116c.a(jSONObject5, "allowMixedContent", rVar.f1465i));
        try {
            i2 = AbstractC0116c.c("android.minWebViewVersion", rVar.f1479w).getInt(AbstractC0116c.b("android.minWebViewVersion"));
        } catch (JSONException unused2) {
        }
        rVar.f1471o = i2;
        try {
            i3 = AbstractC0116c.c("android.minHuaweiWebViewVersion", rVar.f1479w).getInt(AbstractC0116c.b("android.minHuaweiWebViewVersion"));
        } catch (JSONException unused3) {
        }
        rVar.f1472p = i3;
        rVar.f1466j = AbstractC0116c.a(rVar.f1479w, "android.captureInput", rVar.f1466j);
        rVar.f1470n = AbstractC0116c.a(rVar.f1479w, "android.useLegacyBridge", rVar.f1470n);
        rVar.f1467k = AbstractC0116c.a(rVar.f1479w, "android.webContentsDebuggingEnabled", z2);
        JSONObject jSONObject6 = rVar.f1479w;
        rVar.f1474r = AbstractC0116c.a(jSONObject6, "android.zoomEnabled", AbstractC0116c.a(jSONObject6, "zoomEnabled", false));
        rVar.f1475s = AbstractC0116c.a(rVar.f1479w, "android.resolveServiceWorkerRequests", true);
        rVar.f1476t = AbstractC0116c.e(rVar.f1479w, "android.adjustMarginsForEdgeToEdge", "disable");
        JSONObject jSONObject7 = rVar.f1479w;
        String lowerCase = AbstractC0116c.e(jSONObject7, "android.loggingBehavior", AbstractC0116c.e(jSONObject7, "loggingBehavior", "debug")).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.equals("none")) {
            rVar.f1468l = false;
        } else if (lowerCase.equals("production")) {
            rVar.f1468l = true;
        } else {
            rVar.f1468l = z2;
        }
        JSONObject jSONObject8 = rVar.f1479w;
        rVar.f1469m = AbstractC0116c.a(jSONObject8, "android.initialFocus", AbstractC0116c.a(jSONObject8, "initialFocus", rVar.f1469m));
        try {
            jSONObject = AbstractC0116c.c("plugins", rVar.f1479w).getJSONObject(AbstractC0116c.b("plugins"));
        } catch (JSONException unused4) {
        }
        HashMap map = new HashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    map.put(next, new F(jSONObject.getJSONObject(next)));
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
        }
        rVar.f1478v = map;
        return rVar;
    }

    public final int a() {
        int i2 = this.f1471o;
        if (i2 >= 55) {
            return i2;
        }
        L.c.G("Specified minimum webview version is too low, defaulting to 55");
        return 55;
    }

    public final F b(String str) {
        F f2 = (F) this.f1478v.get(str);
        return f2 == null ? new F(new JSONObject()) : f2;
    }
}
