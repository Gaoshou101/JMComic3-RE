package G;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;

/* renamed from: G.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039o {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f198a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f199b;

    /* renamed from: c, reason: collision with root package name */
    public final NestedScrollView f200c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f201e;

    public C0039o(NestedScrollView nestedScrollView) {
        this.f200c = nestedScrollView;
    }

    public final boolean a(float f2, float f3) {
        ViewParent viewParentC;
        if (!this.d || (viewParentC = c(0)) == null) {
            return false;
        }
        try {
            return viewParentC.onNestedPreFling(this.f200c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public final boolean b(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent viewParentC;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.d || (viewParentC = c(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        NestedScrollView nestedScrollView = this.f200c;
        if (iArr != null) {
            nestedScrollView.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            if (this.f201e == null) {
                this.f201e = new int[2];
            }
            int[] iArr4 = this.f201e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (viewParentC instanceof InterfaceC0041q) {
            ((InterfaceC0041q) viewParentC).d(nestedScrollView, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (viewParentC instanceof InterfaceC0040p) {
                ((InterfaceC0040p) viewParentC).e(nestedScrollView, i2, i3, i4, i5, i6);
            } else if (i6 == 0) {
                try {
                    viewParentC.onNestedScroll(nestedScrollView, i2, i3, i4, i5);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            nestedScrollView.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public final ViewParent c(int i2) {
        if (i2 == 0) {
            return this.f198a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f199b;
    }
}
