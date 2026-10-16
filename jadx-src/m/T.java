package m;

import a.AbstractC0062a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import l.ViewTreeObserverOnGlobalLayoutListenerC0242d;

/* loaded from: classes.dex */
public final class T extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f2294i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0285p f2295a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2296b;

    /* renamed from: c, reason: collision with root package name */
    public final C0254J f2297c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2298e;

    /* renamed from: f, reason: collision with root package name */
    public final S f2299f;

    /* renamed from: g, reason: collision with root package name */
    public int f2300g;
    public final Rect h;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130903271(0x7f0300e7, float:1.7413355E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.h = r1
            android.content.Context r1 = r12.getContext()
            m.V0.a(r12, r1)
            int[] r1 = f.AbstractC0113a.f1515u
            G.m r2 = G.C0037m.m(r13, r14, r1, r0)
            m.p r3 = new m.p
            r3.<init>(r12)
            r12.f2295a = r3
            java.lang.Object r3 = r2.f196b
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            k.c r6 = new k.c
            r6.<init>(r13, r4)
            r12.f2296b = r6
            goto L37
        L35:
            r12.f2296b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = m.T.f2294i     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r13 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            m.P r4 = new m.P
            android.content.Context r9 = r12.f2296b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f2296b
            G.m r1 = G.C0037m.m(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f196b
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f2300g = r9
            android.graphics.drawable.Drawable r9 = r1.i(r8)
            r4.l(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f2273C = r7
            r1.r()
            r12.f2299f = r4
            m.J r1 = new m.J
            r1.<init>(r12, r12, r4)
            r12.f2297c = r1
            goto Laa
        L9d:
            m.L r1 = new m.L
            r1.<init>(r12)
            r12.f2299f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f2261c = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131427373(0x7f0b002d, float:1.847636E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.r()
            r12.f2298e = r8
            android.widget.SpinnerAdapter r13 = r12.d
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.d = r6
        Lcf:
            m.p r13 = r12.f2295a
            r13.d(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: m.T.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0285p c0285p = this.f2295a;
        if (c0285p != null) {
            c0285p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        S s2 = this.f2299f;
        return s2 != null ? s2.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        S s2 = this.f2299f;
        return s2 != null ? s2.g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2299f != null ? this.f2300g : super.getDropDownWidth();
    }

    public final S getInternalPopup() {
        return this.f2299f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        S s2 = this.f2299f;
        return s2 != null ? s2.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2296b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        S s2 = this.f2299f;
        return s2 != null ? s2.i() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0285p c0285p = this.f2295a;
        if (c0285p != null) {
            return c0285p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0285p c0285p = this.f2295a;
        if (c0285p != null) {
            return c0285p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        S s2 = this.f2299f;
        if (s2 == null || !s2.a()) {
            return;
        }
        s2.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2299f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        Q q2 = (Q) parcelable;
        super.onRestoreInstanceState(q2.getSuperState());
        if (!q2.f2279a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0242d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        Q q2 = new Q(super.onSaveInstanceState());
        S s2 = this.f2299f;
        q2.f2279a = s2 != null && s2.a();
        return q2;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0254J c0254j = this.f2297c;
        if (c0254j == null || !c0254j.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        S s2 = this.f2299f;
        if (s2 == null) {
            return super.performClick();
        }
        if (s2.a()) {
            return true;
        }
        this.f2299f.d(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0285p c0285p = this.f2295a;
        if (c0285p != null) {
            c0285p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0285p c0285p = this.f2295a;
        if (c0285p != null) {
            c0285p.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        S s2 = this.f2299f;
        if (s2 == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            s2.o(i2);
            s2.b(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        S s2 = this.f2299f;
        if (s2 != null) {
            s2.m(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2299f != null) {
            this.f2300g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        S s2 = this.f2299f;
        if (s2 != null) {
            s2.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(AbstractC0062a.v(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        S s2 = this.f2299f;
        if (s2 != null) {
            s2.k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0285p c0285p = this.f2295a;
        if (c0285p != null) {
            c0285p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0285p c0285p = this.f2295a;
        if (c0285p != null) {
            c0285p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2298e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        S s2 = this.f2299f;
        if (s2 != null) {
            Context context = this.f2296b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            M m2 = new M();
            m2.f2262a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                m2.f2263b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                K.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            s2.n(m2);
        }
    }
}
