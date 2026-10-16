package o;

import java.util.Iterator;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321d extends e implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public C0320c f2514b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2515c = true;
    public final /* synthetic */ f d;

    public C0321d(f fVar) {
        this.d = fVar;
    }

    @Override // o.e
    public final void a(C0320c c0320c) {
        C0320c c0320c2 = this.f2514b;
        if (c0320c == c0320c2) {
            C0320c c0320c3 = c0320c2.f2513e;
            this.f2514b = c0320c3;
            this.f2515c = c0320c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2515c) {
            return this.d.f2516b != null;
        }
        C0320c c0320c = this.f2514b;
        return (c0320c == null || c0320c.d == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2515c) {
            this.f2515c = false;
            this.f2514b = this.d.f2516b;
        } else {
            C0320c c0320c = this.f2514b;
            this.f2514b = c0320c != null ? c0320c.d : null;
        }
        return this.f2514b;
    }
}
