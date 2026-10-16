package l0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final d f2184b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2185c;
    public final int d;

    public c(d dVar, int i2, int i3) {
        x0.g.e("list", dVar);
        this.f2184b = dVar;
        this.f2185c = i2;
        P0.b.d(i2, i3, dVar.a());
        this.d = i3 - i2;
    }

    @Override // l0.d
    public final int a() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        int i3 = this.d;
        if (i2 >= 0 && i2 < i3) {
            return this.f2184b.get(this.f2185c + i2);
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }
}
