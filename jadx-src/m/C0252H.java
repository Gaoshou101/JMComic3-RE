package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.a7m3p9xv.t6qk2z8.app.R;

/* renamed from: m.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252H extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0253I f2225a;

    public C0252H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        V0.a(this, getContext());
        C0253I c0253i = new C0253I(this);
        this.f2225a = c0253i;
        c0253i.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0253I c0253i = this.f2225a;
        Drawable drawable = c0253i.f2228f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0252H c0252h = c0253i.f2227e;
        if (drawable.setState(c0252h.getDrawableState())) {
            c0252h.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2225a.f2228f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2225a.g(canvas);
    }
}
