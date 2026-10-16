package h0;

import a.AbstractC0062a;
import j0.C0215f;
import j0.C0217h;
import j0.C0218i;
import j0.C0224o;
import java.io.File;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185m extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1816g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185m(String str, String str2, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1816g = str;
        this.h = str2;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0185m) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        C0185m c0185m = new C0185m(this.f1816g, this.h, interfaceC0311d);
        c0185m.f1815f = obj;
        return c0185m;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        Object objM;
        AbstractC0062a.X(obj);
        String str = this.f1816g;
        String str2 = this.h;
        try {
            File file = new File(str);
            File file2 = new File(str2);
            if (!file.equals(file2)) {
                if (!file.exists()) {
                    throw new C0224o(str, null);
                }
                if (file.isFile() || file2.isFile()) {
                    throw new C0217h();
                }
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    throw new C0218i();
                }
                if (file2.isDirectory()) {
                    throw new C0215f(str2);
                }
                if (!u0.l.K(file, file2)) {
                    throw new j0.s(null);
                }
            }
            objM = C0235h.f2029a;
        } catch (Throwable th) {
            objM = AbstractC0062a.m(th);
        }
        return new C0232e(objM);
    }
}
