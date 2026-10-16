package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196c extends P0.b {

    /* renamed from: m, reason: collision with root package name */
    public final ObjectAnimator f1888m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1889n;

    public C0196c(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i2 = z2 ? numberOfFrames - 1 : 0;
        int i3 = z2 ? 0 : numberOfFrames - 1;
        C0197d c0197d = new C0197d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        c0197d.f1891b = numberOfFrames2;
        int[] iArr = c0197d.f1890a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            c0197d.f1890a = new int[numberOfFrames2];
        }
        int[] iArr2 = c0197d.f1890a;
        int i4 = 0;
        for (int i5 = 0; i5 < numberOfFrames2; i5++) {
            int duration = animationDrawable.getDuration(z2 ? (numberOfFrames2 - i5) - 1 : i5);
            iArr2[i5] = duration;
            i4 += duration;
        }
        c0197d.f1892c = i4;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c0197d.f1892c);
        objectAnimatorOfInt.setInterpolator(c0197d);
        this.f1889n = z3;
        this.f1888m = objectAnimatorOfInt;
    }

    @Override // P0.b
    public final void D() {
        this.f1888m.start();
    }

    @Override // P0.b
    public final void E() {
        this.f1888m.cancel();
    }

    @Override // P0.b
    public final boolean b() {
        return this.f1889n;
    }

    @Override // P0.b
    public final void z() {
        this.f1888m.reverse();
    }
}
