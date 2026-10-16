package h0;

import a.AbstractC0062a;
import android.net.Uri;
import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183k extends p0.g implements w0.q {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Throwable f1810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X.i f1811g;
    public final /* synthetic */ Uri h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183k(X.i iVar, Uri uri, InterfaceC0311d interfaceC0311d) {
        super(3, interfaceC0311d);
        this.f1811g = iVar;
        this.h = uri;
    }

    @Override // w0.q
    public final Object e(Object obj, Object obj2, Object obj3) throws Throwable {
        Uri uri = this.h;
        C0183k c0183k = new C0183k(this.f1811g, uri, (InterfaceC0311d) obj3);
        c0183k.f1810f = (Throwable) obj2;
        c0183k.k(C0235h.f2029a);
        throw null;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) throws Throwable {
        AbstractC0062a.X(obj);
        Throwable th = this.f1810f;
        Uri uri = this.h;
        this.f1811g.getClass();
        throw X.i.H(th, uri);
    }
}
