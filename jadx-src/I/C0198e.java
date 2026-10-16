package i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: i.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198e extends Drawable implements Drawable.Callback {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f1893t = 0;

    /* renamed from: a, reason: collision with root package name */
    public C0195b f1894a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f1895b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f1896c;
    public Drawable d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1898f;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public D.b f1900i;

    /* renamed from: j, reason: collision with root package name */
    public long f1901j;

    /* renamed from: k, reason: collision with root package name */
    public long f1902k;

    /* renamed from: l, reason: collision with root package name */
    public U.b f1903l;

    /* renamed from: m, reason: collision with root package name */
    public C0195b f1904m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1905n;

    /* renamed from: o, reason: collision with root package name */
    public C0195b f1906o;

    /* renamed from: p, reason: collision with root package name */
    public P0.b f1907p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1910s;

    /* renamed from: e, reason: collision with root package name */
    public int f1897e = 255;

    /* renamed from: g, reason: collision with root package name */
    public int f1899g = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f1908q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f1909r = -1;

    public C0198e(C0195b c0195b, Resources resources) {
        i(new C0195b(c0195b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0276, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i.C0198e c(android.content.Context r20, android.content.res.Resources r21, android.content.res.XmlResourceParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0198e.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):i.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f1898f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f1896c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f1901j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f1897e
            r3.setAlpha(r9)
            r13.f1901j = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            i.b r10 = r13.f1894a
            int r10 = r10.f1886y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f1897e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f1901j = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.d
            if (r9 == 0) goto L61
            long r10 = r13.f1902k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.d = r0
            r13.f1902k = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            i.b r4 = r13.f1894a
            int r4 = r4.f1887z
            int r3 = r3 / r4
            int r4 = r13.f1897e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f1902k = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            D.b r14 = r13.f1900i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0198e.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        C0195b c0195b = this.f1894a;
        if (theme == null) {
            c0195b.getClass();
            return;
        }
        c0195b.c();
        int i2 = c0195b.h;
        Drawable[] drawableArr = c0195b.f1870g;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i3].applyTheme(theme);
                c0195b.f1868e |= drawableArr[i3].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            c0195b.f1866b = resources;
            int i4 = resources.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = 160;
            }
            int i5 = c0195b.f1867c;
            c0195b.f1867c = i4;
            if (i5 != i4) {
                c0195b.f1875m = false;
                c0195b.f1872j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f1894a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f1903l == null) {
            this.f1903l = new U.b();
        }
        U.b bVar = this.f1903l;
        bVar.f630b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f1894a.f1886y <= 0 && this.f1898f) {
                drawable.setAlpha(this.f1897e);
            }
            C0195b c0195b = this.f1894a;
            if (c0195b.f1857C) {
                drawable.setColorFilter(c0195b.f1856B);
            } else {
                if (c0195b.f1860F) {
                    drawable.setTintList(c0195b.f1858D);
                }
                C0195b c0195b2 = this.f1894a;
                if (c0195b2.f1861G) {
                    drawable.setTintMode(c0195b2.f1859E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1894a.f1885w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f1894a.f1855A);
            Rect rect = this.f1895b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            U.b bVar2 = this.f1903l;
            Drawable.Callback callback = (Drawable.Callback) bVar2.f630b;
            bVar2.f630b = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            U.b bVar3 = this.f1903l;
            Drawable.Callback callback2 = (Drawable.Callback) bVar3.f630b;
            bVar3.f630b = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f1896c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z2;
        Drawable drawable = this.d;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f1896c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1898f) {
                this.f1896c.setAlpha(this.f1897e);
            }
        }
        if (this.f1902k != 0) {
            this.f1902k = 0L;
            z2 = true;
        }
        if (this.f1901j != 0) {
            this.f1901j = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.h && super.mutate() == this) {
            C0195b c0195b = new C0195b(this.f1906o, this, null);
            c0195b.f1863I = c0195b.f1863I.clone();
            c0195b.f1864J = c0195b.f1864J.clone();
            i(c0195b);
            this.h = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f1905n) {
            f();
            C0195b c0195b = this.f1904m;
            c0195b.f1863I = c0195b.f1863I.clone();
            c0195b.f1864J = c0195b.f1864J.clone();
            this.f1905n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1897e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1894a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        C0195b c0195b = this.f1894a;
        if (!c0195b.f1883u) {
            c0195b.c();
            c0195b.f1883u = true;
            int i2 = c0195b.h;
            Drawable[] drawableArr = c0195b.f1870g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    c0195b.f1884v = true;
                    z2 = true;
                    break;
                }
                if (drawableArr[i3].getConstantState() == null) {
                    c0195b.f1884v = false;
                    z2 = false;
                    break;
                }
                i3++;
            }
        } else {
            z2 = c0195b.f1884v;
        }
        if (!z2) {
            return null;
        }
        this.f1894a.d = getChangingConfigurations();
        return this.f1894a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f1896c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f1895b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C0195b c0195b = this.f1894a;
        if (c0195b.f1874l) {
            if (!c0195b.f1875m) {
                c0195b.b();
            }
            return c0195b.f1877o;
        }
        Drawable drawable = this.f1896c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C0195b c0195b = this.f1894a;
        if (c0195b.f1874l) {
            if (!c0195b.f1875m) {
                c0195b.b();
            }
            return c0195b.f1876n;
        }
        Drawable drawable = this.f1896c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C0195b c0195b = this.f1894a;
        if (c0195b.f1874l) {
            if (!c0195b.f1875m) {
                c0195b.b();
            }
            return c0195b.f1879q;
        }
        Drawable drawable = this.f1896c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C0195b c0195b = this.f1894a;
        if (c0195b.f1874l) {
            if (!c0195b.f1875m) {
                c0195b.b();
            }
            return c0195b.f1878p;
        }
        Drawable drawable = this.f1896c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1896c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C0195b c0195b = this.f1894a;
        if (c0195b.f1880r) {
            return c0195b.f1881s;
        }
        c0195b.c();
        int i2 = c0195b.h;
        Drawable[] drawableArr = c0195b.f1870g;
        int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i3 = 1; i3 < i2; i3++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
        }
        c0195b.f1881s = opacity;
        c0195b.f1880r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f1896c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C0195b c0195b = this.f1894a;
        boolean padding = false;
        Rect rect2 = null;
        if (!c0195b.f1871i) {
            Rect rect3 = c0195b.f1873k;
            if (rect3 != null || c0195b.f1872j) {
                rect2 = rect3;
            } else {
                c0195b.c();
                Rect rect4 = new Rect();
                int i2 = c0195b.h;
                Drawable[] drawableArr = c0195b.f1870g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                c0195b.f1872j = true;
                c0195b.f1873k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f1896c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f1894a.f1855A && getLayoutDirection() == 1) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f1899g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            i.b r0 = r9.f1894a
            int r0 = r0.f1887z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f1896c
            if (r0 == 0) goto L29
            r9.d = r0
            i.b r0 = r9.f1894a
            int r0 = r0.f1887z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f1902k = r0
            goto L35
        L29:
            r9.d = r4
            r9.f1902k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f1896c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            i.b r0 = r9.f1894a
            int r1 = r0.h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f1896c = r0
            r9.f1899g = r10
            if (r0 == 0) goto L5a
            i.b r10 = r9.f1894a
            int r10 = r10.f1886y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f1901j = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f1896c = r4
            r10 = -1
            r9.f1899g = r10
        L5a:
            long r0 = r9.f1901j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f1902k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7a
        L67:
            D.b r10 = r9.f1900i
            if (r10 != 0) goto L74
            D.b r10 = new D.b
            r1 = 4
            r10.<init>(r1, r9)
            r9.f1900i = r10
            goto L77
        L74:
            r9.unscheduleSelf(r10)
        L77:
            r9.a(r0)
        L7a:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0198e.h(int):boolean");
    }

    public final void i(C0195b c0195b) {
        this.f1894a = c0195b;
        int i2 = this.f1899g;
        if (i2 >= 0) {
            Drawable drawableD = c0195b.d(i2);
            this.f1896c = drawableD;
            if (drawableD != null) {
                d(drawableD);
            }
        }
        this.d = null;
        this.f1904m = c0195b;
        this.f1906o = c0195b;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C0195b c0195b = this.f1894a;
        if (c0195b != null) {
            c0195b.f1880r = false;
            c0195b.f1882t = false;
        }
        if (drawable != this.f1896c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f1894a.f1855A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f1896c;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        P0.b bVar = this.f1907p;
        if (bVar != null) {
            bVar.E();
            this.f1907p = null;
            h(this.f1908q);
            this.f1908q = -1;
            this.f1909r = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f1910s) {
            g();
            C0195b c0195b = this.f1906o;
            c0195b.f1863I = c0195b.f1863I.clone();
            c0195b.f1864J = c0195b.f1864J.clone();
            this.f1910s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1896c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        C0195b c0195b = this.f1894a;
        int i3 = this.f1899g;
        int i4 = c0195b.h;
        Drawable[] drawableArr = c0195b.f1870g;
        boolean z2 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i2);
                if (i5 == i3) {
                    z2 = layoutDirection;
                }
            }
        }
        c0195b.x = i2;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f1896c;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0198e.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f1896c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f1898f && this.f1897e == i2) {
            return;
        }
        this.f1898f = true;
        this.f1897e = i2;
        Drawable drawable = this.f1896c;
        if (drawable != null) {
            if (this.f1901j == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        C0195b c0195b = this.f1894a;
        if (c0195b.f1855A != z2) {
            c0195b.f1855A = z2;
            Drawable drawable = this.f1896c;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C0195b c0195b = this.f1894a;
        c0195b.f1857C = true;
        if (c0195b.f1856B != colorFilter) {
            c0195b.f1856B = colorFilter;
            Drawable drawable = this.f1896c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        C0195b c0195b = this.f1894a;
        if (c0195b.f1885w != z2) {
            c0195b.f1885w = z2;
            Drawable drawable = this.f1896c;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f3) {
        Drawable drawable = this.f1896c;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f1895b;
        if (rect == null) {
            this.f1895b = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f1896c;
        if (drawable != null) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C0195b c0195b = this.f1894a;
        c0195b.f1860F = true;
        if (c0195b.f1858D != colorStateList) {
            c0195b.f1858D = colorStateList;
            this.f1896c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C0195b c0195b = this.f1894a;
        c0195b.f1861G = true;
        if (c0195b.f1859E != mode) {
            c0195b.f1859E = mode;
            this.f1896c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean zJ = j(z2, z3);
        P0.b bVar = this.f1907p;
        if (bVar != null && (zJ || z3)) {
            if (z2) {
                bVar.D();
            } else {
                jumpToCurrentState();
            }
        }
        return zJ;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f1896c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
