package m;

import a.AbstractC0062a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.lang.reflect.InvocationTargetException;

/* renamed from: m.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287q extends Button implements J.l {

    /* renamed from: a, reason: collision with root package name */
    public final C0285p f2441a;

    /* renamed from: b, reason: collision with root package name */
    public final C0258b0 f2442b;

    /* renamed from: c, reason: collision with root package name */
    public C0300x f2443c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0287q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        W0.a(context);
        V0.a(this, getContext());
        C0285p c0285p = new C0285p(this);
        this.f2441a = c0285p;
        c0285p.d(attributeSet, R.attr.buttonStyle);
        C0258b0 c0258b0 = new C0258b0(this);
        this.f2442b = c0258b0;
        c0258b0.f(attributeSet, R.attr.buttonStyle);
        c0258b0.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private C0300x getEmojiTextViewHelper() {
        if (this.f2443c == null) {
            this.f2443c = new C0300x(this);
        }
        return this.f2443c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0285p c0285p = this.f2441a;
        if (c0285p != null) {
            c0285p.a();
        }
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p1.f2440c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 != null) {
            return Math.round(c0258b0.f2329i.f2397e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (p1.f2440c) {
            return super.getAutoSizeMinTextSize();
        }
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 != null) {
            return Math.round(c0258b0.f2329i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (p1.f2440c) {
            return super.getAutoSizeStepGranularity();
        }
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 != null) {
            return Math.round(c0258b0.f2329i.f2396c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (p1.f2440c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0258b0 c0258b0 = this.f2442b;
        return c0258b0 != null ? c0258b0.f2329i.f2398f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (p1.f2440c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 != null) {
            return c0258b0.f2329i.f2394a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0062a.Y(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0285p c0285p = this.f2441a;
        if (c0285p != null) {
            return c0285p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0285p c0285p = this.f2441a;
        if (c0285p != null) {
            return c0285p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2442b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2442b.e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 == null || p1.f2440c) {
            return;
        }
        c0258b0.f2329i.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 == null || p1.f2440c) {
            return;
        }
        C0276k0 c0276k0 = c0258b0.f2329i;
        if (c0276k0.f()) {
            c0276k0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (p1.f2440c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 != null) {
            c0258b0.i(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (p1.f2440c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 != null) {
            c0258b0.j(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (p1.f2440c) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 != null) {
            c0258b0.k(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0285p c0285p = this.f2441a;
        if (c0285p != null) {
            c0285p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0285p c0285p = this.f2441a;
        if (c0285p != null) {
            c0285p.f(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0062a.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((P0.b) getEmojiTextViewHelper().f2481b.f715b).o(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 != null) {
            c0258b0.f2323a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0285p c0285p = this.f2441a;
        if (c0285p != null) {
            c0285p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0285p c0285p = this.f2441a;
        if (c0285p != null) {
            c0285p.i(mode);
        }
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0258b0 c0258b0 = this.f2442b;
        c0258b0.l(colorStateList);
        c0258b0.b();
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0258b0 c0258b0 = this.f2442b;
        c0258b0.m(mode);
        c0258b0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 != null) {
            c0258b0.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2 = p1.f2440c;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        C0258b0 c0258b0 = this.f2442b;
        if (c0258b0 == null || z2) {
            return;
        }
        C0276k0 c0276k0 = c0258b0.f2329i;
        if (c0276k0.f()) {
            return;
        }
        c0276k0.g(i2, f2);
    }
}
