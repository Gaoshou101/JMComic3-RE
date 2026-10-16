package G;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* loaded from: classes.dex */
public final class N extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f153b;

    public N(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f153b = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f152a) {
            case 0:
                ((P) this.f153b).b();
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f153b;
                actionBarOverlayLayout.f963w = null;
                actionBarOverlayLayout.f950j = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f152a) {
            case 0:
                ((P) this.f153b).a();
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f153b;
                actionBarOverlayLayout.f963w = null;
                actionBarOverlayLayout.f950j = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f152a) {
            case 0:
                ((P) this.f153b).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public N(P p2, View view) {
        this.f153b = p2;
    }
}
