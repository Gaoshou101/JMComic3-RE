package D0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Iterator, y0.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f59b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f60c;

    public h(i iVar) {
        this.f60c = iVar;
        this.f59b = new E0.b(iVar.f61a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f59b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f60c.f62b.g(this.f59b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
