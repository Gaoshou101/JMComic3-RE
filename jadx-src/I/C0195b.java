package i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import p.h;
import p.i;
import p.l;
import q.AbstractC0328a;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195b extends Drawable.ConstantState {

    /* renamed from: A, reason: collision with root package name */
    public boolean f1855A;

    /* renamed from: B, reason: collision with root package name */
    public ColorFilter f1856B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1857C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f1858D;

    /* renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f1859E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1860F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1861G;

    /* renamed from: H, reason: collision with root package name */
    public int[][] f1862H;

    /* renamed from: I, reason: collision with root package name */
    public h f1863I;

    /* renamed from: J, reason: collision with root package name */
    public l f1864J;

    /* renamed from: a, reason: collision with root package name */
    public final C0198e f1865a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f1866b;

    /* renamed from: c, reason: collision with root package name */
    public int f1867c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1868e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f1869f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable[] f1870g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1871i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1872j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f1873k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1874l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1875m;

    /* renamed from: n, reason: collision with root package name */
    public int f1876n;

    /* renamed from: o, reason: collision with root package name */
    public int f1877o;

    /* renamed from: p, reason: collision with root package name */
    public int f1878p;

    /* renamed from: q, reason: collision with root package name */
    public int f1879q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1880r;

    /* renamed from: s, reason: collision with root package name */
    public int f1881s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1882t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1883u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1884v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1885w;
    public int x;

    /* renamed from: y, reason: collision with root package name */
    public int f1886y;

    /* renamed from: z, reason: collision with root package name */
    public int f1887z;

    public C0195b(C0195b c0195b, C0198e c0198e, Resources resources) {
        this.f1871i = false;
        this.f1874l = false;
        this.f1885w = true;
        this.f1886y = 0;
        this.f1887z = 0;
        this.f1865a = c0198e;
        this.f1866b = resources != null ? resources : c0195b != null ? c0195b.f1866b : null;
        int i2 = c0195b != null ? c0195b.f1867c : 0;
        int i3 = C0198e.f1893t;
        i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
        i2 = i2 == 0 ? 160 : i2;
        this.f1867c = i2;
        if (c0195b != null) {
            this.d = c0195b.d;
            this.f1868e = c0195b.f1868e;
            this.f1883u = true;
            this.f1884v = true;
            this.f1871i = c0195b.f1871i;
            this.f1874l = c0195b.f1874l;
            this.f1885w = c0195b.f1885w;
            this.x = c0195b.x;
            this.f1886y = c0195b.f1886y;
            this.f1887z = c0195b.f1887z;
            this.f1855A = c0195b.f1855A;
            this.f1856B = c0195b.f1856B;
            this.f1857C = c0195b.f1857C;
            this.f1858D = c0195b.f1858D;
            this.f1859E = c0195b.f1859E;
            this.f1860F = c0195b.f1860F;
            this.f1861G = c0195b.f1861G;
            if (c0195b.f1867c == i2) {
                if (c0195b.f1872j) {
                    this.f1873k = c0195b.f1873k != null ? new Rect(c0195b.f1873k) : null;
                    this.f1872j = true;
                }
                if (c0195b.f1875m) {
                    this.f1876n = c0195b.f1876n;
                    this.f1877o = c0195b.f1877o;
                    this.f1878p = c0195b.f1878p;
                    this.f1879q = c0195b.f1879q;
                    this.f1875m = true;
                }
            }
            if (c0195b.f1880r) {
                this.f1881s = c0195b.f1881s;
                this.f1880r = true;
            }
            if (c0195b.f1882t) {
                this.f1882t = true;
            }
            Drawable[] drawableArr = c0195b.f1870g;
            this.f1870g = new Drawable[drawableArr.length];
            this.h = c0195b.h;
            SparseArray sparseArray = c0195b.f1869f;
            if (sparseArray != null) {
                this.f1869f = sparseArray.clone();
            } else {
                this.f1869f = new SparseArray(this.h);
            }
            int i4 = this.h;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f1869f.put(i5, constantState);
                    } else {
                        this.f1870g[i5] = drawableArr[i5];
                    }
                }
            }
        } else {
            this.f1870g = new Drawable[10];
            this.h = 0;
        }
        if (c0195b != null) {
            this.f1862H = c0195b.f1862H;
        } else {
            this.f1862H = new int[this.f1870g.length][];
        }
        if (c0195b != null) {
            this.f1863I = c0195b.f1863I;
            this.f1864J = c0195b.f1864J;
        } else {
            this.f1863I = new h();
            this.f1864J = new l();
        }
    }

    public final int a(Drawable drawable) {
        int i2 = this.h;
        if (i2 >= this.f1870g.length) {
            int i3 = i2 + 10;
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f1870g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f1870g = drawableArr;
            int[][] iArr = new int[i3][];
            System.arraycopy(this.f1862H, 0, iArr, 0, i2);
            this.f1862H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f1865a);
        this.f1870g[i2] = drawable;
        this.h++;
        this.f1868e = drawable.getChangingConfigurations() | this.f1868e;
        this.f1880r = false;
        this.f1882t = false;
        this.f1873k = null;
        this.f1872j = false;
        this.f1875m = false;
        this.f1883u = false;
        return i2;
    }

    public final void b() {
        this.f1875m = true;
        c();
        int i2 = this.h;
        Drawable[] drawableArr = this.f1870g;
        this.f1877o = -1;
        this.f1876n = -1;
        this.f1879q = 0;
        this.f1878p = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f1876n) {
                this.f1876n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f1877o) {
                this.f1877o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f1878p) {
                this.f1878p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f1879q) {
                this.f1879q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f1869f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.f1869f.keyAt(i2);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1869f.valueAt(i2);
                Drawable[] drawableArr = this.f1870g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f1866b);
                drawableNewDrawable.setLayoutDirection(this.x);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f1865a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f1869f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i2 = this.h;
        Drawable[] drawableArr = this.f1870g;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1869f.get(i3);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i2) {
        int iIndexOfKey;
        Drawable drawable = this.f1870g[i2];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f1869f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i2)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f1869f.valueAt(iIndexOfKey)).newDrawable(this.f1866b);
        drawableNewDrawable.setLayoutDirection(this.x);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f1865a);
        this.f1870g[i2] = drawableMutate;
        this.f1869f.removeAt(iIndexOfKey);
        if (this.f1869f.size() == 0) {
            this.f1869f = null;
        }
        return drawableMutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final int e(int i2) {
        ?? r5;
        if (i2 < 0) {
            return 0;
        }
        l lVar = this.f1864J;
        int i3 = 0;
        int iA = AbstractC0328a.a(lVar.f2600c, i2, lVar.f2598a);
        if (iA >= 0 && (r5 = lVar.f2599b[iA]) != i.f2590b) {
            i3 = r5;
        }
        return i3.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.f1862H;
        int i2 = this.h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.d | this.f1868e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0198e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0198e(this, resources);
    }
}
