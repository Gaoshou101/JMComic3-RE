package H0;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f261a;

    public j(Throwable th) {
        this.f261a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (x0.g.a(this.f261a, ((j) obj).f261a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f261a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // H0.k
    public final String toString() {
        return "Closed(" + this.f261a + ')';
    }
}
