package U;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import y.AbstractC0344b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f620a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f621b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f622c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f623e = {R.attr.drawable};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f624f = {R.attr.name, R.attr.animation};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f625g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] h = {R.attr.ordering};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f626i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f627j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f628k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:200:0x03a4, code lost:
    
        if (r31 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03a6, code lost:
    
        if (r13 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03a8, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b7, code lost:
    
        if (r3.hasNext() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b9, code lost:
    
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03c5, code lost:
    
        if (r32 != 0) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03c7, code lost:
    
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03cb, code lost:
    
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03ce, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i2, int i3, int i4, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue != null;
        int i5 = z2 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i4);
        boolean z3 = typedValuePeekValue2 != null;
        int i6 = z3 ? typedValuePeekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z2 && c(i5)) || (z3 && c(i6))) ? 3 : 0;
        }
        boolean z4 = i2 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i2 != 2) {
            g gVar = i2 == 3 ? g.f638a : null;
            if (z4) {
                if (z2) {
                    float dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                    if (z3) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z2) {
                int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : c(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                if (z3) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : c(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z3) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : c(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
            }
            if (propertyValuesHolderOfInt == null || gVar == null) {
                return propertyValuesHolderOfInt;
            }
            propertyValuesHolderOfInt.setEvaluator(gVar);
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i3);
        String string2 = typedArray.getString(i4);
        z.e[] eVarArrF = z.f.f(string);
        z.e[] eVarArrF2 = z.f.f(string2);
        if (eVarArrF == null && eVarArrF2 == null) {
            return null;
        }
        if (eVarArrF == null) {
            if (eVarArrF2 != null) {
                return PropertyValuesHolder.ofObject(str, new f(), eVarArrF2);
            }
            return null;
        }
        f fVar = new f();
        if (eVarArrF2 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, fVar, eVarArrF);
        } else {
            if (!z.f.a(eVarArrF, eVarArrF2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, fVar, eVarArrF, eVarArrF2);
        }
        return propertyValuesHolderOfObject;
    }

    public static boolean c(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        int i2;
        TypedArray typedArray;
        TypedArray typedArray2;
        int resourceId;
        ValueAnimator valueAnimator2;
        TypedArray typedArrayF = AbstractC0344b.f(resources, theme, attributeSet, f625g);
        TypedArray typedArrayF2 = AbstractC0344b.f(resources, theme, attributeSet, f628k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j2 = AbstractC0344b.c(xmlResourceParser, "duration") ? typedArrayF.getInt(1, 300) : 300;
        long j3 = !AbstractC0344b.c(xmlResourceParser, "startOffset") ? 0 : typedArrayF.getInt(2, 0);
        int i3 = !AbstractC0344b.c(xmlResourceParser, "valueType") ? 4 : typedArrayF.getInt(7, 4);
        if (AbstractC0344b.c(xmlResourceParser, "valueFrom") && AbstractC0344b.c(xmlResourceParser, "valueTo")) {
            if (i3 == 4) {
                TypedValue typedValuePeekValue = typedArrayF.peekValue(5);
                boolean z2 = typedValuePeekValue != null;
                int i4 = z2 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayF.peekValue(6);
                boolean z3 = typedValuePeekValue2 != null;
                i3 = ((z2 && c(i4)) || (z3 && c(z3 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayF, i3, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator3.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator3.setDuration(j2);
        valueAnimator3.setStartDelay(j3);
        valueAnimator3.setRepeatCount(!AbstractC0344b.c(xmlResourceParser, "repeatCount") ? 0 : typedArrayF.getInt(3, 0));
        valueAnimator3.setRepeatMode(!AbstractC0344b.c(xmlResourceParser, "repeatMode") ? 1 : typedArrayF.getInt(4, 1));
        if (typedArrayF2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strB = AbstractC0344b.b(typedArrayF2, xmlResourceParser, "pathData", 1);
            if (strB != null) {
                String strB2 = AbstractC0344b.b(typedArrayF2, xmlResourceParser, "propertyXName", 2);
                String strB3 = AbstractC0344b.b(typedArrayF2, xmlResourceParser, "propertyYName", 3);
                if (strB2 == null && strB3 == null) {
                    throw new InflateException(typedArrayF2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    z.e.b(z.f.f(strB), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float length = 0.0f;
                    while (true) {
                        length += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(length));
                        if (!pathMeasure.nextContour()) {
                            break;
                        }
                        valueAnimator3 = valueAnimator3;
                    }
                    PathMeasure pathMeasure2 = new PathMeasure(path, false);
                    int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                    float[] fArr = new float[iMin];
                    float[] fArr2 = new float[iMin];
                    float[] fArr3 = new float[2];
                    float f2 = length / (iMin - 1);
                    valueAnimator = valueAnimator3;
                    typedArray = typedArrayF;
                    int i5 = 0;
                    int i6 = 0;
                    float f3 = 0.0f;
                    while (true) {
                        if (i6 >= iMin) {
                            break;
                        }
                        int i7 = iMin;
                        pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
                        fArr[i6] = fArr3[0];
                        fArr2[i6] = fArr3[1];
                        f3 += f2;
                        int i8 = i5 + 1;
                        if (i8 < arrayList.size() && f3 > ((Float) arrayList.get(i8)).floatValue()) {
                            pathMeasure2.nextContour();
                            i5 = i8;
                        }
                        i6++;
                        iMin = i7;
                    }
                    PropertyValuesHolder propertyValuesHolderOfFloat = strB2 != null ? PropertyValuesHolder.ofFloat(strB2, fArr) : null;
                    PropertyValuesHolder propertyValuesHolderOfFloat2 = strB3 != null ? PropertyValuesHolder.ofFloat(strB3, fArr2) : null;
                    if (propertyValuesHolderOfFloat == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                    } else if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                    i2 = 0;
                } catch (RuntimeException e2) {
                    throw new RuntimeException("Error in parsing ".concat(strB), e2);
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayF;
                i2 = 0;
                objectAnimator2.setPropertyName(AbstractC0344b.b(typedArrayF2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            i2 = 0;
            typedArray = typedArrayF;
        }
        if (AbstractC0344b.c(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(i2, i2);
        } else {
            resourceId = i2;
            typedArray2 = typedArray;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayF2 != null) {
            typedArrayF2.recycle();
        }
        return valueAnimator2;
    }
}
