package j0;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1935a;

    public C0210a(boolean z2) {
        this.f1935a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0210a) && this.f1935a == ((C0210a) obj).f1935a;
    }

    public final int hashCode() {
        return this.f1935a ? 1231 : 1237;
    }

    public final String toString() {
        return "IONFILECreateOptions(recursive=" + this.f1935a + ")";
    }
}
