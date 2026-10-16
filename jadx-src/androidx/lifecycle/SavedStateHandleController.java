package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements p {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1291b;

    @Override // androidx.lifecycle.p
    public final void b(r rVar, EnumC0080l enumC0080l) {
        if (enumC0080l == EnumC0080l.ON_DESTROY) {
            this.f1291b = false;
            rVar.d().f(this);
        }
    }
}
