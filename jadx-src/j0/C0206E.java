package j0;

import android.net.Uri;

/* renamed from: j0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206E extends AbstractC0207F {
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f1927e;

    /* renamed from: f, reason: collision with root package name */
    public final EnumC0209H f1928f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1929g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0206E(String str, Uri uri, EnumC0209H enumC0209H, boolean z2) {
        super(z2);
        x0.g.e("fullPath", str);
        this.d = str;
        this.f1927e = uri;
        this.f1928f = enumC0209H;
        this.f1929g = z2;
    }

    @Override // j0.AbstractC0207F
    public final boolean a0() {
        return this.f1929g;
    }

    @Override // j0.AbstractC0207F
    public final Uri b0() {
        return this.f1927e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0206E)) {
            return false;
        }
        C0206E c0206e = (C0206E) obj;
        return x0.g.a(this.d, c0206e.d) && x0.g.a(this.f1927e, c0206e.f1927e) && this.f1928f == c0206e.f1928f && this.f1929g == c0206e.f1929g;
    }

    public final int hashCode() {
        return ((this.f1928f.hashCode() + ((this.f1927e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31) + (this.f1929g ? 1231 : 1237);
    }

    public final String toString() {
        return "Local(fullPath=" + this.d + ", uri=" + this.f1927e + ", type=" + this.f1928f + ", inExternalStorage=" + this.f1929g + ")";
    }
}
