package F;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f77a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f78b;

    public b(Object obj, Object obj2) {
        this.f77a = obj;
        this.f78b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f77a, this.f77a) && Objects.equals(bVar.f78b, this.f78b);
    }

    public final int hashCode() {
        Object obj = this.f77a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f78b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f77a + " " + this.f78b + "}";
    }
}
