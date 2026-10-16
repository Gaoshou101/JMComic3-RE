package m;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2288a;

    /* renamed from: b, reason: collision with root package name */
    public int f2289b;

    /* renamed from: c, reason: collision with root package name */
    public int f2290c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2291e;

    /* renamed from: f, reason: collision with root package name */
    public int f2292f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2293g;
    public boolean h;

    public final void a(int i2, int i3) {
        this.f2290c = i2;
        this.d = i3;
        this.h = true;
        if (this.f2293g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f2288a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f2289b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2288a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f2289b = i3;
        }
    }
}
