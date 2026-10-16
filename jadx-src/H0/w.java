package h0;

import a.AbstractC0062a;
import j0.C0217h;
import j0.C0218i;
import j0.C0224o;
import java.io.File;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;

/* loaded from: classes.dex */
public final class w extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1844g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, String str2, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1844g = str;
        this.h = str2;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((w) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        w wVar = new w(this.f1844g, this.h, interfaceC0311d);
        wVar.f1843f = obj;
        return wVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        Object objM;
        AbstractC0062a.X(obj);
        String str = this.f1844g;
        String str2 = this.h;
        try {
            File file = new File(str);
            File file2 = new File(str2);
            if (!file.equals(file2)) {
                if (!file.exists()) {
                    throw new C0224o(str, null);
                }
                if (file.isDirectory() || file2.isDirectory()) {
                    throw new C0217h();
                }
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    throw new C0218i();
                }
                u0.l.L(file, file2, true);
                if (!file2.exists()) {
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
