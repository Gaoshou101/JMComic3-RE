package a0;

import G.C0037m;
import android.os.Handler;
import com.getcapacitor.C0101f;
import com.getcapacitor.E;
import k0.C0235h;

/* loaded from: classes.dex */
public final class v extends x0.h implements w0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f796c;
    public final /* synthetic */ String d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0101f f798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f799g;
    public final /* synthetic */ Handler h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0037m f800i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, String str, E e2, C0101f c0101f, d dVar, Handler handler, C0037m c0037m) {
        super(0);
        this.f796c = wVar;
        this.d = str;
        this.f797e = e2;
        this.f798f = c0101f;
        this.f799g = dVar;
        this.h = handler;
        this.f800i = c0037m;
    }

    @Override // w0.a
    public final Object a() {
        C0037m c0037m = this.f800i;
        Handler handler = this.h;
        try {
            handler.post(new Q.h(c0037m, 2, w.a(this.f796c, this.d, this.f797e, this.f798f, this.f799g)));
        } catch (Exception e2) {
            handler.post(new Q.h(c0037m, 3, e2));
        }
        return C0235h.f2029a;
    }
}
