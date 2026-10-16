package Z;

import android.util.Log;
import androidx.activity.k;
import androidx.fragment.app.q;
import com.capacitorjs.plugins.app.AppPlugin;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import x0.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f725a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f726b;

    /* renamed from: c, reason: collision with root package name */
    public f f727c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f728e;

    public b(boolean z2) {
        this.f725a = z2;
        this.f726b = new CopyOnWriteArrayList();
    }

    public void a() {
        switch (this.d) {
            case 1:
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                q qVar = (q) this.f728e;
                if (zIsLoggable) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + qVar);
                }
                qVar.getClass();
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + qVar.f1219g);
                }
                androidx.fragment.app.a aVar = qVar.f1219g;
                if (aVar != null) {
                    aVar.f1169r = false;
                    k kVar = new k(3, qVar);
                    if (aVar.f1167p == null) {
                        aVar.f1167p = new ArrayList();
                    }
                    aVar.f1167p.add(kVar);
                    qVar.f1219g.c(true);
                    qVar.h = true;
                    qVar.h(true);
                    qVar.k();
                    qVar.h = false;
                    qVar.f1219g = null;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(AppPlugin appPlugin) {
        this(true);
        this.d = 0;
        this.f728e = appPlugin;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(q qVar) {
        this(false);
        this.d = 1;
        this.f728e = qVar;
    }

    public final void b() {
    }
}
