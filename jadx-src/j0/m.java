package J0;

import n0.InterfaceC0311d;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public final class m implements InterfaceC0311d, p0.d {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0311d f361b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0316i f362c;

    public m(InterfaceC0311d interfaceC0311d, InterfaceC0316i interfaceC0316i) {
        this.f361b = interfaceC0311d;
        this.f362c = interfaceC0316i;
    }

    @Override // p0.d
    public final p0.d d() {
        InterfaceC0311d interfaceC0311d = this.f361b;
        if (interfaceC0311d instanceof p0.d) {
            return (p0.d) interfaceC0311d;
        }
        return null;
    }

    @Override // n0.InterfaceC0311d
    public final InterfaceC0316i getContext() {
        return this.f362c;
    }

    @Override // n0.InterfaceC0311d
    public final void h(Object obj) {
        this.f361b.h(obj);
    }
}
