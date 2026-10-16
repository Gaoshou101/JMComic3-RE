package h0;

import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167I extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public L.c f1762f;

    /* renamed from: g, reason: collision with root package name */
    public int f1763g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f1764i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f1765j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ L.c f1766k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0167I(String str, String str2, L.c cVar, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1764i = str;
        this.f1765j = str2;
        this.f1766k = cVar;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0167I) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        C0167I c0167i = new C0167I(this.f1764i, this.f1765j, this.f1766k, interfaceC0311d);
        c0167i.h = obj;
        return c0167i;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:6:0x000d, B:42:0x009d, B:53:0x00bc, B:45:0x00a4, B:46:0x00a9, B:13:0x0027, B:37:0x008a, B:39:0x0090, B:47:0x00aa, B:48:0x00af, B:16:0x003c, B:18:0x004c, B:20:0x0052, B:22:0x0058, B:24:0x005e, B:26:0x0064, B:29:0x006b, B:30:0x0070, B:31:0x0071, B:33:0x007a, B:49:0x00b0, B:50:0x00b5, B:51:0x00b6, B:52:0x00bb), top: B:58:0x0007 }] */
    @Override // p0.AbstractC0326a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r10) {
        /*
            r9 = this;
            o0.a r0 = o0.EnumC0322a.f2519b
            int r1 = r9.f1763g
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L21
            if (r1 != r4) goto L19
            a.AbstractC0062a.X(r10)     // Catch: java.lang.Throwable -> L16
            k0.e r10 = (k0.C0232e) r10     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = r10.f2025b     // Catch: java.lang.Throwable -> L16
            goto L9d
        L16:
            r10 = move-exception
            goto Lbf
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            L.c r1 = r9.f1762f
            java.lang.Object r3 = r9.h
            java.lang.String r3 = (java.lang.String) r3
            a.AbstractC0062a.X(r10)     // Catch: java.lang.Throwable -> L16
            k0.e r10 = (k0.C0232e) r10     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = r10.f2025b     // Catch: java.lang.Throwable -> L16
            goto L8a
        L2f:
            a.AbstractC0062a.X(r10)
            java.lang.Object r10 = r9.h
            F0.r r10 = (F0.r) r10
            java.lang.String r10 = r9.f1764i
            java.lang.String r1 = r9.f1765j
            L.c r5 = r9.f1766k
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L16
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L16
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L16
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L16
            boolean r8 = r6.equals(r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != 0) goto Lbc
            boolean r8 = r6.exists()     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto Lb6
            boolean r8 = r6.isDirectory()     // Catch: java.lang.Throwable -> L16
            if (r8 != 0) goto Lb0
            boolean r8 = r7.isDirectory()     // Catch: java.lang.Throwable -> L16
            if (r8 != 0) goto Lb0
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
            r7.delete()     // Catch: java.lang.Throwable -> L16
            boolean r6 = r6.renameTo(r7)     // Catch: java.lang.Throwable -> L16
            if (r6 != 0) goto Lbc
            r9.h = r10     // Catch: java.lang.Throwable -> L16
            r9.f1762f = r5     // Catch: java.lang.Throwable -> L16
            r9.f1763g = r3     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r5.f(r10, r1, r9)     // Catch: java.lang.Throwable -> L16
            if (r1 != r0) goto L87
            return r0
        L87:
            r3 = r10
            r10 = r1
            r1 = r5
        L8a:
            java.lang.Throwable r10 = k0.C0232e.a(r10)     // Catch: java.lang.Throwable -> L16
            if (r10 != 0) goto Laa
            r9.h = r2     // Catch: java.lang.Throwable -> L16
            r9.f1762f = r2     // Catch: java.lang.Throwable -> L16
            r9.f1763g = r4     // Catch: java.lang.Throwable -> L16
            java.lang.Object r10 = r1.n(r3, r9)     // Catch: java.lang.Throwable -> L16
            if (r10 != r0) goto L9d
            return r0
        L9d:
            java.lang.Throwable r10 = k0.C0232e.a(r10)     // Catch: java.lang.Throwable -> L16
            if (r10 != 0) goto La4
            goto Lbc
        La4:
            j0.s r0 = new j0.s     // Catch: java.lang.Throwable -> L16
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        Laa:
            j0.s r0 = new j0.s     // Catch: java.lang.Throwable -> L16
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        Lb0:
            j0.h r10 = new j0.h     // Catch: java.lang.Throwable -> L16
            r10.<init>()     // Catch: java.lang.Throwable -> L16
            throw r10     // Catch: java.lang.Throwable -> L16
        Lb6:
            j0.o r0 = new j0.o     // Catch: java.lang.Throwable -> L16
            r0.<init>(r10, r2)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        Lbc:
            k0.h r10 = k0.C0235h.f2029a     // Catch: java.lang.Throwable -> L16
            goto Lc3
        Lbf:
            k0.d r10 = a.AbstractC0062a.m(r10)
        Lc3:
            k0.e r0 = new k0.e
            r0.<init>(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C0167I.k(java.lang.Object):java.lang.Object");
    }
}
