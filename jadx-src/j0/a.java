package J0;

import F0.r;
import k0.C0235h;
import n0.InterfaceC0311d;
import w0.p;

/* loaded from: classes.dex */
public final class a extends p0.g implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f339f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f340g;
    public final /* synthetic */ I0.c h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f341i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(I0.c cVar, d dVar, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = cVar;
        this.f341i = dVar;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((a) i((r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        a aVar = new a(this.h, this.f341i, interfaceC0311d);
        aVar.f340g = obj;
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb A[RETURN] */
    @Override // p0.AbstractC0326a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            o0.a r0 = o0.EnumC0322a.f2519b
            int r1 = r11.f339f
            k0.h r2 = k0.C0235h.f2029a
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            a.AbstractC0062a.X(r12)
            goto Lbc
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L18:
            a.AbstractC0062a.X(r12)
            java.lang.Object r12 = r11.f340g
            F0.r r12 = (F0.r) r12
            J0.d r1 = r11.f341i
            r4 = -3
            int r5 = r1.f347b
            r6 = -2
            if (r5 != r4) goto L28
            r5 = r6
        L28:
            F0.s r4 = F0.EnumC0017s.f125c
            J0.b r7 = new J0.b
            r8 = 0
            r7.<init>(r1, r8)
            H0.a r9 = H0.a.f224b
            H0.a r10 = r1.f348c
            if (r5 == r6) goto L76
            r6 = -1
            if (r5 == r6) goto L64
            if (r5 == 0) goto L55
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L4e
            if (r10 != r9) goto L48
            H0.e r6 = new H0.e
            r6.<init>(r5, r8)
            goto L8b
        L48:
            H0.p r6 = new H0.p
            r6.<init>(r5, r10, r8)
            goto L8b
        L4e:
            H0.e r5 = new H0.e
            r5.<init>(r6, r8)
        L53:
            r6 = r5
            goto L8b
        L55:
            if (r10 != r9) goto L5e
            H0.e r5 = new H0.e
            r6 = 0
            r5.<init>(r6, r8)
            goto L53
        L5e:
            H0.p r5 = new H0.p
            r5.<init>(r3, r10, r8)
            goto L53
        L64:
            if (r10 != r9) goto L6e
            H0.p r6 = new H0.p
            H0.a r5 = H0.a.f225c
            r6.<init>(r3, r5, r8)
            goto L8b
        L6e:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            r12.<init>(r0)
            throw r12
        L76:
            if (r10 != r9) goto L85
            H0.e r5 = new H0.e
            H0.h r6 = H0.i.f260a
            r6.getClass()
            int r6 = H0.h.f259b
            r5.<init>(r6, r8)
            goto L53
        L85:
            H0.p r5 = new H0.p
            r5.<init>(r3, r10, r8)
            goto L53
        L8b:
            n0.i r12 = r12.f()
            n0.i r1 = r1.f346a
            n0.i r12 = F0.AbstractC0019u.a(r12, r1, r3)
            M0.e r1 = F0.A.f80a
            if (r12 == r1) goto La5
            n0.e r5 = n0.C0312e.f2506b
            n0.g r5 = r12.g(r5)
            if (r5 != 0) goto La5
            n0.i r12 = r12.e(r1)
        La5:
            H0.q r1 = new H0.q
            r1.<init>(r12, r6)
            r1.N(r4, r1, r7)
            r11.f339f = r3
            I0.c r12 = r11.h
            java.lang.Object r12 = P0.b.k(r12, r1, r3, r11)
            if (r12 != r0) goto Lb8
            goto Lb9
        Lb8:
            r12 = r2
        Lb9:
            if (r12 != r0) goto Lbc
            return r0
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.a.k(java.lang.Object):java.lang.Object");
    }
}
