package J0;

import java.util.ArrayList;
import n0.C0317j;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public final class d implements I0.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0316i f346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f347b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.a f348c;
    public final X.i d;

    public d(X.i iVar, InterfaceC0316i interfaceC0316i, int i2, H0.a aVar) {
        this.f346a = interfaceC0316i;
        this.f347b = i2;
        this.f348c = aVar;
        this.d = iVar;
    }

    public final String a() {
        ArrayList arrayList = new ArrayList(4);
        C0317j c0317j = C0317j.f2507b;
        InterfaceC0316i interfaceC0316i = this.f346a;
        if (interfaceC0316i != c0317j) {
            arrayList.add("context=" + interfaceC0316i);
        }
        int i2 = this.f347b;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        H0.a aVar = H0.a.f224b;
        H0.a aVar2 = this.f348c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + l0.h.O(arrayList, null, null, null, 62) + ']';
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(I0.c r8, p0.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            k0.h r0 = k0.C0235h.f2029a
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r7.f347b
            r3 = -3
            r4 = 0
            if (r2 != r3) goto L75
            n0.i r2 = r9.getContext()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            F0.m r5 = new F0.m
            r6 = 0
            r5.<init>(r6)
            n0.i r6 = r7.f346a
            java.lang.Object r3 = r6.j(r3, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L29
            n0.i r3 = r2.e(r6)
            goto L2e
        L29:
            r3 = 0
            n0.i r3 = F0.AbstractC0019u.a(r2, r6, r3)
        L2e:
            boolean r5 = x0.g.a(r3, r2)
            if (r5 == 0) goto L42
            X.i r2 = r7.d
            java.lang.Object r8 = r2.o(r8, r9)
            if (r8 != r1) goto L3d
            goto L3e
        L3d:
            r8 = r0
        L3e:
            if (r8 != r1) goto L8e
        L40:
            r0 = r8
            goto L8e
        L42:
            n0.e r5 = n0.C0312e.f2506b
            n0.g r6 = r3.g(r5)
            n0.g r2 = r2.g(r5)
            boolean r2 = x0.g.a(r6, r2)
            if (r2 == 0) goto L75
            n0.i r2 = r9.getContext()
            boolean r5 = r8 instanceof J0.l
            if (r5 != 0) goto L65
            boolean r5 = r8 instanceof J0.g
            if (r5 == 0) goto L5f
            goto L65
        L5f:
            J0.o r5 = new J0.o
            r5.<init>(r8, r2)
            r8 = r5
        L65:
            J0.c r2 = new J0.c
            r2.<init>(r7, r4)
            java.lang.Object r4 = K0.a.m(r3)
            java.lang.Object r8 = P0.b.I(r3, r8, r4, r2, r9)
            if (r8 != r1) goto L8e
            goto L40
        L75:
            J0.a r2 = new J0.a
            r2.<init>(r8, r7, r4)
            K0.r r8 = new K0.r
            n0.i r3 = r9.getContext()
            r8.<init>(r3, r9)
            java.lang.Object r8 = a.AbstractC0062a.W(r8, r8, r2)
            if (r8 != r1) goto L8a
            goto L8b
        L8a:
            r8 = r0
        L8b:
            if (r8 != r1) goto L8e
            goto L40
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.d.o(I0.c, p0.c):java.lang.Object");
    }

    public final String toString() {
        return this.d + " -> " + a();
    }
}
