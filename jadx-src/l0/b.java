package l0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends a implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f2183e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i2) {
        super(0, dVar);
        this.f2183e = dVar;
        int iA = dVar.a();
        if (i2 >= 0 && i2 <= iA) {
            this.f2182c = i2;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + iA);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2182c > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2182c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f2182c - 1;
        this.f2182c = i2;
        return this.f2183e.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2182c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
