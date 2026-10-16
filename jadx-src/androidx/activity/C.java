package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0081m;
import com.capacitorjs.plugins.app.AppPlugin;
import com.getcapacitor.C0097b;
import com.getcapacitor.C0101f;
import com.getcapacitor.D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f811a;

    /* renamed from: b, reason: collision with root package name */
    public final l0.f f812b = new l0.f();

    /* renamed from: c, reason: collision with root package name */
    public Z.b f813c;
    public final OnBackInvokedCallback d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f814e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f815f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f816g;

    public C(Runnable runnable) {
        this.f811a = runnable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.d = i2 >= 34 ? z.f883a.a(new u(this, 0), new u(this, 1), new v(this, 0), new v(this, 1)) : x.f879a.a(new v(this, 2));
        }
    }

    public final void a(androidx.lifecycle.r rVar, Z.b bVar) {
        x0.g.e("owner", rVar);
        x0.g.e("onBackPressedCallback", bVar);
        androidx.lifecycle.t tVarD = rVar.d();
        if (tVarD.f1311c == EnumC0081m.f1301b) {
            return;
        }
        bVar.f726b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, tVarD, bVar));
        e();
        bVar.f727c = new B(0, this, C.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        Z.b bVarPrevious;
        Z.b bVar = this.f813c;
        if (bVar == null) {
            l0.f fVar = this.f812b;
            ListIterator listIterator = fVar.listIterator(fVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    bVarPrevious = 0;
                    break;
                } else {
                    bVarPrevious = listIterator.previous();
                    if (((Z.b) bVarPrevious).f725a) {
                        break;
                    }
                }
            }
            bVar = bVarPrevious;
        }
        this.f813c = null;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    public final void c() {
        Z.b bVarPrevious;
        Z.b bVar = this.f813c;
        if (bVar == null) {
            l0.f fVar = this.f812b;
            fVar.getClass();
            ListIterator listIterator = fVar.listIterator(fVar.d);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    bVarPrevious = 0;
                    break;
                } else {
                    bVarPrevious = listIterator.previous();
                    if (((Z.b) bVarPrevious).f725a) {
                        break;
                    }
                }
            }
            bVar = bVarPrevious;
        }
        this.f813c = null;
        if (bVar == null) {
            this.f811a.run();
            return;
        }
        switch (bVar.d) {
            case 0:
                AppPlugin appPlugin = (AppPlugin) bVar.f728e;
                if (!appPlugin.hasListeners("backButton")) {
                    if (((D) appPlugin).bridge.f1419k.canGoBack()) {
                        ((D) appPlugin).bridge.f1419k.goBack();
                        return;
                    }
                    return;
                }
                com.getcapacitor.w wVar = new com.getcapacitor.w();
                wVar.f("canGoBack", ((D) appPlugin).bridge.f1419k.canGoBack());
                appPlugin.notifyListeners("backButton", wVar, true);
                C0101f c0101f = ((D) appPlugin).bridge;
                c0101f.getClass();
                new Handler(c0101f.f1412b.getMainLooper()).post(new androidx.emoji2.text.k(c0101f, "window.Capacitor.triggerEvent(\"backbutton\", \"document\")", new C0097b(), 1));
                return;
            default:
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                androidx.fragment.app.q qVar = (androidx.fragment.app.q) bVar.f728e;
                if (zIsLoggable) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + qVar);
                }
                qVar.h = true;
                qVar.h(true);
                qVar.h = false;
                androidx.fragment.app.a aVar = qVar.f1219g;
                Z.b bVar2 = qVar.f1220i;
                if (aVar == null) {
                    if (!bVar2.f725a) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        qVar.f1218f.c();
                        return;
                    }
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                    }
                    qVar.h(false);
                    qVar.g(true);
                    if (qVar.n(qVar.f1209E, qVar.f1210F)) {
                        qVar.f1215b = true;
                        try {
                            qVar.o(qVar.f1209E, qVar.f1210F);
                        } finally {
                            qVar.a();
                        }
                    }
                    qVar.q();
                    ((HashMap) qVar.f1216c.f1141b).values().removeAll(Collections.singleton(null));
                    return;
                }
                ArrayList arrayList = qVar.f1224m;
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(androidx.fragment.app.q.l(qVar.f1219g));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw androidx.fragment.app.x.a(it2);
                        }
                    }
                }
                Iterator it3 = qVar.f1219g.f1154a.iterator();
                while (it3.hasNext()) {
                    ((androidx.fragment.app.u) it3.next()).getClass();
                }
                Iterator it4 = androidx.fragment.app.q.c(new ArrayList(Collections.singletonList(qVar.f1219g)), 0, 1).iterator();
                if (it4.hasNext()) {
                    ((androidx.fragment.app.y) it4.next()).getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    throw null;
                }
                Iterator it5 = qVar.f1219g.f1154a.iterator();
                while (it5.hasNext()) {
                    ((androidx.fragment.app.u) it5.next()).getClass();
                }
                qVar.f1219g = null;
                qVar.q();
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + bVar2.f725a + " for  FragmentManager " + qVar);
                    return;
                }
                return;
        }
    }

    public final void d(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f814e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        x xVar = x.f879a;
        if (z2 && !this.f815f) {
            xVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f815f = true;
        } else {
            if (z2 || !this.f815f) {
                return;
            }
            xVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f815f = false;
        }
    }

    public final void e() {
        boolean z2 = this.f816g;
        l0.f fVar = this.f812b;
        boolean z3 = false;
        if (!(fVar instanceof Collection) || !fVar.isEmpty()) {
            Iterator it = fVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Z.b) it.next()).f725a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f816g = z3;
        if (z3 == z2 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z3);
    }
}
