package G0;

import F0.C0016q;
import n0.AbstractC0308a;
import n0.InterfaceC0314g;

/* loaded from: classes.dex */
public final class b extends AbstractC0308a implements InterfaceC0314g {
    private volatile Object _preHandler;

    public b() {
        super(C0016q.f122b);
        this._preHandler = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Throwable r3, n0.InterfaceC0316i r4) {
        /*
            r2 = this;
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r0 > r4) goto L4a
            r0 = 28
            if (r4 >= r0) goto L4a
            java.lang.Object r4 = r2._preHandler
            r0 = 0
            if (r4 == r2) goto L12
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            goto L32
        L12:
            java.lang.Class<java.lang.Thread> r4 = java.lang.Thread.class
            java.lang.String r1 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r1, r0)     // Catch: java.lang.Throwable -> L2f
            int r1 = r4.getModifiers()     // Catch: java.lang.Throwable -> L2f
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2f
            int r1 = r4.getModifiers()     // Catch: java.lang.Throwable -> L2f
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            r4 = r0
        L30:
            r2._preHandler = r4
        L32:
            if (r4 == 0) goto L39
            java.lang.Object r4 = r4.invoke(r0, r0)
            goto L3a
        L39:
            r4 = r0
        L3a:
            boolean r1 = r4 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L41
            r0 = r4
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L41:
            if (r0 == 0) goto L4a
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r0.uncaughtException(r4, r3)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.b.d(java.lang.Throwable, n0.i):void");
    }
}
