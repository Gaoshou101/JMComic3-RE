package K0;

import F0.AbstractC0015p;
import F0.AbstractC0019u;
import F0.AbstractC0024z;
import F0.C0010k;
import F0.F;
import F0.a0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.C0232e;
import n0.InterfaceC0311d;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public final class f extends AbstractC0024z implements p0.d, InterfaceC0311d {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f381i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0015p f382e;

    /* renamed from: f, reason: collision with root package name */
    public final p0.c f383f;

    /* renamed from: g, reason: collision with root package name */
    public Object f384g;
    public final Object h;

    public f(AbstractC0015p abstractC0015p, p0.c cVar) {
        super(-1);
        this.f382e = abstractC0015p;
        this.f383f = cVar;
        this.f384g = a.f371b;
        this.h = a.m(cVar.getContext());
    }

    @Override // p0.d
    public final p0.d d() {
        return this.f383f;
    }

    @Override // n0.InterfaceC0311d
    public final InterfaceC0316i getContext() {
        return this.f383f.getContext();
    }

    @Override // n0.InterfaceC0311d
    public final void h(Object obj) {
        Throwable thA = C0232e.a(obj);
        Object c0010k = thA == null ? obj : new C0010k(thA, false);
        p0.c cVar = this.f383f;
        InterfaceC0316i context = cVar.getContext();
        AbstractC0015p abstractC0015p = this.f382e;
        if (abstractC0015p.f(context)) {
            this.f384g = c0010k;
            this.d = 0;
            abstractC0015p.d(cVar.getContext(), this);
            return;
        }
        F fA = a0.a();
        if (fA.d >= 4294967296L) {
            this.f384g = c0010k;
            this.d = 0;
            l0.f fVar = fA.f85f;
            if (fVar == null) {
                fVar = new l0.f();
                fA.f85f = fVar;
            }
            fVar.addLast(this);
            return;
        }
        fA.l(true);
        try {
            InterfaceC0316i context2 = cVar.getContext();
            Object objN = a.n(context2, this.h);
            try {
                cVar.h(obj);
                while (fA.m()) {
                }
            } finally {
                a.i(context2, objN);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // F0.AbstractC0024z
    public final Object i() {
        Object obj = this.f384g;
        this.f384g = a.f371b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f382e + ", " + AbstractC0019u.j(this.f383f) + ']';
    }

    @Override // F0.AbstractC0024z
    public final InterfaceC0311d c() {
        return this;
    }
}
