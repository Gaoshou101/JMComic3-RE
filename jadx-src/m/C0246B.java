package m;

import G.C0037m;
import a.AbstractC0062a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: m.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246B extends MultiAutoCompleteTextView implements J.l {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0285p f2210a;

    /* renamed from: b, reason: collision with root package name */
    public final C0258b0 f2211b;

    /* renamed from: c, reason: collision with root package name */
    public final C0248D f2212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.a7m3p9xv.t6qk2z8.app.R.attr.autoCompleteTextViewStyle);
        W0.a(context);
        V0.a(this, getContext());
        C0037m c0037mM = C0037m.m(getContext(), attributeSet, d, com.a7m3p9xv.t6qk2z8.app.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c0037mM.f196b).hasValue(0)) {
            setDropDownBackgroundDrawable(c0037mM.i(0));
        }
        c0037mM.r();
        C0285p c0285p = new C0285p(this);
        this.f2210a = c0285p;
        c0285p.d(attributeSet, com.a7m3p9xv.t6qk2z8.app.R.attr.autoCompleteTextViewStyle);
        C0258b0 c0258b0 = new C0258b0(this);
        this.f2211b = c0258b0;
        c0258b0.f(attributeSet, com.a7m3p9xv.t6qk2z8.app.R.attr.autoCompleteTextViewStyle);
        c0258b0.b();
        C0248D c0248d = new C0248D(this);
        this.f2212c = c0248d;
        c0248d.b(attributeSet, com.a7m3p9xv.t6qk2z8.app.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerA = c0248d.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0285p c0285p = this.f2210a;
        if (c0285p != null) {
            c0285p.a();
        }
        C0258b0 c0258b0 = this.f2211b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0285p c0285p = this.f2210a;
        if (c0285p != null) {
            return c0285p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0285p c0285p = this.f2210a;
        if (c0285p != null) {
            return c0285p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2211b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2211b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        P0.b.t(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.f2212c.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0285p c0285p = this.f2210a;
        if (c0285p != null) {
            c0285p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0285p c0285p = this.f2210a;
        if (c0285p != null) {
            c0285p.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2211b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2211b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AbstractC0062a.v(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f2212c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2212c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0285p c0285p = this.f2210a;
        if (c0285p != null) {
            c0285p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0285p c0285p = this.f2210a;
        if (c0285p != null) {
            c0285p.i(mode);
        }
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0258b0 c0258b0 = this.f2211b;
        c0258b0.l(colorStateList);
        c0258b0.b();
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0258b0 c0258b0 = this.f2211b;
        c0258b0.m(mode);
        c0258b0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0258b0 c0258b0 = this.f2211b;
        if (c0258b0 != null) {
            c0258b0.g(context, i2);
        }
    }
}
