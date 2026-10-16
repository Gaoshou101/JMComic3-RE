package U;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f675a;

    /* renamed from: b, reason: collision with root package name */
    public n f676b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f677c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f678e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f679f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f680g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public int f681i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f682j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f683k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f684l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f675a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}
