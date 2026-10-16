package H0;

import F0.AbstractC0000a;
import F0.AbstractC0019u;
import F0.C0010k;
import F0.M;
import F0.S;
import F0.T;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import n0.InterfaceC0311d;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public final class q extends AbstractC0000a implements r, i {

    /* renamed from: e, reason: collision with root package name */
    public final e f266e;

    public q(InterfaceC0316i interfaceC0316i, e eVar) {
        super(interfaceC0316i, true);
        this.f266e = eVar;
    }

    @Override // F0.AbstractC0000a
    public final void L(Throwable th, boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f266e.f(th, false) || z2) {
            return;
        }
        AbstractC0019u.d(th, this.d);
    }

    @Override // F0.AbstractC0000a
    public final void M(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f266e.f(null, false);
    }

    @Override // F0.T, F0.L
    public final void a(CancellationException cancellationException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = T.f97b.get(this);
        if (obj instanceof C0010k) {
            return;
        }
        if ((obj instanceof S) && ((S) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new M(p(), null, this);
        }
        n(cancellationException);
    }

    @Override // H0.t
    public final Object i(Object obj, InterfaceC0311d interfaceC0311d) {
        return this.f266e.i(obj, interfaceC0311d);
    }

    @Override // F0.T
    public final void n(CancellationException cancellationException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f266e.f(cancellationException, true);
        m(cancellationException);
    }
}
