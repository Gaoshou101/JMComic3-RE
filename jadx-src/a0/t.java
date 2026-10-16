package a0;

import a.AbstractC0062a;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import com.getcapacitor.E;
import j0.AbstractC0207F;
import k0.C0231d;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class t extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public int f789f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f790g;
    public final /* synthetic */ FilesystemPlugin h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f791i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(FilesystemPlugin filesystemPlugin, E e2, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = filesystemPlugin;
        this.f791i = e2;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((t) i((AbstractC0207F) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        t tVar = new t(this.h, this.f791i, interfaceC0311d);
        tVar.f790g = obj;
        return tVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        Object objE;
        EnumC0322a enumC0322a = EnumC0322a.f2519b;
        int i2 = this.f789f;
        if (i2 == 0) {
            AbstractC0062a.X(obj);
            AbstractC0207F abstractC0207F = (AbstractC0207F) this.f790g;
            g0.k controller = this.h.getController();
            this.f789f = 1;
            objE = controller.e(abstractC0207F, this);
            if (objE == enumC0322a) {
                return enumC0322a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0062a.X(obj);
            objE = ((C0232e) obj).f2025b;
        }
        boolean z2 = objE instanceof C0231d;
        E e2 = this.f791i;
        if (!z2) {
            AbstractC0062a.R(e2, P0.b.H((j0.y) objE), 2);
        }
        Throwable thA = C0232e.a(objE);
        if (thA != null) {
            String str = e2.d;
            x0.g.d("getMethodName(...)", str);
            AbstractC0062a.Q(e2, P0.b.G(str, thA));
        }
        return C0235h.f2029a;
    }
}
