package N0;

import android.util.Base64;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f488g = {"No result", "OK", "Class not found", "Illegal access", "Instantiation error", "Malformed url", "IO error", "Invalid action", "JSON error", "Error"};

    /* renamed from: a, reason: collision with root package name */
    public final int f489a;

    /* renamed from: b, reason: collision with root package name */
    public final int f490b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f491c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public String f492e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f493f;

    public L(int i2) {
        this(f488g[androidx.fragment.app.x.c(i2)], i2);
    }

    public final String a() {
        if (this.f492e == null) {
            this.f492e = JSONObject.quote(this.d);
        }
        return this.f492e;
    }

    public L(String str, int i2) {
        this.f491c = false;
        this.f489a = androidx.fragment.app.x.c(i2);
        this.f490b = str == null ? 5 : 1;
        this.d = str;
    }

    public L(JSONArray jSONArray) {
        this.f491c = false;
        this.f489a = androidx.fragment.app.x.c(2);
        this.f490b = 2;
        this.f492e = jSONArray.toString();
    }

    public L(int i2, JSONObject jSONObject) {
        this.f491c = false;
        this.f489a = androidx.fragment.app.x.c(i2);
        this.f490b = 2;
        this.f492e = jSONObject.toString();
    }

    public L(int i2, int i3) {
        this.f491c = false;
        this.f489a = androidx.fragment.app.x.c(i2);
        this.f490b = 3;
        this.f492e = "" + i3;
    }

    public L(byte[] bArr) {
        this.f491c = false;
        this.f489a = androidx.fragment.app.x.c(2);
        this.f490b = 6;
        this.f492e = Base64.encodeToString(bArr, 2);
    }

    public L(ArrayList arrayList) {
        this.f491c = false;
        this.f489a = androidx.fragment.app.x.c(2);
        this.f490b = 8;
        this.f493f = arrayList;
    }
}
