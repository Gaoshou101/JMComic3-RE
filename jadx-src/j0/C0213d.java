package j0;

import java.nio.charset.Charset;

/* renamed from: j0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213d extends AbstractC0214e {

    /* renamed from: b, reason: collision with root package name */
    public final Charset f1938b;

    public C0213d(Charset charset) {
        x0.g.e("charset", charset);
        this.f1938b = charset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0213d) && x0.g.a(this.f1938b, ((C0213d) obj).f1938b);
    }

    public final int hashCode() {
        return this.f1938b.hashCode();
    }

    public final String toString() {
        return "WithCharset(charset=" + this.f1938b + ")";
    }
}
