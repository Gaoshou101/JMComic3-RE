package j0;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1936a;

    public C0211b(boolean z2) {
        this.f1936a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0211b) && this.f1936a == ((C0211b) obj).f1936a;
    }

    public final int hashCode() {
        return this.f1936a ? 1231 : 1237;
    }

    public final String toString() {
        return "IONFILEDeleteOptions(recursive=" + this.f1936a + ")";
    }
}
