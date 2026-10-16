package M0;

import F0.AbstractC0015p;
import K0.o;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public final class l extends AbstractC0015p {
    public static final l d = new l();

    @Override // F0.AbstractC0015p
    public final void d(InterfaceC0316i interfaceC0316i, Runnable runnable) {
        e.f457e.d.b(runnable, true, false);
    }

    @Override // F0.AbstractC0015p
    public final AbstractC0015p h(String str, int i2) {
        K0.a.c(i2);
        return i2 >= k.d ? str != null ? new o(this, str) : this : super.h(str, i2);
    }

    @Override // F0.AbstractC0015p
    public final String toString() {
        return "Dispatchers.IO";
    }
}
