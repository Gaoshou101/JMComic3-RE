package m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: m.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276k0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f2392l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f2393m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f2394a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2395b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f2396c = -1.0f;
    public float d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f2397e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2398f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f2399g = false;
    public TextPaint h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f2400i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f2401j;

    /* renamed from: k, reason: collision with root package name */
    public final C0270h0 f2402k;

    public C0276k0(TextView textView) {
        this.f2400i = textView;
        this.f2401j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2402k = new C0272i0();
        } else {
            this.f2402k = new C0270h0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) throws SecurityException {
        try {
            ConcurrentHashMap concurrentHashMap = f2393m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f2395b) {
                if (this.f2400i.getMeasuredHeight() <= 0 || this.f2400i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2402k.b(this.f2400i) ? 1048576 : (this.f2400i.getMeasuredWidth() - this.f2400i.getTotalPaddingLeft()) - this.f2400i.getTotalPaddingRight();
                int height = (this.f2400i.getHeight() - this.f2400i.getCompoundPaddingBottom()) - this.f2400i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2392l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f2400i.getTextSize()) {
                            g(0, fC);
                        }
                    } finally {
                    }
                }
            }
            this.f2395b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f2398f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 <= i2) {
            int i5 = (i4 + i2) / 2;
            int i6 = this.f2398f[i5];
            TextView textView = this.f2400i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.h;
            if (textPaint == null) {
                this.h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.h.set(textView.getPaint());
            this.h.setTextSize(i6);
            StaticLayout staticLayoutA = AbstractC0268g0.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f2400i, this.h, this.f2402k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i7 = i5 + 1;
                i3 = i4;
                i4 = i7;
            } else {
                i3 = i5 - 1;
                i2 = i3;
            }
        }
        return this.f2398f[i3];
    }

    public final boolean f() {
        return j() && this.f2394a != 0;
    }

    public final void g(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Context context = this.f2401j;
        float fApplyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f2400i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f2395b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f2394a == 1) {
            if (!this.f2399g || this.f2398f.length == 0) {
                int iFloor = ((int) Math.floor((this.f2397e - this.d) / this.f2396c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f2396c) + this.d);
                }
                this.f2398f = b(iArr);
            }
            this.f2395b = true;
        } else {
            this.f2395b = false;
        }
        return this.f2395b;
    }

    public final boolean i() {
        boolean z2 = this.f2398f.length > 0;
        this.f2399g = z2;
        if (z2) {
            this.f2394a = 1;
            this.d = r0[0];
            this.f2397e = r0[r1 - 1];
            this.f2396c = -1.0f;
        }
        return z2;
    }

    public final boolean j() {
        return !(this.f2400i instanceof C0298w);
    }

    public final void k(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f2394a = 1;
        this.d = f2;
        this.f2397e = f3;
        this.f2396c = f4;
        this.f2399g = false;
    }
}
