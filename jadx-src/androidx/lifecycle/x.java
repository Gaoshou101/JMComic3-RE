package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class x extends AbstractC0074f {
    final /* synthetic */ y this$0;

    public static final class a extends AbstractC0074f {
        final /* synthetic */ y this$0;

        public a(y yVar) {
            this.this$0 = yVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            x0.g.e("activity", activity);
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            x0.g.e("activity", activity);
            y yVar = this.this$0;
            int i2 = yVar.f1318a + 1;
            yVar.f1318a = i2;
            if (i2 == 1 && yVar.d) {
                yVar.f1322f.d(EnumC0080l.ON_START);
                yVar.d = false;
            }
        }
    }

    public x(y yVar) {
        this.this$0 = yVar;
    }

    @Override // androidx.lifecycle.AbstractC0074f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        x0.g.e("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = B.f1269b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            x0.g.c("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", fragmentFindFragmentByTag);
            ((B) fragmentFindFragmentByTag).f1270a = this.this$0.h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0074f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        x0.g.e("activity", activity);
        y yVar = this.this$0;
        int i2 = yVar.f1319b - 1;
        yVar.f1319b = i2;
        if (i2 == 0) {
            Handler handler = yVar.f1321e;
            x0.g.b(handler);
            handler.postDelayed(yVar.f1323g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        x0.g.e("activity", activity);
        w.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0074f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        x0.g.e("activity", activity);
        y yVar = this.this$0;
        int i2 = yVar.f1318a - 1;
        yVar.f1318a = i2;
        if (i2 == 0 && yVar.f1320c) {
            yVar.f1322f.d(EnumC0080l.ON_STOP);
            yVar.d = true;
        }
    }
}
