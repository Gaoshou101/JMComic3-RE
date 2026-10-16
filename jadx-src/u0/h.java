package u0;

import F0.C0011l;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements Iterator, y0.a {

    /* renamed from: b, reason: collision with root package name */
    public int f2662b;

    /* renamed from: c, reason: collision with root package name */
    public File f2663c;
    public final ArrayDeque d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f2664e;

    public h(j jVar) {
        this.f2664e = jVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.d = arrayDeque;
        boolean zIsDirectory = jVar.f2666a.isDirectory();
        File file = jVar.f2666a;
        if (zIsDirectory) {
            arrayDeque.push(a(file));
        } else if (file.isFile()) {
            arrayDeque.push(new f(file));
        } else {
            this.f2662b = 2;
        }
    }

    public final d a(File file) {
        int iOrdinal = this.f2664e.f2667b.ordinal();
        if (iOrdinal == 0) {
            return new g(this, file);
        }
        if (iOrdinal == 1) {
            return new e(this, file);
        }
        throw new C0011l();
    }

    public final boolean b() {
        File file;
        File fileA;
        this.f2662b = 3;
        while (true) {
            ArrayDeque arrayDeque = this.d;
            i iVar = (i) arrayDeque.peek();
            if (iVar == null) {
                file = null;
                break;
            }
            fileA = iVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(iVar.f2665a) || !fileA.isDirectory() || arrayDeque.size() >= this.f2664e.d) {
                    break;
                }
                arrayDeque.push(a(fileA));
            }
        }
        file = fileA;
        if (file != null) {
            this.f2663c = file;
            this.f2662b = 1;
        } else {
            this.f2662b = 2;
        }
        return this.f2662b == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f2662b;
        if (i2 == 0) {
            return b();
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f2662b;
        if (i2 == 1) {
            this.f2662b = 0;
            return this.f2663c;
        }
        if (i2 == 2 || !b()) {
            throw new NoSuchElementException();
        }
        this.f2662b = 0;
        return this.f2663c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
