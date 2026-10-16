package q;

import x0.g;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0328a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2607a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f2608b = new Object[0];

    public static final int a(int i2, int i3, int[] iArr) {
        g.e("array", iArr);
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int b(long[] jArr, int i2, long j2) {
        g.e("array", jArr);
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
