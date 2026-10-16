package h0;

import a.AbstractC0062a;
import android.content.ContentResolver;
import android.net.Uri;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176d extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X.i f1792g;
    public final /* synthetic */ Uri h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0176d(X.i iVar, Uri uri, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1792g = iVar;
        this.h = uri;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0176d) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        C0176d c0176d = new C0176d(this.f1792g, this.h, interfaceC0311d);
        c0176d.f1791f = obj;
        return c0176d;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        Object objM;
        Uri uri = this.h;
        AbstractC0062a.X(obj);
        X.i iVar = this.f1792g;
        try {
        } catch (Throwable th) {
            objM = AbstractC0062a.m(th);
        }
        if (((ContentResolver) iVar.f715b).delete(uri, null, null) <= 0) {
            throw new j0.s(null);
        }
        objM = C0235h.f2029a;
        return new C0232e(X.i.z(iVar, objM, uri));
    }
}
