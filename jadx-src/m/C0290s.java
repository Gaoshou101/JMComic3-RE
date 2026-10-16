package m;

import G.C0037m;
import a.AbstractC0062a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.a7m3p9xv.t6qk2z8.app.R;
import f.AbstractC0113a;

/* renamed from: m.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290s extends CheckedTextView implements J.l {

    /* renamed from: a, reason: collision with root package name */
    public final R.d f2450a;

    /* renamed from: b, reason: collision with root package name */
    public final C0285p f2451b;

    /* renamed from: c, reason: collision with root package name */
    public final C0258b0 f2452c;
    public C0300x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0290s(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        W0.a(context);
        V0.a(this, getContext());
        C0258b0 c0258b0 = new C0258b0(this);
        this.f2452c = c0258b0;
        c0258b0.f(attributeSet, R.attr.checkedTextViewStyle);
        c0258b0.b();
        C0285p c0285p = new C0285p(this);
        this.f2451b = c0285p;
        c0285p.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f2450a = new R.d(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0113a.f1506l;
        C0037m c0037mM = C0037m.m(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c0037mM.f196b;
        G.K.g(this, getContext(), iArr, attributeSet, (TypedArray) c0037mM.f196b, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0062a.v(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0062a.v(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0037mM.h(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC0286p0.b(typedArray.getInt(3, -1), null));
            }
            c0037mM.r();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c0037mM.r();
            throw th;
        }
    }

    private C0300x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0300x(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0258b0 c0258b0 = this.f2452c;
        if (c0258b0 != null) {
            c0258b0.b();
        }
        C0285p c0285p = this.f2451b;
        if (c0285p != null) {
            c0285p.a();
        }
        R.d dVar = this.f2450a;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0062a.Y(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0285p c0285p = this.f2451b;
        if (c0285p != null) {
            return c0285p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0285p c0285p = this.f2451b;
        if (c0285p != null) {
            return c0285p.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        R.d dVar = this.f2450a;
        if (dVar != null) {
            return (ColorStateList) dVar.f611e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        R.d dVar = this.f2450a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f612f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2452c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2452c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        P0.b.t(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0285p c0285p = this.f2451b;
        if (c0285p != null) {
            c0285p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0285p c0285p = this.f2451b;
        if (c0285p != null) {
            c0285p.f(i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        R.d dVar = this.f2450a;
        if (dVar != null) {
            if (dVar.f610c) {
                dVar.f610c = false;
            } else {
                dVar.f610c = true;
                dVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2452c;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2452c;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0062a.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0285p c0285p = this.f2451b;
        if (c0285p != null) {
            c0285p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0285p c0285p = this.f2451b;
        if (c0285p != null) {
            c0285p.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        R.d dVar = this.f2450a;
        if (dVar != null) {
            dVar.f611e = colorStateList;
            dVar.f608a = true;
            dVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        R.d dVar = this.f2450a;
        if (dVar != null) {
            dVar.f612f = mode;
            dVar.f609b = true;
            dVar.b();
        }
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0258b0 c0258b0 = this.f2452c;
        c0258b0.l(colorStateList);
        c0258b0.b();
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0258b0 c0258b0 = this.f2452c;
        c0258b0.m(mode);
        c0258b0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0258b0 c0258b0 = this.f2452c;
        if (c0258b0 != null) {
            c0258b0.g(context, i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(AbstractC0062a.v(getContext(), i2));
    }
}
