package j0;

/* renamed from: j0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202A {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0214e f1921a;

    public C0202A(AbstractC0214e abstractC0214e) {
        x0.g.e("encoding", abstractC0214e);
        this.f1921a = abstractC0214e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0202A) && x0.g.a(this.f1921a, ((C0202A) obj).f1921a);
    }

    public final int hashCode() {
        return this.f1921a.hashCode();
    }

    public final String toString() {
        return "IONFILEReadOptions(encoding=" + this.f1921a + ")";
    }
}
