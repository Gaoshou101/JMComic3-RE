package h0;

import java.io.File;
import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171M extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.emoji2.text.u f1776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ File f1777g;
    public final /* synthetic */ String h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Boolean f1778i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171M(androidx.emoji2.text.u uVar, File file, String str, Boolean bool, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1776f = uVar;
        this.f1777g = file;
        this.h = str;
        this.f1778i = bool;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0171M) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        return new C0171M(this.f1776f, this.f1777g, this.h, this.f1778i, interfaceC0311d);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    @Override // p0.AbstractC0326a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r9) {
        /*
            r8 = this;
            j0.H r0 = j0.EnumC0209H.d
            a.AbstractC0062a.X(r9)
            androidx.emoji2.text.u r9 = r8.f1776f
            r9.getClass()
            java.lang.String r1 = r8.h
            java.io.File r2 = r8.f1777g
            java.io.File r3 = new java.io.File
            if (r2 == 0) goto L16
            r3.<init>(r2, r1)
            goto L19
        L16:
            r3.<init>(r1)
        L19:
            android.net.Uri r1 = android.net.Uri.fromFile(r3)
            java.lang.Boolean r2 = r8.f1778i
            if (r2 == 0) goto L26
            boolean r9 = r2.booleanValue()
            goto L66
        L26:
            java.lang.String r2 = r3.getAbsolutePath()
            java.lang.String r4 = "getAbsolutePath(...)"
            x0.g.d(r4, r2)
            q0.a r5 = j0.x.f1954l
            r5.getClass()
            l0.a r6 = new l0.a
            r7 = 0
            r6.<init>(r7, r5)
        L3a:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L5d
            java.lang.Object r5 = r6.next()
            r7 = r5
            j0.x r7 = (j0.x) r7
            java.io.File r7 = r9.e(r7)
            if (r7 == 0) goto L59
            java.lang.String r7 = r7.getAbsolutePath()
            x0.g.d(r4, r7)
            boolean r7 = E0.l.K(r2, r7)
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r7 == 0) goto L3a
            goto L5e
        L5d:
            r5 = 0
        L5e:
            j0.x r5 = (j0.x) r5
            if (r5 == 0) goto L65
            boolean r9 = r5.f1955b
            goto L66
        L65:
            r9 = 1
        L66:
            java.lang.String r2 = r3.getPath()
            java.lang.String r4 = "getPath(...)"
            x0.g.d(r4, r2)
            java.lang.String r4 = java.io.File.separator
            java.lang.String r5 = "separator"
            x0.g.d(r5, r4)
            boolean r2 = r2.endsWith(r4)
            if (r2 != 0) goto L82
            boolean r2 = r3.isDirectory()
            if (r2 != 0) goto L9f
        L82:
            boolean r2 = r3.exists()
            java.lang.String r5 = ""
            if (r2 != 0) goto L9e
            java.lang.String r2 = r3.getName()
            java.lang.String r6 = "getName(...)"
            x0.g.d(r6, r2)
            java.lang.String r2 = E0.l.V(r2, r5)
            boolean r2 = E0.l.Q(r2)
            if (r2 == 0) goto L9e
            goto L9f
        L9e:
            r4 = r5
        L9f:
            j0.E r2 = new j0.E
            java.lang.String r5 = r3.getPath()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r4)
            java.lang.String r5 = r6.toString()
            android.net.Uri$Builder r6 = r1.buildUpon()
            java.lang.String r1 = r1.getPath()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r4)
            java.lang.String r1 = r7.toString()
            android.net.Uri$Builder r1 = r6.path(r1)
            android.net.Uri r1 = r1.build()
            java.lang.String r4 = "build(...)"
            x0.g.d(r4, r1)
            boolean r4 = r3.exists()     // Catch: java.lang.SecurityException -> Lf0
            if (r4 != 0) goto Ldf
            goto Lf0
        Ldf:
            boolean r4 = r3.isDirectory()     // Catch: java.lang.SecurityException -> Lf0
            if (r4 == 0) goto Le8
            j0.H r0 = j0.EnumC0209H.f1933c     // Catch: java.lang.SecurityException -> Lf0
            goto Lf0
        Le8:
            boolean r3 = r3.isFile()     // Catch: java.lang.SecurityException -> Lf0
            if (r3 == 0) goto Lf0
            j0.H r0 = j0.EnumC0209H.f1932b     // Catch: java.lang.SecurityException -> Lf0
        Lf0:
            r2.<init>(r5, r1, r0, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C0171M.k(java.lang.Object):java.lang.Object");
    }
}
