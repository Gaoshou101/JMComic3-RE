package E0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, y0.a {

    /* renamed from: b, reason: collision with root package name */
    public int f67b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f68c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public B0.c f69e;

    /* renamed from: f, reason: collision with root package name */
    public int f70f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f71g;

    public b(c cVar) {
        this.f71g = cVar;
        int i2 = cVar.f73b;
        int length = cVar.f72a.length();
        if (length < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > length) {
            i2 = length;
        }
        this.f68c = i2;
        this.d = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [w0.p, x0.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            int r0 = r8.d
            r1 = 0
            if (r0 >= 0) goto Lc
            r8.f67b = r1
            r0 = 0
            r8.f69e = r0
            goto L81
        Lc:
            E0.c r2 = r8.f71g
            int r3 = r2.f74c
            r4 = 1
            java.lang.CharSequence r5 = r2.f72a
            r6 = -1
            if (r3 <= 0) goto L1d
            int r7 = r8.f70f
            int r7 = r7 + r4
            r8.f70f = r7
            if (r7 >= r3) goto L23
        L1d:
            int r3 = r5.length()
            if (r0 <= r3) goto L33
        L23:
            B0.c r0 = new B0.c
            int r1 = r8.f68c
            int r2 = E0.l.L(r5)
            r0.<init>(r1, r2, r4)
            r8.f69e = r0
            r8.d = r6
            goto L7f
        L33:
            x0.h r0 = r2.d
            int r2 = r8.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.f(r5, r2)
            k0.c r0 = (k0.C0230c) r0
            if (r0 != 0) goto L53
            B0.c r0 = new B0.c
            int r1 = r8.f68c
            int r2 = E0.l.L(r5)
            r0.<init>(r1, r2, r4)
            r8.f69e = r0
            r8.d = r6
            goto L7f
        L53:
            java.lang.Object r2 = r0.f2022b
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f2023c
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r8.f68c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > r5) goto L6c
            B0.c r3 = B0.c.f5e
            goto L74
        L6c:
            B0.c r5 = new B0.c
            int r6 = r2 + (-1)
            r5.<init>(r3, r6, r4)
            r3 = r5
        L74:
            r8.f69e = r3
            int r2 = r2 + r0
            r8.f68c = r2
            if (r0 != 0) goto L7c
            r1 = r4
        L7c:
            int r2 = r2 + r1
            r8.d = r2
        L7f:
            r8.f67b = r4
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f67b == -1) {
            a();
        }
        return this.f67b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f67b == -1) {
            a();
        }
        if (this.f67b == 0) {
            throw new NoSuchElementException();
        }
        B0.c cVar = this.f69e;
        x0.g.c("null cannot be cast to non-null type kotlin.ranges.IntRange", cVar);
        this.f69e = null;
        this.f67b = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
