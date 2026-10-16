package M0;

import K0.v;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f461a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f462b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f463c;
    public static final int d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f464e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f465f;

    static {
        String property;
        int i2 = v.f408a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f461a = property;
        f462b = K0.a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = v.f408a;
        if (i3 < 2) {
            i3 = 2;
        }
        f463c = K0.a.l("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        d = K0.a.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f464e = TimeUnit.SECONDS.toNanos(K0.a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f465f = g.f458a;
    }
}
