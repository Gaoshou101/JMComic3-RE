package F0;

/* renamed from: F0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0021w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f135a = 0;

    static {
        String property;
        int i2 = K0.v.f408a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (!(property != null ? Boolean.parseBoolean(property) : false)) {
            RunnableC0020v runnableC0020v = RunnableC0020v.f133j;
            return;
        }
        M0.e eVar = A.f80a;
        G0.c cVar = K0.n.f400a;
        G0.c cVar2 = cVar.f213g;
        if (cVar instanceof InterfaceC0022x) {
            return;
        }
        RunnableC0020v runnableC0020v2 = RunnableC0020v.f133j;
    }
}
