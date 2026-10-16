package h0;

import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193u extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public L.c f1835f;

    /* renamed from: g, reason: collision with root package name */
    public int f1836g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f1837i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f1838j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ L.c f1839k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0193u(String str, String str2, L.c cVar, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1837i = str;
        this.f1838j = str2;
        this.f1839k = cVar;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0193u) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        C0193u c0193u = new C0193u(this.f1837i, this.f1838j, this.f1839k, interfaceC0311d);
        c0193u.h = obj;
        return c0193u;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:6:0x000d, B:43:0x00a2, B:56:0x00c7, B:46:0x00a9, B:47:0x00ae, B:13:0x0027, B:38:0x008a, B:40:0x0090, B:48:0x00af, B:49:0x00b4, B:16:0x003c, B:18:0x004c, B:20:0x0052, B:22:0x0058, B:24:0x005e, B:26:0x0064, B:29:0x006b, B:30:0x0070, B:31:0x0071, B:33:0x0077, B:35:0x007d, B:50:0x00b5, B:51:0x00ba, B:52:0x00bb, B:53:0x00c0, B:54:0x00c1, B:55:0x00c6), top: B:61:0x0007 }] */
    @Override // p0.AbstractC0326a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r10) {
        /*
            r9 = this;
            o0.a r0 = o0.EnumC0322a.f2519b
            int r1 = r9.f1836g
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            a.AbstractC0062a.X(r10)     // Catch: java.lang.Throwable -> L16
            k0.e r10 = (k0.C0232e) r10     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = r10.f2025b     // Catch: java.lang.Throwable -> L16
            goto La2
        L16:
            r10 = move-exception
            goto Lca
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            L.c r1 = r9.f1835f
            java.lang.Object r5 = r9.h
            java.lang.String r5 = (java.lang.String) r5
            a.AbstractC0062a.X(r10)     // Catch: java.lang.Throwable -> L16
            k0.e r10 = (k0.C0232e) r10     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = r10.f2025b     // Catch: java.lang.Throwable -> L16
            goto L8a
        L2f:
            a.AbstractC0062a.X(r10)
            java.lang.Object r10 = r9.h
            F0.r r10 = (F0.r) r10
            java.lang.String r5 = r9.f1837i
            java.lang.String r10 = r9.f1838j
            L.c r1 = r9.f1839k
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L16
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L16
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L16
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L16
            boolean r8 = r6.equals(r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != 0) goto Lc7
            boolean r8 = r6.exists()     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto Lc1
            boolean r8 = r6.isFile()     // Catch: java.lang.Throwable -> L16
            if (r8 != 0) goto Lbb
            boolean r8 = r7.isFile()     // Catch: java.lang.Throwable -> L16
            if (r8 != 0) goto Lbb
            java.io.File r8 = r7.getParentFile()     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto L71
            boolean r8 = r8.exists()     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto L6b
            goto L71
        L6b:
            j0.i r10 = new j0.i     // Catch: java.lang.Throwable -> L16
            r10.<init>()     // Catch: java.lang.Throwable -> L16
            throw r10     // Catch: java.lang.Throwable -> L16
        L71:
            boolean r8 = r7.isDirectory()     // Catch: java.lang.Throwable -> L16
            if (r8 != 0) goto Lb5
            boolean r6 = r6.renameTo(r7)     // Catch: java.lang.Throwable -> L16
            if (r6 != 0) goto Lc7
            r9.h = r5     // Catch: java.lang.Throwable -> L16
            r9.f1835f = r1     // Catch: java.lang.Throwable -> L16
            r9.f1836g = r4     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = r1.e(r5, r10, r9)     // Catch: java.lang.Throwable -> L16
            if (r10 != r0) goto L8a
            return r0
        L8a:
            java.lang.Throwable r10 = k0.C0232e.a(r10)     // Catch: java.lang.Throwable -> L16
            if (r10 != 0) goto Laf
            j0.b r10 = new j0.b     // Catch: java.lang.Throwable -> L16
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L16
            r9.h = r2     // Catch: java.lang.Throwable -> L16
            r9.f1835f = r2     // Catch: java.lang.Throwable -> L16
            r9.f1836g = r3     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = r1.m(r5, r10, r9)     // Catch: java.lang.Throwable -> L16
            if (r10 != r0) goto La2
            return r0
        La2:
            java.lang.Throwable r10 = k0.C0232e.a(r10)     // Catch: java.lang.Throwable -> L16
            if (r10 != 0) goto La9
            goto Lc7
        La9:
            j0.s r0 = new j0.s     // Catch: java.lang.Throwable -> L16
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        Laf:
            j0.s r0 = new j0.s     // Catch: java.lang.Throwable -> L16
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        Lb5:
            j0.f r0 = new j0.f     // Catch: java.lang.Throwable -> L16
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        Lbb:
            j0.h r10 = new j0.h     // Catch: java.lang.Throwable -> L16
            r10.<init>()     // Catch: java.lang.Throwable -> L16
            throw r10     // Catch: java.lang.Throwable -> L16
        Lc1:
            j0.o r10 = new j0.o     // Catch: java.lang.Throwable -> L16
            r10.<init>(r5, r2)     // Catch: java.lang.Throwable -> L16
            throw r10     // Catch: java.lang.Throwable -> L16
        Lc7:
            k0.h r10 = k0.C0235h.f2029a     // Catch: java.lang.Throwable -> L16
            goto Lce
        Lca:
            k0.d r10 = a.AbstractC0062a.m(r10)
        Lce:
            k0.e r0 = new k0.e
            r0.<init>(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C0193u.k(java.lang.Object):java.lang.Object");
    }
}
