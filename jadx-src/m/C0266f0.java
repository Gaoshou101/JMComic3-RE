package m;

import G.AbstractC0044u;
import a.AbstractC0062a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: m.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0266f0 extends TextView implements J.l {

    /* renamed from: a, reason: collision with root package name */
    public final C0285p f2342a;

    /* renamed from: b, reason: collision with root package name */
    public final C0258b0 f2343b;

    /* renamed from: c, reason: collision with root package name */
    public final C0248D f2344c;
    public C0300x d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2345e;

    /* renamed from: f, reason: collision with root package name */
    public X.i f2346f;

    /* renamed from: g, reason: collision with root package name */
    public Future f2347g;

    public C0266f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0300x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0300x(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0285p c0285p = this.f2342a;
        if (c0285p != null) {
            c0285p.a();
        }
        C0258b0 c0258b0 = this.f2343b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    public final void g() {
        Future future = this.f2347g;
        if (future == null) {
            return;
        }
        try {
            this.f2347g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0062a.E(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p1.f2440c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0258b0 c0258b0 = this.f2343b;
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
        C0258b0 c0258b0 = this.f2343b;
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
        C0258b0 c0258b0 = this.f2343b;
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
        C0258b0 c0258b0 = this.f2343b;
        return c0258b0 != null ? c0258b0.f2329i.f2398f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (p1.f2440c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0258b0 c0258b0 = this.f2343b;
        if (c0258b0 != null) {
            return c0258b0.f2329i.f2394a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0062a.Y(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0260c0 getSuperCaller() {
        if (this.f2346f == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                this.f2346f = new C0264e0(this);
            } else if (i2 >= 28) {
                this.f2346f = new C0262d0(this);
            } else if (i2 >= 26) {
                this.f2346f = new X.i(26, this);
            }
        }
        return this.f2346f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0285p c0285p = this.f2342a;
        if (c0285p != null) {
            return c0285p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0285p c0285p = this.f2342a;
        if (c0285p != null) {
            return c0285p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2343b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2343b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0248D c0248d;
        if (Build.VERSION.SDK_INT >= 28 || (c0248d = this.f2344c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0248d.f2216c;
        return textClassifier == null ? U.a((TextView) c0248d.f2215b) : textClassifier;
    }

    public E.c getTextMetricsParamsCompat() {
        return AbstractC0062a.E(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2343b.getClass();
        C0258b0.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        P0.b.t(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 || i2 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0258b0 c0258b0 = this.f2343b;
        if (c0258b0 == null || p1.f2440c) {
            return;
        }
        c0258b0.f2329i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        g();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0258b0 c0258b0 = this.f2343b;
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
        C0258b0 c0258b0 = this.f2343b;
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
        C0258b0 c0258b0 = this.f2343b;
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
        C0258b0 c0258b0 = this.f2343b;
        if (c0258b0 != null) {
            c0258b0.k(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0285p c0285p = this.f2342a;
        if (c0285p != null) {
            c0285p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0285p c0285p = this.f2342a;
        if (c0285p != null) {
            c0285p.f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2343b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2343b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2343b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0258b0 c0258b0 = this.f2343b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((P0.b) getEmojiTextViewHelper().f2481b.f715b).o(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().r(i2);
        } else {
            AbstractC0062a.S(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().p(i2);
        } else {
            AbstractC0062a.T(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        AbstractC0062a.U(this, i2);
    }

    public void setPrecomputedText(E.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0062a.E(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0285p c0285p = this.f2342a;
        if (c0285p != null) {
            c0285p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0285p c0285p = this.f2342a;
        if (c0285p != null) {
            c0285p.i(mode);
        }
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0258b0 c0258b0 = this.f2343b;
        c0258b0.l(colorStateList);
        c0258b0.b();
    }

    @Override // J.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0258b0 c0258b0 = this.f2343b;
        c0258b0.m(mode);
        c0258b0.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0258b0 c0258b0 = this.f2343b;
        if (c0258b0 != null) {
            c0258b0.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0248D c0248d;
        if (Build.VERSION.SDK_INT >= 28 || (c0248d = this.f2344c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0248d.f2216c = textClassifier;
        }
    }

    public void setTextFuture(Future<E.d> future) {
        this.f2347g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(E.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f64b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(cVar.f63a);
        setBreakStrategy(cVar.f65c);
        setHyphenationFrequency(cVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2 = p1.f2440c;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        C0258b0 c0258b0 = this.f2343b;
        if (c0258b0 == null || z2) {
            return;
        }
        C0276k0 c0276k0 = c0258b0.f2329i;
        if (c0276k0.f()) {
            return;
        }
        c0276k0.g(i2, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typefaceCreate;
        if (this.f2345e) {
            return;
        }
        if (typeface == null || i2 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            w.d dVar = z.g.f2755a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i2);
        }
        this.f2345e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f2345e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0266f0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        W0.a(context);
        this.f2345e = false;
        this.f2346f = null;
        V0.a(this, getContext());
        C0285p c0285p = new C0285p(this);
        this.f2342a = c0285p;
        c0285p.d(attributeSet, i2);
        C0258b0 c0258b0 = new C0258b0(this);
        this.f2343b = c0258b0;
        c0258b0.f(attributeSet, i2);
        c0258b0.b();
        C0248D c0248d = new C0248D();
        c0248d.f2215b = this;
        this.f2344c = c0248d;
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i2, float f2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            getSuperCaller().w(i2, f2);
        } else if (i3 >= 34) {
            AbstractC0044u.h(this, i2, f2);
        } else {
            AbstractC0062a.U(this, Math.round(TypedValue.applyDimension(i2, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AbstractC0062a.v(context, i2) : null, i3 != 0 ? AbstractC0062a.v(context, i3) : null, i4 != 0 ? AbstractC0062a.v(context, i4) : null, i5 != 0 ? AbstractC0062a.v(context, i5) : null);
        C0258b0 c0258b0 = this.f2343b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AbstractC0062a.v(context, i2) : null, i3 != 0 ? AbstractC0062a.v(context, i3) : null, i4 != 0 ? AbstractC0062a.v(context, i4) : null, i5 != 0 ? AbstractC0062a.v(context, i5) : null);
        C0258b0 c0258b0 = this.f2343b;
        if (c0258b0 != null) {
            c0258b0.b();
        }
    }
}
