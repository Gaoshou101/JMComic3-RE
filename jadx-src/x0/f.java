package x0;

import k0.InterfaceC0228a;

/* loaded from: classes.dex */
public abstract class f extends b implements e, C0.a, InterfaceC0228a {
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2702i;

    public f(int i2, Class cls, String str, String str2, int i3) {
        this(i2, a.f2693b, cls, str, str2, i3);
    }

    @Override // x0.e
    public final int b() {
        return this.h;
    }

    public final C0.a d() {
        k.f2707a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f2696e.equals(fVar.f2696e) && this.f2697f.equals(fVar.f2697f) && this.f2702i == fVar.f2702i && this.h == fVar.h && g.a(this.f2695c, fVar.f2695c) && c().equals(fVar.c());
        }
        if (!(obj instanceof f)) {
            return false;
        }
        C0.a aVar = this.f2694b;
        if (aVar == null) {
            d();
            this.f2694b = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        c();
        return this.f2697f.hashCode() + ((this.f2696e.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        C0.a aVar = this.f2694b;
        if (aVar == null) {
            d();
            this.f2694b = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f2696e;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : Q.d.a("function ", str, " (Kotlin reflection is not available)");
    }

    public f(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.h = i2;
        this.f2702i = 0;
    }
}
