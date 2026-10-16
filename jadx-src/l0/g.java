package l0;

import a.AbstractC0062a;

/* loaded from: classes.dex */
public abstract class g extends AbstractC0062a {
    public static void a0(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        x0.g.e("<this>", iArr);
        x0.g.e("destination", iArr2);
        System.arraycopy(iArr, i3, iArr2, i2, i4 - i3);
    }

    public static void b0(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        x0.g.e("<this>", objArr);
        x0.g.e("destination", objArr2);
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static /* synthetic */ void c0(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        b0(objArr, objArr2, 0, i2, i3);
    }
}
