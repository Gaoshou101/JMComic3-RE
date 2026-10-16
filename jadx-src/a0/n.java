package a0;

import F0.AbstractC0019u;
import a.AbstractC0062a;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import com.getcapacitor.E;
import j0.AbstractC0207F;
import k0.C0235h;
import n0.InterfaceC0311d;

/* loaded from: classes.dex */
public final class n extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FilesystemPlugin f768g;
    public final /* synthetic */ x h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f769i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(FilesystemPlugin filesystemPlugin, x xVar, E e2, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f768g = filesystemPlugin;
        this.h = xVar;
        this.f769i = e2;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        n nVar = (n) i((AbstractC0207F) obj, (InterfaceC0311d) obj2);
        C0235h c0235h = C0235h.f2029a;
        nVar.k(c0235h);
        return c0235h;
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        n nVar = new n(this.f768g, this.h, this.f769i, interfaceC0311d);
        nVar.f767f = obj;
        return nVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        AbstractC0062a.X(obj);
        AbstractC0207F abstractC0207F = (AbstractC0207F) this.f767f;
        FilesystemPlugin filesystemPlugin = this.f768g;
        g0.k controller = filesystemPlugin.getController();
        j0.z zVar = this.h.f803b;
        controller.getClass();
        x0.g.e("uri", abstractC0207F);
        X.i iVar = new X.i(new g0.i(controller, abstractC0207F, zVar, null));
        E e2 = this.f769i;
        AbstractC0019u.g(filesystemPlugin.getCoroutineScope(), new I0.e(new D.c(new I0.h(new D.c(iVar, 2, new l(e2, null)), new m(e2, null, 0)), new m(e2, null, 1)), null));
        return C0235h.f2029a;
    }
}
