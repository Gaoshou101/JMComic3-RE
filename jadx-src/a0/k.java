package a0;

import a.AbstractC0062a;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import com.getcapacitor.E;
import j0.AbstractC0207F;
import j0.C0202A;
import k0.C0231d;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class k extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public int f759f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f760g;
    public final /* synthetic */ FilesystemPlugin h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f761i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E f762j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FilesystemPlugin filesystemPlugin, y yVar, E e2, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = filesystemPlugin;
        this.f761i = yVar;
        this.f762j = e2;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((k) i((AbstractC0207F) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        k kVar = new k(this.h, this.f761i, this.f762j, interfaceC0311d);
        kVar.f760g = obj;
        return kVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) throws JSONException {
        Object objH;
        EnumC0322a enumC0322a = EnumC0322a.f2519b;
        int i2 = this.f759f;
        if (i2 == 0) {
            AbstractC0062a.X(obj);
            AbstractC0207F abstractC0207F = (AbstractC0207F) this.f760g;
            g0.k controller = this.h.getController();
            C0202A c0202a = this.f761i.f805b;
            this.f759f = 1;
            objH = controller.h(abstractC0207F, c0202a, this);
            if (objH == enumC0322a) {
                return enumC0322a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0062a.X(obj);
            objH = ((C0232e) obj).f2025b;
        }
        boolean z2 = objH instanceof C0231d;
        E e2 = this.f762j;
        if (!z2) {
            String str = (String) objH;
            x0.g.e("readData", str);
            com.getcapacitor.w wVar = new com.getcapacitor.w();
            wVar.putOpt("data", str);
            AbstractC0062a.R(e2, wVar, 2);
        }
        Throwable thA = C0232e.a(objH);
        if (thA != null) {
            String str2 = e2.d;
            x0.g.d("getMethodName(...)", str2);
            AbstractC0062a.Q(e2, P0.b.G(str2, thA));
        }
        return C0235h.f2029a;
    }
}
