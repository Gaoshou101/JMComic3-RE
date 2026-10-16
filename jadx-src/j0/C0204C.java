package j0;

/* renamed from: j0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204C {

    /* renamed from: a, reason: collision with root package name */
    public final String f1924a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0214e f1925b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0203B f1926c;
    public final boolean d;

    public C0204C(String str, AbstractC0214e abstractC0214e, EnumC0203B enumC0203B, boolean z2) {
        x0.g.e("encoding", abstractC0214e);
        this.f1924a = str;
        this.f1925b = abstractC0214e;
        this.f1926c = enumC0203B;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0204C)) {
            return false;
        }
        C0204C c0204c = (C0204C) obj;
        return x0.g.a(this.f1924a, c0204c.f1924a) && x0.g.a(this.f1925b, c0204c.f1925b) && this.f1926c == c0204c.f1926c && this.d == c0204c.d;
    }

    public final int hashCode() {
        return ((this.f1926c.hashCode() + ((this.f1925b.hashCode() + (this.f1924a.hashCode() * 31)) * 31)) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "IONFILESaveOptions(data=" + this.f1924a + ", encoding=" + this.f1925b + ", mode=" + this.f1926c + ", createFileRecursive=" + this.d + ")";
    }
}
