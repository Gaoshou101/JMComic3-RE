package x0;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2705a;

    public i(Class cls) {
        this.f2705a = cls;
    }

    @Override // x0.c
    public final Class a() {
        return this.f2705a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (g.a(this.f2705a, ((i) obj).f2705a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2705a.hashCode();
    }

    public final String toString() {
        return this.f2705a.toString() + " (Kotlin reflection is not available)";
    }
}
