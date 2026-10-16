package B0;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public static final c f5e = new c(1, 0, 1);

    @Override // B0.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f0b == cVar.f0b) {
                    if (this.f1c == cVar.f1c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // B0.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f0b * 31) + this.f1c;
    }

    @Override // B0.a
    public final boolean isEmpty() {
        return this.f0b > this.f1c;
    }

    @Override // B0.a
    public final String toString() {
        return this.f0b + ".." + this.f1c;
    }
}
