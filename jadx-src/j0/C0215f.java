package j0;

/* renamed from: j0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215f extends AbstractC0220k {

    /* renamed from: b, reason: collision with root package name */
    public final String f1940b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0215f(String str) {
        super("Cannot copy/rename to an existing directory (" + str + ")", null);
        x0.g.e("path", str);
        this.f1940b = str;
    }
}
