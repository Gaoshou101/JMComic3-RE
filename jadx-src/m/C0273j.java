package m;

import a.AbstractC0062a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.a7m3p9xv.t6qk2z8.app.R;
import l.C0240b;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273j extends C0245A implements InterfaceC0277l {
    public final /* synthetic */ C0275k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0273j(C0275k c0275k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.d = c0275k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0062a.V(this, getContentDescription());
        setOnTouchListener(new C0240b(this, this));
    }

    @Override // m.InterfaceC0277l
    public final boolean a() {
        return false;
    }

    @Override // m.InterfaceC0277l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
