package org.apache.cordova;

import N0.C0053d;
import N0.K;
import N0.L;
import android.util.Log;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ResumeCallback extends C0053d {
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final K f2557e;

    public ResumeCallback(String str, K k2) {
        super("resumecallback", null);
        this.d = str;
        this.f2557e = k2;
    }

    @Override // N0.C0053d
    public void sendPluginResult(L l2) throws JSONException {
        synchronized (this) {
            try {
                if (this.f500c) {
                    l2.a();
                    return;
                }
                this.f500c = true;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("pluginServiceName", this.d);
                    jSONObject2.put("pluginStatus", L.f488g[l2.f489a]);
                    jSONObject.put("action", "resume");
                    jSONObject.put("pendingResult", jSONObject2);
                } catch (JSONException unused) {
                    Log.e("CordovaResumeCallback", "Unable to create resume object for Activity Result");
                }
                L l3 = new L(2, jSONObject);
                ArrayList arrayList = new ArrayList();
                arrayList.add(l3);
                arrayList.add(l2);
                ((CoreAndroid) this.f2557e.c(CoreAndroid.PLUGIN_NAME)).sendResumeEvent(new L(arrayList));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
