package a0;

import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import com.getcapacitor.E;
import j0.C0208G;
import k0.C0235h;
import n0.InterfaceC0311d;

/* loaded from: classes.dex */
public final class q extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public Object f777f;

    /* renamed from: g, reason: collision with root package name */
    public int f778g;
    public final /* synthetic */ FilesystemPlugin h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0208G f779i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E f780j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w0.p f781k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(FilesystemPlugin filesystemPlugin, C0208G c0208g, E e2, w0.p pVar, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = filesystemPlugin;
        this.f779i = c0208g;
        this.f780j = e2;
        this.f781k = pVar;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((q) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        return new q(this.h, this.f779i, this.f780j, this.f781k, interfaceC0311d);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    @Override // p0.AbstractC0326a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r9) {
        /*
            r8 = this;
            o0.a r0 = o0.EnumC0322a.f2519b
            int r1 = r8.f778g
            com.getcapacitor.E r2 = r8.f780j
            j0.G r3 = r8.f779i
            com.capacitorjs.plugins.filesystem.FilesystemPlugin r4 = r8.h
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L20
            if (r1 != r5) goto L18
            java.lang.Object r0 = r8.f777f
            a.AbstractC0062a.X(r9)
            goto L65
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            a.AbstractC0062a.X(r9)
            k0.e r9 = (k0.C0232e) r9
            java.lang.Object r9 = r9.f2025b
            goto L38
        L28:
            a.AbstractC0062a.X(r9)
            g0.k r9 = com.capacitorjs.plugins.filesystem.FilesystemPlugin.access$getController(r4)
            r8.f778g = r6
            java.lang.Object r9 = r9.d(r3, r8)
            if (r9 != r0) goto L38
            return r0
        L38:
            boolean r1 = r9 instanceof k0.C0231d
            if (r1 != 0) goto L66
            r1 = r9
            j0.F r1 = (j0.AbstractC0207F) r1
            boolean r7 = r1.a0()
            if (r7 == 0) goto L57
            j0.x r3 = r3.f1931c
            if (r3 != 0) goto L4a
            goto L4b
        L4a:
            r6 = 0
        L4b:
            boolean r3 = com.capacitorjs.plugins.filesystem.FilesystemPlugin.access$isStoragePermissionGranted(r4, r6)
            if (r3 != 0) goto L57
            java.lang.String r0 = "permissionCallback"
            com.capacitorjs.plugins.filesystem.FilesystemPlugin.access$requestAllPermissions(r4, r2, r0)
            goto L66
        L57:
            r8.f777f = r9
            r8.f778g = r5
            w0.p r3 = r8.f781k
            java.lang.Object r1 = r3.f(r1, r8)
            if (r1 != r0) goto L64
            return r0
        L64:
            r0 = r9
        L65:
            r9 = r0
        L66:
            java.lang.Throwable r9 = k0.C0232e.a(r9)
            if (r9 == 0) goto L7a
            java.lang.String r0 = r2.d
            java.lang.String r1 = "getMethodName(...)"
            x0.g.d(r1, r0)
            a0.b r9 = P0.b.G(r0, r9)
            a.AbstractC0062a.Q(r2, r9)
        L7a:
            k0.h r9 = k0.C0235h.f2029a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.q.k(java.lang.Object):java.lang.Object");
    }
}
