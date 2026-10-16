package F;

import D.m;

/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: c, reason: collision with root package name */
    public final Object f79c;

    public c() {
        super(12);
        this.f79c = new Object();
    }

    @Override // D.m
    public final Object a() {
        Object objA;
        synchronized (this.f79c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // D.m
    public final boolean d(Object obj) {
        boolean zD;
        synchronized (this.f79c) {
            zD = super.d(obj);
        }
        return zD;
    }
}
