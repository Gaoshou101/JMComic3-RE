package U;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f634a;

    public d(Drawable.ConstantState constantState) {
        this.f634a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f634a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f634a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f634a.newDrawable();
        eVar.f639a = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.d);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f634a.newDrawable(resources);
        eVar.f639a = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.d);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f634a.newDrawable(resources, theme);
        eVar.f639a = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.d);
        return eVar;
    }
}
