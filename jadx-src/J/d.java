package J;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import m.C0297v0;

/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f316r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f317a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f318b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f319c;
    public D.b d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f320e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f321f;

    /* renamed from: g, reason: collision with root package name */
    public final int f322g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f323i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f324j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f325k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f326l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f327m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f328n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f329o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f330p;

    /* renamed from: q, reason: collision with root package name */
    public final C0297v0 f331q;

    public d(C0297v0 c0297v0) {
        a aVar = new a();
        aVar.f312e = Long.MIN_VALUE;
        aVar.f314g = -1L;
        aVar.f313f = 0L;
        this.f317a = aVar;
        this.f318b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f320e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f321f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f323i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f324j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f325k = fArr5;
        this.f319c = c0297v0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f322g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = f316r;
        aVar.f309a = 500;
        aVar.f310b = 500;
        this.f331q = c0297v0;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f320e
            r0 = r0[r7]
            float[] r1 = r3.f321f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f318b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f323i
            r0 = r0[r7]
            float[] r1 = r3.f324j
            r1 = r1[r7]
            float[] r2 = r3.f325k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: J.d.a(float, float, float, int):float");
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f322g;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f329o && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f327m) {
            this.f329o = false;
            return;
        }
        a aVar = this.f317a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (jCurrentAnimationTimeMillis - aVar.f312e);
        int i4 = aVar.f310b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f315i = i2;
        aVar.h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f314g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        C0297v0 c0297v0;
        int count;
        a aVar = this.f317a;
        float f2 = aVar.d;
        int iAbs = (int) (f2 / Math.abs(f2));
        Math.abs(aVar.f311c);
        if (iAbs == 0 || (count = (c0297v0 = this.f331q).getCount()) == 0) {
            return false;
        }
        int childCount = c0297v0.getChildCount();
        int firstVisiblePosition = c0297v0.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i2 >= count && c0297v0.getChildAt(childCount - 1).getBottom() <= c0297v0.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c0297v0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 1
            boolean r1 = r7.f330p
            r2 = 0
            if (r1 != 0) goto L7
            return r2
        L7:
            int r1 = r9.getActionMasked()
            if (r1 == 0) goto L1a
            if (r1 == r0) goto L16
            r3 = 2
            if (r1 == r3) goto L1e
            r8 = 3
            if (r1 == r8) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.f328n = r0
            r7.f326l = r2
        L1e:
            float r1 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f319c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r1 = r7.a(r1, r3, r5, r2)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r0)
            J.a r9 = r7.f317a
            r9.f311c = r1
            r9.d = r8
            boolean r8 = r7.f329o
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            D.b r8 = r7.d
            if (r8 != 0) goto L5f
            D.b r8 = new D.b
            r8.<init>(r0, r7)
            r7.d = r8
        L5f:
            r7.f329o = r0
            r7.f327m = r0
            boolean r8 = r7.f326l
            if (r8 != 0) goto L74
            int r8 = r7.h
            if (r8 <= 0) goto L74
            D.b r9 = r7.d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = G.K.f146a
            r4.postOnAnimationDelayed(r9, r5)
            goto L79
        L74:
            D.b r8 = r7.d
            r8.run()
        L79:
            r7.f326l = r0
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: J.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
