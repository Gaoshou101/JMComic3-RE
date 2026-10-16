package n0;

import java.io.Serializable;
import w0.p;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310c implements InterfaceC0316i, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0316i f2504b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0314g f2505c;

    public C0310c(InterfaceC0316i interfaceC0316i, InterfaceC0314g interfaceC0314g) {
        x0.g.e("left", interfaceC0316i);
        x0.g.e("element", interfaceC0314g);
        this.f2504b = interfaceC0316i;
        this.f2505c = interfaceC0314g;
    }

    @Override // n0.InterfaceC0316i
    public final InterfaceC0316i c(InterfaceC0315h interfaceC0315h) {
        x0.g.e("key", interfaceC0315h);
        InterfaceC0314g interfaceC0314g = this.f2505c;
        InterfaceC0314g interfaceC0314gG = interfaceC0314g.g(interfaceC0315h);
        InterfaceC0316i interfaceC0316i = this.f2504b;
        if (interfaceC0314gG != null) {
            return interfaceC0316i;
        }
        InterfaceC0316i interfaceC0316iC = interfaceC0316i.c(interfaceC0315h);
        return interfaceC0316iC == interfaceC0316i ? this : interfaceC0316iC == C0317j.f2507b ? interfaceC0314g : new C0310c(interfaceC0316iC, interfaceC0314g);
    }

    @Override // n0.InterfaceC0316i
    public final InterfaceC0316i e(InterfaceC0316i interfaceC0316i) {
        x0.g.e("context", interfaceC0316i);
        return interfaceC0316i == C0317j.f2507b ? this : (InterfaceC0316i) interfaceC0316i.j(this, C0309b.f2502e);
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (!(obj instanceof C0310c)) {
                return false;
            }
            C0310c c0310c = (C0310c) obj;
            c0310c.getClass();
            int i2 = 2;
            C0310c c0310c2 = c0310c;
            int i3 = 2;
            while (true) {
                InterfaceC0316i interfaceC0316i = c0310c2.f2504b;
                c0310c2 = interfaceC0316i instanceof C0310c ? (C0310c) interfaceC0316i : null;
                if (c0310c2 == null) {
                    break;
                }
                i3++;
            }
            C0310c c0310c3 = this;
            while (true) {
                InterfaceC0316i interfaceC0316i2 = c0310c3.f2504b;
                c0310c3 = interfaceC0316i2 instanceof C0310c ? (C0310c) interfaceC0316i2 : null;
                if (c0310c3 == null) {
                    break;
                }
                i2++;
            }
            if (i3 != i2) {
                return false;
            }
            C0310c c0310c4 = this;
            while (true) {
                InterfaceC0314g interfaceC0314g = c0310c4.f2505c;
                if (!x0.g.a(c0310c.g(interfaceC0314g.getKey()), interfaceC0314g)) {
                    zA = false;
                    break;
                }
                InterfaceC0316i interfaceC0316i3 = c0310c4.f2504b;
                if (!(interfaceC0316i3 instanceof C0310c)) {
                    x0.g.c("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", interfaceC0316i3);
                    InterfaceC0314g interfaceC0314g2 = (InterfaceC0314g) interfaceC0316i3;
                    zA = x0.g.a(c0310c.g(interfaceC0314g2.getKey()), interfaceC0314g2);
                    break;
                }
                c0310c4 = (C0310c) interfaceC0316i3;
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    @Override // n0.InterfaceC0316i
    public final InterfaceC0314g g(InterfaceC0315h interfaceC0315h) {
        x0.g.e("key", interfaceC0315h);
        C0310c c0310c = this;
        while (true) {
            InterfaceC0314g interfaceC0314gG = c0310c.f2505c.g(interfaceC0315h);
            if (interfaceC0314gG != null) {
                return interfaceC0314gG;
            }
            InterfaceC0316i interfaceC0316i = c0310c.f2504b;
            if (!(interfaceC0316i instanceof C0310c)) {
                return interfaceC0316i.g(interfaceC0315h);
            }
            c0310c = (C0310c) interfaceC0316i;
        }
    }

    public final int hashCode() {
        return this.f2505c.hashCode() + this.f2504b.hashCode();
    }

    @Override // n0.InterfaceC0316i
    public final Object j(Object obj, p pVar) {
        return pVar.f(this.f2504b.j(obj, pVar), this.f2505c);
    }

    public final String toString() {
        return "[" + ((String) j("", C0309b.d)) + ']';
    }
}
