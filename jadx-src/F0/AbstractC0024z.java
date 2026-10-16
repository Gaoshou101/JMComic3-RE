package F0;

import a.AbstractC0062a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import n0.InterfaceC0311d;
import n0.InterfaceC0316i;

/* renamed from: F0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0024z extends M0.i {
    public int d;

    public AbstractC0024z(int i2) {
        super(0L, false);
        this.d = i2;
    }

    public abstract InterfaceC0311d c();

    public Throwable e(Object obj) {
        C0010k c0010k = obj instanceof C0010k ? (C0010k) obj : null;
        if (c0010k != null) {
            return c0010k.f117a;
        }
        return null;
    }

    public final void g(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC0019u.d(new C0018t("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            InterfaceC0311d interfaceC0311dC = c();
            x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>", interfaceC0311dC);
            K0.f fVar = (K0.f) interfaceC0311dC;
            p0.c cVar = fVar.f383f;
            Object obj = fVar.h;
            InterfaceC0316i context = cVar.getContext();
            Object objN = K0.a.n(context, obj);
            L l2 = null;
            c0 c0VarK = objN != K0.a.d ? AbstractC0019u.k(cVar, context, objN) : null;
            try {
                InterfaceC0316i context2 = cVar.getContext();
                Object objI = i();
                Throwable thE = e(objI);
                if (thE == null && AbstractC0019u.f(this.d)) {
                    l2 = (L) context2.g(C0016q.f123c);
                }
                if (l2 != null && !l2.b()) {
                    CancellationException cancellationExceptionT = ((T) l2).t();
                    b(cancellationExceptionT);
                    cVar.h(AbstractC0062a.m(cancellationExceptionT));
                } else if (thE != null) {
                    cVar.h(AbstractC0062a.m(thE));
                } else {
                    cVar.h(f(objI));
                }
                if (c0VarK != null && !c0VarK.O()) {
                    return;
                }
                K0.a.i(context, objN);
            } catch (Throwable th) {
                if (c0VarK == null || c0VarK.O()) {
                    K0.a.i(context, objN);
                }
                throw th;
            }
        } catch (Throwable th2) {
            g(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
