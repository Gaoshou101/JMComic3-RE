package n;

import java.util.concurrent.Executors;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307a extends P0.b {

    /* renamed from: n, reason: collision with root package name */
    public static volatile C0307a f2498n;

    /* renamed from: m, reason: collision with root package name */
    public final Object f2499m;

    public C0307a(int i2) {
        switch (i2) {
            case 1:
                this.f2499m = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f2499m = new C0307a(1);
                break;
        }
    }
}
