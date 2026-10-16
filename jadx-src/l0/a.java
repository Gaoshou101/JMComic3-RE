package l0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class a implements Iterator, y0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2181b;

    /* renamed from: c, reason: collision with root package name */
    public int f2182c;
    public final Object d;

    public /* synthetic */ a(int i2, Object obj) {
        this.f2181b = i2;
        this.d = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2181b) {
            case 0:
                if (this.f2182c < ((d) this.d).a()) {
                }
                break;
            default:
                if (this.f2182c < ((Object[]) this.d).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2181b) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f2182c;
                this.f2182c = i2 + 1;
                return ((d) this.d).get(i2);
            default:
                try {
                    Object[] objArr = (Object[]) this.d;
                    int i3 = this.f2182c;
                    this.f2182c = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f2182c--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2181b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
