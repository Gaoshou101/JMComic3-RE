package m;

import G.AbstractC0044u;
import G.C0037m;
import a.AbstractC0062a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import f.AbstractC0113a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: m.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258b0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2323a;

    /* renamed from: b, reason: collision with root package name */
    public X0 f2324b;

    /* renamed from: c, reason: collision with root package name */
    public X0 f2325c;
    public X0 d;

    /* renamed from: e, reason: collision with root package name */
    public X0 f2326e;

    /* renamed from: f, reason: collision with root package name */
    public X0 f2327f;

    /* renamed from: g, reason: collision with root package name */
    public X0 f2328g;
    public X0 h;

    /* renamed from: i, reason: collision with root package name */
    public final C0276k0 f2329i;

    /* renamed from: j, reason: collision with root package name */
    public int f2330j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2331k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f2332l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2333m;

    public C0258b0(TextView textView) {
        this.f2323a = textView;
        this.f2329i = new C0276k0(textView);
    }

    public static X0 c(Context context, C0294u c0294u, int i2) {
        ColorStateList colorStateListI;
        synchronized (c0294u) {
            colorStateListI = c0294u.f2462a.i(context, i2);
        }
        if (colorStateListI == null) {
            return null;
        }
        X0 x02 = new X0();
        x02.d = true;
        x02.f2313a = colorStateListI;
        return x02;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            I.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i2 >= 30) {
            I.b.a(editorInfo, text);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = text.length();
        if (i5 < 0 || i3 > length) {
            I.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            I.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            I.c.a(editorInfo, text, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(text.length() - i3, i9 - Math.min(i5, (int) (i9 * 0.8d)));
        int iMin2 = Math.min(i5, i9 - iMin);
        int i10 = i5 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i10))) {
            i10++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i11 = iMin2 + i8;
        I.c.a(editorInfo, i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + iMin2), text.subSequence(i3, iMin + i3)) : text.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    public final void a(Drawable drawable, X0 x02) {
        if (drawable == null || x02 == null) {
            return;
        }
        C0294u.d(drawable, x02, this.f2323a.getDrawableState());
    }

    public final void b() {
        X0 x02 = this.f2324b;
        TextView textView = this.f2323a;
        if (x02 != null || this.f2325c != null || this.d != null || this.f2326e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2324b);
            a(compoundDrawables[1], this.f2325c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f2326e);
        }
        if (this.f2327f == null && this.f2328g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2327f);
        a(compoundDrawablesRelative[2], this.f2328g);
    }

    public final ColorStateList d() {
        X0 x02 = this.h;
        if (x02 != null) {
            return x02.f2313a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        X0 x02 = this.h;
        if (x02 != null) {
            return x02.f2314b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i2) {
        boolean z2;
        boolean z3;
        String string;
        String string2;
        boolean z4;
        C0276k0 c0276k0;
        int i3;
        int i4;
        int i5;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        int i7;
        TextView textView = this.f2323a;
        Context context = textView.getContext();
        C0294u c0294uA = C0294u.a();
        int[] iArr = AbstractC0113a.h;
        C0037m c0037mM = C0037m.m(context, attributeSet, iArr, i2);
        G.K.g(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c0037mM.f196b, i2, 0);
        TypedArray typedArray = (TypedArray) c0037mM.f196b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2324b = c(context, c0294uA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2325c = c(context, c0294uA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, c0294uA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2326e = c(context, c0294uA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f2327f = c(context, c0294uA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f2328g = c(context, c0294uA, typedArray.getResourceId(6, 0));
        }
        c0037mM.r();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0113a.f1516v;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0037m c0037m = new C0037m(context, typedArrayObtainStyledAttributes);
            if (z5 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            n(context, c0037m);
            int i8 = Build.VERSION.SDK_INT;
            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                string2 = typedArrayObtainStyledAttributes.getString(15);
                i7 = 26;
            } else {
                i7 = 26;
                string2 = null;
            }
            string = (i8 < i7 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            c0037m.r();
        } else {
            z2 = false;
            z3 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        C0037m c0037m2 = new C0037m(context, typedArrayObtainStyledAttributes2);
        if (z5 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z4 = z2;
        } else {
            z4 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        if (i9 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i9 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c0037m2);
        c0037m2.r();
        if (!z5 && z3) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f2332l;
        if (typeface != null) {
            if (this.f2331k == -1) {
                textView.setTypeface(typeface, this.f2330j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            Z.d(textView, string);
        }
        if (str != null) {
            if (i9 >= 24) {
                Y.b(textView, Y.a(str));
            } else {
                textView.setTextLocale(X.a(str.split(",")[0]));
            }
        }
        int[] iArr3 = AbstractC0113a.f1503i;
        C0276k0 c0276k02 = this.f2329i;
        Context context2 = c0276k02.f2401j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i2, 0);
        TextView textView2 = c0276k02.f2400i;
        G.K.g(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i2, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0276k0 = c0276k02;
            c0276k0.f2394a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        } else {
            c0276k0 = c0276k02;
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i10 = 0; i10 < length; i10++) {
                    iArr4[i10] = typedArrayObtainTypedArray.getDimensionPixelSize(i10, -1);
                }
                c0276k0.f2398f = C0276k0.b(iArr4);
                c0276k0.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0276k0.j()) {
            c0276k0.f2394a = 0;
        } else if (c0276k0.f2394a == 1) {
            if (!c0276k0.f2399g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                float f2 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0276k0.k(dimension2, f2, dimension);
            }
            c0276k0.h();
        }
        if (p1.f2440c && c0276k0.f2394a != 0) {
            int[] iArr5 = c0276k0.f2398f;
            if (iArr5.length > 0) {
                if (Z.a(textView) != -1.0f) {
                    Z.b(textView, Math.round(c0276k0.d), Math.round(c0276k0.f2397e), Math.round(c0276k0.f2396c), 0);
                } else {
                    Z.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? c0294uA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? c0294uA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? c0294uA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? c0294uA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? c0294uA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? c0294uA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0062a.t(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            i3 = 24;
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof J.l) {
                ((J.l) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        } else {
            i3 = 24;
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeB = AbstractC0286p0.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= i3) {
                textView.setCompoundDrawableTintMode(modeB);
            } else if (textView instanceof J.l) {
                ((J.l) textView).setSupportCompoundDrawablesTintMode(modeB);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i4 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i5 = -1;
            } else {
                int i11 = typedValuePeekValue.data;
                int i12 = i11 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i11);
                i5 = i12;
                i4 = -1;
            }
        } else {
            i4 = -1;
            i5 = -1;
            dimensionPixelSize = -1.0f;
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i4) {
            AbstractC0062a.S(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i4) {
            AbstractC0062a.T(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i5 == i4) {
                AbstractC0062a.U(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0044u.h(textView, i5, dimensionPixelSize);
            } else {
                AbstractC0062a.U(textView, Math.round(TypedValue.applyDimension(i5, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i2) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0113a.f1516v);
        C0037m c0037m = new C0037m(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f2323a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c0037m);
        if (i3 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            Z.d(textView, string);
        }
        c0037m.r();
        Typeface typeface = this.f2332l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2330j);
        }
    }

    public final void i(int i2, int i3, int i4, int i5) {
        C0276k0 c0276k0 = this.f2329i;
        if (c0276k0.j()) {
            DisplayMetrics displayMetrics = c0276k0.f2401j.getResources().getDisplayMetrics();
            c0276k0.k(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c0276k0.h()) {
                c0276k0.a();
            }
        }
    }

    public final void j(int[] iArr, int i2) {
        C0276k0 c0276k0 = this.f2329i;
        if (c0276k0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i2 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0276k0.f2401j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArrCopyOf[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c0276k0.f2398f = C0276k0.b(iArrCopyOf);
                if (!c0276k0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0276k0.f2399g = false;
            }
            if (c0276k0.h()) {
                c0276k0.a();
            }
        }
    }

    public final void k(int i2) {
        C0276k0 c0276k0 = this.f2329i;
        if (c0276k0.j()) {
            if (i2 == 0) {
                c0276k0.f2394a = 0;
                c0276k0.d = -1.0f;
                c0276k0.f2397e = -1.0f;
                c0276k0.f2396c = -1.0f;
                c0276k0.f2398f = new int[0];
                c0276k0.f2395b = false;
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            }
            DisplayMetrics displayMetrics = c0276k0.f2401j.getResources().getDisplayMetrics();
            c0276k0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0276k0.h()) {
                c0276k0.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new X0();
        }
        X0 x02 = this.h;
        x02.f2313a = colorStateList;
        x02.d = colorStateList != null;
        this.f2324b = x02;
        this.f2325c = x02;
        this.d = x02;
        this.f2326e = x02;
        this.f2327f = x02;
        this.f2328g = x02;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new X0();
        }
        X0 x02 = this.h;
        x02.f2314b = mode;
        x02.f2315c = mode != null;
        this.f2324b = x02;
        this.f2325c = x02;
        this.d = x02;
        this.f2326e = x02;
        this.f2327f = x02;
        this.f2328g = x02;
    }

    public final void n(Context context, C0037m c0037m) {
        String string;
        int i2 = this.f2330j;
        TypedArray typedArray = (TypedArray) c0037m.f196b;
        this.f2330j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f2331k = i4;
            if (i4 != -1) {
                this.f2330j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2333m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f2332l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f2332l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f2332l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2332l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f2331k;
        int i8 = this.f2330j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceK = c0037m.k(i6, this.f2330j, new V(this, i7, i8, new WeakReference(this.f2323a)));
                if (typefaceK != null) {
                    if (i3 < 28 || this.f2331k == -1) {
                        this.f2332l = typefaceK;
                    } else {
                        this.f2332l = AbstractC0256a0.a(Typeface.create(typefaceK, 0), this.f2331k, (this.f2330j & 2) != 0);
                    }
                }
                this.f2333m = this.f2332l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2332l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2331k == -1) {
            this.f2332l = Typeface.create(string, this.f2330j);
        } else {
            this.f2332l = AbstractC0256a0.a(Typeface.create(string, 0), this.f2331k, (this.f2330j & 2) != 0);
        }
    }
}
