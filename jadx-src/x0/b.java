package x0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class b implements C0.a, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public transient C0.a f2694b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2695c;
    public final Class d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2696e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2697f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2698g;

    public b(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f2695c = obj;
        this.d = cls;
        this.f2696e = str;
        this.f2697f = str2;
        this.f2698g = z2;
    }

    public final c c() {
        Class cls = this.d;
        if (this.f2698g) {
            k.f2707a.getClass();
            return new i(cls);
        }
        k.f2707a.getClass();
        return new d(cls);
    }
}
