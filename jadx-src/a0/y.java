package a0;

import j0.C0202A;
import j0.C0208G;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C0208G f804a;

    /* renamed from: b, reason: collision with root package name */
    public final C0202A f805b;

    public y(C0208G c0208g, C0202A c0202a) {
        this.f804a = c0208g;
        this.f805b = c0202a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return x0.g.a(this.f804a, yVar.f804a) && x0.g.a(this.f805b, yVar.f805b);
    }

    public final int hashCode() {
        return this.f805b.f1921a.hashCode() + (this.f804a.hashCode() * 31);
    }

    public final String toString() {
        return "ReadFileOptions(uri=" + this.f804a + ", options=" + this.f805b + ")";
    }
}
