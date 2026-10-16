package I0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class l implements c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f303c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ l(c cVar, Serializable serializable, int i2) {
        this.f302b = i2;
        this.f303c = cVar;
        this.d = serializable;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // I0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r7, n0.InterfaceC0311d r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f302b
            switch(r0) {
                case 0: goto L68;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof I0.m
            if (r0 == 0) goto L18
            r0 = r8
            I0.m r0 = (I0.m) r0
            int r1 = r0.f305f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f305f = r1
            goto L1d
        L18:
            I0.m r0 = new I0.m
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f304e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f305f
            k0.h r3 = k0.C0235h.f2029a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            a.AbstractC0062a.X(r8)
            goto L66
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            I0.c r7 = r0.f307i
            java.lang.Object r2 = r0.h
            a.AbstractC0062a.X(r8)
            goto L58
        L41:
            a.AbstractC0062a.X(r8)
            r0.h = r7
            I0.c r8 = r6.f303c
            r0.f307i = r8
            r0.f305f = r5
            java.io.Serializable r2 = r6.d
            a0.l r2 = (a0.l) r2
            r2.f(r7, r0)
            if (r3 != r1) goto L56
            goto L67
        L56:
            r2 = r7
            r7 = r8
        L58:
            r8 = 0
            r0.h = r8
            r0.f307i = r8
            r0.f305f = r4
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L66
            goto L67
        L66:
            r1 = r3
        L67:
            return r1
        L68:
            boolean r0 = r8 instanceof I0.k
            if (r0 == 0) goto L7b
            r0 = r8
            I0.k r0 = (I0.k) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L7b
            int r1 = r1 - r2
            r0.h = r1
            goto L80
        L7b:
            I0.k r0 = new I0.k
            r0.<init>(r6, r8)
        L80:
            java.lang.Object r8 = r0.f300f
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L9b
            if (r2 != r3) goto L93
            I0.l r7 = r0.f299e
            a.AbstractC0062a.X(r8)     // Catch: java.lang.Throwable -> L91
            goto Lab
        L91:
            r8 = move-exception
            goto Lb0
        L93:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L9b:
            a.AbstractC0062a.X(r8)
            I0.c r8 = r6.f303c     // Catch: java.lang.Throwable -> Lae
            r0.f299e = r6     // Catch: java.lang.Throwable -> Lae
            r0.h = r3     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r7 = r8.c(r7, r0)     // Catch: java.lang.Throwable -> Lae
            if (r7 != r1) goto Lab
            goto Lad
        Lab:
            k0.h r1 = k0.C0235h.f2029a
        Lad:
            return r1
        Lae:
            r8 = move-exception
            r7 = r6
        Lb0:
            java.io.Serializable r7 = r7.d
            x0.j r7 = (x0.j) r7
            r7.f2706b = r8
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.l.c(java.lang.Object, n0.d):java.lang.Object");
    }
}
