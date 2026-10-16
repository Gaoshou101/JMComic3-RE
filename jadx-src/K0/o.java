package K0;

import F0.AbstractC0015p;
import F0.AbstractC0021w;
import F0.InterfaceC0022x;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public final class o extends AbstractC0015p implements InterfaceC0022x {
    public final AbstractC0015p d;

    /* renamed from: e, reason: collision with root package name */
    public final String f401e;

    /* JADX WARN: Multi-variable type inference failed */
    public o(AbstractC0015p abstractC0015p, String str) {
        if ((abstractC0015p instanceof InterfaceC0022x ? (InterfaceC0022x) abstractC0015p : null) == null) {
            int i2 = AbstractC0021w.f135a;
        }
        this.d = abstractC0015p;
        this.f401e = str;
    }

    @Override // F0.AbstractC0015p
    public final void d(InterfaceC0316i interfaceC0316i, Runnable runnable) {
        this.d.d(interfaceC0316i, runnable);
    }

    @Override // F0.AbstractC0015p
    public final boolean f(InterfaceC0316i interfaceC0316i) {
        return this.d.f(interfaceC0316i);
    }

    @Override // F0.AbstractC0015p
    public final String toString() {
        return this.f401e;
    }
}
