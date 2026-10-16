package m;

import G.C0037m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import f.AbstractC0113a;
import java.util.WeakHashMap;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285p {

    /* renamed from: a, reason: collision with root package name */
    public final View f2431a;
    public X0 d;

    /* renamed from: e, reason: collision with root package name */
    public X0 f2434e;

    /* renamed from: f, reason: collision with root package name */
    public X0 f2435f;

    /* renamed from: c, reason: collision with root package name */
    public int f2433c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0294u f2432b = C0294u.a();

    public C0285p(View view) {
        this.f2431a = view;
    }

    public final void a() {
        View view = this.f2431a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f2435f == null) {
                    this.f2435f = new X0();
                }
                X0 x02 = this.f2435f;
                x02.f2313a = null;
                x02.d = false;
                x02.f2314b = null;
                x02.f2315c = false;
                WeakHashMap weakHashMap = G.K.f146a;
                ColorStateList colorStateListC = G.D.c(view);
                if (colorStateListC != null) {
                    x02.d = true;
                    x02.f2313a = colorStateListC;
                }
                PorterDuff.Mode modeD = G.D.d(view);
                if (modeD != null) {
                    x02.f2315c = true;
                    x02.f2314b = modeD;
                }
                if (x02.d || x02.f2315c) {
                    C0294u.d(background, x02, view.getDrawableState());
                    return;
                }
            }
            X0 x03 = this.f2434e;
            if (x03 != null) {
                C0294u.d(background, x03, view.getDrawableState());
                return;
            }
            X0 x04 = this.d;
            if (x04 != null) {
                C0294u.d(background, x04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        X0 x02 = this.f2434e;
        if (x02 != null) {
            return x02.f2313a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        X0 x02 = this.f2434e;
        if (x02 != null) {
            return x02.f2314b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListI;
        View view = this.f2431a;
        Context context = view.getContext();
        int[] iArr = AbstractC0113a.f1518y;
        C0037m c0037mM = C0037m.m(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) c0037mM.f196b;
        View view2 = this.f2431a;
        G.K.g(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0037mM.f196b, i2, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f2433c = typedArray.getResourceId(0, -1);
                C0294u c0294u = this.f2432b;
                Context context2 = view.getContext();
                int i3 = this.f2433c;
                synchronized (c0294u) {
                    colorStateListI = c0294u.f2462a.i(context2, i3);
                }
                if (colorStateListI != null) {
                    g(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                G.D.f(view, c0037mM.h(1));
            }
            if (typedArray.hasValue(2)) {
                G.D.g(view, AbstractC0286p0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            c0037mM.r();
        }
    }

    public final void e() {
        this.f2433c = -1;
        g(null);
        a();
    }

    public final void f(int i2) {
        ColorStateList colorStateListI;
        this.f2433c = i2;
        C0294u c0294u = this.f2432b;
        if (c0294u != null) {
            Context context = this.f2431a.getContext();
            synchronized (c0294u) {
                colorStateListI = c0294u.f2462a.i(context, i2);
            }
        } else {
            colorStateListI = null;
        }
        g(colorStateListI);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new X0();
            }
            X0 x02 = this.d;
            x02.f2313a = colorStateList;
            x02.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f2434e == null) {
            this.f2434e = new X0();
        }
        X0 x02 = this.f2434e;
        x02.f2313a = colorStateList;
        x02.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f2434e == null) {
            this.f2434e = new X0();
        }
        X0 x02 = this.f2434e;
        x02.f2314b = mode;
        x02.f2315c = true;
        a();
    }
}
