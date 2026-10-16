package androidx.activity;

import k0.C0235h;

/* loaded from: classes.dex */
public final class v extends x0.h implements w0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f876c;
    public final /* synthetic */ C d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(C c2, int i2) {
        super(0);
        this.f876c = i2;
        this.d = c2;
    }

    @Override // w0.a
    public final Object a() {
        switch (this.f876c) {
            case 0:
                this.d.c();
                break;
            case 1:
                this.d.b();
                break;
            default:
                this.d.c();
                break;
        }
        return C0235h.f2029a;
    }
}
