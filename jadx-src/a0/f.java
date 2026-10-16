package a0;

import a.AbstractC0062a;
import android.net.Uri;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import com.getcapacitor.E;
import j0.AbstractC0207F;
import k0.C0231d;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class f extends p0.g implements w0.q {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f743f;

    /* renamed from: g, reason: collision with root package name */
    public int f744g;
    public /* synthetic */ AbstractC0207F h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ AbstractC0207F f745i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ FilesystemPlugin f746j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ E f747k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(FilesystemPlugin filesystemPlugin, E e2, InterfaceC0311d interfaceC0311d, int i2) {
        super(3, interfaceC0311d);
        this.f743f = i2;
        this.f746j = filesystemPlugin;
        this.f747k = e2;
    }

    @Override // w0.q
    public final Object e(Object obj, Object obj2, Object obj3) {
        AbstractC0207F abstractC0207F = (AbstractC0207F) obj;
        AbstractC0207F abstractC0207F2 = (AbstractC0207F) obj2;
        InterfaceC0311d interfaceC0311d = (InterfaceC0311d) obj3;
        switch (this.f743f) {
            case 0:
                f fVar = new f(this.f746j, this.f747k, interfaceC0311d, 0);
                fVar.h = abstractC0207F;
                fVar.f745i = abstractC0207F2;
                return fVar.k(C0235h.f2029a);
            default:
                f fVar2 = new f(this.f746j, this.f747k, interfaceC0311d, 1);
                fVar2.h = abstractC0207F;
                fVar2.f745i = abstractC0207F2;
                return fVar2.k(C0235h.f2029a);
        }
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        Object objA;
        Object objG;
        switch (this.f743f) {
            case 0:
                EnumC0322a enumC0322a = EnumC0322a.f2519b;
                int i2 = this.f744g;
                if (i2 == 0) {
                    AbstractC0062a.X(obj);
                    AbstractC0207F abstractC0207F = this.h;
                    AbstractC0207F abstractC0207F2 = this.f745i;
                    g0.k controller = this.f746j.getController();
                    this.h = null;
                    this.f744g = 1;
                    objA = controller.a(abstractC0207F, abstractC0207F2, this);
                    if (objA == enumC0322a) {
                        return enumC0322a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0062a.X(obj);
                    objA = ((C0232e) obj).f2025b;
                }
                boolean z2 = objA instanceof C0231d;
                E e2 = this.f747k;
                if (!z2) {
                    AbstractC0062a.R(e2, P0.b.h((Uri) objA), 2);
                }
                Throwable thA = C0232e.a(objA);
                if (thA != null) {
                    String str = e2.d;
                    x0.g.d("getMethodName(...)", str);
                    AbstractC0062a.Q(e2, P0.b.G(str, thA));
                }
                return C0235h.f2029a;
            default:
                EnumC0322a enumC0322a2 = EnumC0322a.f2519b;
                int i3 = this.f744g;
                if (i3 == 0) {
                    AbstractC0062a.X(obj);
                    AbstractC0207F abstractC0207F3 = this.h;
                    AbstractC0207F abstractC0207F4 = this.f745i;
                    g0.k controller2 = this.f746j.getController();
                    this.h = null;
                    this.f744g = 1;
                    objG = controller2.g(abstractC0207F3, abstractC0207F4, this);
                    if (objG == enumC0322a2) {
                        return enumC0322a2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0062a.X(obj);
                    objG = ((C0232e) obj).f2025b;
                }
                boolean z3 = objG instanceof C0231d;
                E e3 = this.f747k;
                if (!z3) {
                    AbstractC0062a.R(e3, null, 3);
                }
                Throwable thA2 = C0232e.a(objG);
                if (thA2 != null) {
                    String str2 = e3.d;
                    x0.g.d("getMethodName(...)", str2);
                    AbstractC0062a.Q(e3, P0.b.G(str2, thA2));
                }
                return C0235h.f2029a;
        }
    }
}
