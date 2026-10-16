package com.capacitorjs.plugins.filesystem;

import F0.AbstractC0019u;
import F0.C0016q;
import F0.L;
import F0.r;
import G.C0037m;
import a.AbstractC0062a;
import a0.C0063A;
import a0.C0064a;
import a0.b;
import a0.e;
import a0.f;
import a0.g;
import a0.h;
import a0.i;
import a0.j;
import a0.o;
import a0.q;
import a0.s;
import a0.t;
import a0.u;
import a0.w;
import a0.y;
import a0.z;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import c0.InterfaceC0095b;
import c0.c;
import c0.d;
import com.getcapacitor.B;
import com.getcapacitor.C0101f;
import com.getcapacitor.D;
import com.getcapacitor.E;
import com.getcapacitor.I;
import g0.k;
import j0.AbstractC0214e;
import j0.C0202A;
import j0.C0204C;
import j0.C0208G;
import j0.C0213d;
import j0.EnumC0203B;
import k0.C0233f;
import k0.InterfaceC0229b;
import org.json.JSONException;
import w0.p;

@InterfaceC0095b(name = "Filesystem", permissions = {@c(alias = "publicStorage", strings = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}), @c(alias = "publicStorageAboveAPI29", strings = {"android.permission.READ_EXTERNAL_STORAGE"})})
/* loaded from: classes.dex */
public final class FilesystemPlugin extends D {
    private w legacyImplementation;
    private final InterfaceC0229b coroutineScope$delegate = new C0233f(g.f748c);
    private final InterfaceC0229b controller$delegate = new C0233f(new e(0, this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$11(E e2, FilesystemPlugin filesystemPlugin, Integer num, Integer num2) throws JSONException {
        x0.g.e("$call", e2);
        x0.g.e("this$0", filesystemPlugin);
        com.getcapacitor.w wVar = new com.getcapacitor.w();
        wVar.e("url", e2.e("url", null));
        wVar.d("bytes", num);
        wVar.d("contentLength", num2);
        filesystemPlugin.notifyListeners("progress", wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k getController() {
        return (k) ((C0233f) this.controller$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r getCoroutineScope() {
        return (r) ((C0233f) this.coroutineScope$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isStoragePermissionGranted(boolean z2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return true;
        }
        B b2 = B.f1353c;
        if (i2 >= 30) {
            if (!z2 || getPermissionState("publicStorageAboveAPI29") == b2) {
                return true;
            }
        } else if (getPermissionState("publicStorage") == b2) {
            return true;
        }
        return false;
    }

    @d
    private final void permissionCallback(E e2) {
        if (!isStoragePermissionGranted(true)) {
            L.c.l(getLogTag(), "User denied storage permission");
            b bVar = a0.c.f737a;
            AbstractC0062a.Q(e2, a0.c.f737a);
            return;
        }
        String str = e2.d;
        if (str != null) {
            switch (str.hashCode()) {
                case -2139808842:
                    if (!str.equals("appendFile")) {
                        return;
                    }
                    break;
                case -1406748165:
                    if (!str.equals("writeFile")) {
                        return;
                    }
                    break;
                case -1249348042:
                    if (str.equals("getUri")) {
                        getUri(e2);
                        return;
                    }
                    return;
                case -934594754:
                    if (str.equals("rename")) {
                        rename(e2);
                        return;
                    }
                    return;
                case -867956686:
                    if (str.equals("readFile")) {
                        readFile(e2);
                        return;
                    }
                    return;
                case 3059573:
                    if (str.equals("copy")) {
                        copy(e2);
                        return;
                    }
                    return;
                case 3540564:
                    if (str.equals("stat")) {
                        stat(e2);
                        return;
                    }
                    return;
                case 103950895:
                    if (str.equals("mkdir")) {
                        mkdir(e2);
                        return;
                    }
                    return;
                case 108628082:
                    if (str.equals("rmdir")) {
                        rmdir(e2);
                        return;
                    }
                    return;
                case 864161661:
                    if (str.equals("readFileInChunks")) {
                        readFileInChunks(e2);
                        return;
                    }
                    return;
                case 1080408887:
                    if (str.equals("readdir")) {
                        readdir(e2);
                        return;
                    }
                    return;
                case 1108651556:
                    if (str.equals("downloadFile")) {
                        downloadFile(e2);
                        return;
                    }
                    return;
                case 1764172231:
                    if (str.equals("deleteFile")) {
                        deleteFile(e2);
                        return;
                    }
                    return;
                default:
                    return;
            }
            writeFile(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runWithPermission(C0208G c0208g, E e2, p pVar) {
        AbstractC0019u.g(getCoroutineScope(), new q(this, c0208g, e2, pVar, null));
    }

    @I
    public final void appendFile(E e2) throws JSONException {
        x0.g.e("call", e2);
        try {
            e2.f1365e.putOpt("append", Boolean.TRUE);
            writeFile(e2);
        } catch (JSONException e3) {
            Log.e(getLogTag(), "Tried to set `append` in `PluginCall`, but got exception", e3);
            b bVar = a0.c.f737a;
            String str = e2.d;
            x0.g.d("getMethodName(...)", str);
            String localizedMessage = e3.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            AbstractC0062a.Q(e2, a0.c.e(str, localizedMessage));
        }
    }

    @Override // com.getcapacitor.D
    @I
    public void checkPermissions(E e2) throws JSONException {
        x0.g.e("call", e2);
        if (!isStoragePermissionGranted(false)) {
            super.checkPermissions(e2);
            return;
        }
        com.getcapacitor.w wVar = new com.getcapacitor.w();
        wVar.e("publicStorage", "granted");
        AbstractC0062a.R(e2, wVar, 2);
    }

    @I
    public final void copy(E e2) {
        x0.g.e("call", e2);
        C0064a c0064aU = AbstractC0062a.u(e2);
        if (c0064aU != null) {
            runWithPermission(c0064aU.f733a, c0064aU.f734b, e2, new f(this, e2, null, 0));
        } else {
            b bVar = a0.c.f737a;
            String str = e2.d;
            x0.g.d("getMethodName(...)", str);
            AbstractC0062a.Q(e2, a0.c.c(str));
        }
    }

    @I
    public final void deleteFile(E e2) {
        x0.g.e("call", e2);
        C0208G c0208gC = AbstractC0062a.C(e2);
        if (c0208gC != null) {
            runWithPermission(c0208gC, e2, new h(this, e2, null));
            return;
        }
        b bVar = a0.c.f737a;
        String str = e2.d;
        x0.g.d("getMethodName(...)", str);
        AbstractC0062a.Q(e2, a0.c.c(str));
    }

    @I
    public final void downloadFile(E e2) {
        x0.g.e("call", e2);
        try {
            String strE = e2.e("directory", Environment.DIRECTORY_DOWNLOADS);
            if (this.legacyImplementation != null) {
                if (("DOCUMENTS".equals(strE) || "EXTERNAL_STORAGE".equals(strE)) && !isStoragePermissionGranted(false)) {
                    requestAllPermissions(e2, "permissionCallback");
                    return;
                }
            }
            a0.d dVar = new a0.d(e2, this);
            w wVar = this.legacyImplementation;
            if (wVar != null) {
                C0101f c0101f = this.bridge;
                x0.g.d("bridge", c0101f);
                wVar.b(e2, c0101f, dVar, new C0037m(this, strE, e2));
            }
        } catch (Exception e3) {
            e2.f("Error downloading file: " + e3.getLocalizedMessage(), null, e3);
        }
    }

    @I
    public final void getUri(E e2) {
        x0.g.e("call", e2);
        C0208G c0208gC = AbstractC0062a.C(e2);
        if (c0208gC != null) {
            AbstractC0019u.g(getCoroutineScope(), new i(this, c0208gC, e2, null));
            return;
        }
        b bVar = a0.c.f737a;
        String str = e2.d;
        x0.g.d("getMethodName(...)", str);
        AbstractC0062a.Q(e2, a0.c.c(str));
    }

    @Override // com.getcapacitor.D
    public void handleOnDestroy() {
        super.handleOnDestroy();
        r coroutineScope = getCoroutineScope();
        L l2 = (L) coroutineScope.f().g(C0016q.f123c);
        if (l2 != null) {
            l2.a(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
        }
    }

    @Override // com.getcapacitor.D
    public void load() {
        super.load();
        Context context = getContext();
        x0.g.d("getContext(...)", context);
        this.legacyImplementation = new w(context);
    }

    @I
    public final void mkdir(E e2) {
        x0.g.e("call", e2);
        z zVarD = AbstractC0062a.D(e2);
        if (zVarD != null) {
            runWithPermission(zVarD.f806a, e2, new j(this, zVarD, e2, null));
        } else {
            b bVar = a0.c.f737a;
            String str = e2.d;
            x0.g.d("getMethodName(...)", str);
            AbstractC0062a.Q(e2, a0.c.c(str));
        }
    }

    @I
    public final void readFile(E e2) {
        y yVar;
        x0.g.e("call", e2);
        C0208G c0208gC = AbstractC0062a.C(e2);
        if (c0208gC == null) {
            yVar = null;
        } else {
            C0213d c0213d = AbstractC0214e.f1939a;
            yVar = new y(c0208gC, new C0202A(AbstractC0062a.r(e2.e("encoding", null))));
        }
        if (yVar != null) {
            runWithPermission(yVar.f804a, e2, new a0.k(this, yVar, e2, null));
        } else {
            b bVar = a0.c.f737a;
            String str = e2.d;
            x0.g.d("getMethodName(...)", str);
            AbstractC0062a.Q(e2, a0.c.c(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    @com.getcapacitor.I(returnType = "callback")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void readFileInChunks(com.getcapacitor.E r7) {
        /*
            r6 = this;
            java.lang.String r0 = "call"
            x0.g.e(r0, r7)
            j0.G r0 = a.AbstractC0062a.C(r7)
            r1 = 0
            if (r0 != 0) goto Le
        Lc:
            r4 = r1
            goto L3b
        Le:
            j0.d r2 = j0.AbstractC0214e.f1939a
            java.lang.String r2 = "encoding"
            java.lang.String r2 = r7.e(r2, r1)
            j0.e r2 = a.AbstractC0062a.r(r2)
            java.lang.String r3 = "chunkSize"
            java.lang.Integer r3 = r7.c(r3)
            if (r3 == 0) goto Lc
            int r4 = r3.intValue()
            if (r4 <= 0) goto L29
            goto L2a
        L29:
            r3 = r1
        L2a:
            if (r3 != 0) goto L2d
            goto Lc
        L2d:
            int r3 = r3.intValue()
            a0.x r4 = new a0.x
            j0.z r5 = new j0.z
            r5.<init>(r2, r3)
            r4.<init>(r0, r5)
        L3b:
            if (r4 != 0) goto L4e
            a0.b r0 = a0.c.f737a
            java.lang.String r0 = r7.d
            java.lang.String r1 = "getMethodName(...)"
            x0.g.d(r1, r0)
            a0.b r0 = a0.c.c(r0)
            a.AbstractC0062a.Q(r7, r0)
            return
        L4e:
            a0.n r0 = new a0.n
            r0.<init>(r6, r4, r7, r1)
            j0.G r1 = r4.f802a
            r6.runWithPermission(r1, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.capacitorjs.plugins.filesystem.FilesystemPlugin.readFileInChunks(com.getcapacitor.E):void");
    }

    @I
    public final void readdir(E e2) {
        x0.g.e("call", e2);
        C0208G c0208gC = AbstractC0062a.C(e2);
        if (c0208gC != null) {
            runWithPermission(c0208gC, e2, new o(this, e2, null));
            return;
        }
        b bVar = a0.c.f737a;
        String str = e2.d;
        x0.g.d("getMethodName(...)", str);
        AbstractC0062a.Q(e2, a0.c.c(str));
    }

    @I
    public final void rename(E e2) {
        x0.g.e("call", e2);
        C0064a c0064aU = AbstractC0062a.u(e2);
        if (c0064aU != null) {
            runWithPermission(c0064aU.f733a, c0064aU.f734b, e2, new f(this, e2, null, 1));
        } else {
            b bVar = a0.c.f737a;
            String str = e2.d;
            x0.g.d("getMethodName(...)", str);
            AbstractC0062a.Q(e2, a0.c.c(str));
        }
    }

    @Override // com.getcapacitor.D
    @I
    public void requestPermissions(E e2) throws JSONException {
        x0.g.e("call", e2);
        if (!isStoragePermissionGranted(false)) {
            super.requestPermissions(e2);
            return;
        }
        com.getcapacitor.w wVar = new com.getcapacitor.w();
        wVar.e("publicStorage", "granted");
        AbstractC0062a.R(e2, wVar, 2);
    }

    @I
    public final void rmdir(E e2) {
        x0.g.e("call", e2);
        z zVarD = AbstractC0062a.D(e2);
        if (zVarD != null) {
            runWithPermission(zVarD.f806a, e2, new a0.p(this, zVarD, e2, null));
        } else {
            b bVar = a0.c.f737a;
            String str = e2.d;
            x0.g.d("getMethodName(...)", str);
            AbstractC0062a.Q(e2, a0.c.c(str));
        }
    }

    @I
    public final void stat(E e2) {
        x0.g.e("call", e2);
        C0208G c0208gC = AbstractC0062a.C(e2);
        if (c0208gC != null) {
            runWithPermission(c0208gC, e2, new t(this, e2, null));
            return;
        }
        b bVar = a0.c.f737a;
        String str = e2.d;
        x0.g.d("getMethodName(...)", str);
        AbstractC0062a.Q(e2, a0.c.c(str));
    }

    @I
    public final void writeFile(E e2) {
        String strE;
        C0063A c0063a;
        x0.g.e("call", e2);
        C0208G c0208gC = AbstractC0062a.C(e2);
        if (c0208gC == null || (strE = e2.e("data", null)) == null) {
            c0063a = null;
        } else {
            Boolean boolB = e2.b("recursive", null);
            if (boolB == null) {
                boolB = Boolean.FALSE;
            }
            boolean zBooleanValue = boolB.booleanValue();
            Boolean boolB2 = e2.b("append", null);
            if (boolB2 == null) {
                boolB2 = Boolean.FALSE;
            }
            EnumC0203B enumC0203B = boolB2.booleanValue() ? EnumC0203B.f1923c : EnumC0203B.f1922b;
            C0213d c0213d = AbstractC0214e.f1939a;
            c0063a = new C0063A(c0208gC, new C0204C(strE, AbstractC0062a.r(e2.e("encoding", null)), enumC0203B, zBooleanValue));
        }
        if (c0063a != null) {
            runWithPermission(c0063a.f731a, e2, new u(this, c0063a, e2, null));
            return;
        }
        b bVar = a0.c.f737a;
        String str = e2.d;
        x0.g.d("getMethodName(...)", str);
        AbstractC0062a.Q(e2, a0.c.c(str));
    }

    private final void runWithPermission(C0208G c0208g, C0208G c0208g2, E e2, w0.q qVar) {
        runWithPermission(c0208g, e2, new s(this, c0208g2, e2, qVar, null));
    }
}
