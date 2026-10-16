package J;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f309a;

    /* renamed from: b, reason: collision with root package name */
    public int f310b;

    /* renamed from: c, reason: collision with root package name */
    public float f311c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public long f312e;

    /* renamed from: f, reason: collision with root package name */
    public long f313f;

    /* renamed from: g, reason: collision with root package name */
    public long f314g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public int f315i;

    public final float a(long j2) {
        if (j2 < this.f312e) {
            return 0.0f;
        }
        long j3 = this.f314g;
        if (j3 < 0 || j2 < j3) {
            return d.b((j2 - r0) / this.f309a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.h;
        return (d.b((j2 - j3) / this.f315i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
