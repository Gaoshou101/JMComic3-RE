package h0;

import android.net.Uri;
import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178f extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X.i f1797g;
    public final /* synthetic */ Uri h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178f(X.i iVar, Uri uri, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1797g = iVar;
        this.h = uri;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0178f) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        C0178f c0178f = new C0178f(this.f1797g, this.h, interfaceC0311d);
        c0178f.f1796f = obj;
        return c0178f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[Catch: all -> 0x0086, TryCatch #1 {all -> 0x0086, blocks: (B:6:0x001f, B:8:0x0025, B:10:0x0038, B:13:0x0045, B:15:0x005b, B:17:0x006e, B:20:0x0079, B:25:0x0089, B:28:0x0093, B:19:0x0074, B:33:0x00ae, B:34:0x00b3, B:35:0x00b4, B:36:0x00c2), top: B:49:0x001f, outer: #2 }] */
    @Override // p0.AbstractC0326a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            a.AbstractC0062a.X(r18)
            java.lang.Object r0 = r1.f1796f
            F0.r r0 = (F0.r) r0
            X.i r2 = r1.f1797g
            android.net.Uri r0 = r1.h
            java.lang.Object r3 = r2.f715b     // Catch: java.lang.Throwable -> Lac
            r9 = r3
            android.content.ContentResolver r9 = (android.content.ContentResolver) r9     // Catch: java.lang.Throwable -> Lac
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r9
            r4 = r0
            android.database.Cursor r13 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lac
            r14 = 0
            if (r13 == 0) goto Lca
            boolean r3 = r13.moveToFirst()     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto Lb4
            r9.getPersistedUriPermissions()     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = "_display_name"
            java.lang.String[] r3 = new java.lang.String[]{r3, r3, r3}     // Catch: java.lang.Throwable -> L86
            java.util.List r3 = l0.i.K(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.Integer r3 = X.i.C(r13, r3)     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L42
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = r13.getString(r3)     // Catch: java.lang.Throwable -> L86
            r5 = r3
            goto L43
        L42:
            r5 = r14
        L43:
            if (r5 == 0) goto Lae
            long r7 = X.i.y(r2, r13, r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = "date_modified"
            java.lang.String r4 = "last_modified"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L86
            java.util.List r3 = l0.i.K(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.Integer r3 = X.i.C(r13, r3)     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L74
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = r13.getString(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "getString(...)"
            x0.g.d(r4, r3)     // Catch: java.lang.Throwable -> L86
            java.lang.Long r3 = E0.l.W(r3)     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto L74
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L86
        L72:
            r11 = r3
            goto L79
        L74:
            long r3 = X.i.D(r13)     // Catch: java.lang.Throwable -> L86
            goto L72
        L79:
            long r3 = X.i.D(r13)     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r9.getType(r0)     // Catch: java.lang.Throwable -> L86
            if (r6 != 0) goto L89
            java.lang.String r6 = "application/octet-binary"
            goto L89
        L86:
            r0 = move-exception
            r3 = r0
            goto Lc3
        L89:
            j0.y r15 = new j0.y     // Catch: java.lang.Throwable -> L86
            java.lang.String r9 = r0.getPath()     // Catch: java.lang.Throwable -> L86
            if (r9 != 0) goto L93
            java.lang.String r9 = ""
        L93:
            j0.w r10 = new j0.w     // Catch: java.lang.Throwable -> L86
            r10.<init>(r6)     // Catch: java.lang.Throwable -> L86
            java.lang.Long r6 = new java.lang.Long     // Catch: java.lang.Throwable -> L86
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L86
            r3 = r15
            r4 = r9
            r16 = r6
            r6 = r0
            r9 = r10
            r10 = r16
            r3.<init>(r4, r5, r6, r7, r9, r10, r11)     // Catch: java.lang.Throwable -> L86
            a.AbstractC0062a.k(r13, r14)     // Catch: java.lang.Throwable -> Lac
            goto Ld4
        Lac:
            r0 = move-exception
            goto Ld0
        Lae:
            j0.s r0 = new j0.s     // Catch: java.lang.Throwable -> L86
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        Lb4:
            j0.o r3 = new j0.o     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "toString(...)"
            x0.g.d(r4, r0)     // Catch: java.lang.Throwable -> L86
            r3.<init>(r0, r14)     // Catch: java.lang.Throwable -> L86
            throw r3     // Catch: java.lang.Throwable -> L86
        Lc3:
            throw r3     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r0 = move-exception
            r4 = r0
            a.AbstractC0062a.k(r13, r3)     // Catch: java.lang.Throwable -> Lac
            throw r4     // Catch: java.lang.Throwable -> Lac
        Lca:
            j0.s r0 = new j0.s     // Catch: java.lang.Throwable -> Lac
            r0.<init>(r14)     // Catch: java.lang.Throwable -> Lac
            throw r0     // Catch: java.lang.Throwable -> Lac
        Ld0:
            k0.d r15 = a.AbstractC0062a.m(r0)
        Ld4:
            android.net.Uri r0 = r1.h
            java.lang.Object r0 = X.i.z(r2, r15, r0)
            k0.e r2 = new k0.e
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C0178f.k(java.lang.Object):java.lang.Object");
    }
}
