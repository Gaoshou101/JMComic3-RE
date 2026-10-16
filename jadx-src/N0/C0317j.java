package n0;

import java.io.Serializable;
import w0.p;

/* renamed from: n0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317j implements InterfaceC0316i, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0317j f2507b = new C0317j();

    @Override // n0.InterfaceC0316i
    public final InterfaceC0316i c(InterfaceC0315h interfaceC0315h) {
        x0.g.e("key", interfaceC0315h);
        return this;
    }

    @Override // n0.InterfaceC0316i
    public final InterfaceC0316i e(InterfaceC0316i interfaceC0316i) {
        x0.g.e("context", interfaceC0316i);
        return interfaceC0316i;
    }

    @Override // n0.InterfaceC0316i
    public final InterfaceC0314g g(InterfaceC0315h interfaceC0315h) {
        x0.g.e("key", interfaceC0315h);
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // n0.InterfaceC0316i
    public final Object j(Object obj, p pVar) {
        return obj;
    }
}
