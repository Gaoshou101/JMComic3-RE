package p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, y0.a {

    /* renamed from: b, reason: collision with root package name */
    public int f2572b;

    /* renamed from: c, reason: collision with root package name */
    public int f2573c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2575f;

    public b(int i2) {
        this.f2572b = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2573c < this.f2572b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f2573c;
        switch (this.f2574e) {
            case 0:
                objE = ((f) this.f2575f).e(i2);
                break;
            case 1:
                objE = ((f) this.f2575f).h(i2);
                break;
            default:
                objE = ((g) this.f2575f).f2585c[i2];
                break;
        }
        this.f2573c++;
        this.d = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i2 = this.f2573c - 1;
        this.f2573c = i2;
        switch (this.f2574e) {
            case 0:
                ((f) this.f2575f).f(i2);
                break;
            case 1:
                ((f) this.f2575f).f(i2);
                break;
            default:
                ((g) this.f2575f).a(i2);
                break;
        }
        this.f2572b--;
        this.d = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.d);
        this.f2574e = 2;
        this.f2575f = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i2) {
        this(fVar.d);
        this.f2574e = i2;
        switch (i2) {
            case 1:
                this.f2575f = fVar;
                this(fVar.d);
                break;
            default:
                this.f2575f = fVar;
                break;
        }
    }
}
