package a0;

import j0.C0208G;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064a {

    /* renamed from: a, reason: collision with root package name */
    public final C0208G f733a;

    /* renamed from: b, reason: collision with root package name */
    public final C0208G f734b;

    public C0064a(C0208G c0208g, C0208G c0208g2) {
        this.f733a = c0208g;
        this.f734b = c0208g2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0064a)) {
            return false;
        }
        C0064a c0064a = (C0064a) obj;
        return x0.g.a(this.f733a, c0064a.f733a) && x0.g.a(this.f734b, c0064a.f734b);
    }

    public final int hashCode() {
        return this.f734b.hashCode() + (this.f733a.hashCode() * 31);
    }

    public final String toString() {
        return "DoubleUri(fromUri=" + this.f733a + ", toUri=" + this.f734b + ")";
    }
}
