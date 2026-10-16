package com.getcapacitor;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final z f1362a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1363b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1364c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final w f1365e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1366f = false;

    public E(z zVar, String str, String str2, String str3, w wVar) {
        this.f1362a = zVar;
        this.f1363b = str;
        this.f1364c = str2;
        this.d = str3;
        this.f1365e = wVar;
    }

    public final void a(String str) {
        K k2 = new K();
        try {
            k2.a("message", str);
        } catch (Exception e2) {
            L.c.q(L.c.F("Plugin"), e2.toString(), null);
        }
        this.f1362a.c(this, null, k2);
    }

    public final Boolean b(String str, Boolean bool) {
        Object objOpt = this.f1365e.opt(str);
        return (objOpt != null && (objOpt instanceof Boolean)) ? (Boolean) objOpt : bool;
    }

    public final Integer c(String str) {
        Object objOpt = this.f1365e.opt(str);
        if (objOpt != null && (objOpt instanceof Integer)) {
            return (Integer) objOpt;
        }
        return null;
    }

    public final w d(String str, w wVar) {
        Object objOpt = this.f1365e.opt(str);
        if (objOpt != null && (objOpt instanceof JSONObject)) {
            try {
                JSONObject jSONObject = (JSONObject) objOpt;
                Iterator<String> itKeys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                return new w(jSONObject, (String[]) arrayList.toArray(new String[arrayList.size()]));
            } catch (JSONException unused) {
            }
        }
        return wVar;
    }

    public final String e(String str, String str2) {
        Object objOpt = this.f1365e.opt(str);
        return (objOpt != null && (objOpt instanceof String)) ? (String) objOpt : str2;
    }

    public final void f(String str, String str2, Exception exc) {
        K k2 = new K();
        if (exc != null) {
            L.c.q(L.c.F("Plugin"), str, exc);
        }
        try {
            k2.a("message", str);
            k2.a("code", str2);
        } catch (Exception e2) {
            L.c.q(L.c.F("Plugin"), e2.getMessage(), e2);
        }
        this.f1362a.c(this, null, k2);
    }

    public final void g() {
        this.f1362a.c(this, null, null);
    }

    public final void h(w wVar) {
        this.f1362a.c(this, new K(wVar), null);
    }
}
