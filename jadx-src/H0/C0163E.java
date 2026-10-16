package h0;

import a.AbstractC0062a;
import j0.C0202A;
import j0.C0224o;
import java.io.File;
import java.io.FileInputStream;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163E extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1753g;
    public final /* synthetic */ C0202A h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0163E(String str, C0202A c0202a, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1753g = str;
        this.h = c0202a;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0163E) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        C0163E c0163e = new C0163E(this.f1753g, this.h, interfaceC0311d);
        c0163e.f1752f = obj;
        return c0163e;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        Object objM;
        File file;
        AbstractC0062a.X(obj);
        String str = this.f1753g;
        C0202A c0202a = this.h;
        try {
            file = new File(str);
        } catch (Throwable th) {
            objM = AbstractC0062a.m(th);
        }
        if (!file.exists()) {
            throw new C0224o(str, null);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            objM = P0.b.y(fileInputStream, c0202a);
            AbstractC0062a.k(fileInputStream, null);
            return new C0232e(objM);
        } finally {
        }
    }
}
