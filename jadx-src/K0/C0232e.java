package k0;

import java.io.Serializable;

/* renamed from: k0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232e implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f2025b;

    public static final Throwable a(Object obj) {
        if (obj instanceof C0231d) {
            return ((C0231d) obj).f2024b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0232e) {
            return x0.g.a(this.f2025b, ((C0232e) obj).f2025b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f2025b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f2025b;
        if (obj instanceof C0231d) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
