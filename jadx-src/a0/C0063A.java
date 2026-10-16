package a0;

import j0.C0204C;
import j0.C0208G;

/* renamed from: a0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063A {

    /* renamed from: a, reason: collision with root package name */
    public final C0208G f731a;

    /* renamed from: b, reason: collision with root package name */
    public final C0204C f732b;

    public C0063A(C0208G c0208g, C0204C c0204c) {
        this.f731a = c0208g;
        this.f732b = c0204c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0063A)) {
            return false;
        }
        C0063A c0063a = (C0063A) obj;
        return x0.g.a(this.f731a, c0063a.f731a) && x0.g.a(this.f732b, c0063a.f732b);
    }

    public final int hashCode() {
        return this.f732b.hashCode() + (this.f731a.hashCode() * 31);
    }

    public final String toString() {
        return "WriteFileOptions(uri=" + this.f731a + ", options=" + this.f732b + ")";
    }
}
