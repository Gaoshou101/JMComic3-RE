package n0;

import w0.p;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309b extends x0.h implements p {
    public static final C0309b d = new C0309b(2, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final C0309b f2502e = new C0309b(2, 1);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2503c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0309b(int i2, int i3) {
        super(i2);
        this.f2503c = i3;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        C0310c c0310c;
        switch (this.f2503c) {
            case 0:
                String str = (String) obj;
                InterfaceC0314g interfaceC0314g = (InterfaceC0314g) obj2;
                x0.g.e("acc", str);
                x0.g.e("element", interfaceC0314g);
                if (str.length() == 0) {
                    return interfaceC0314g.toString();
                }
                return str + ", " + interfaceC0314g;
            default:
                InterfaceC0316i interfaceC0316i = (InterfaceC0316i) obj;
                InterfaceC0314g interfaceC0314g2 = (InterfaceC0314g) obj2;
                x0.g.e("acc", interfaceC0316i);
                x0.g.e("element", interfaceC0314g2);
                InterfaceC0316i interfaceC0316iC = interfaceC0316i.c(interfaceC0314g2.getKey());
                C0317j c0317j = C0317j.f2507b;
                if (interfaceC0316iC == c0317j) {
                    return interfaceC0314g2;
                }
                C0312e c0312e = C0312e.f2506b;
                InterfaceC0313f interfaceC0313f = (InterfaceC0313f) interfaceC0316iC.g(c0312e);
                if (interfaceC0313f == null) {
                    c0310c = new C0310c(interfaceC0316iC, interfaceC0314g2);
                } else {
                    InterfaceC0316i interfaceC0316iC2 = interfaceC0316iC.c(c0312e);
                    if (interfaceC0316iC2 == c0317j) {
                        return new C0310c(interfaceC0314g2, interfaceC0313f);
                    }
                    c0310c = new C0310c(new C0310c(interfaceC0316iC2, interfaceC0314g2), interfaceC0313f);
                }
                return c0310c;
        }
    }
}
