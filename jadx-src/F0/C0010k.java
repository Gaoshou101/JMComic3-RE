package F0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: F0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0010k {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f116b = AtomicIntegerFieldUpdater.newUpdater(C0010k.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f117a;

    public C0010k(Throwable th, boolean z2) {
        this.f117a = th;
        this._handled$volatile = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f117a + ']';
    }
}
