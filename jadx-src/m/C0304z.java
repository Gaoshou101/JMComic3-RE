package m;

import G.C0037m;
import a.AbstractC0062a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import f.AbstractC0113a;

/* renamed from: m.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304z {

    /* renamed from: a, reason: collision with root package name */
    public int f2494a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2495b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2496c;

    public C0304z(ImageView imageView) {
        this.f2494a = 0;
        this.f2495b = imageView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        if (r5 == 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f3, code lost:
    
        if (r5 == 2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f5, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f7, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fd, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0200, code lost:
    
        r1 = 0;
        r3 = new android.graphics.LinearGradient(r11, r27, r26, r25, (int[]) r0.f19b, (float[]) r0.f20c, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0217, code lost:
    
        r1 = 0;
        r3 = new android.graphics.SweepGradient(r22, r23, (int[]) r0.f19b, (float[]) r0.f20c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022a, code lost:
    
        r9 = r22;
        r15 = r23;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0232, code lost:
    
        if (r24 <= 0.0f) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0237, code lost:
    
        if (r5 == 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023a, code lost:
    
        if (r5 == 2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x023c, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0241, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0244, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0247, code lost:
    
        r3 = new android.graphics.RadialGradient(r9, r15, r24, (int[]) r0.f19b, (float[]) r0.f20c, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0264, code lost:
    
        return new m.C0304z(r3, null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cf, code lost:
    
        if (r14.size() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:
    
        r0 = new D.c(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d8, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        if (r19 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        r0 = new D.c(r6, r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e4, code lost:
    
        r0 = new D.c(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ea, code lost:
    
        if (r8 == 1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ed, code lost:
    
        if (r8 == 2) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m.C0304z b(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0304z.b(android.content.res.Resources, int, android.content.res.Resources$Theme):m.z");
    }

    public void a() {
        X0 x02;
        ImageView imageView = (ImageView) this.f2495b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0286p0.a(drawable);
        }
        if (drawable == null || (x02 = (X0) this.f2496c) == null) {
            return;
        }
        C0294u.d(drawable, x02, imageView.getDrawableState());
    }

    public boolean c() {
        ColorStateList colorStateList;
        return ((Shader) this.f2495b) == null && (colorStateList = (ColorStateList) this.f2496c) != null && colorStateList.isStateful();
    }

    public void d(AttributeSet attributeSet, int i2) {
        int resourceId;
        ImageView imageView = (ImageView) this.f2495b;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0113a.f1501f;
        C0037m c0037mM = C0037m.m(context, attributeSet, iArr, i2);
        G.K.g(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0037mM.f196b, i2, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c0037mM.f196b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0062a.v(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0286p0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c0037mM.h(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC0286p0.b(typedArray.getInt(3, -1), null));
            }
            c0037mM.r();
        } catch (Throwable th) {
            c0037mM.r();
            throw th;
        }
    }

    public C0304z(Shader shader, ColorStateList colorStateList, int i2) {
        this.f2495b = shader;
        this.f2496c = colorStateList;
        this.f2494a = i2;
    }
}
