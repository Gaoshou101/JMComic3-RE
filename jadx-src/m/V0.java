package m;

import a.AbstractC0062a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import f.AbstractC0113a;
import z.AbstractC0348a;

/* loaded from: classes.dex */
public abstract class V0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2304a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2305b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2306c = {R.attr.state_focused};
    public static final int[] d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2307e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2308f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f2309g = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0113a.f1504j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList colorStateListD = d(context, i2);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f2305b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = f2304a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        int iC = c(context, i2);
        int iRound = Math.round(Color.alpha(iC) * f2);
        int i3 = AbstractC0348a.f2747a;
        if (iRound < 0 || iRound > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (iC & 16777215) | (iRound << 24);
    }

    public static int c(Context context, int i2) {
        int[] iArr = f2309g;
        iArr[0] = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f2309g;
        iArr[0] = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC0062a.t(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
