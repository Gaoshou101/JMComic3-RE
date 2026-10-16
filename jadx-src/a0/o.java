package a0;

import a.AbstractC0062a;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import com.getcapacitor.E;
import j0.AbstractC0207F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.C0231d;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class o extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public int f770f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f771g;
    public final /* synthetic */ FilesystemPlugin h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f772i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(FilesystemPlugin filesystemPlugin, E e2, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = filesystemPlugin;
        this.f772i = e2;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((o) i((AbstractC0207F) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        o oVar = new o(this.h, this.f772i, interfaceC0311d);
        oVar.f771g = obj;
        return oVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) throws JSONException {
        Object objF;
        EnumC0322a enumC0322a = EnumC0322a.f2519b;
        int i2 = this.f770f;
        if (i2 == 0) {
            AbstractC0062a.X(obj);
            AbstractC0207F abstractC0207F = (AbstractC0207F) this.f771g;
            g0.k controller = this.h.getController();
            this.f770f = 1;
            objF = controller.f(abstractC0207F, this);
            if (objF == enumC0322a) {
                return enumC0322a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0062a.X(obj);
            objF = ((C0232e) obj).f2025b;
        }
        boolean z2 = objF instanceof C0231d;
        E e2 = this.f772i;
        if (!z2) {
            List list = (List) objF;
            x0.g.e("list", list);
            com.getcapacitor.w wVar = new com.getcapacitor.w();
            ArrayList arrayList = new ArrayList(l0.j.L(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(P0.b.H((j0.y) it.next()));
            }
            wVar.d("files", new com.getcapacitor.u(arrayList));
            AbstractC0062a.R(e2, wVar, 2);
        }
        Throwable thA = C0232e.a(objF);
        if (thA != null) {
            String str = e2.d;
            x0.g.d("getMethodName(...)", str);
            AbstractC0062a.Q(e2, P0.b.G(str, thA));
        }
        return C0235h.f2029a;
    }
}
