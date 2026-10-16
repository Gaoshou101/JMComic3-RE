package Q;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f595c;

    public /* synthetic */ i(Context context, int i2) {
        this.f594b = i2;
        this.f595c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r11.f594b
            switch(r0) {
                case 0: goto L96;
                case 1: goto L88;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L85
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r11.f595c
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r4, r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r1) goto L85
            java.lang.String r5 = "locale"
            if (r0 < r2) goto L5e
            p.g r0 = g.AbstractC0143o.f1673g
            r0.getClass()
            p.b r2 = new p.b
            r2.<init>(r0)
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            g.o r0 = (g.AbstractC0143o) r0
            if (r0 == 0) goto L2d
            g.A r0 = (g.LayoutInflaterFactory2C0118A) r0
            android.content.Context r0 = r0.f1559k
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r0.getSystemService(r5)
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 == 0) goto L63
            android.os.LocaleList r0 = g.AbstractC0140l.a(r0)
            C.f r2 = new C.f
            C.j r6 = new C.j
            r6.<init>(r0)
            r2.<init>(r6)
            goto L65
        L5e:
            C.f r2 = g.AbstractC0143o.f1670c
            if (r2 == 0) goto L63
            goto L65
        L63:
            C.f r2 = C.f.f7b
        L65:
            C.h r0 = r2.f8a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7e
            java.lang.String r0 = v.d.f(r4)
            java.lang.Object r2 = r4.getSystemService(r5)
            if (r2 == 0) goto L7e
            android.os.LocaleList r0 = g.AbstractC0139k.a(r0)
            g.AbstractC0140l.b(r2, r0)
        L7e:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L85:
            g.AbstractC0143o.f1672f = r1
            return
        L88:
            Q.e r0 = new Q.e
            r0.<init>()
            L.c r1 = Q.g.f584a
            r2 = 0
            android.content.Context r3 = r11.f595c
            Q.g.s(r3, r0, r1, r2)
            return
        L96:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r6 = 1
            r7 = 0
            r5 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            Q.i r1 = new Q.i
            android.content.Context r2 = r11.f595c
            r3 = 1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.i.run():void");
    }
}
