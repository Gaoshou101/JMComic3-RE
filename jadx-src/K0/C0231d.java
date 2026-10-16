package k0;

import java.io.Serializable;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231d implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f2024b;

    public C0231d(Throwable th) {
        x0.g.e("exception", th);
        this.f2024b = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0231d) {
            if (x0.g.a(this.f2024b, ((C0231d) obj).f2024b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2024b.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2024b + ')';
    }
}
