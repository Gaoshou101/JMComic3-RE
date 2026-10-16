package m;

import a.AbstractC0062a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.a7m3p9xv.t6qk2z8.app.R;

/* renamed from: m.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249E extends RadioButton implements J.l {

    /* renamed from: a, reason: collision with root package name */
    public final R.d f2217a;

    /* renamed from: b, reason: collision with root package name */
    public final C0285p f2218b;

    /* renamed from: c, reason: collision with root package name */
    public final C0258b0 f2219c;
    public C0300x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        W0.a(context);
        V0.a(this, getContext());
        R.d dVar = new R.d(this);
        this.f2217a = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        C0285p c0285p = new C0285p(this);
        this.f2218b = c0285p;
        c0285p.d(attributeSet, R.attr.radioButtonStyle);
        C0258b0 c0258b0 = new C0258b0(this);
        this.f2219c = c0258b0;
        c0258b0.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0300x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0300x(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0285p c0285p = this.f2218b;
        if (c0285p != null) {
            c0285p.a();
        }
        C0258b0 c0258b0 = this.f2219c;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0285p c0285p = this.f2218b;
        if (c0285p != null) {
            return c0285p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0285p c0285p = this.f2218b;
        if (c0285p != null) {
            return c0285p.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        R.d dVar = this.f2217a;
        if (dVar != null) {
            return (ColorStateList) dVar.f611e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        R.d dVar = this.f2217a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f612f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2219c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2219c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0285p c0285p = this.f2218b;
        if (c0285p != null) {
            c0285p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0285p c0285p = this.f2218b;
        if (c0285p != null) {
            c0285p.f(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        R.d dVar = this.f2217a;
        if (dVar != null) {
            if (dVar.f610c) {
                dVar.f610c = false;
            } else {
                dVar.f610c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2219c;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2219c;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((P0.b) getEmojiTextViewHelper().f2481b.f715b).o(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0285p c0285p = this.f2218b;
        if (c0285p != null) {
            c0285p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0285p c0285p = this.f2218b;
        if (c0285p != null) {
            c0285p.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        R.d dVar = this.f2217a;
        if (dVar != null) {
            dVar.f611e = colorStateList;
            dVar.f608a = true;
            dVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        R.d dVar = this.f2217a;
        if (dVar != null) {
            dVar.f612f = mode;
            dVar.f609b = true;
            dVar.a();
        }
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0258b0 c0258b0 = this.f2219c;
        c0258b0.l(colorStateList);
        c0258b0.b();
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0258b0 c0258b0 = this.f2219c;
        c0258b0.m(mode);
        c0258b0.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(AbstractC0062a.v(getContext(), i2));
    }
}
