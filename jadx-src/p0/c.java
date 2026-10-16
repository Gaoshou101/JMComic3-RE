package p0;

import F0.C0004e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C0312e;
import n0.InterfaceC0311d;
import n0.InterfaceC0314g;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public abstract class c extends AbstractC0326a {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0316i f2603c;
    public transient InterfaceC0311d d;

    public c(InterfaceC0311d interfaceC0311d, InterfaceC0316i interfaceC0316i) {
        super(interfaceC0311d);
        this.f2603c = interfaceC0316i;
    }

    @Override // n0.InterfaceC0311d
    public InterfaceC0316i getContext() {
        InterfaceC0316i interfaceC0316i = this.f2603c;
        x0.g.b(interfaceC0316i);
        return interfaceC0316i;
    }

    @Override // p0.AbstractC0326a
    public void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0311d interfaceC0311d = this.d;
        if (interfaceC0311d != null && interfaceC0311d != this) {
            InterfaceC0314g interfaceC0314gG = getContext().g(C0312e.f2506b);
            x0.g.b(interfaceC0314gG);
            K0.f fVar = (K0.f) interfaceC0311d;
            do {
                atomicReferenceFieldUpdater = K0.f.f381i;
            } while (atomicReferenceFieldUpdater.get(fVar) == K0.a.f372c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0004e c0004e = obj instanceof C0004e ? (C0004e) obj : null;
            if (c0004e != null) {
                c0004e.m();
            }
        }
        this.d = C0327b.f2602b;
    }

    public c(InterfaceC0311d interfaceC0311d) {
        this(interfaceC0311d, interfaceC0311d != null ? interfaceC0311d.getContext() : null);
    }
}
