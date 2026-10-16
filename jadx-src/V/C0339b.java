package v;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f2675a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f2676b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2677c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2678e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2679f = false;

    public C0339b(Activity activity) {
        this.f2676b = activity;
        this.f2677c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f2676b == activity) {
            this.f2676b = null;
            this.f2678e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f2678e || this.f2679f || this.d) {
            return;
        }
        Object obj = this.f2675a;
        try {
            Object obj2 = AbstractC0340c.f2682c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f2677c) {
                AbstractC0340c.f2685g.postAtFrontOfQueue(new D.a(AbstractC0340c.f2681b.get(activity), 9, obj2));
                this.f2679f = true;
                this.f2675a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f2676b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
