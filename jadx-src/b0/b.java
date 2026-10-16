package B0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, y0.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f2b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int f4e;

    public b(int i2, int i3, int i4) {
        this.f2b = i4;
        this.f3c = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.d = z2;
        this.f4e = z2 ? i2 : i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f4e;
        if (i2 != this.f3c) {
            this.f4e = this.f2b + i2;
        } else {
            if (!this.d) {
                throw new NoSuchElementException();
            }
            this.d = false;
        }
        return Integer.valueOf(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
