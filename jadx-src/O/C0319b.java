package o;

import java.util.Iterator;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319b extends e implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public C0320c f2509b;

    /* renamed from: c, reason: collision with root package name */
    public C0320c f2510c;
    public final /* synthetic */ int d;

    public C0319b(C0320c c0320c, C0320c c0320c2, int i2) {
        this.d = i2;
        this.f2509b = c0320c2;
        this.f2510c = c0320c;
    }

    @Override // o.e
    public final void a(C0320c c0320c) {
        C0320c c0320c2;
        C0320c c0320cB = null;
        if (this.f2509b == c0320c && c0320c == this.f2510c) {
            this.f2510c = null;
            this.f2509b = null;
        }
        C0320c c0320c3 = this.f2509b;
        if (c0320c3 == c0320c) {
            switch (this.d) {
                case 0:
                    c0320c2 = c0320c3.f2513e;
                    break;
                default:
                    c0320c2 = c0320c3.d;
                    break;
            }
            this.f2509b = c0320c2;
        }
        C0320c c0320c4 = this.f2510c;
        if (c0320c4 == c0320c) {
            C0320c c0320c5 = this.f2509b;
            if (c0320c4 != c0320c5 && c0320c5 != null) {
                c0320cB = b(c0320c4);
            }
            this.f2510c = c0320cB;
        }
    }

    public final C0320c b(C0320c c0320c) {
        switch (this.d) {
            case 0:
                return c0320c.d;
            default:
                return c0320c.f2513e;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2510c != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0320c c0320c = this.f2510c;
        C0320c c0320c2 = this.f2509b;
        this.f2510c = (c0320c == c0320c2 || c0320c2 == null) ? null : b(c0320c);
        return c0320c;
    }
}
