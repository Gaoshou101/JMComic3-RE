package p;

import java.util.ConcurrentModificationException;
import q.AbstractC0328a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2589a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2590b = new Object();

    public static final int a(g gVar, Object obj, int i2) {
        x0.g.e("<this>", gVar);
        int i3 = gVar.d;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0328a.a(gVar.d, i2, gVar.f2584b);
            if (iA < 0 || x0.g.a(obj, gVar.f2585c[iA])) {
                return iA;
            }
            int i4 = iA + 1;
            while (i4 < i3 && gVar.f2584b[i4] == i2) {
                if (x0.g.a(obj, gVar.f2585c[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iA - 1; i5 >= 0 && gVar.f2584b[i5] == i2; i5--) {
                if (x0.g.a(obj, gVar.f2585c[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
