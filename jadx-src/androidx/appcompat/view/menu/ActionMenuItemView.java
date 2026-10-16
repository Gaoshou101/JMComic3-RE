package androidx.appcompat.view.menu;

import a.AbstractC0062a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import f.AbstractC0113a;
import l.AbstractC0241c;
import l.C0240b;
import l.InterfaceC0236A;
import l.m;
import l.n;
import l.p;
import m.C0266f0;
import m.InterfaceC0277l;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0266f0 implements InterfaceC0236A, View.OnClickListener, InterfaceC0277l {
    public p h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f886i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f887j;

    /* renamed from: k, reason: collision with root package name */
    public m f888k;

    /* renamed from: l, reason: collision with root package name */
    public C0240b f889l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0241c f890m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f891n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f892o;

    /* renamed from: p, reason: collision with root package name */
    public final int f893p;

    /* renamed from: q, reason: collision with root package name */
    public int f894q;

    /* renamed from: r, reason: collision with root package name */
    public final int f895r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f891n = h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0113a.f1499c, 0, 0);
        this.f893p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f895r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f894q = -1;
        setSaveEnabled(false);
    }

    @Override // m.InterfaceC0277l
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.InterfaceC0236A
    public final void b(p pVar) {
        this.h = pVar;
        setIcon(pVar.getIcon());
        setTitle(pVar.getTitleCondensed());
        setId(pVar.f2138a);
        setVisibility(pVar.isVisible() ? 0 : 8);
        setEnabled(pVar.isEnabled());
        if (pVar.hasSubMenu() && this.f889l == null) {
            this.f889l = new C0240b(this);
        }
    }

    @Override // m.InterfaceC0277l
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.h.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.InterfaceC0236A
    public p getItemData() {
        return this.h;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void i() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f886i);
        if (this.f887j != null && ((this.h.f2159y & 4) != 4 || (!this.f891n && !this.f892o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f886i : null);
        CharSequence charSequence = this.h.f2152q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.h.f2141e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.f2153r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0062a.V(this, z4 ? null : this.h.f2141e);
        } else {
            AbstractC0062a.V(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m mVar = this.f888k;
        if (mVar != null) {
            mVar.b(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f891n = h();
        i();
    }

    @Override // m.C0266f0, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i4 = this.f894q) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f893p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (!zIsEmpty || this.f887j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f887j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0240b c0240b;
        if (this.h.hasSubMenu() && (c0240b = this.f889l) != null && c0240b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f892o != z2) {
            this.f892o = z2;
            p pVar = this.h;
            if (pVar != null) {
                n nVar = pVar.f2149n;
                nVar.f2119k = true;
                nVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f887j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f895r;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(m mVar) {
        this.f888k = mVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f894q = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(AbstractC0241c abstractC0241c) {
        this.f890m = abstractC0241c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f886i = charSequence;
        i();
    }
}
