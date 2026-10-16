package N0;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: N0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0053d {

    /* renamed from: a, reason: collision with root package name */
    public final String f498a;

    /* renamed from: b, reason: collision with root package name */
    public final t f499b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f500c;

    public C0053d(String str, t tVar) {
        this.f498a = str;
        this.f499b = tVar;
    }

    public void error(JSONObject jSONObject) {
        sendPluginResult(new L(10, jSONObject));
    }

    public String getCallbackId() {
        return this.f498a;
    }

    public boolean isChangingThreads() {
        return false;
    }

    public boolean isFinished() {
        return this.f500c;
    }

    public void sendPluginResult(L l2) {
        synchronized (this) {
            try {
                if (this.f500c) {
                    l2.a();
                } else {
                    this.f500c = !l2.f491c;
                    this.f499b.sendPluginResult(l2, this.f498a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void success(JSONObject jSONObject) {
        sendPluginResult(new L(2, jSONObject));
    }

    public void error(String str) {
        sendPluginResult(new L(str, 10));
    }

    public void success(String str) {
        sendPluginResult(new L(str, 2));
    }

    public void error(int i2) {
        sendPluginResult(new L(10, i2));
    }

    public void success(JSONArray jSONArray) {
        sendPluginResult(new L(jSONArray));
    }

    public void success(byte[] bArr) {
        sendPluginResult(new L(bArr));
    }

    public void success(int i2) {
        sendPluginResult(new L(2, i2));
    }

    public void success() {
        sendPluginResult(new L(2));
    }
}
