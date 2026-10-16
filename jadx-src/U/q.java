package U;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y.AbstractC0344b;
import y.AbstractC0345c;

/* loaded from: classes.dex */
public final class q extends h {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f686j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public o f687b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f688c;
    public ColorFilter d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f689e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f690f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f691g;
    public final Matrix h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f692i;

    public q() {
        this.f690f = true;
        this.f691g = new float[9];
        this.h = new Matrix();
        this.f692i = new Rect();
        o oVar = new o();
        oVar.f677c = null;
        oVar.d = f686j;
        oVar.f676b = new n();
        this.f687b = oVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f639a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f692i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.f688c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f691g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o oVar = this.f687b;
        Bitmap bitmap = oVar.f679f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != oVar.f679f.getHeight()) {
            oVar.f679f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oVar.f683k = true;
        }
        if (this.f690f) {
            o oVar2 = this.f687b;
            if (oVar2.f683k || oVar2.f680g != oVar2.f677c || oVar2.h != oVar2.d || oVar2.f682j != oVar2.f678e || oVar2.f681i != oVar2.f676b.getRootAlpha()) {
                o oVar3 = this.f687b;
                oVar3.f679f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f679f);
                n nVar = oVar3.f676b;
                nVar.a(nVar.f667g, n.f661p, canvas2, iMin, iMin2);
                o oVar4 = this.f687b;
                oVar4.f680g = oVar4.f677c;
                oVar4.h = oVar4.d;
                oVar4.f681i = oVar4.f676b.getRootAlpha();
                oVar4.f682j = oVar4.f678e;
                oVar4.f683k = false;
            }
        } else {
            o oVar5 = this.f687b;
            oVar5.f679f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f679f);
            n nVar2 = oVar5.f676b;
            nVar2.a(nVar2.f667g, n.f661p, canvas3, iMin, iMin2);
        }
        o oVar6 = this.f687b;
        if (oVar6.f676b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.f684l == null) {
                Paint paint2 = new Paint();
                oVar6.f684l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.f684l.setAlpha(oVar6.f676b.getRootAlpha());
            oVar6.f684l.setColorFilter(colorFilter);
            paint = oVar6.f684l;
        }
        canvas.drawBitmap(oVar6.f679f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.getAlpha() : this.f687b.f676b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f687b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.getColorFilter() : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f639a != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f639a.getConstantState());
        }
        this.f687b.f675a = getChangingConfigurations();
        return this.f687b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f687b.f676b.f668i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f687b.f676b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.isAutoMirrored() : this.f687b.f678e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f639a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            o oVar = this.f687b;
            if (oVar != null) {
                n nVar = oVar.f676b;
                if (nVar.f673n == null) {
                    nVar.f673n = Boolean.valueOf(nVar.f667g.a());
                }
                if (nVar.f673n.booleanValue() || ((colorStateList = this.f687b.f677c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f689e && super.mutate() == this) {
            o oVar = this.f687b;
            o oVar2 = new o();
            oVar2.f677c = null;
            oVar2.d = f686j;
            if (oVar != null) {
                oVar2.f675a = oVar.f675a;
                n nVar = new n(oVar.f676b);
                oVar2.f676b = nVar;
                if (oVar.f676b.f665e != null) {
                    nVar.f665e = new Paint(oVar.f676b.f665e);
                }
                if (oVar.f676b.d != null) {
                    oVar2.f676b.d = new Paint(oVar.f676b.d);
                }
                oVar2.f677c = oVar.f677c;
                oVar2.d = oVar.d;
                oVar2.f678e = oVar.f678e;
            }
            this.f687b = oVar2;
            this.f689e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f639a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f687b;
        ColorStateList colorStateList = oVar.f677c;
        if (colorStateList == null || (mode = oVar.d) == null) {
            z2 = false;
        } else {
            this.f688c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        n nVar = oVar.f676b;
        if (nVar.f673n == null) {
            nVar.f673n = Boolean.valueOf(nVar.f667g.a());
        }
        if (nVar.f673n.booleanValue()) {
            boolean zB = oVar.f676b.f667g.b(iArr);
            oVar.f683k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f687b.f676b.getRootAlpha() != i2) {
            this.f687b.f676b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f687b.f678e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            P0.b.C(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        o oVar = this.f687b;
        if (oVar.f677c != colorStateList) {
            oVar.f677c = colorStateList;
            this.f688c = a(colorStateList, oVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        o oVar = this.f687b;
        if (oVar.d != mode) {
            oVar.d = mode;
            this.f688c = a(oVar.f677c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        n nVar;
        int i2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f687b;
        oVar.f676b = new n();
        TypedArray typedArrayF = AbstractC0344b.f(resources, theme, attributeSet, a.f620a);
        o oVar2 = this.f687b;
        n nVar2 = oVar2.f676b;
        int i5 = !AbstractC0344b.c(xmlPullParser, "tintMode") ? -1 : typedArrayF.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.d = mode;
        int i7 = 1;
        ColorStateList colorStateListA = null;
        boolean z4 = false;
        if (AbstractC0344b.c(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayF.getValue(1, typedValue);
            int i8 = typedValue.type;
            if (i8 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i8 >= 28 && i8 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayF.getResources();
                int resourceId = typedArrayF.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0345c.f2719a;
                try {
                    colorStateListA = AbstractC0345c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            oVar2.f677c = colorStateList;
        }
        boolean z5 = oVar2.f678e;
        if (AbstractC0344b.c(xmlPullParser, "autoMirrored")) {
            z5 = typedArrayF.getBoolean(5, z5);
        }
        oVar2.f678e = z5;
        float f2 = nVar2.f669j;
        if (AbstractC0344b.c(xmlPullParser, "viewportWidth")) {
            f2 = typedArrayF.getFloat(7, f2);
        }
        nVar2.f669j = f2;
        float f3 = nVar2.f670k;
        if (AbstractC0344b.c(xmlPullParser, "viewportHeight")) {
            f3 = typedArrayF.getFloat(8, f3);
        }
        nVar2.f670k = f3;
        if (nVar2.f669j <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 > 0.0f) {
            nVar2.h = typedArrayF.getDimension(3, nVar2.h);
            float dimension = typedArrayF.getDimension(2, nVar2.f668i);
            nVar2.f668i = dimension;
            if (nVar2.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = nVar2.getAlpha();
                if (AbstractC0344b.c(xmlPullParser, "alpha")) {
                    alpha = typedArrayF.getFloat(4, alpha);
                }
                nVar2.setAlpha(alpha);
                String string = typedArrayF.getString(0);
                if (string != null) {
                    nVar2.f672m = string;
                    nVar2.f674o.put(string, nVar2);
                }
                typedArrayF.recycle();
                oVar.f675a = getChangingConfigurations();
                oVar.f683k = true;
                o oVar3 = this.f687b;
                n nVar3 = oVar3.f676b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nVar3.f667g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        k kVar = (k) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i2 = depth;
                        p.f fVar = nVar3.f674o;
                        if (zEquals) {
                            j jVar = new j();
                            jVar.f640e = 0.0f;
                            jVar.f642g = 1.0f;
                            jVar.h = 1.0f;
                            jVar.f643i = 0.0f;
                            jVar.f644j = 1.0f;
                            jVar.f645k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            jVar.f646l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            jVar.f647m = join3;
                            nVar = nVar3;
                            jVar.f648n = 4.0f;
                            TypedArray typedArrayF2 = AbstractC0344b.f(resources, theme, attributeSet, a.f622c);
                            if (AbstractC0344b.c(xmlPullParser, "pathData")) {
                                String string2 = typedArrayF2.getString(0);
                                if (string2 != null) {
                                    jVar.f659b = string2;
                                }
                                String string3 = typedArrayF2.getString(2);
                                if (string3 != null) {
                                    jVar.f658a = z.f.f(string3);
                                }
                                jVar.f641f = AbstractC0344b.a(typedArrayF2, xmlPullParser, theme, "fillColor", 1);
                                float f4 = jVar.h;
                                if (AbstractC0344b.c(xmlPullParser, "fillAlpha")) {
                                    f4 = typedArrayF2.getFloat(12, f4);
                                }
                                jVar.h = f4;
                                int i9 = !AbstractC0344b.c(xmlPullParser, "strokeLineCap") ? -1 : typedArrayF2.getInt(8, -1);
                                Paint.Cap cap3 = jVar.f646l;
                                if (i9 != 0) {
                                    join = join3;
                                    if (i9 != 1) {
                                        cap = i9 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                jVar.f646l = cap;
                                int i10 = !AbstractC0344b.c(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayF2.getInt(9, -1);
                                Paint.Join join4 = jVar.f647m;
                                if (i10 == 0) {
                                    join2 = join;
                                } else if (i10 != 1) {
                                    join2 = i10 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                jVar.f647m = join2;
                                float f5 = jVar.f648n;
                                if (AbstractC0344b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f5 = typedArrayF2.getFloat(10, f5);
                                }
                                jVar.f648n = f5;
                                jVar.d = AbstractC0344b.a(typedArrayF2, xmlPullParser, theme, "strokeColor", 3);
                                float f6 = jVar.f642g;
                                if (AbstractC0344b.c(xmlPullParser, "strokeAlpha")) {
                                    f6 = typedArrayF2.getFloat(11, f6);
                                }
                                jVar.f642g = f6;
                                float f7 = jVar.f640e;
                                if (AbstractC0344b.c(xmlPullParser, "strokeWidth")) {
                                    f7 = typedArrayF2.getFloat(4, f7);
                                }
                                jVar.f640e = f7;
                                float f8 = jVar.f644j;
                                if (AbstractC0344b.c(xmlPullParser, "trimPathEnd")) {
                                    f8 = typedArrayF2.getFloat(6, f8);
                                }
                                jVar.f644j = f8;
                                float f9 = jVar.f645k;
                                if (AbstractC0344b.c(xmlPullParser, "trimPathOffset")) {
                                    f9 = typedArrayF2.getFloat(7, f9);
                                }
                                jVar.f645k = f9;
                                float f10 = jVar.f643i;
                                if (AbstractC0344b.c(xmlPullParser, "trimPathStart")) {
                                    f10 = typedArrayF2.getFloat(5, f10);
                                }
                                jVar.f643i = f10;
                                int i11 = jVar.f660c;
                                if (AbstractC0344b.c(xmlPullParser, "fillType")) {
                                    i11 = typedArrayF2.getInt(13, i11);
                                }
                                jVar.f660c = i11;
                            }
                            typedArrayF2.recycle();
                            kVar.f650b.add(jVar);
                            if (jVar.getPathName() != null) {
                                fVar.put(jVar.getPathName(), jVar);
                            }
                            oVar3.f675a = oVar3.f675a;
                            z3 = false;
                            i3 = 1;
                            z6 = false;
                        } else {
                            nVar = nVar3;
                            if ("clip-path".equals(name)) {
                                i iVar = new i();
                                if (AbstractC0344b.c(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayF3 = AbstractC0344b.f(resources, theme, attributeSet, a.d);
                                    String string4 = typedArrayF3.getString(0);
                                    if (string4 != null) {
                                        iVar.f659b = string4;
                                    }
                                    String string5 = typedArrayF3.getString(1);
                                    if (string5 != null) {
                                        iVar.f658a = z.f.f(string5);
                                    }
                                    iVar.f660c = !AbstractC0344b.c(xmlPullParser, "fillType") ? 0 : typedArrayF3.getInt(2, 0);
                                    typedArrayF3.recycle();
                                }
                                kVar.f650b.add(iVar);
                                if (iVar.getPathName() != null) {
                                    fVar.put(iVar.getPathName(), iVar);
                                }
                                oVar3.f675a = oVar3.f675a;
                            } else if ("group".equals(name)) {
                                k kVar2 = new k();
                                TypedArray typedArrayF4 = AbstractC0344b.f(resources, theme, attributeSet, a.f621b);
                                float f11 = kVar2.f651c;
                                if (AbstractC0344b.c(xmlPullParser, "rotation")) {
                                    f11 = typedArrayF4.getFloat(5, f11);
                                }
                                kVar2.f651c = f11;
                                i3 = 1;
                                kVar2.d = typedArrayF4.getFloat(1, kVar2.d);
                                kVar2.f652e = typedArrayF4.getFloat(2, kVar2.f652e);
                                float f12 = kVar2.f653f;
                                if (AbstractC0344b.c(xmlPullParser, "scaleX")) {
                                    f12 = typedArrayF4.getFloat(3, f12);
                                }
                                kVar2.f653f = f12;
                                float f13 = kVar2.f654g;
                                if (AbstractC0344b.c(xmlPullParser, "scaleY")) {
                                    f13 = typedArrayF4.getFloat(4, f13);
                                }
                                kVar2.f654g = f13;
                                float f14 = kVar2.h;
                                if (AbstractC0344b.c(xmlPullParser, "translateX")) {
                                    f14 = typedArrayF4.getFloat(6, f14);
                                }
                                kVar2.h = f14;
                                float f15 = kVar2.f655i;
                                if (AbstractC0344b.c(xmlPullParser, "translateY")) {
                                    f15 = typedArrayF4.getFloat(7, f15);
                                }
                                kVar2.f655i = f15;
                                z3 = false;
                                String string6 = typedArrayF4.getString(0);
                                if (string6 != null) {
                                    kVar2.f657k = string6;
                                }
                                kVar2.c();
                                typedArrayF4.recycle();
                                kVar.f650b.add(kVar2);
                                arrayDeque.push(kVar2);
                                if (kVar2.getGroupName() != null) {
                                    fVar.put(kVar2.getGroupName(), kVar2);
                                }
                                oVar3.f675a = oVar3.f675a;
                            }
                            z3 = false;
                            i3 = 1;
                        }
                        z2 = z3;
                        i4 = 3;
                    } else {
                        nVar = nVar3;
                        i2 = depth;
                        i3 = i7;
                        z2 = z4;
                        i4 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i6 = i4;
                    z4 = z2;
                    i7 = i3;
                    depth = i2;
                    nVar3 = nVar;
                }
                if (!z6) {
                    this.f688c = a(oVar.f677c, oVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public q(o oVar) {
        this.f690f = true;
        this.f691g = new float[9];
        this.h = new Matrix();
        this.f692i = new Rect();
        this.f687b = oVar;
        this.f688c = a(oVar.f677c, oVar.d);
    }
}
