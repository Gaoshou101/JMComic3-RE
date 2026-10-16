package M0;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: e, reason: collision with root package name */
    public static final e f457e;

    static {
        int i2 = k.f463c;
        int i3 = k.d;
        long j2 = k.f464e;
        String str = k.f461a;
        e eVar = new e();
        eVar.d = new c(i2, i3, j2, str);
        f457e = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // F0.AbstractC0015p
    public final String toString() {
        return "Dispatchers.Default";
    }
}
