package i;

import android.graphics.drawable.Animatable;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194a extends P0.b {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1853m;

    /* renamed from: n, reason: collision with root package name */
    public final Animatable f1854n;

    public /* synthetic */ C0194a(Animatable animatable, int i2) {
        this.f1853m = i2;
        this.f1854n = animatable;
    }

    @Override // P0.b
    public final void D() {
        switch (this.f1853m) {
            case 0:
                this.f1854n.start();
                break;
            default:
                ((U.e) this.f1854n).start();
                break;
        }
    }

    @Override // P0.b
    public final void E() {
        switch (this.f1853m) {
            case 0:
                this.f1854n.stop();
                break;
            default:
                ((U.e) this.f1854n).stop();
                break;
        }
    }
}
