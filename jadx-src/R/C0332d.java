package r;

import a.AbstractC0062a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332d extends AbstractC0062a {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2615c;
    public final AtomicReferenceFieldUpdater d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2616e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2617f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2618g;

    public C0332d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2615c = atomicReferenceFieldUpdater;
        this.d = atomicReferenceFieldUpdater2;
        this.f2616e = atomicReferenceFieldUpdater3;
        this.f2617f = atomicReferenceFieldUpdater4;
        this.f2618g = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0062a
    public final void L(C0334f c0334f, C0334f c0334f2) {
        this.d.lazySet(c0334f, c0334f2);
    }

    @Override // a.AbstractC0062a
    public final void M(C0334f c0334f, Thread thread) {
        this.f2615c.lazySet(c0334f, thread);
    }

    @Override // a.AbstractC0062a
    public final boolean f(g gVar, C0331c c0331c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0331c c0331c2 = C0331c.f2613b;
        do {
            atomicReferenceFieldUpdater = this.f2617f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c0331c, c0331c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c0331c);
        return false;
    }

    @Override // a.AbstractC0062a
    public final boolean g(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2618g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // a.AbstractC0062a
    public final boolean h(g gVar, C0334f c0334f, C0334f c0334f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2616e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c0334f, c0334f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c0334f);
        return false;
    }
}
