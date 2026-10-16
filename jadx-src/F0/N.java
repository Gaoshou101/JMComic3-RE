package F0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class N extends T {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(L l2) {
        super(true);
        boolean z2 = true;
        y(l2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T.f98c;
        InterfaceC0007h interfaceC0007h = (InterfaceC0007h) atomicReferenceFieldUpdater.get(this);
        C0008i c0008i = interfaceC0007h instanceof C0008i ? (C0008i) interfaceC0007h : null;
        if (c0008i == null) {
            z2 = false;
            break;
        }
        T tJ = c0008i.j();
        while (!tJ.u()) {
            InterfaceC0007h interfaceC0007h2 = (InterfaceC0007h) atomicReferenceFieldUpdater.get(tJ);
            C0008i c0008i2 = interfaceC0007h2 instanceof C0008i ? (C0008i) interfaceC0007h2 : null;
            if (c0008i2 == null) {
                z2 = false;
                break;
            }
            tJ = c0008i2.j();
        }
        this.d = z2;
    }

    @Override // F0.T
    public final boolean u() {
        return this.d;
    }
}
