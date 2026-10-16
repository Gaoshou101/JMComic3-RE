package h0;

import a.AbstractC0062a;
import j0.C0224o;
import java.io.File;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161C extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1748g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161C(String str, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1748g = str;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0161C) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        C0161C c0161c = new C0161C(this.f1748g, interfaceC0311d);
        c0161c.f1747f = obj;
        return c0161c;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        Object objM;
        File file;
        AbstractC0062a.X(obj);
        String str = this.f1748g;
        try {
            file = new File(str);
        } catch (Throwable th) {
            objM = AbstractC0062a.m(th);
        }
        if (!file.exists()) {
            throw new C0224o(str, null);
        }
        objM = AbstractC0062a.y(file);
        return new C0232e(objM);
    }
}
