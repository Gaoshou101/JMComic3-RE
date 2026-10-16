package a0;

import j0.C0208G;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final C0208G f806a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f807b;

    public z(C0208G c0208g, boolean z2) {
        this.f806a = c0208g;
        this.f807b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return x0.g.a(this.f806a, zVar.f806a) && this.f807b == zVar.f807b;
    }

    public final int hashCode() {
        return (this.f806a.hashCode() * 31) + (this.f807b ? 1231 : 1237);
    }

    public final String toString() {
        return "SingleUriWithRecursiveOptions(uri=" + this.f806a + ", recursive=" + this.f807b + ")";
    }
}
