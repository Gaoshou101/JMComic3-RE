package N0;

import android.util.Log;

/* renamed from: N0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056g {

    /* renamed from: a, reason: collision with root package name */
    public K f507a;

    /* renamed from: b, reason: collision with root package name */
    public H f508b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f509c;

    public final String a(int i2, String str, String str2, String str3, String str4) {
        if (!b(i2)) {
            return null;
        }
        if (str4 == null) {
            return "@Null arguments.";
        }
        H h = this.f508b;
        h.g(true);
        try {
            Thread.currentThread();
            this.f507a.a(str, str2, str3, str4);
            return h.d(false);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return "";
            } finally {
                h.g(false);
            }
        }
    }

    public final boolean b(int i2) throws IllegalAccessException {
        if (this.f508b.d == null) {
            return false;
        }
        if (this.f509c >= 0 && i2 == this.f509c) {
            return true;
        }
        Log.e("CordovaBridge", "Bridge access attempt with wrong secret token, possibly from malicious code. Disabling exec() bridge!");
        this.f509c = -1;
        throw new IllegalAccessException();
    }
}
