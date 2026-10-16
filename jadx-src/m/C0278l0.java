package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: m.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278l0 extends ToggleButton implements J.l {

    /* renamed from: a, reason: collision with root package name */
    public final C0285p f2413a;

    /* renamed from: b, reason: collision with root package name */
    public final C0258b0 f2414b;

    /* renamed from: c, reason: collision with root package name */
    public C0300x f2415c;

    public C0278l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        V0.a(this, getContext());
        C0285p c0285p = new C0285p(this);
        this.f2413a = c0285p;
        c0285p.d(attributeSet, R.attr.buttonStyleToggle);
        C0258b0 c0258b0 = new C0258b0(this);
        this.f2414b = c0258b0;
        c0258b0.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0300x getEmojiTextViewHelper() {
        if (this.f2415c == null) {
            this.f2415c = new C0300x(this);
        }
        return this.f2415c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0285p c0285p = this.f2413a;
        if (c0285p != null) {
            c0285p.a();
        }
        C0258b0 c0258b0 = this.f2414b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0285p c0285p = this.f2413a;
        if (c0285p != null) {
            return c0285p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0285p c0285p = this.f2413a;
        if (c0285p != null) {
            return c0285p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2414b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2414b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0285p c0285p = this.f2413a;
        if (c0285p != null) {
            c0285p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0285p c0285p = this.f2413a;
        if (c0285p != null) {
            c0285p.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2414b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2414b;
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
        C0285p c0285p = this.f2413a;
        if (c0285p != null) {
            c0285p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0285p c0285p = this.f2413a;
        if (c0285p != null) {
            c0285p.i(mode);
        }
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0258b0 c0258b0 = this.f2414b;
        c0258b0.l(colorStateList);
        c0258b0.b();
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0258b0 c0258b0 = this.f2414b;
        c0258b0.m(mode);
        c0258b0.b();
    }
}
