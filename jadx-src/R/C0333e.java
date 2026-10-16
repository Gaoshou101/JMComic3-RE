package r;

import a.AbstractC0062a;

/* renamed from: r.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333e extends AbstractC0062a {
    @Override // a.AbstractC0062a
    public final void L(C0334f c0334f, C0334f c0334f2) {
        c0334f.f2621b = c0334f2;
    }

    @Override // a.AbstractC0062a
    public final void M(C0334f c0334f, Thread thread) {
        c0334f.f2620a = thread;
    }

    @Override // a.AbstractC0062a
    public final boolean f(g gVar, C0331c c0331c) {
        C0331c c0331c2 = C0331c.f2613b;
        synchronized (gVar) {
            try {
                if (gVar.f2626b != c0331c) {
                    return false;
                }
                gVar.f2626b = c0331c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0062a
    public final boolean g(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f2625a != obj) {
                    return false;
                }
                gVar.f2625a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0062a
    public final boolean h(g gVar, C0334f c0334f, C0334f c0334f2) {
        synchronized (gVar) {
            try {
                if (gVar.f2627c != c0334f) {
                    return false;
                }
                gVar.f2627c = c0334f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
