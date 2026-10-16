package z;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f2748e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2749a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2750b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2751c;
    public final int d;

    public c(int i2, int i3, int i4, int i5) {
        this.f2749a = i2;
        this.f2750b = i3;
        this.f2751c = i4;
        this.d = i5;
    }

    public static c a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f2748e : new c(i2, i3, i4, i5);
    }

    public static c b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets c() {
        return AbstractC0349b.a(this.f2749a, this.f2750b, this.f2751c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.f2749a == cVar.f2749a && this.f2751c == cVar.f2751c && this.f2750b == cVar.f2750b;
    }

    public final int hashCode() {
        return (((((this.f2749a * 31) + this.f2750b) * 31) + this.f2751c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2749a + ", top=" + this.f2750b + ", right=" + this.f2751c + ", bottom=" + this.d + '}';
    }
}
