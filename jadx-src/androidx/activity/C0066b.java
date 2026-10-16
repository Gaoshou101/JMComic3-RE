package androidx.activity;

import android.window.BackEvent;

/* renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066b {

    /* renamed from: a, reason: collision with root package name */
    public final float f824a;

    /* renamed from: b, reason: collision with root package name */
    public final float f825b;

    /* renamed from: c, reason: collision with root package name */
    public final float f826c;
    public final int d;

    public C0066b(BackEvent backEvent) {
        x0.g.e("backEvent", backEvent);
        C0065a c0065a = C0065a.f823a;
        float fD = c0065a.d(backEvent);
        float fE = c0065a.e(backEvent);
        float fB = c0065a.b(backEvent);
        int iC = c0065a.c(backEvent);
        this.f824a = fD;
        this.f825b = fE;
        this.f826c = fB;
        this.d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f824a + ", touchY=" + this.f825b + ", progress=" + this.f826c + ", swipeEdge=" + this.d + '}';
    }
}
