package I0;

/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D.c f290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.m f291b;

    public h(D.c cVar, a0.m mVar) {
        this.f290a = cVar;
        this.f291b = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(I0.c r10, p0.c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof I0.g
            if (r0 == 0) goto L13
            r0 = r11
            I0.g r0 = (I0.g) r0
            int r1 = r0.f287f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f287f = r1
            goto L18
        L13:
            I0.g r0 = new I0.g
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f286e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f287f
            k0.h r3 = k0.C0235h.f2029a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L52
            if (r2 == r6) goto L46
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r10 = r0.h
            J0.h r10 = (J0.h) r10
            a.AbstractC0062a.X(r11)     // Catch: java.lang.Throwable -> L34
            goto L7e
        L34:
            r11 = move-exception
            goto L88
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            java.lang.Object r10 = r0.h
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            a.AbstractC0062a.X(r11)
            goto La4
        L46:
            I0.c r10 = r0.f289i
            java.lang.Object r2 = r0.h
            I0.h r2 = (I0.h) r2
            a.AbstractC0062a.X(r11)     // Catch: java.lang.Throwable -> L50
            goto L65
        L50:
            r10 = move-exception
            goto L90
        L52:
            a.AbstractC0062a.X(r11)
            D.c r11 = r9.f290a     // Catch: java.lang.Throwable -> L8e
            r0.h = r9     // Catch: java.lang.Throwable -> L8e
            r0.f289i = r10     // Catch: java.lang.Throwable -> L8e
            r0.f287f = r6     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r11 = r11.o(r10, r0)     // Catch: java.lang.Throwable -> L8e
            if (r11 != r1) goto L64
            return r1
        L64:
            r2 = r9
        L65:
            J0.h r11 = new J0.h
            n0.i r5 = r0.f2603c
            x0.g.b(r5)
            r11.<init>(r10, r5)
            a0.m r10 = r2.f291b     // Catch: java.lang.Throwable -> L86
            r0.h = r11     // Catch: java.lang.Throwable -> L86
            r0.f289i = r7     // Catch: java.lang.Throwable -> L86
            r0.f287f = r4     // Catch: java.lang.Throwable -> L86
            r10.e(r11, r7, r0)     // Catch: java.lang.Throwable -> L86
            if (r3 != r1) goto L7d
            return r1
        L7d:
            r10 = r11
        L7e:
            r10.l()
            return r3
        L82:
            r8 = r11
            r11 = r10
            r10 = r8
            goto L88
        L86:
            r10 = move-exception
            goto L82
        L88:
            r10.l()
            throw r11
        L8c:
            r2 = r9
            goto L90
        L8e:
            r10 = move-exception
            goto L8c
        L90:
            I0.n r11 = new I0.n
            r11.<init>(r10)
            a0.m r2 = r2.f291b
            r0.h = r10
            r0.f289i = r7
            r0.f287f = r5
            java.lang.Object r11 = a.AbstractC0062a.d(r11, r2, r10, r0)
            if (r11 != r1) goto La4
            return r1
        La4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.h.o(I0.c, p0.c):java.lang.Object");
    }
}
