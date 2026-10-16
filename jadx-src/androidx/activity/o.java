package androidx.activity;

import G.C0037m;
import G.InterfaceC0036l;
import a.AbstractC0062a;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.EnumC0080l;
import androidx.lifecycle.EnumC0081m;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0076h;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.SavedStateHandleAttacher;
import b.C0082a;
import c.InterfaceC0092h;
import com.a7m3p9xv.t6qk2z8.app.R;
import g.AbstractActivityC0137i;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C0233f;
import o.C0319b;
import w.InterfaceC0342b;

/* loaded from: classes.dex */
public abstract class o extends v.f implements M, InterfaceC0076h, R.f, InterfaceC0092h, InterfaceC0342b, w.c, v.j, v.k, InterfaceC0036l {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f851s = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0082a f852b = new C0082a();

    /* renamed from: c, reason: collision with root package name */
    public final C0037m f853c;
    public final R.e d;

    /* renamed from: e, reason: collision with root package name */
    public L f854e;

    /* renamed from: f, reason: collision with root package name */
    public final l f855f;

    /* renamed from: g, reason: collision with root package name */
    public final C0233f f856g;
    public final AtomicInteger h;

    /* renamed from: i, reason: collision with root package name */
    public final m f857i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f858j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f859k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f860l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f861m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f862n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f863o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f864p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f865q;

    /* renamed from: r, reason: collision with root package name */
    public final C0233f f866r;

    public o() {
        R.c cVar;
        final AbstractActivityC0137i abstractActivityC0137i = (AbstractActivityC0137i) this;
        this.f853c = new C0037m(new d(abstractActivityC0137i, 0));
        R.e eVar = new R.e(this);
        this.d = eVar;
        this.f855f = new l(abstractActivityC0137i);
        this.f856g = new C0233f(new n(abstractActivityC0137i, 1));
        this.h = new AtomicInteger();
        this.f857i = new m(abstractActivityC0137i);
        this.f858j = new CopyOnWriteArrayList();
        this.f859k = new CopyOnWriteArrayList();
        this.f860l = new CopyOnWriteArrayList();
        this.f861m = new CopyOnWriteArrayList();
        this.f862n = new CopyOnWriteArrayList();
        this.f863o = new CopyOnWriteArrayList();
        androidx.lifecycle.t tVar = this.f2687a;
        if (tVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        tVar.a(new e(0, abstractActivityC0137i));
        this.f2687a.a(new e(1, abstractActivityC0137i));
        this.f2687a.a(new androidx.lifecycle.p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.p
            public final void b(androidx.lifecycle.r rVar, EnumC0080l enumC0080l) {
                int i2 = o.f851s;
                AbstractActivityC0137i abstractActivityC0137i2 = abstractActivityC0137i;
                if (abstractActivityC0137i2.f854e == null) {
                    j jVar = (j) abstractActivityC0137i2.getLastNonConfigurationInstance();
                    if (jVar != null) {
                        abstractActivityC0137i2.f854e = jVar.f838a;
                    }
                    if (abstractActivityC0137i2.f854e == null) {
                        abstractActivityC0137i2.f854e = new L();
                    }
                }
                abstractActivityC0137i2.f2687a.f(this);
            }
        });
        eVar.a();
        EnumC0081m enumC0081m = this.f2687a.f1311c;
        if (enumC0081m != EnumC0081m.f1302c && enumC0081m != EnumC0081m.d) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        R.d dVar = (R.d) eVar.f615c;
        Iterator it = ((o.f) dVar.d).iterator();
        while (true) {
            C0319b c0319b = (C0319b) it;
            if (!c0319b.hasNext()) {
                cVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) c0319b.next();
            x0.g.d("components", entry);
            String str = (String) entry.getKey();
            cVar = (R.c) entry.getValue();
            if (x0.g.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (cVar == null) {
            F f2 = new F(dVar, this);
            dVar.e("androidx.lifecycle.internal.SavedStateHandlesProvider", f2);
            this.f2687a.a(new SavedStateHandleAttacher(f2));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            this.f2687a.a(new ImmLeaksCleaner(this));
        }
        dVar.e("android:support:activity-result", new f(0, abstractActivityC0137i));
        f(new g(abstractActivityC0137i, 0));
        this.f866r = new C0233f(new n(abstractActivityC0137i, 2));
    }

    @Override // R.f
    public final R.d a() {
        return (R.d) this.d.f615c;
    }

    @Override // androidx.lifecycle.M
    public final L c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f854e == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this.f854e = jVar.f838a;
            }
            if (this.f854e == null) {
                this.f854e = new L();
            }
        }
        L l2 = this.f854e;
        x0.g.b(l2);
        return l2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f2687a;
    }

    public final void f(b.b bVar) {
        C0082a c0082a = this.f852b;
        c0082a.getClass();
        o oVar = c0082a.f1327b;
        if (oVar != null) {
            bVar.a(oVar);
        }
        c0082a.f1326a.add(bVar);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f857i.a(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((C) this.f866r.a()).c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        x0.g.e("newConfig", configuration);
        super.onConfigurationChanged(configuration);
        Iterator it = this.f858j.iterator();
        while (it.hasNext()) {
            ((F.a) it.next()).a(configuration);
        }
    }

    @Override // v.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        C0082a c0082a = this.f852b;
        c0082a.getClass();
        c0082a.f1327b = this;
        Iterator it = c0082a.f1326a.iterator();
        while (it.hasNext()) {
            ((b.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i2 = androidx.lifecycle.B.f1269b;
        androidx.lifecycle.z.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        x0.g.e("menu", menu);
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        this.f853c.n();
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        x0.g.e("item", menuItem);
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        this.f853c.o();
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        if (this.f864p) {
            return;
        }
        Iterator it = this.f861m.iterator();
        while (it.hasNext()) {
            ((F.a) it.next()).a(new v.g(z2));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        x0.g.e("intent", intent);
        super.onNewIntent(intent);
        Iterator it = this.f860l.iterator();
        while (it.hasNext()) {
            ((F.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        x0.g.e("menu", menu);
        Iterator it = ((CopyOnWriteArrayList) this.f853c.f196b).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.q qVar = ((androidx.fragment.app.k) it.next()).f1198a;
            if (qVar.f1231t >= 1) {
                Iterator it2 = qVar.f1216c.f().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        if (this.f865q) {
            return;
        }
        Iterator it = this.f862n.iterator();
        while (it.hasNext()) {
            ((F.a) it.next()).a(new v.l(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        x0.g.e("menu", menu);
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        this.f853c.p();
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        x0.g.e("permissions", strArr);
        x0.g.e("grantResults", iArr);
        if (this.f857i.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        L l2 = this.f854e;
        if (l2 == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            l2 = jVar.f838a;
        }
        if (l2 == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f838a = l2;
        return jVar2;
    }

    @Override // v.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        x0.g.e("outState", bundle);
        androidx.lifecycle.t tVar = this.f2687a;
        if (tVar instanceof androidx.lifecycle.t) {
            x0.g.c("null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry", tVar);
            EnumC0081m enumC0081m = EnumC0081m.d;
            tVar.c("setCurrentState");
            tVar.e(enumC0081m);
        }
        super.onSaveInstanceState(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it = this.f859k.iterator();
        while (it.hasNext()) {
            ((F.a) it.next()).a(Integer.valueOf(i2));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f863o.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0062a.G()) {
                AbstractC0062a.e("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            p pVar = (p) this.f856g.a();
            synchronized (pVar.f867a) {
                try {
                    pVar.f868b = true;
                    Iterator it = pVar.f869c.iterator();
                    while (it.hasNext()) {
                        ((w0.a) it.next()).a();
                    }
                    pVar.f869c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        View decorView = getWindow().getDecorView();
        x0.g.d("window.decorView", decorView);
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        x0.g.d("window.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        x0.g.d("window.decorView", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        x0.g.d("window.decorView", decorView4);
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        x0.g.d("window.decorView", decorView5);
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        x0.g.d("window.decorView", decorView6);
        l lVar = this.f855f;
        lVar.getClass();
        if (!lVar.d) {
            lVar.d = true;
            decorView6.getViewTreeObserver().addOnDrawListener(lVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i2) {
        x0.g.e("intent", intent);
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        x0.g.e("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        x0.g.e("intent", intent);
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        x0.g.e("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        x0.g.e("newConfig", configuration);
        this.f864p = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f864p = false;
            Iterator it = this.f861m.iterator();
            while (it.hasNext()) {
                ((F.a) it.next()).a(new v.g(z2));
            }
        } catch (Throwable th) {
            this.f864p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        x0.g.e("newConfig", configuration);
        this.f865q = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f865q = false;
            Iterator it = this.f862n.iterator();
            while (it.hasNext()) {
                ((F.a) it.next()).a(new v.l(z2));
            }
        } catch (Throwable th) {
            this.f865q = false;
            throw th;
        }
    }
}
