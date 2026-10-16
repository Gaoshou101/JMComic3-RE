package g0;

import android.content.ContentResolver;
import android.content.Context;
import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final u f1740a;

    /* renamed from: b, reason: collision with root package name */
    public final L.c f1741b;

    /* renamed from: c, reason: collision with root package name */
    public final L.c f1742c;
    public final X.i d;

    public k(Context context) {
        u uVar = new u(context);
        L.c cVar = new L.c(17);
        L.c cVar2 = new L.c(16);
        ContentResolver contentResolver = context.getContentResolver();
        x0.g.d("getContentResolver(...)", contentResolver);
        X.i iVar = new X.i(21, contentResolver);
        this.f1740a = uVar;
        this.f1741b = cVar;
        this.f1742c = cVar2;
        this.d = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.AbstractC0062a r10, a.AbstractC0062a r11, p0.c r12) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.a(a.a, a.a, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.AbstractC0062a r7, j0.C0210a r8, p0.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof g0.C0156b
            if (r0 == 0) goto L13
            r0 = r9
            g0.b r0 = (g0.C0156b) r0
            int r1 = r0.f1710i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1710i = r1
            goto L18
        L13:
            g0.b r0 = new g0.b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f1709g
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1710i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f1707e
            j0.E r7 = (j0.C0206E) r7
            a.AbstractC0062a.X(r9)
            k0.e r9 = (k0.C0232e) r9
            java.lang.Object r8 = r9.f2025b
            goto L94
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            j0.a r8 = r0.f1708f
            java.lang.Object r7 = r0.f1707e
            g0.k r7 = (g0.k) r7
            a.AbstractC0062a.X(r9)
            k0.e r9 = (k0.C0232e) r9
            java.lang.Object r9 = r9.f2025b
            goto L6a
        L48:
            a.AbstractC0062a.X(r9)
            boolean r9 = r7 instanceof j0.AbstractC0207F
            if (r9 == 0) goto L54
            j0.F r7 = (j0.AbstractC0207F) r7
            r9 = r8
            r8 = r6
            goto L76
        L54:
            boolean r9 = r7 instanceof j0.C0208G
            if (r9 == 0) goto Lb6
            j0.G r7 = (j0.C0208G) r7
            r0.f1707e = r6
            r0.f1708f = r8
            r0.f1710i = r4
            androidx.emoji2.text.u r9 = r6.f1740a
            java.lang.Object r9 = r9.i(r7, r0)
            if (r9 != r1) goto L69
            return r1
        L69:
            r7 = r6
        L6a:
            java.lang.Throwable r2 = k0.C0232e.a(r9)
            if (r2 != 0) goto Lb1
            j0.F r9 = (j0.AbstractC0207F) r9
            r5 = r8
            r8 = r7
            r7 = r9
            r9 = r5
        L76:
            boolean r2 = r7 instanceof j0.C0206E
            if (r2 == 0) goto La7
            j0.E r7 = (j0.C0206E) r7
            j0.H r2 = r7.f1928f
            j0.H r4 = j0.EnumC0209H.f1932b
            if (r2 == r4) goto L9d
            L.c r8 = r8.f1742c
            r0.f1707e = r7
            r2 = 0
            r0.f1708f = r2
            r0.f1710i = r3
            java.lang.String r2 = r7.d
            java.lang.Object r8 = r8.h(r2, r9, r0)
            if (r8 != r1) goto L94
            return r1
        L94:
            boolean r9 = r8 instanceof k0.C0231d
            if (r9 != 0) goto Lb5
            k0.h r8 = (k0.C0235h) r8
            android.net.Uri r8 = r7.f1927e
            goto Lb5
        L9d:
            j0.r r7 = new j0.r
            r7.<init>()
            k0.d r8 = a.AbstractC0062a.m(r7)
            goto Lb5
        La7:
            j0.p r7 = new j0.p
            r7.<init>()
            k0.d r8 = a.AbstractC0062a.m(r7)
            goto Lb5
        Lb1:
            k0.d r8 = a.AbstractC0062a.m(r2)
        Lb5:
            return r8
        Lb6:
            F0.l r7 = new F0.l
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.b(a.a, j0.a, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(a.AbstractC0062a r9, j0.C0211b r10, p0.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof g0.C0157c
            if (r0 == 0) goto L13
            r0 = r11
            g0.c r0 = (g0.C0157c) r0
            int r1 = r0.f1714i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1714i = r1
            goto L18
        L13:
            g0.c r0 = new g0.c
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f1713g
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1714i
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L49
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L2c
            if (r2 == r4) goto L2c
            if (r2 != r3) goto L35
        L2c:
            a.AbstractC0062a.X(r11)
            k0.e r11 = (k0.C0232e) r11
            java.lang.Object r9 = r11.f2025b
            goto Lbb
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            j0.b r10 = r0.f1712f
            g0.k r9 = r0.f1711e
            a.AbstractC0062a.X(r11)
            k0.e r11 = (k0.C0232e) r11
            java.lang.Object r11 = r11.f2025b
            goto L6b
        L49:
            a.AbstractC0062a.X(r11)
            boolean r11 = r9 instanceof j0.AbstractC0207F
            if (r11 == 0) goto L55
            j0.F r9 = (j0.AbstractC0207F) r9
            r11 = r10
            r10 = r8
            goto L77
        L55:
            boolean r11 = r9 instanceof j0.C0208G
            if (r11 == 0) goto Lbc
            j0.G r9 = (j0.C0208G) r9
            r0.f1711e = r8
            r0.f1712f = r10
            r0.f1714i = r6
            androidx.emoji2.text.u r11 = r8.f1740a
            java.lang.Object r11 = r11.i(r9, r0)
            if (r11 != r1) goto L6a
            return r1
        L6a:
            r9 = r8
        L6b:
            java.lang.Throwable r2 = k0.C0232e.a(r11)
            if (r2 != 0) goto Lb7
            j0.F r11 = (j0.AbstractC0207F) r11
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L77:
            boolean r2 = r9 instanceof j0.C0206E
            r6 = 0
            if (r2 == 0) goto La4
            j0.E r9 = (j0.C0206E) r9
            java.lang.String r2 = r9.d
            j0.H r9 = r9.f1928f
            j0.H r3 = j0.EnumC0209H.f1933c
            if (r9 != r3) goto L95
            L.c r9 = r10.f1742c
            r0.f1711e = r6
            r0.f1712f = r6
            r0.f1714i = r5
            java.lang.Object r9 = r9.m(r2, r11, r0)
            if (r9 != r1) goto Lbb
            return r1
        L95:
            L.c r9 = r10.f1741b
            r0.f1711e = r6
            r0.f1712f = r6
            r0.f1714i = r4
            java.lang.Object r9 = r9.n(r2, r0)
            if (r9 != r1) goto Lbb
            return r1
        La4:
            X.i r10 = r10.d
            android.net.Uri r9 = r9.b0()
            r0.f1711e = r6
            r0.f1712f = r6
            r0.f1714i = r3
            java.lang.Object r9 = r10.B(r9, r0)
            if (r9 != r1) goto Lbb
            return r1
        Lb7:
            k0.d r9 = a.AbstractC0062a.m(r2)
        Lbb:
            return r9
        Lbc:
            F0.l r9 = new F0.l
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.c(a.a, j0.b, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(j0.C0208G r5, p0.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g0.C0158d
            if (r0 == 0) goto L13
            r0 = r6
            g0.d r0 = (g0.C0158d) r0
            int r1 = r0.f1717g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1717g = r1
            goto L18
        L13:
            g0.d r0 = new g0.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f1715e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1717g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            a.AbstractC0062a.X(r6)
            k0.e r6 = (k0.C0232e) r6
            java.lang.Object r5 = r6.f2025b
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            a.AbstractC0062a.X(r6)
            r0.f1717g = r3
            androidx.emoji2.text.u r6 = r4.f1740a
            java.lang.Object r5 = r6.i(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.d(j0.G, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(a.AbstractC0062a r8, p0.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof g0.e
            if (r0 == 0) goto L13
            r0 = r9
            g0.e r0 = (g0.e) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            g0.e r0 = new g0.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f1719f
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L39
            if (r2 == r4) goto L29
            if (r2 != r3) goto L31
        L29:
            a.AbstractC0062a.X(r9)
            k0.e r9 = (k0.C0232e) r9
            java.lang.Object r8 = r9.f2025b
            goto L98
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            g0.k r8 = r0.f1718e
            a.AbstractC0062a.X(r9)
            k0.e r9 = (k0.C0232e) r9
            java.lang.Object r9 = r9.f2025b
            goto L62
        L43:
            a.AbstractC0062a.X(r9)
            boolean r9 = r8 instanceof j0.AbstractC0207F
            if (r9 == 0) goto L4e
            j0.F r8 = (j0.AbstractC0207F) r8
            r9 = r7
            goto L6d
        L4e:
            boolean r9 = r8 instanceof j0.C0208G
            if (r9 == 0) goto L99
            j0.G r8 = (j0.C0208G) r8
            r0.f1718e = r7
            r0.h = r5
            androidx.emoji2.text.u r9 = r7.f1740a
            java.lang.Object r9 = r9.i(r8, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            r8 = r7
        L62:
            java.lang.Throwable r2 = k0.C0232e.a(r9)
            if (r2 != 0) goto L94
            j0.F r9 = (j0.AbstractC0207F) r9
            r6 = r9
            r9 = r8
            r8 = r6
        L6d:
            boolean r2 = r8 instanceof j0.C0206E
            r5 = 0
            if (r2 == 0) goto L83
            L.c r9 = r9.f1741b
            j0.E r8 = (j0.C0206E) r8
            java.lang.String r8 = r8.d
            r0.f1718e = r5
            r0.h = r4
            java.lang.Object r8 = r9.s(r8, r0)
            if (r8 != r1) goto L98
            return r1
        L83:
            X.i r9 = r9.d
            android.net.Uri r8 = r8.b0()
            r0.f1718e = r5
            r0.h = r3
            java.lang.Object r8 = r9.E(r8, r0)
            if (r8 != r1) goto L98
            return r1
        L94:
            k0.d r8 = a.AbstractC0062a.m(r2)
        L98:
            return r8
        L99:
            F0.l r8 = new F0.l
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.e(a.a, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(a.AbstractC0062a r7, p0.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof g0.f
            if (r0 == 0) goto L13
            r0 = r8
            g0.f r0 = (g0.f) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            g0.f r0 = new g0.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f1722f
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            a.AbstractC0062a.X(r8)
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r7 = r8.f2025b
            goto L9f
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            g0.k r7 = r0.f1721e
            a.AbstractC0062a.X(r8)
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r8 = r8.f2025b
            goto L60
        L41:
            a.AbstractC0062a.X(r8)
            boolean r8 = r7 instanceof j0.AbstractC0207F
            if (r8 == 0) goto L4c
            j0.F r7 = (j0.AbstractC0207F) r7
            r8 = r6
            goto L6b
        L4c:
            boolean r8 = r7 instanceof j0.C0208G
            if (r8 == 0) goto La0
            j0.G r7 = (j0.C0208G) r7
            r0.f1721e = r6
            r0.h = r4
            androidx.emoji2.text.u r8 = r6.f1740a
            java.lang.Object r8 = r8.i(r7, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r7 = r6
        L60:
            java.lang.Throwable r2 = k0.C0232e.a(r8)
            if (r2 != 0) goto L9b
            j0.F r8 = (j0.AbstractC0207F) r8
            r5 = r8
            r8 = r7
            r7 = r5
        L6b:
            boolean r2 = r7 instanceof j0.C0206E
            if (r2 == 0) goto L91
            j0.E r7 = (j0.C0206E) r7
            j0.H r2 = r7.f1928f
            j0.H r4 = j0.EnumC0209H.f1932b
            if (r2 == r4) goto L87
            L.c r8 = r8.f1742c
            r2 = 0
            r0.f1721e = r2
            r0.h = r3
            java.lang.String r7 = r7.d
            java.lang.Object r7 = r8.x(r7, r0)
            if (r7 != r1) goto L9f
            return r1
        L87:
            j0.r r7 = new j0.r
            r7.<init>()
            k0.d r7 = a.AbstractC0062a.m(r7)
            goto L9f
        L91:
            j0.p r7 = new j0.p
            r7.<init>()
            k0.d r7 = a.AbstractC0062a.m(r7)
            goto L9f
        L9b:
            k0.d r7 = a.AbstractC0062a.m(r2)
        L9f:
            return r7
        La0:
            F0.l r7 = new F0.l
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.f(a.a, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(a.AbstractC0062a r10, a.AbstractC0062a r11, p0.c r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.g(a.a, a.a, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(a.AbstractC0062a r9, j0.C0202A r10, p0.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof g0.h
            if (r0 == 0) goto L13
            r0 = r11
            g0.h r0 = (g0.h) r0
            int r1 = r0.f1731i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1731i = r1
            goto L18
        L13:
            g0.h r0 = new g0.h
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f1730g
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1731i
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L29
            if (r2 != r3) goto L32
        L29:
            a.AbstractC0062a.X(r11)
            k0.e r11 = (k0.C0232e) r11
            java.lang.Object r9 = r11.f2025b
            goto Lb9
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            j0.A r10 = r0.f1729f
            g0.k r9 = r0.f1728e
            a.AbstractC0062a.X(r11)
            k0.e r11 = (k0.C0232e) r11
            java.lang.Object r11 = r11.f2025b
            goto L68
        L46:
            a.AbstractC0062a.X(r11)
            boolean r11 = r9 instanceof j0.AbstractC0207F
            if (r11 == 0) goto L52
            j0.F r9 = (j0.AbstractC0207F) r9
            r11 = r10
            r10 = r8
            goto L74
        L52:
            boolean r11 = r9 instanceof j0.C0208G
            if (r11 == 0) goto Lba
            j0.G r9 = (j0.C0208G) r9
            r0.f1728e = r8
            r0.f1729f = r10
            r0.f1731i = r5
            androidx.emoji2.text.u r11 = r8.f1740a
            java.lang.Object r11 = r11.i(r9, r0)
            if (r11 != r1) goto L67
            return r1
        L67:
            r9 = r8
        L68:
            java.lang.Throwable r2 = k0.C0232e.a(r11)
            if (r2 != 0) goto Lb5
            j0.F r11 = (j0.AbstractC0207F) r11
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L74:
            boolean r2 = r9 instanceof j0.C0206E
            if (r2 == 0) goto L8c
            r5 = r9
            j0.E r5 = (j0.C0206E) r5
            j0.H r5 = r5.f1928f
            j0.H r6 = j0.EnumC0209H.f1933c
            if (r5 == r6) goto L82
            goto L8c
        L82:
            j0.q r9 = new j0.q
            r9.<init>()
            k0.d r9 = a.AbstractC0062a.m(r9)
            goto Lb9
        L8c:
            r5 = 0
            if (r2 == 0) goto La2
            L.c r10 = r10.f1741b
            j0.E r9 = (j0.C0206E) r9
            java.lang.String r9 = r9.d
            r0.f1728e = r5
            r0.f1729f = r5
            r0.f1731i = r4
            java.lang.Object r9 = r10.B(r9, r11, r0)
            if (r9 != r1) goto Lb9
            return r1
        La2:
            X.i r10 = r10.d
            android.net.Uri r9 = r9.b0()
            r0.f1728e = r5
            r0.f1729f = r5
            r0.f1731i = r3
            java.lang.Object r9 = r10.J(r9, r11, r0)
            if (r9 != r1) goto Lb9
            return r1
        Lb5:
            k0.d r9 = a.AbstractC0062a.m(r2)
        Lb9:
            return r9
        Lba:
            F0.l r9 = new F0.l
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.h(a.a, j0.A, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(a.AbstractC0062a r7, j0.C0204C r8, p0.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof g0.j
            if (r0 == 0) goto L13
            r0 = r9
            g0.j r0 = (g0.j) r0
            int r1 = r0.f1739i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1739i = r1
            goto L18
        L13:
            g0.j r0 = new g0.j
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f1738g
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1739i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f1736e
            j0.E r7 = (j0.C0206E) r7
            a.AbstractC0062a.X(r9)
            k0.e r9 = (k0.C0232e) r9
            java.lang.Object r8 = r9.f2025b
            goto L94
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            j0.C r8 = r0.f1737f
            java.lang.Object r7 = r0.f1736e
            g0.k r7 = (g0.k) r7
            a.AbstractC0062a.X(r9)
            k0.e r9 = (k0.C0232e) r9
            java.lang.Object r9 = r9.f2025b
            goto L6a
        L48:
            a.AbstractC0062a.X(r9)
            boolean r9 = r7 instanceof j0.AbstractC0207F
            if (r9 == 0) goto L54
            j0.F r7 = (j0.AbstractC0207F) r7
            r9 = r8
            r8 = r6
            goto L76
        L54:
            boolean r9 = r7 instanceof j0.C0208G
            if (r9 == 0) goto Lb6
            j0.G r7 = (j0.C0208G) r7
            r0.f1736e = r6
            r0.f1737f = r8
            r0.f1739i = r4
            androidx.emoji2.text.u r9 = r6.f1740a
            java.lang.Object r9 = r9.i(r7, r0)
            if (r9 != r1) goto L69
            return r1
        L69:
            r7 = r6
        L6a:
            java.lang.Throwable r2 = k0.C0232e.a(r9)
            if (r2 != 0) goto Lb1
            j0.F r9 = (j0.AbstractC0207F) r9
            r5 = r8
            r8 = r7
            r7 = r9
            r9 = r5
        L76:
            boolean r2 = r7 instanceof j0.C0206E
            if (r2 == 0) goto La7
            j0.E r7 = (j0.C0206E) r7
            j0.H r2 = r7.f1928f
            j0.H r4 = j0.EnumC0209H.f1933c
            if (r2 == r4) goto L9d
            L.c r8 = r8.f1741b
            r0.f1736e = r7
            r2 = 0
            r0.f1737f = r2
            r0.f1739i = r3
            java.lang.String r2 = r7.d
            java.lang.Object r8 = r8.D(r2, r9, r0)
            if (r8 != r1) goto L94
            return r1
        L94:
            boolean r9 = r8 instanceof k0.C0231d
            if (r9 != 0) goto Lb5
            k0.h r8 = (k0.C0235h) r8
            android.net.Uri r8 = r7.f1927e
            goto Lb5
        L9d:
            j0.q r7 = new j0.q
            r7.<init>()
            k0.d r8 = a.AbstractC0062a.m(r7)
            goto Lb5
        La7:
            j0.p r7 = new j0.p
            r7.<init>()
            k0.d r8 = a.AbstractC0062a.m(r7)
            goto Lb5
        Lb1:
            k0.d r8 = a.AbstractC0062a.m(r2)
        Lb5:
            return r8
        Lb6:
            F0.l r7 = new F0.l
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.i(a.a, j0.C, p0.c):java.lang.Object");
    }
}
