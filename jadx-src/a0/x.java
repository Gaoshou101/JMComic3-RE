package a0;

import j0.C0208G;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final C0208G f802a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.z f803b;

    public x(C0208G c0208g, j0.z zVar) {
        this.f802a = c0208g;
        this.f803b = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return x0.g.a(this.f802a, xVar.f802a) && x0.g.a(this.f803b, xVar.f803b);
    }

    public final int hashCode() {
        return this.f803b.hashCode() + (this.f802a.hashCode() * 31);
    }

    public final String toString() {
        return "ReadFileInChunksOptions(uri=" + this.f802a + ", options=" + this.f803b + ")";
    }
}
