package r;

import java.util.concurrent.CancellationException;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0329a f2610b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0329a f2611c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f2612a;

    static {
        if (g.d) {
            f2611c = null;
            f2610b = null;
        } else {
            f2611c = new C0329a(false, null);
            f2610b = new C0329a(true, null);
        }
    }

    public C0329a(boolean z2, CancellationException cancellationException) {
        this.f2612a = cancellationException;
    }
}
