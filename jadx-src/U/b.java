package U;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f629a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Object f630b;

    public /* synthetic */ b() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f629a) {
            case 0:
                ((e) this.f630b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        switch (this.f629a) {
            case 0:
                ((e) this.f630b).scheduleSelf(runnable, j2);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f630b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j2);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f629a) {
            case 0:
                ((e) this.f630b).unscheduleSelf(runnable);
                break;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f630b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
        }
    }

    public b(e eVar) {
        this.f630b = eVar;
    }

    private final void a(Drawable drawable) {
    }
}
