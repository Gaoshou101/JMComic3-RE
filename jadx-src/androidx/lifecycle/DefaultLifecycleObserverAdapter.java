package androidx.lifecycle;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements p {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0072d f1273b;

    /* renamed from: c, reason: collision with root package name */
    public final p f1274c;

    public DefaultLifecycleObserverAdapter(InterfaceC0072d interfaceC0072d, p pVar) {
        this.f1273b = interfaceC0072d;
        this.f1274c = pVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, EnumC0080l enumC0080l) {
        int i2 = AbstractC0073e.f1299a[enumC0080l.ordinal()];
        InterfaceC0072d interfaceC0072d = this.f1273b;
        if (i2 == 3) {
            interfaceC0072d.a();
        } else if (i2 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        p pVar = this.f1274c;
        if (pVar != null) {
            pVar.b(rVar, enumC0080l);
        }
    }
}
