package D0;

import c.C0090f;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, y0.a {

    /* renamed from: b, reason: collision with root package name */
    public Object f55b;

    /* renamed from: c, reason: collision with root package name */
    public int f56c = -2;
    public final /* synthetic */ c d;

    public b(c cVar) {
        this.d = cVar;
    }

    public final void a() {
        Object objG;
        int i2 = this.f56c;
        c cVar = this.d;
        if (i2 == -2) {
            cVar.getClass();
            objG = C0090f.f1340c.a();
        } else {
            g gVar = (g) cVar.f58b;
            Object obj = this.f55b;
            x0.g.b(obj);
            objG = gVar.g(obj);
        }
        this.f55b = objG;
        this.f56c = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f56c < 0) {
            a();
        }
        return this.f56c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f56c < 0) {
            a();
        }
        if (this.f56c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f55b;
        x0.g.c("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", obj);
        this.f56c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
