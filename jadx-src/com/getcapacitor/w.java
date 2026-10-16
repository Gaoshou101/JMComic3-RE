package com.getcapacitor;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w extends JSONObject {
    public final w a(String str, w wVar) throws JSONException {
        try {
            Object obj = get(str);
            if (obj instanceof JSONObject) {
                Iterator<String> itKeys = ((JSONObject) obj).keys();
                ArrayList arrayList = new ArrayList();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                return new w((JSONObject) obj, (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        } catch (JSONException unused) {
        }
        return wVar;
    }

    public final void b(int i2) throws JSONException {
        try {
            super.put("status", i2);
        } catch (JSONException unused) {
        }
    }

    public final void c(String str, long j2) throws JSONException {
        try {
            super.put(str, j2);
        } catch (JSONException unused) {
        }
    }

    public final void d(String str, Object obj) throws JSONException {
        try {
            super.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    public final void e(String str, String str2) throws JSONException {
        try {
            super.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    public final void f(String str, boolean z2) throws JSONException {
        try {
            super.put(str, z2);
        } catch (JSONException unused) {
        }
    }

    @Override // org.json.JSONObject
    public final String getString(String str) throws JSONException {
        String string;
        try {
            string = super.getString(str);
        } catch (JSONException unused) {
        }
        if (isNull(str)) {
            return null;
        }
        return string;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, boolean z2) throws JSONException {
        try {
            super.put(str, z2);
        } catch (JSONException unused) {
        }
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, int i2) throws JSONException {
        try {
            super.put(str, i2);
        } catch (JSONException unused) {
        }
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, long j2) throws JSONException {
        try {
            super.put(str, j2);
        } catch (JSONException unused) {
        }
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, double d) throws JSONException {
        try {
            super.put(str, d);
        } catch (JSONException unused) {
        }
        return this;
    }

    @Override // org.json.JSONObject
    public final JSONObject put(String str, Object obj) throws JSONException {
        try {
            super.put(str, obj);
        } catch (JSONException unused) {
        }
        return this;
    }
}
