package a0;

import a.AbstractC0062a;
import android.media.MediaScannerConnection;
import android.net.Uri;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import com.getcapacitor.E;
import j0.AbstractC0207F;
import j0.C0204C;
import j0.EnumC0203B;
import k0.C0231d;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class u extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public int f792f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f793g;
    public final /* synthetic */ FilesystemPlugin h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0063A f794i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E f795j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(FilesystemPlugin filesystemPlugin, C0063A c0063a, E e2, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = filesystemPlugin;
        this.f794i = c0063a;
        this.f795j = e2;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((u) i((AbstractC0207F) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        u uVar = new u(this.h, this.f794i, this.f795j, interfaceC0311d);
        uVar.f793g = obj;
        return uVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        AbstractC0207F abstractC0207F;
        Object obj2;
        String path;
        EnumC0322a enumC0322a = EnumC0322a.f2519b;
        int i2 = this.f792f;
        C0204C c0204c = this.f794i.f732b;
        FilesystemPlugin filesystemPlugin = this.h;
        if (i2 == 0) {
            AbstractC0062a.X(obj);
            AbstractC0207F abstractC0207F2 = (AbstractC0207F) this.f793g;
            g0.k controller = filesystemPlugin.getController();
            this.f793g = abstractC0207F2;
            this.f792f = 1;
            Object objI = controller.i(abstractC0207F2, c0204c, this);
            if (objI == enumC0322a) {
                return enumC0322a;
            }
            abstractC0207F = abstractC0207F2;
            obj2 = objI;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC0207F = (AbstractC0207F) this.f793g;
            AbstractC0062a.X(obj);
            obj2 = ((C0232e) obj).f2025b;
        }
        boolean z2 = obj2 instanceof C0231d;
        E e2 = this.f795j;
        if (!z2) {
            Uri uri = (Uri) obj2;
            if (abstractC0207F.a0() && (path = uri.getPath()) != null) {
                MediaScannerConnection.scanFile(filesystemPlugin.getContext(), new String[]{path}, null, null);
            }
            EnumC0203B enumC0203B = c0204c.f1926c;
            x0.g.e("uri", uri);
            AbstractC0062a.R(e2, enumC0203B != EnumC0203B.f1923c ? P0.b.h(uri) : null, 2);
        }
        Throwable thA = C0232e.a(obj2);
        if (thA != null) {
            String str = e2.d;
            x0.g.d("getMethodName(...)", str);
            AbstractC0062a.Q(e2, P0.b.G(str, thA));
        }
        return C0235h.f2029a;
    }
}
