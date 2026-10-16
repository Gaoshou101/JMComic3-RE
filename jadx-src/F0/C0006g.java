package F0;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: F0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g extends P {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f110e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f111f;

    public /* synthetic */ C0006g(int i2, Object obj) {
        this.f110e = i2;
        this.f111f = obj;
    }

    @Override // F0.P
    public final boolean k() {
        switch (this.f110e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // F0.P
    public final void l(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f110e) {
            case 0:
                T tJ = j();
                C0004e c0004e = (C0004e) this.f111f;
                c0004e.getClass();
                CancellationException cancellationExceptionT = tJ.t();
                if (c0004e.q()) {
                    K0.f fVar = (K0.f) c0004e.f107e;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K0.f.f381i;
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        K0.u uVar = K0.a.f372c;
                        if (x0.g.a(obj, uVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, uVar, cancellationExceptionT)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != uVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c0004e.l(cancellationExceptionT);
                if (!c0004e.q()) {
                    c0004e.m();
                    break;
                }
                break;
            default:
                ((w0.l) this.f111f).g(th);
                break;
        }
    }
}
