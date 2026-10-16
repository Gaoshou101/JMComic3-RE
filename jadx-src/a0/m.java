package a0;

import a.AbstractC0062a;
import com.getcapacitor.E;
import k0.C0235h;
import n0.InterfaceC0311d;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class m extends p0.g implements w0.q {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f765f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Throwable f766g;
    public final /* synthetic */ E h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(E e2, InterfaceC0311d interfaceC0311d, int i2) {
        super(3, interfaceC0311d);
        this.f765f = i2;
        this.h = e2;
    }

    @Override // w0.q
    public final Object e(Object obj, Object obj2, Object obj3) throws JSONException {
        Throwable th = (Throwable) obj2;
        InterfaceC0311d interfaceC0311d = (InterfaceC0311d) obj3;
        switch (this.f765f) {
            case 0:
                m mVar = new m(this.h, interfaceC0311d, 0);
                mVar.f766g = th;
                C0235h c0235h = C0235h.f2029a;
                mVar.k(c0235h);
                return c0235h;
            default:
                m mVar2 = new m(this.h, interfaceC0311d, 1);
                mVar2.f766g = th;
                C0235h c0235h2 = C0235h.f2029a;
                mVar2.k(c0235h2);
                return c0235h2;
        }
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) throws JSONException {
        switch (this.f765f) {
            case 0:
                AbstractC0062a.X(obj);
                if (this.f766g == null) {
                    com.getcapacitor.w wVar = new com.getcapacitor.w();
                    wVar.putOpt("data", "");
                    AbstractC0062a.R(this.h, wVar, 2);
                }
                break;
            default:
                AbstractC0062a.X(obj);
                Throwable th = this.f766g;
                E e2 = this.h;
                String str = e2.d;
                x0.g.d("getMethodName(...)", str);
                AbstractC0062a.Q(e2, P0.b.G(str, th));
                break;
        }
        return C0235h.f2029a;
    }
}
