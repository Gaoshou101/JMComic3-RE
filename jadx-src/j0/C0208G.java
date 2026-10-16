package j0;

import a.AbstractC0062a;

/* renamed from: j0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208G extends AbstractC0062a {

    /* renamed from: c, reason: collision with root package name */
    public final x f1931c;
    public final String d;

    public C0208G(x xVar, String str) {
        this.f1931c = xVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0208G)) {
            return false;
        }
        C0208G c0208g = (C0208G) obj;
        return this.f1931c == c0208g.f1931c && x0.g.a(this.d, c0208g.d);
    }

    public final int hashCode() {
        x xVar = this.f1931c;
        return this.d.hashCode() + ((xVar == null ? 0 : xVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Unresolved(parentFolder=" + this.f1931c + ", uriPath=" + this.d + ")";
    }
}
