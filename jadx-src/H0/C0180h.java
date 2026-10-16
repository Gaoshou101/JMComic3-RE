package h0;

import a.AbstractC0062a;
import android.content.ContentResolver;
import android.net.Uri;
import j0.C0202A;
import java.io.InputStream;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180h extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X.i f1802g;
    public final /* synthetic */ Uri h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0202A f1803i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0180h(X.i iVar, Uri uri, C0202A c0202a, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1802g = iVar;
        this.h = uri;
        this.f1803i = c0202a;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0180h) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        C0180h c0180h = new C0180h(this.f1802g, this.h, this.f1803i, interfaceC0311d);
        c0180h.f1801f = obj;
        return c0180h;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        Object objM;
        InputStream inputStreamOpenInputStream;
        Uri uri = this.h;
        AbstractC0062a.X(obj);
        X.i iVar = this.f1802g;
        C0202A c0202a = this.f1803i;
        try {
            inputStreamOpenInputStream = ((ContentResolver) iVar.f715b).openInputStream(uri);
        } catch (Throwable th) {
            objM = AbstractC0062a.m(th);
        }
        if (inputStreamOpenInputStream == null) {
            throw new j0.s(null);
        }
        try {
            objM = P0.b.y(inputStreamOpenInputStream, c0202a);
            AbstractC0062a.k(inputStreamOpenInputStream, null);
            return new C0232e(X.i.z(iVar, objM, uri));
        } finally {
        }
    }
}
