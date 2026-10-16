package m;

import G.C0037m;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import f.AbstractC0113a;

/* loaded from: classes.dex */
public abstract class A0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2197a;

    /* renamed from: b, reason: collision with root package name */
    public int f2198b;

    /* renamed from: c, reason: collision with root package name */
    public int f2199c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2200e;

    /* renamed from: f, reason: collision with root package name */
    public int f2201f;

    /* renamed from: g, reason: collision with root package name */
    public float f2202g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f2203i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f2204j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f2205k;

    /* renamed from: l, reason: collision with root package name */
    public int f2206l;

    /* renamed from: m, reason: collision with root package name */
    public int f2207m;

    /* renamed from: n, reason: collision with root package name */
    public int f2208n;

    /* renamed from: o, reason: collision with root package name */
    public int f2209o;

    public A0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2197a = true;
        this.f2198b = -1;
        this.f2199c = 0;
        this.f2200e = 8388659;
        int[] iArr = AbstractC0113a.f1508n;
        C0037m c0037mM = C0037m.m(context, attributeSet, iArr, 0);
        G.K.g(this, context, iArr, attributeSet, (TypedArray) c0037mM.f196b, 0, 0);
        TypedArray typedArray = (TypedArray) c0037mM.f196b;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f2202g = typedArray.getFloat(4, -1.0f);
        this.f2198b = typedArray.getInt(3, -1);
        this.h = typedArray.getBoolean(7, false);
        setDividerDrawable(c0037mM.i(5));
        this.f2208n = typedArray.getInt(8, 0);
        this.f2209o = typedArray.getDimensionPixelSize(6, 0);
        c0037mM.r();
    }

    public final void c(Canvas canvas, int i2) {
        this.f2205k.setBounds(getPaddingLeft() + this.f2209o, i2, (getWidth() - getPaddingRight()) - this.f2209o, this.f2207m + i2);
        this.f2205k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0305z0;
    }

    public final void d(Canvas canvas, int i2) {
        this.f2205k.setBounds(i2, getPaddingTop() + this.f2209o, this.f2206l + i2, (getHeight() - getPaddingBottom()) - this.f2209o);
        this.f2205k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0305z0 generateDefaultLayoutParams() {
        int i2 = this.d;
        if (i2 == 0) {
            return new C0305z0(-2, -2);
        }
        if (i2 == 1) {
            return new C0305z0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0305z0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0305z0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0305z0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0305z0 ? new C0305z0((C0305z0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0305z0((ViewGroup.MarginLayoutParams) layoutParams) : new C0305z0(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f2198b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f2198b;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2198b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f2199c;
        if (this.d == 1 && (i2 = this.f2200e & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2201f) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2201f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0305z0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2198b;
    }

    public Drawable getDividerDrawable() {
        return this.f2205k;
    }

    public int getDividerPadding() {
        return this.f2209o;
    }

    public int getDividerWidth() {
        return this.f2206l;
    }

    public int getGravity() {
        return this.f2200e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.f2208n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2202g;
    }

    public final boolean h(int i2) {
        if (i2 == 0) {
            return (this.f2208n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f2208n & 4) != 0;
        }
        if ((this.f2208n & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f2205k == null) {
            return;
        }
        int i3 = 0;
        if (this.d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && h(i3)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0305z0) childAt.getLayoutParams())).topMargin) - this.f2207m);
                }
                i3++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f2207m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0305z0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z2 = p1.f2438a;
        boolean z3 = getLayoutDirection() == 1;
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i3)) {
                C0305z0 c0305z0 = (C0305z0) childAt3.getLayoutParams();
                d(canvas, z3 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0305z0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0305z0).leftMargin) - this.f2206l);
            }
            i3++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0305z0 c0305z02 = (C0305z0) childAt4.getLayoutParams();
                if (z3) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0305z02).leftMargin;
                    i2 = this.f2206l;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0305z02).rightMargin;
                }
            } else if (z3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f2206l;
                right = left - i2;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.A0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.A0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f2197a = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f2198b = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2205k) {
            return;
        }
        this.f2205k = drawable;
        if (drawable != null) {
            this.f2206l = drawable.getIntrinsicWidth();
            this.f2207m = drawable.getIntrinsicHeight();
        } else {
            this.f2206l = 0;
            this.f2207m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f2209o = i2;
    }

    public void setGravity(int i2) {
        if (this.f2200e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f2200e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f2200e;
        if ((8388615 & i4) != i3) {
            this.f2200e = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.h = z2;
    }

    public void setOrientation(int i2) {
        if (this.d != i2) {
            this.d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f2208n) {
            requestLayout();
        }
        this.f2208n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f2200e;
        if ((i4 & 112) != i3) {
            this.f2200e = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f2202g = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
