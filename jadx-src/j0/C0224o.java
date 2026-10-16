package j0;

/* renamed from: j0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224o extends u {

    /* renamed from: b, reason: collision with root package name */
    public final String f1942b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f1943c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0224o(String str, Throwable th) {
        super("The file/directory at " + str + " does not exist", null);
        x0.g.e("path", str);
        this.f1942b = str;
        this.f1943c = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f1943c;
    }
}
