package H0;

import F0.AbstractC0019u;
import F0.C0004e;
import F0.C0009j;
import F0.InterfaceC0003d;
import F0.W;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final m f241a = new m(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f242b = K0.a.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f243c = K0.a.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final K0.u d = new K0.u("BUFFERED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final K0.u f244e = new K0.u("SHOULD_BUFFER", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final K0.u f245f = new K0.u("S_RESUMING_BY_RCV", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final K0.u f246g = new K0.u("RESUMING_BY_EB", 0);
    public static final K0.u h = new K0.u("POISONED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final K0.u f247i = new K0.u("DONE_RCV", 0);

    /* renamed from: j, reason: collision with root package name */
    public static final K0.u f248j = new K0.u("INTERRUPTED_SEND", 0);

    /* renamed from: k, reason: collision with root package name */
    public static final K0.u f249k = new K0.u("INTERRUPTED_RCV", 0);

    /* renamed from: l, reason: collision with root package name */
    public static final K0.u f250l = new K0.u("CHANNEL_CLOSED", 0);

    /* renamed from: m, reason: collision with root package name */
    public static final K0.u f251m = new K0.u("SUSPEND", 0);

    /* renamed from: n, reason: collision with root package name */
    public static final K0.u f252n = new K0.u("SUSPEND_NO_WAITER", 0);

    /* renamed from: o, reason: collision with root package name */
    public static final K0.u f253o = new K0.u("FAILED", 0);

    /* renamed from: p, reason: collision with root package name */
    public static final K0.u f254p = new K0.u("NO_RECEIVE_RESULT", 0);

    /* renamed from: q, reason: collision with root package name */
    public static final K0.u f255q = new K0.u("CLOSE_HANDLER_CLOSED", 0);

    /* renamed from: r, reason: collision with root package name */
    public static final K0.u f256r = new K0.u("CLOSE_HANDLER_INVOKED", 0);

    /* renamed from: s, reason: collision with root package name */
    public static final K0.u f257s = new K0.u("NO_CLOSE_CAUSE", 0);

    public static final boolean a(InterfaceC0003d interfaceC0003d, Object obj, w0.q qVar) {
        K0.u uVar;
        C0004e c0004e = (C0004e) interfaceC0003d;
        c0004e.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0004e.h;
            Object obj2 = atomicReferenceFieldUpdater.get(c0004e);
            boolean z2 = obj2 instanceof W;
            uVar = AbstractC0019u.f126a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0009j;
                uVar = null;
                break;
            }
            Object objU = C0004e.u(obj, c0004e.d, qVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(c0004e, obj2, objU)) {
                if (atomicReferenceFieldUpdater.get(c0004e) != obj2) {
                    break;
                }
            }
            if (!c0004e.q()) {
                c0004e.m();
            }
        }
        if (uVar == null) {
            return false;
        }
        c0004e.n(c0004e.d);
        return true;
    }
}
