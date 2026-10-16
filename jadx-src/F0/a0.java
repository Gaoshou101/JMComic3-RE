package F0;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f100a = new ThreadLocal();

    public static F a() {
        ThreadLocal threadLocal = f100a;
        F f2 = (F) threadLocal.get();
        if (f2 != null) {
            return f2;
        }
        C0002c c0002c = new C0002c(Thread.currentThread());
        threadLocal.set(c0002c);
        return c0002c;
    }
}
