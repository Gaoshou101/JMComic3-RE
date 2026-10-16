package F0;

import n0.AbstractC0308a;
import n0.C0312e;
import n0.C0317j;
import n0.InterfaceC0313f;
import n0.InterfaceC0314g;
import n0.InterfaceC0315h;
import n0.InterfaceC0316i;

/* renamed from: F0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0015p extends AbstractC0308a implements InterfaceC0313f {

    /* renamed from: c, reason: collision with root package name */
    public static final C0014o f121c = new C0014o(C0312e.f2506b, new C0013n());

    public AbstractC0015p() {
        super(C0312e.f2506b);
    }

    @Override // n0.AbstractC0308a, n0.InterfaceC0316i
    public final InterfaceC0316i c(InterfaceC0315h interfaceC0315h) {
        x0.g.e("key", interfaceC0315h);
        boolean z2 = interfaceC0315h instanceof C0014o;
        C0317j c0317j = C0317j.f2507b;
        if (z2) {
            C0014o c0014o = (C0014o) interfaceC0315h;
            InterfaceC0315h interfaceC0315h2 = this.f2501b;
            if ((interfaceC0315h2 == c0014o || c0014o.f120c == interfaceC0315h2) && ((InterfaceC0314g) c0014o.f119b.g(this)) != null) {
                return c0317j;
            }
        } else if (C0312e.f2506b == interfaceC0315h) {
            return c0317j;
        }
        return this;
    }

    public abstract void d(InterfaceC0316i interfaceC0316i, Runnable runnable);

    public boolean f(InterfaceC0316i interfaceC0316i) {
        return !(this instanceof b0);
    }

    @Override // n0.AbstractC0308a, n0.InterfaceC0316i
    public final InterfaceC0314g g(InterfaceC0315h interfaceC0315h) {
        x0.g.e("key", interfaceC0315h);
        if (!(interfaceC0315h instanceof C0014o)) {
            if (C0312e.f2506b == interfaceC0315h) {
                return this;
            }
            return null;
        }
        C0014o c0014o = (C0014o) interfaceC0315h;
        InterfaceC0315h interfaceC0315h2 = this.f2501b;
        if (interfaceC0315h2 != c0014o && c0014o.f120c != interfaceC0315h2) {
            return null;
        }
        InterfaceC0314g interfaceC0314g = (InterfaceC0314g) c0014o.f119b.g(this);
        if (interfaceC0314g instanceof InterfaceC0314g) {
            return interfaceC0314g;
        }
        return null;
    }

    public AbstractC0015p h(String str, int i2) {
        K0.a.c(i2);
        return new K0.g(this, i2, str);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0019u.b(this);
    }
}
