package j0;

import android.net.Uri;

/* renamed from: j0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205D extends AbstractC0207F {
    public final Uri d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0205D(Uri uri) {
        super(false);
        x0.g.e("uri", uri);
        this.d = uri;
    }

    @Override // j0.AbstractC0207F
    public final Uri b0() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0205D) && x0.g.a(this.d, ((C0205D) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Content(uri=" + this.d + ")";
    }
}
