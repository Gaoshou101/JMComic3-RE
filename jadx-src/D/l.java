package D;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final p.j f40a = new p.j(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f41b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f42c;
    public static final p.k d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new p());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f41b = threadPoolExecutor;
        f42c = new Object();
        d = new p.k(0);
    }

    public static String a(List list, int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < list.size(); i3++) {
            sb.append(((h) list.get(i3)).f31e);
            sb.append("-");
            sb.append(i2);
            if (i3 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bc, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r8 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static D.k b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            r0 = 1
            java.lang.String r1 = "getFontSync"
            a.AbstractC0062a.e(r1)
            p.j r1 = D.l.f40a
            java.lang.Object r2 = r1.a(r8)     // Catch: java.lang.Throwable -> L19
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L1c
            D.k r8 = new D.k     // Catch: java.lang.Throwable -> L19
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        L19:
            r8 = move-exception
            goto Lb9
        L1c:
            D.m r10 = D.g.a(r9, r10)     // Catch: java.lang.Throwable -> L19 android.content.pm.PackageManager.NameNotFoundException -> Laf
            int r2 = r10.f43a     // Catch: java.lang.Throwable -> L19
            r3 = 0
            java.lang.Object r10 = r10.f44b
            java.util.List r10 = (java.util.List) r10
            r4 = -3
            if (r2 == 0) goto L30
            if (r2 == r0) goto L2e
        L2c:
            r2 = r4
            goto L50
        L2e:
            r2 = -2
            goto L50
        L30:
            java.lang.Object r2 = r10.get(r3)     // Catch: java.lang.Throwable -> L19
            D.n[] r2 = (D.n[]) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L4f
            int r5 = r2.length     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L3c
            goto L4f
        L3c:
            int r5 = r2.length     // Catch: java.lang.Throwable -> L19
            r6 = r3
        L3e:
            if (r6 >= r5) goto L4d
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L19
            int r7 = r7.f48e     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto L4b
            if (r7 >= 0) goto L49
            goto L2c
        L49:
            r2 = r7
            goto L50
        L4b:
            int r6 = r6 + r0
            goto L3e
        L4d:
            r2 = r3
            goto L50
        L4f:
            r2 = r0
        L50:
            if (r2 == 0) goto L5b
            D.k r8 = new D.k     // Catch: java.lang.Throwable -> L19
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        L5b:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L19
            if (r2 <= r0) goto L7d
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L19
            r2 = 29
            if (r0 < r2) goto L7d
            w.d r0 = z.g.f2755a     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            a.AbstractC0062a.e(r0)     // Catch: java.lang.Throwable -> L19
            w.d r0 = z.g.f2755a     // Catch: java.lang.Throwable -> L78
            android.graphics.Typeface r9 = r0.d(r9, r10, r11)     // Catch: java.lang.Throwable -> L78
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
            goto L93
        L78:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
            throw r8     // Catch: java.lang.Throwable -> L19
        L7d:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L19
            D.n[] r10 = (D.n[]) r10     // Catch: java.lang.Throwable -> L19
            w.d r0 = z.g.f2755a     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            a.AbstractC0062a.e(r0)     // Catch: java.lang.Throwable -> L19
            w.d r0 = z.g.f2755a     // Catch: java.lang.Throwable -> Laa
            android.graphics.Typeface r9 = r0.c(r9, r10, r11)     // Catch: java.lang.Throwable -> Laa
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
        L93:
            if (r9 == 0) goto La1
            r1.b(r8, r9)     // Catch: java.lang.Throwable -> L19
            D.k r8 = new D.k     // Catch: java.lang.Throwable -> L19
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        La1:
            D.k r8 = new D.k     // Catch: java.lang.Throwable -> L19
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        Laa:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
            throw r8     // Catch: java.lang.Throwable -> L19
        Laf:
            D.k r8 = new D.k     // Catch: java.lang.Throwable -> L19
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        Lb9:
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: D.l.b(java.lang.String, android.content.Context, java.util.List, int):D.k");
    }
}
