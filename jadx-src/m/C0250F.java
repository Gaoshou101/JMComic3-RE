package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.a7m3p9xv.t6qk2z8.app.R;

/* renamed from: m.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250F extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0248D f2222a;

    public C0250F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        V0.a(this, getContext());
        C0248D c0248d = new C0248D(this);
        this.f2222a = c0248d;
        c0248d.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = (Bitmap) this.f2222a.f2216c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
