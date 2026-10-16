package U;

import android.graphics.Paint;
import m.C0304z;

/* loaded from: classes.dex */
public final class j extends m {
    public C0304z d;

    /* renamed from: e, reason: collision with root package name */
    public float f640e;

    /* renamed from: f, reason: collision with root package name */
    public C0304z f641f;

    /* renamed from: g, reason: collision with root package name */
    public float f642g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f643i;

    /* renamed from: j, reason: collision with root package name */
    public float f644j;

    /* renamed from: k, reason: collision with root package name */
    public float f645k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f646l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f647m;

    /* renamed from: n, reason: collision with root package name */
    public float f648n;

    @Override // U.l
    public final boolean a() {
        return this.f641f.c() || this.d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // U.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            m.z r0 = r6.f641f
            boolean r1 = r0.c()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f2496c
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f2494a
            if (r1 == r4) goto L1e
            r0.f2494a = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            m.z r1 = r6.d
            boolean r4 = r1.c()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f2496c
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f2494a
            if (r7 == r4) goto L3a
            r1.f2494a = r7
            r2 = r3
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U.j.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f641f.f2494a;
    }

    public float getStrokeAlpha() {
        return this.f642g;
    }

    public int getStrokeColor() {
        return this.d.f2494a;
    }

    public float getStrokeWidth() {
        return this.f640e;
    }

    public float getTrimPathEnd() {
        return this.f644j;
    }

    public float getTrimPathOffset() {
        return this.f645k;
    }

    public float getTrimPathStart() {
        return this.f643i;
    }

    public void setFillAlpha(float f2) {
        this.h = f2;
    }

    public void setFillColor(int i2) {
        this.f641f.f2494a = i2;
    }

    public void setStrokeAlpha(float f2) {
        this.f642g = f2;
    }

    public void setStrokeColor(int i2) {
        this.d.f2494a = i2;
    }

    public void setStrokeWidth(float f2) {
        this.f640e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f644j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f645k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.f643i = f2;
    }
}
