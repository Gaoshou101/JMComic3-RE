package j0;

/* loaded from: classes.dex */
public final class s extends u {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f1944b;

    public s(Throwable th) {
        super("An unknown error occurred.", null);
        this.f1944b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f1944b;
    }
}
