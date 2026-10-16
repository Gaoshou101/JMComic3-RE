package K0;

import F0.AbstractC0019u;
import F0.C0011l;
import F0.C0012m;
import F0.Z;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final u f370a = new u("CLOSED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final u f371b = new u("UNDEFINED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final u f372c = new u("REUSABLE_CLAIMED", 0);
    public static final u d = new u("NO_THREAD_ELEMENTS", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final C0012m f373e = new C0012m(4);

    /* renamed from: f, reason: collision with root package name */
    public static final C0012m f374f = new C0012m(5);

    /* renamed from: g, reason: collision with root package name */
    public static final C0012m f375g = new C0012m(6);

    public static final void a(w0.l lVar, Object obj, InterfaceC0316i interfaceC0316i) {
        C0011l c0011lB = b(lVar, obj, null);
        if (c0011lB != null) {
            AbstractC0019u.d(c0011lB, interfaceC0316i);
        }
    }

    public static final C0011l b(w0.l lVar, Object obj, C0011l c0011l) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            lVar.g(obj);
        } catch (Throwable th) {
            if (c0011l == null || c0011l.getCause() == th) {
                return new C0011l("Exception in undelivered element handler for " + obj, th);
            }
            P0.b.a(c0011l, th);
        }
        return c0011l;
    }

    public static final void c(int i2) {
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [K0.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [K0.s] */
    public static final Object d(long j2, H0.m mVar) {
        H0.f fVar = H0.f.f240j;
        while (true) {
            long j3 = mVar.f404c;
            if (j3 >= j2 && !mVar.c()) {
                return mVar;
            }
            Object obj = b.f376a.get(mVar);
            u uVar = f370a;
            if (obj == uVar) {
                return uVar;
            }
            ?? r3 = (s) ((b) obj);
            if (r3 != 0) {
                mVar = r3;
            } else {
                ?? r1 = (s) fVar.f(Long.valueOf(j3 + 1), mVar);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f376a;
                    if (atomicReferenceFieldUpdater.compareAndSet(mVar, null, r1)) {
                        if (mVar.c()) {
                            mVar.d();
                        }
                        mVar = r1;
                    } else if (atomicReferenceFieldUpdater.get(mVar) != null) {
                        break;
                    }
                }
            }
        }
    }

    public static final s e(Object obj) {
        if (obj != f370a) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void f(Throwable th, InterfaceC0316i interfaceC0316i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable runtimeException;
        Iterator it = d.f379a.iterator();
        while (it.hasNext()) {
            try {
                ((G0.b) it.next()).d(th, interfaceC0316i);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    P0.b.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            P0.b.a(th, new e(interfaceC0316i));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean g(Object obj) {
        return obj == f370a;
    }

    public static final Object h(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void i(InterfaceC0316i interfaceC0316i, Object obj) {
        if (obj == d) {
            return;
        }
        if (!(obj instanceof x)) {
            Object objJ = interfaceC0316i.j(null, f374f);
            x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>", objJ);
            androidx.fragment.app.x.b(objJ);
            throw null;
        }
        x xVar = (x) obj;
        Z[] zArr = xVar.f411b;
        int length = zArr.length - 1;
        if (length < 0) {
            return;
        }
        Z z2 = zArr[length];
        x0.g.b(null);
        Object obj2 = xVar.f410a[length];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: all -> 0x0078, DONT_GENERATE, TryCatch #2 {all -> 0x0078, blocks: (B:18:0x0056, B:20:0x0064, B:22:0x006a, B:35:0x009c, B:25:0x007a, B:27:0x0088, B:32:0x0093, B:34:0x0099, B:40:0x00a9, B:43:0x00b2, B:42:0x00af, B:30:0x008e), top: B:55:0x0056, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(java.lang.Object r9, n0.InterfaceC0311d r10) {
        /*
            boolean r0 = r10 instanceof K0.f
            if (r0 == 0) goto Lbc
            K0.f r10 = (K0.f) r10
            java.lang.Throwable r0 = k0.C0232e.a(r9)
            if (r0 != 0) goto Le
            r1 = r9
            goto L14
        Le:
            F0.k r1 = new F0.k
            r2 = 0
            r1.<init>(r0, r2)
        L14:
            F0.p r0 = r10.f382e
            p0.c r2 = r10.f383f
            n0.i r3 = r2.getContext()
            boolean r3 = r0.f(r3)
            r4 = 1
            if (r3 == 0) goto L30
            r10.f384g = r1
            r10.d = r4
            n0.i r9 = r2.getContext()
            r0.d(r9, r10)
            goto Lbf
        L30:
            F0.F r0 = F0.a0.a()
            long r5 = r0.d
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L53
            r10.f384g = r1
            r10.d = r4
            l0.f r9 = r0.f85f
            if (r9 != 0) goto L4e
            l0.f r9 = new l0.f
            r9.<init>()
            r0.f85f = r9
        L4e:
            r9.addLast(r10)
            goto Lbf
        L53:
            r0.l(r4)
            n0.i r1 = r2.getContext()     // Catch: java.lang.Throwable -> L78
            F0.q r3 = F0.C0016q.f123c     // Catch: java.lang.Throwable -> L78
            n0.g r1 = r1.g(r3)     // Catch: java.lang.Throwable -> L78
            F0.L r1 = (F0.L) r1     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L7a
            boolean r3 = r1.b()     // Catch: java.lang.Throwable -> L78
            if (r3 != 0) goto L7a
            F0.T r1 = (F0.T) r1     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.CancellationException r9 = r1.t()     // Catch: java.lang.Throwable -> L78
            k0.d r9 = a.AbstractC0062a.m(r9)     // Catch: java.lang.Throwable -> L78
            r10.h(r9)     // Catch: java.lang.Throwable -> L78
            goto L9c
        L78:
            r9 = move-exception
            goto Lb3
        L7a:
            java.lang.Object r1 = r10.h     // Catch: java.lang.Throwable -> L78
            n0.i r3 = r2.getContext()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = n(r3, r1)     // Catch: java.lang.Throwable -> L78
            K0.u r4 = K0.a.d     // Catch: java.lang.Throwable -> L78
            if (r1 == r4) goto L8d
            F0.c0 r4 = F0.AbstractC0019u.k(r2, r3, r1)     // Catch: java.lang.Throwable -> L78
            goto L8e
        L8d:
            r4 = 0
        L8e:
            r2.h(r9)     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto L99
            boolean r9 = r4.O()     // Catch: java.lang.Throwable -> L78
            if (r9 == 0) goto L9c
        L99:
            i(r3, r1)     // Catch: java.lang.Throwable -> L78
        L9c:
            boolean r9 = r0.m()     // Catch: java.lang.Throwable -> L78
            if (r9 != 0) goto L9c
        La2:
            r0.i()
            goto Lbf
        La6:
            r9 = move-exception
            if (r4 == 0) goto Laf
            boolean r2 = r4.O()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto Lb2
        Laf:
            i(r3, r1)     // Catch: java.lang.Throwable -> L78
        Lb2:
            throw r9     // Catch: java.lang.Throwable -> L78
        Lb3:
            r10.g(r9)     // Catch: java.lang.Throwable -> Lb7
            goto La2
        Lb7:
            r9 = move-exception
            r0.i()
            throw r9
        Lbc:
            r10.h(r9)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.a.j(java.lang.Object, n0.d):void");
    }

    public static final long k(String str, long j2, long j3, long j4) {
        String property;
        int i2 = v.f408a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        Long lW = E0.l.W(property);
        if (lW == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lW.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int l(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) k(str, i2, i3, i4);
    }

    public static final Object m(InterfaceC0316i interfaceC0316i) {
        Object objJ = interfaceC0316i.j(0, f373e);
        x0.g.b(objJ);
        return objJ;
    }

    public static final Object n(InterfaceC0316i interfaceC0316i, Object obj) {
        if (obj == null) {
            obj = m(interfaceC0316i);
        }
        if (obj == 0) {
            return d;
        }
        if (obj instanceof Integer) {
            return interfaceC0316i.j(new x(((Number) obj).intValue(), interfaceC0316i), f375g);
        }
        androidx.fragment.app.x.b(obj);
        throw null;
    }
}
