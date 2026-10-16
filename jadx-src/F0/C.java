package F0;

/* loaded from: classes.dex */
public final class C implements I {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81a;

    public C(boolean z2) {
        this.f81a = z2;
    }

    @Override // F0.I
    public final boolean b() {
        return this.f81a;
    }

    @Override // F0.I
    public final U d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f81a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
