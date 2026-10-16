package androidx.activity;

import android.window.BackEvent;

/* renamed from: androidx.activity.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0065a f823a = new C0065a();

    public final BackEvent a(float f2, float f3, float f4, int i2) {
        return new BackEvent(f2, f3, f4, i2);
    }

    public final float b(BackEvent backEvent) {
        x0.g.e("backEvent", backEvent);
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        x0.g.e("backEvent", backEvent);
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        x0.g.e("backEvent", backEvent);
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        x0.g.e("backEvent", backEvent);
        return backEvent.getTouchY();
    }
}
