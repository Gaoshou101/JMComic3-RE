package z;

import android.content.res.Resources;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final w.d f2755a;

    /* renamed from: b, reason: collision with root package name */
    public static final p.j f2756b;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    static {
        /*
            java.lang.String r0 = "TypefaceCompat static init"
            a.AbstractC0062a.e(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L13
            z.l r0 = new z.l
            r0.<init>()
            z.g.f2755a = r0
            goto L4b
        L13:
            r1 = 28
            if (r0 < r1) goto L1f
            z.k r0 = new z.k
            r0.<init>()
            z.g.f2755a = r0
            goto L4b
        L1f:
            r1 = 26
            if (r0 < r1) goto L2b
            z.j r0 = new z.j
            r0.<init>()
            z.g.f2755a = r0
            goto L4b
        L2b:
            r1 = 24
            if (r0 < r1) goto L44
            java.lang.reflect.Method r0 = z.i.f2763c
            if (r0 != 0) goto L3a
            java.lang.String r1 = "TypefaceCompatApi24Impl"
            java.lang.String r2 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        L3a:
            if (r0 == 0) goto L44
            z.i r0 = new z.i
            r0.<init>()
            z.g.f2755a = r0
            goto L4b
        L44:
            z.h r0 = new z.h
            r0.<init>()
            z.g.f2755a = r0
        L4b:
            p.j r0 = new p.j
            r1 = 16
            r0.<init>(r1)
            z.g.f2756b = r0
            android.os.Trace.endSection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.g.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r14, y.InterfaceC0346d r15, android.content.res.Resources r16, int r17, java.lang.String r18, int r19, int r20, m.V r21) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.g.a(android.content.Context, y.d, android.content.res.Resources, int, java.lang.String, int, int, m.V):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
