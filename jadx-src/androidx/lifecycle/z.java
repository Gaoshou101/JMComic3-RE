package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.B;

/* loaded from: classes.dex */
public abstract class z {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0080l enumC0080l) {
        x0.g.e("activity", activity);
        x0.g.e("event", enumC0080l);
        if (activity instanceof r) {
            t tVarD = ((r) activity).d();
            if (tVarD instanceof t) {
                tVarD.d(enumC0080l);
            }
        }
    }

    public static void b(Activity activity) {
        x0.g.e("activity", activity);
        if (Build.VERSION.SDK_INT >= 29) {
            B.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new B.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new B(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
