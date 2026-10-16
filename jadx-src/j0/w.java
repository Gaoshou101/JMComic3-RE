package j0;

/* loaded from: classes.dex */
public final class w extends P0.b {

    /* renamed from: m, reason: collision with root package name */
    public final String f1947m;

    public w(String str) {
        this.f1947m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && x0.g.a(this.f1947m, ((w) obj).f1947m);
    }

    public final int hashCode() {
        return this.f1947m.hashCode();
    }

    public final String toString() {
        return "File(mimeType=" + this.f1947m + ")";
    }
}
