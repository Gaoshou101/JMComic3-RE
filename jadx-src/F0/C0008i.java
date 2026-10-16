package F0;

import java.util.concurrent.CancellationException;

/* renamed from: F0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008i extends P implements InterfaceC0007h {

    /* renamed from: e, reason: collision with root package name */
    public final T f112e;

    public C0008i(T t2) {
        this.f112e = t2;
    }

    @Override // F0.InterfaceC0007h
    public final boolean c(Throwable th) {
        T tJ = j();
        if (th instanceof CancellationException) {
            return true;
        }
        return tJ.m(th) && tJ.u();
    }

    @Override // F0.P
    public final boolean k() {
        return true;
    }

    @Override // F0.P
    public final void l(Throwable th) {
        this.f112e.m(j());
    }
}
