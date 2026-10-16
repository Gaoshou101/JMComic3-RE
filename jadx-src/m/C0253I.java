package m;

import G.C0037m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.a7m3p9xv.t6qk2z8.app.R;
import f.AbstractC0113a;

/* renamed from: m.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253I extends C0248D {

    /* renamed from: e, reason: collision with root package name */
    public final C0252H f2227e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2228f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2229g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2230i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2231j;

    public C0253I(C0252H c0252h) {
        super(c0252h);
        this.f2229g = null;
        this.h = null;
        this.f2230i = false;
        this.f2231j = false;
        this.f2227e = c0252h;
    }

    @Override // m.C0248D
    public final void b(AttributeSet attributeSet, int i2) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0252H c0252h = this.f2227e;
        Context context = c0252h.getContext();
        int[] iArr = AbstractC0113a.f1502g;
        C0037m c0037mM = C0037m.m(context, attributeSet, iArr, R.attr.seekBarStyle);
        G.K.g(c0252h, c0252h.getContext(), iArr, attributeSet, (TypedArray) c0037mM.f196b, R.attr.seekBarStyle, 0);
        Drawable drawableJ = c0037mM.j(0);
        if (drawableJ != null) {
            c0252h.setThumb(drawableJ);
        }
        Drawable drawableI = c0037mM.i(1);
        Drawable drawable = this.f2228f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2228f = drawableI;
        if (drawableI != null) {
            drawableI.setCallback(c0252h);
            drawableI.setLayoutDirection(c0252h.getLayoutDirection());
            if (drawableI.isStateful()) {
                drawableI.setState(c0252h.getDrawableState());
            }
            f();
        }
        c0252h.invalidate();
        TypedArray typedArray = (TypedArray) c0037mM.f196b;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0286p0.b(typedArray.getInt(3, -1), this.h);
            this.f2231j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2229g = c0037mM.h(2);
            this.f2230i = true;
        }
        c0037mM.r();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2228f;
        if (drawable != null) {
            if (this.f2230i || this.f2231j) {
                Drawable drawableMutate = drawable.mutate();
                this.f2228f = drawableMutate;
                if (this.f2230i) {
                    drawableMutate.setTintList(this.f2229g);
                }
                if (this.f2231j) {
                    this.f2228f.setTintMode(this.h);
                }
                if (this.f2228f.isStateful()) {
                    this.f2228f.setState(this.f2227e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2228f != null) {
            int max = this.f2227e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2228f.getIntrinsicWidth();
                int intrinsicHeight = this.f2228f.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2228f.setBounds(-i2, -i3, i2, i3);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f2228f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
