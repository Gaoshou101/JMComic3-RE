package F0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: F0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005f extends C0010k {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f109c = AtomicIntegerFieldUpdater.newUpdater(C0005f.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C0005f(C0004e c0004e, Throwable th, boolean z2) {
        super(th, z2);
        this._resumed$volatile = 0;
    }
}
