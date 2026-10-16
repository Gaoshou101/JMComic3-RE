package a0;

import a.AbstractC0062a;
import com.getcapacitor.E;
import k0.C0235h;
import n0.InterfaceC0311d;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class l extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E f764g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(E e2, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f764g = e2;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) throws JSONException {
        l lVar = (l) i((String) obj, (InterfaceC0311d) obj2);
        C0235h c0235h = C0235h.f2029a;
        lVar.k(c0235h);
        return c0235h;
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        l lVar = new l(this.f764g, interfaceC0311d);
        lVar.f763f = obj;
        return lVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) throws JSONException {
        AbstractC0062a.X(obj);
        String str = (String) this.f763f;
        x0.g.e("readData", str);
        com.getcapacitor.w wVar = new com.getcapacitor.w();
        wVar.putOpt("data", str);
        E e2 = this.f764g;
        x0.g.e("<this>", e2);
        e2.f1366f = true;
        e2.h(wVar);
        return C0235h.f2029a;
    }
}
