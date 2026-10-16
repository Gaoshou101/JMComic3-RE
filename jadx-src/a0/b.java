package a0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f735a;

    /* renamed from: b, reason: collision with root package name */
    public final String f736b;

    public b(String str, String str2) {
        x0.g.e("code", str);
        x0.g.e("message", str2);
        this.f735a = str;
        this.f736b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return x0.g.a(this.f735a, bVar.f735a) && x0.g.a(this.f736b, bVar.f736b);
    }

    public final int hashCode() {
        return this.f736b.hashCode() + (this.f735a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorInfo(code=" + this.f735a + ", message=" + this.f736b + ")";
    }
}
