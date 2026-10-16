package androidx.activity;

/* loaded from: classes.dex */
public final class A implements InterfaceC0067c {

    /* renamed from: b, reason: collision with root package name */
    public final Z.b f808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f809c;

    public A(C c2, Z.b bVar) {
        x0.g.e("onBackPressedCallback", bVar);
        this.f809c = c2;
        this.f808b = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [w0.a, x0.f] */
    @Override // androidx.activity.InterfaceC0067c
    public final void cancel() {
        C c2 = this.f809c;
        l0.f fVar = c2.f812b;
        Z.b bVar = this.f808b;
        fVar.remove(bVar);
        if (x0.g.a(c2.f813c, bVar)) {
            bVar.a();
            c2.f813c = null;
        }
        bVar.f726b.remove(this);
        ?? r02 = bVar.f727c;
        if (r02 != 0) {
            r02.a();
        }
        bVar.f727c = null;
    }
}
