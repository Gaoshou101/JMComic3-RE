package k0;

import java.io.Serializable;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f2022b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2023c;

    public C0230c(Object obj, Object obj2) {
        this.f2022b = obj;
        this.f2023c = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0230c)) {
            return false;
        }
        C0230c c0230c = (C0230c) obj;
        return x0.g.a(this.f2022b, c0230c.f2022b) && x0.g.a(this.f2023c, c0230c.f2023c);
    }

    public final int hashCode() {
        Object obj = this.f2022b;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2023c;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2022b + ", " + this.f2023c + ')';
    }
}
