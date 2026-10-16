package k0;

import java.io.Serializable;

/* renamed from: k0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233f implements InterfaceC0229b, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public x0.h f2026b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f2027c = C0234g.f2028a;
    public final Object d = this;

    /* JADX WARN: Multi-variable type inference failed */
    public C0233f(w0.a aVar) {
        this.f2026b = (x0.h) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, w0.a, x0.h] */
    public final Object a() {
        Object objA;
        Object obj = this.f2027c;
        C0234g c0234g = C0234g.f2028a;
        if (obj != c0234g) {
            return obj;
        }
        synchronized (this.d) {
            objA = this.f2027c;
            if (objA == c0234g) {
                ?? r1 = this.f2026b;
                x0.g.b(r1);
                objA = r1.a();
                this.f2027c = objA;
                this.f2026b = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f2027c != C0234g.f2028a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
