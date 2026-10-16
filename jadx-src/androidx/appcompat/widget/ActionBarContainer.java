package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.a7m3p9xv.t6qk2z8.app.R;
import f.AbstractC0113a;
import m.C0257b;
import m.T0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f913a;

    /* renamed from: b, reason: collision with root package name */
    public View f914b;

    /* renamed from: c, reason: collision with root package name */
    public View f915c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f916e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f917f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f918g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final int f919i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0257b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0113a.f1497a);
        boolean z2 = false;
        this.d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f916e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f919i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f918g = true;
            this.f917f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f918g ? !(this.d != null || this.f916e != null) : this.f917f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.d;
        if (drawable != null && drawable.isStateful()) {
            this.d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f916e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f916e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f917f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f917f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f916e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f917f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f914b = findViewById(R.id.action_bar);
        this.f915c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f913a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f918g) {
            Drawable drawable = this.f917f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.d == null) {
                z3 = false;
            } else if (this.f914b.getVisibility() == 0) {
                this.d.setBounds(this.f914b.getLeft(), this.f914b.getTop(), this.f914b.getRight(), this.f914b.getBottom());
            } else {
                View view = this.f915c;
                if (view == null || view.getVisibility() != 0) {
                    this.d.setBounds(0, 0, 0, 0);
                } else {
                    this.d.setBounds(this.f915c.getLeft(), this.f915c.getTop(), this.f915c.getRight(), this.f915c.getBottom());
                }
            }
            this.h = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f914b == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f919i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f914b == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.d);
        }
        this.d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f914b;
            if (view != null) {
                this.d.setBounds(view.getLeft(), this.f914b.getTop(), this.f914b.getRight(), this.f914b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f918g ? !(this.d != null || this.f916e != null) : this.f917f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f917f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f917f);
        }
        this.f917f = drawable;
        boolean z2 = this.f918g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f917f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.d != null || this.f916e != null) : this.f917f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f916e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f916e);
        }
        this.f916e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.h && this.f916e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f918g ? !(this.d != null || this.f916e != null) : this.f917f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f913a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f916e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f917f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.d;
        boolean z2 = this.f918g;
        return (drawable == drawable2 && !z2) || (drawable == this.f916e && this.h) || ((drawable == this.f917f && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(T0 t02) {
    }
}
