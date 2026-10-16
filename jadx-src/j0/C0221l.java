package j0;

/* renamed from: j0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221l extends AbstractC0220k {

    /* renamed from: b, reason: collision with root package name */
    public final String f1941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0221l(String str) {
        super("The file/directory at " + str + " already exists", null);
        x0.g.e("path", str);
        this.f1941b = str;
    }
}
