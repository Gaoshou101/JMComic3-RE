package m;

import a.AbstractC0062a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* renamed from: m.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302y extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0285p f2484a;

    /* renamed from: b, reason: collision with root package name */
    public final C0304z f2485b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0302y(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        W0.a(context);
        this.f2486c = false;
        V0.a(this, getContext());
        C0285p c0285p = new C0285p(this);
        this.f2484a = c0285p;
        c0285p.d(attributeSet, i2);
        C0304z c0304z = new C0304z(this);
        this.f2485b = c0304z;
        c0304z.d(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0285p c0285p = this.f2484a;
        if (c0285p != null) {
            c0285p.a();
        }
        C0304z c0304z = this.f2485b;
        if (c0304z != null) {
            c0304z.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0285p c0285p = this.f2484a;
        if (c0285p != null) {
            return c0285p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0285p c0285p = this.f2484a;
        if (c0285p != null) {
            return c0285p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        X0 x02;
        C0304z c0304z = this.f2485b;
        if (c0304z == null || (x02 = (X0) c0304z.f2496c) == null) {
            return null;
        }
        return x02.f2313a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        X0 x02;
        C0304z c0304z = this.f2485b;
        if (c0304z == null || (x02 = (X0) c0304z.f2496c) == null) {
            return null;
        }
        return x02.f2314b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2485b.f2495b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0285p c0285p = this.f2484a;
        if (c0285p != null) {
            c0285p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0285p c0285p = this.f2484a;
        if (c0285p != null) {
            c0285p.f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0304z c0304z = this.f2485b;
        if (c0304z != null) {
            c0304z.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0304z c0304z = this.f2485b;
        if (c0304z != null && drawable != null && !this.f2486c) {
            c0304z.f2494a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0304z != null) {
            c0304z.a();
            if (this.f2486c) {
                return;
            }
            ImageView imageView = (ImageView) c0304z.f2495b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0304z.f2494a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f2486c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        C0304z c0304z = this.f2485b;
        ImageView imageView = (ImageView) c0304z.f2495b;
        if (i2 != 0) {
            Drawable drawableV = AbstractC0062a.v(imageView.getContext(), i2);
            if (drawableV != null) {
                AbstractC0286p0.a(drawableV);
            }
            imageView.setImageDrawable(drawableV);
        } else {
            imageView.setImageDrawable(null);
        }
        c0304z.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0304z c0304z = this.f2485b;
        if (c0304z != null) {
            c0304z.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0285p c0285p = this.f2484a;
        if (c0285p != null) {
            c0285p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0285p c0285p = this.f2484a;
        if (c0285p != null) {
            c0285p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0304z c0304z = this.f2485b;
        if (c0304z != null) {
            if (((X0) c0304z.f2496c) == null) {
                c0304z.f2496c = new X0();
            }
            X0 x02 = (X0) c0304z.f2496c;
            x02.f2313a = colorStateList;
            x02.d = true;
            c0304z.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0304z c0304z = this.f2485b;
        if (c0304z != null) {
            if (((X0) c0304z.f2496c) == null) {
                c0304z.f2496c = new X0();
            }
            X0 x02 = (X0) c0304z.f2496c;
            x02.f2314b = mode;
            x02.f2315c = true;
            c0304z.a();
        }
    }
}
