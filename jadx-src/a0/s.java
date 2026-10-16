package a0;

import a.AbstractC0062a;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import com.getcapacitor.E;
import j0.AbstractC0207F;
import j0.C0208G;
import k0.C0235h;
import n0.InterfaceC0311d;

/* loaded from: classes.dex */
public final class s extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FilesystemPlugin f786g;
    public final /* synthetic */ C0208G h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f787i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w0.q f788j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(FilesystemPlugin filesystemPlugin, C0208G c0208g, E e2, w0.q qVar, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f786g = filesystemPlugin;
        this.h = c0208g;
        this.f787i = e2;
        this.f788j = qVar;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        s sVar = (s) i((AbstractC0207F) obj, (InterfaceC0311d) obj2);
        C0235h c0235h = C0235h.f2029a;
        sVar.k(c0235h);
        return c0235h;
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        s sVar = new s(this.f786g, this.h, this.f787i, this.f788j, interfaceC0311d);
        sVar.f785f = obj;
        return sVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        AbstractC0062a.X(obj);
        this.f786g.runWithPermission(this.h, this.f787i, new r(this.f788j, (AbstractC0207F) this.f785f, null));
        return C0235h.f2029a;
    }
}
