package a0;

import a.AbstractC0062a;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import com.getcapacitor.E;
import j0.AbstractC0207F;
import j0.C0211b;
import k0.C0231d;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class h extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public int f749f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f750g;
    public final /* synthetic */ FilesystemPlugin h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f751i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FilesystemPlugin filesystemPlugin, E e2, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = filesystemPlugin;
        this.f751i = e2;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((h) i((AbstractC0207F) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        h hVar = new h(this.h, this.f751i, interfaceC0311d);
        hVar.f750g = obj;
        return hVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        Object objC;
        EnumC0322a enumC0322a = EnumC0322a.f2519b;
        int i2 = this.f749f;
        if (i2 == 0) {
            AbstractC0062a.X(obj);
            AbstractC0207F abstractC0207F = (AbstractC0207F) this.f750g;
            g0.k controller = this.h.getController();
            C0211b c0211b = new C0211b(false);
            this.f749f = 1;
            objC = controller.c(abstractC0207F, c0211b, this);
            if (objC == enumC0322a) {
                return enumC0322a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0062a.X(obj);
            objC = ((C0232e) obj).f2025b;
        }
        boolean z2 = objC instanceof C0231d;
        E e2 = this.f751i;
        if (!z2) {
            AbstractC0062a.R(e2, null, 3);
        }
        Throwable thA = C0232e.a(objC);
        if (thA != null) {
            String str = e2.d;
            x0.g.d("getMethodName(...)", str);
            AbstractC0062a.Q(e2, P0.b.G(str, thA));
        }
        return C0235h.f2029a;
    }
}
