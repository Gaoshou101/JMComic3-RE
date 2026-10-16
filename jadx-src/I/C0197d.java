package i;

import android.animation.TimeInterpolator;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197d implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1890a;

    /* renamed from: b, reason: collision with root package name */
    public int f1891b;

    /* renamed from: c, reason: collision with root package name */
    public int f1892c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        int i2 = (int) ((f2 * this.f1892c) + 0.5f);
        int i3 = this.f1891b;
        int[] iArr = this.f1890a;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = iArr[i4];
            if (i2 < i5) {
                break;
            }
            i2 -= i5;
            i4++;
        }
        return (i4 / i3) + (i4 < i3 ? i2 / this.f1892c : 0.0f);
    }
}
