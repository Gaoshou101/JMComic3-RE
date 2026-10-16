package U;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class e extends h implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f636c;
    public final b d = new b(this);

    /* renamed from: b, reason: collision with root package name */
    public final c f635b = new c();

    public e(Context context) {
        this.f636c = context;
    }

    @Override // U.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f635b;
        cVar.f631a.draw(canvas);
        if (cVar.f632b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.getAlpha() : this.f635b.f631a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f635b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.getColorFilter() : this.f635b.f631a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f639a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f639a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f635b.f631a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f635b.f631a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.getOpacity() : this.f635b.f631a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0175, code lost:
    
        if (r8.f632b != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0177, code lost:
    
        r8.f632b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017e, code lost:
    
        r8.f632b.playTogether(r8.f633c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U.e.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.isAutoMirrored() : this.f635b.f631a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f639a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f635b.f632b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.isStateful() : this.f635b.f631a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f635b.f631a.setBounds(rect);
        }
    }

    @Override // U.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.setLevel(i2) : this.f635b.f631a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f639a;
        return drawable != null ? drawable.setState(iArr) : this.f635b.f631a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f635b.f631a.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f635b.f631a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f635b.f631a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            P0.b.C(drawable, i2);
        } else {
            this.f635b.f631a.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f635b.f631a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f635b.f631a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f635b.f631a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f635b;
        if (cVar.f632b.isStarted()) {
            return;
        }
        cVar.f632b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f639a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f635b.f632b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
