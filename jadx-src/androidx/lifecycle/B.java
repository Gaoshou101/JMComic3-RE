package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class B extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1269b = 0;

    /* renamed from: a, reason: collision with root package name */
    public X.i f1270a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final A Companion = new A();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            x0.g.e("activity", activity);
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            x0.g.e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            x0.g.e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            x0.g.e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            x0.g.e("activity", activity);
            int i2 = B.f1269b;
            z.a(activity, EnumC0080l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            x0.g.e("activity", activity);
            int i2 = B.f1269b;
            z.a(activity, EnumC0080l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            x0.g.e("activity", activity);
            int i2 = B.f1269b;
            z.a(activity, EnumC0080l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            x0.g.e("activity", activity);
            int i2 = B.f1269b;
            z.a(activity, EnumC0080l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            x0.g.e("activity", activity);
            int i2 = B.f1269b;
            z.a(activity, EnumC0080l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            x0.g.e("activity", activity);
            int i2 = B.f1269b;
            z.a(activity, EnumC0080l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            x0.g.e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            x0.g.e("activity", activity);
            x0.g.e("bundle", bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            x0.g.e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            x0.g.e("activity", activity);
        }
    }

    public final void a(EnumC0080l enumC0080l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            x0.g.d("activity", activity);
            z.a(activity, enumC0080l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0080l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0080l.ON_DESTROY);
        this.f1270a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0080l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        X.i iVar = this.f1270a;
        if (iVar != null) {
            ((y) iVar.f715b).b();
        }
        a(EnumC0080l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        X.i iVar = this.f1270a;
        if (iVar != null) {
            y yVar = (y) iVar.f715b;
            int i2 = yVar.f1318a + 1;
            yVar.f1318a = i2;
            if (i2 == 1 && yVar.d) {
                yVar.f1322f.d(EnumC0080l.ON_START);
                yVar.d = false;
            }
        }
        a(EnumC0080l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0080l.ON_STOP);
    }
}
