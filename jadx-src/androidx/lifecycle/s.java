package androidx.lifecycle;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0081m f1307a;

    /* renamed from: b, reason: collision with root package name */
    public p f1308b;

    public final void a(r rVar, EnumC0080l enumC0080l) {
        EnumC0081m enumC0081mA = enumC0080l.a();
        EnumC0081m enumC0081m = this.f1307a;
        x0.g.e("state1", enumC0081m);
        if (enumC0081mA.compareTo(enumC0081m) < 0) {
            enumC0081m = enumC0081mA;
        }
        this.f1307a = enumC0081m;
        this.f1308b.b(rVar, enumC0080l);
        this.f1307a = enumC0081mA;
    }
}
