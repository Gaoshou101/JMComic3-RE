package g;

import G.C0037m;
import G.InterfaceC0036l;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.InterfaceC0067c;
import androidx.lifecycle.EnumC0080l;
import androidx.lifecycle.M;
import c.C0091g;
import g.AbstractActivityC0137i;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0227c;
import m.C0294u;
import m.h1;
import m.m1;
import v.InterfaceC0338a;
import w.InterfaceC0342b;
import y.AbstractC0344b;

/* renamed from: g.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0137i extends androidx.activity.o implements InterfaceC0138j, InterfaceC0338a {

    /* renamed from: v, reason: collision with root package name */
    public boolean f1662v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1663w;

    /* renamed from: y, reason: collision with root package name */
    public LayoutInflaterFactory2C0118A f1664y;

    /* renamed from: t, reason: collision with root package name */
    public final X.i f1660t = new X.i(16, new androidx.fragment.app.f(this));

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.t f1661u = new androidx.lifecycle.t(this);
    public boolean x = true;

    public AbstractActivityC0137i() {
        ((R.d) this.d.f615c).e("android:support:lifecycle", new androidx.activity.f(1, this));
        final int i2 = 0;
        this.f858j.add(new F.a(this) { // from class: androidx.fragment.app.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0137i f1186b;

            {
                this.f1186b = this;
            }

            @Override // F.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f1186b.f1660t.I();
                        break;
                    default:
                        this.f1186b.f1660t.I();
                        break;
                }
            }
        });
        final int i3 = 1;
        this.f860l.add(new F.a(this) { // from class: androidx.fragment.app.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0137i f1186b;

            {
                this.f1186b = this;
            }

            @Override // F.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        this.f1186b.f1660t.I();
                        break;
                    default:
                        this.f1186b.f1660t.I();
                        break;
                }
            }
        });
        f(new androidx.activity.g(this, 1));
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h();
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) g();
        layoutInflaterFactory2C0118A.v();
        ((ViewGroup) layoutInflaterFactory2C0118A.f1526A.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0118A.f1561m.a(layoutInflaterFactory2C0118A.f1560l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) g();
        layoutInflaterFactory2C0118A.f1540O = true;
        int i2 = layoutInflaterFactory2C0118A.f1544S;
        if (i2 == -100) {
            i2 = AbstractC0143o.f1669b;
        }
        int iC = layoutInflaterFactory2C0118A.C(context, i2);
        if (AbstractC0143o.b(context) && AbstractC0143o.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC0143o.f1674i) {
                    try {
                        C.f fVar = AbstractC0143o.f1670c;
                        if (fVar == null) {
                            if (AbstractC0143o.d == null) {
                                AbstractC0143o.d = C.f.b(v.d.f(context));
                            }
                            if (!AbstractC0143o.d.f8a.isEmpty()) {
                                AbstractC0143o.f1670c = AbstractC0143o.d;
                            }
                        } else if (!fVar.equals(AbstractC0143o.d)) {
                            C.f fVar2 = AbstractC0143o.f1670c;
                            AbstractC0143o.d = fVar2;
                            v.d.e(context, fVar2.f8a.b());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC0143o.f1672f) {
                AbstractC0143o.f1668a.execute(new Q.i(context, 2));
            }
        }
        C.f fVarO = LayoutInflaterFactory2C0118A.o(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0118A.s(context, iC, fVarO, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof C0227c) {
            try {
                ((C0227c) context).a(LayoutInflaterFactory2C0118A.s(context, iC, fVarO, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (LayoutInflaterFactory2C0118A.f1525j0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f3 = configuration4.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i3 = configuration3.mcc;
                    int i4 = configuration4.mcc;
                    if (i3 != i4) {
                        configuration.mcc = i4;
                    }
                    int i5 = configuration3.mnc;
                    int i6 = configuration4.mnc;
                    if (i5 != i6) {
                        configuration.mnc = i6;
                    }
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 24) {
                        AbstractC0148t.a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i8 = configuration3.touchscreen;
                    int i9 = configuration4.touchscreen;
                    if (i8 != i9) {
                        configuration.touchscreen = i9;
                    }
                    int i10 = configuration3.keyboard;
                    int i11 = configuration4.keyboard;
                    if (i10 != i11) {
                        configuration.keyboard = i11;
                    }
                    int i12 = configuration3.keyboardHidden;
                    int i13 = configuration4.keyboardHidden;
                    if (i12 != i13) {
                        configuration.keyboardHidden = i13;
                    }
                    int i14 = configuration3.navigation;
                    int i15 = configuration4.navigation;
                    if (i14 != i15) {
                        configuration.navigation = i15;
                    }
                    int i16 = configuration3.navigationHidden;
                    int i17 = configuration4.navigationHidden;
                    if (i16 != i17) {
                        configuration.navigationHidden = i17;
                    }
                    int i18 = configuration3.orientation;
                    int i19 = configuration4.orientation;
                    if (i18 != i19) {
                        configuration.orientation = i19;
                    }
                    int i20 = configuration3.screenLayout & 15;
                    int i21 = configuration4.screenLayout & 15;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 192;
                    int i23 = configuration4.screenLayout & 192;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 48;
                    int i25 = configuration4.screenLayout & 48;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 768;
                    int i27 = configuration4.screenLayout & 768;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    if (i7 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode |= configuration4.colorMode & 3;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    int i28 = configuration3.uiMode & 15;
                    int i29 = configuration4.uiMode & 15;
                    if (i28 != i29) {
                        configuration.uiMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 48;
                    int i31 = configuration4.uiMode & 48;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.screenWidthDp;
                    int i33 = configuration4.screenWidthDp;
                    if (i32 != i33) {
                        configuration.screenWidthDp = i33;
                    }
                    int i34 = configuration3.screenHeightDp;
                    int i35 = configuration4.screenHeightDp;
                    if (i34 != i35) {
                        configuration.screenHeightDp = i35;
                    }
                    int i36 = configuration3.smallestScreenWidthDp;
                    int i37 = configuration4.smallestScreenWidthDp;
                    if (i36 != i37) {
                        configuration.smallestScreenWidthDp = i37;
                    }
                    int i38 = configuration3.densityDpi;
                    int i39 = configuration4.densityDpi;
                    if (i38 != i39) {
                        configuration.densityDpi = i39;
                    }
                }
            }
            Configuration configurationS = LayoutInflaterFactory2C0118A.s(context, iC, fVarO, configuration, true);
            C0227c c0227c = new C0227c(context, com.a7m3p9xv.t6qk2z8.app.R.style.Theme_AppCompat_Empty);
            c0227c.a(configurationS);
            try {
                if (context.getTheme() != null) {
                    AbstractC0344b.i(c0227c.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = c0227c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ((LayoutInflaterFactory2C0118A) g()).A();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // v.f, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C0118A) g()).A();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.AbstractActivityC0137i.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) g();
        layoutInflaterFactory2C0118A.v();
        return layoutInflaterFactory2C0118A.f1560l.findViewById(i2);
    }

    public final AbstractC0143o g() {
        if (this.f1664y == null) {
            ExecutorC0141m executorC0141m = AbstractC0143o.f1668a;
            this.f1664y = new LayoutInflaterFactory2C0118A(this, null, this, this);
        }
        return this.f1664y;
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) g();
        if (layoutInflaterFactory2C0118A.f1564p == null) {
            layoutInflaterFactory2C0118A.A();
            C0128K c0128k = layoutInflaterFactory2C0118A.f1563o;
            layoutInflaterFactory2C0118A.f1564p = new k.h(c0128k != null ? c0128k.L() : layoutInflaterFactory2C0118A.f1559k);
        }
        return layoutInflaterFactory2C0118A.f1564p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i2 = m1.f2427a;
        return super.getResources();
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        x0.g.e("<this>", decorView);
        decorView.setTag(com.a7m3p9xv.t6qk2z8.app.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        x0.g.e("<this>", decorView2);
        decorView2.setTag(com.a7m3p9xv.t6qk2z8.app.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        x0.g.e("<this>", decorView3);
        decorView3.setTag(com.a7m3p9xv.t6qk2z8.app.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        x0.g.e("<this>", decorView4);
        decorView4.setTag(com.a7m3p9xv.t6qk2z8.app.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final void i() {
        super.onDestroy();
        androidx.fragment.app.q qVar = ((androidx.fragment.app.f) this.f1660t.f715b).f1189c;
        boolean zIsChangingConfigurations = true;
        qVar.f1208D = true;
        qVar.h(true);
        qVar.e();
        androidx.fragment.app.f fVar = qVar.f1232u;
        boolean z2 = fVar instanceof M;
        androidx.emoji2.text.u uVar = qVar.f1216c;
        if (z2) {
            zIsChangingConfigurations = ((androidx.fragment.app.s) uVar.d).f1246f;
        } else {
            AbstractActivityC0137i abstractActivityC0137i = fVar.f1187a;
            if (abstractActivityC0137i instanceof Activity) {
                zIsChangingConfigurations = true ^ abstractActivityC0137i.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = qVar.f1222k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((androidx.fragment.app.c) it.next()).f1183a.iterator();
                while (it2.hasNext()) {
                    ((androidx.fragment.app.s) uVar.d).c((String) it2.next(), false);
                }
            }
        }
        qVar.d(-1);
        androidx.fragment.app.f fVar2 = qVar.f1232u;
        if (fVar2 instanceof w.c) {
            AbstractActivityC0137i abstractActivityC0137i2 = fVar2.d;
            androidx.fragment.app.i iVar = qVar.f1227p;
            x0.g.e("listener", iVar);
            abstractActivityC0137i2.f859k.remove(iVar);
        }
        androidx.fragment.app.f fVar3 = qVar.f1232u;
        if (fVar3 instanceof InterfaceC0342b) {
            AbstractActivityC0137i abstractActivityC0137i3 = fVar3.d;
            androidx.fragment.app.i iVar2 = qVar.f1226o;
            x0.g.e("listener", iVar2);
            abstractActivityC0137i3.f858j.remove(iVar2);
        }
        androidx.fragment.app.f fVar4 = qVar.f1232u;
        if (fVar4 instanceof v.j) {
            AbstractActivityC0137i abstractActivityC0137i4 = fVar4.d;
            androidx.fragment.app.i iVar3 = qVar.f1228q;
            x0.g.e("listener", iVar3);
            abstractActivityC0137i4.f861m.remove(iVar3);
        }
        androidx.fragment.app.f fVar5 = qVar.f1232u;
        if (fVar5 instanceof v.k) {
            AbstractActivityC0137i abstractActivityC0137i5 = fVar5.d;
            androidx.fragment.app.i iVar4 = qVar.f1229r;
            x0.g.e("listener", iVar4);
            abstractActivityC0137i5.f862n.remove(iVar4);
        }
        androidx.fragment.app.f fVar6 = qVar.f1232u;
        if (fVar6 instanceof InterfaceC0036l) {
            AbstractActivityC0137i abstractActivityC0137i6 = fVar6.d;
            androidx.fragment.app.k kVar = qVar.f1230s;
            x0.g.e("provider", kVar);
            C0037m c0037m = abstractActivityC0137i6.f853c;
            ((CopyOnWriteArrayList) c0037m.f196b).remove(kVar);
            if (((HashMap) c0037m.f197c).remove(kVar) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0037m.f195a).run();
        }
        qVar.f1232u = null;
        qVar.f1233v = null;
        if (qVar.f1218f != null) {
            Iterator it3 = qVar.f1220i.f726b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0067c) it3.next()).cancel();
            }
            qVar.f1218f = null;
        }
        C0091g c0091g = qVar.x;
        if (c0091g != null) {
            c0091g.f1342b.e(c0091g.f1343c);
            C0091g c0091g2 = qVar.f1235y;
            c0091g2.f1342b.e(c0091g2.f1343c);
            C0091g c0091g3 = qVar.f1236z;
            c0091g3.f1342b.e(c0091g3.f1343c);
        }
        this.f1661u.d(EnumC0080l.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) g();
        if (layoutInflaterFactory2C0118A.f1563o != null) {
            layoutInflaterFactory2C0118A.A();
            layoutInflaterFactory2C0118A.f1563o.getClass();
            layoutInflaterFactory2C0118A.B(0);
        }
    }

    public final boolean j(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 6) {
            androidx.fragment.app.q qVar = ((androidx.fragment.app.f) this.f1660t.f715b).f1189c;
            if (qVar.f1231t >= 1) {
                Iterator it = qVar.f1216c.f().iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
        return false;
    }

    public final void k() {
        super.onPostResume();
        this.f1661u.d(EnumC0080l.ON_RESUME);
        androidx.fragment.app.q qVar = ((androidx.fragment.app.f) this.f1660t.f715b).f1189c;
        qVar.f1206B = false;
        qVar.f1207C = false;
        qVar.f1212H.getClass();
        qVar.d(7);
    }

    public final void l() {
        X.i iVar = this.f1660t;
        iVar.I();
        super.onStart();
        this.x = false;
        boolean z2 = this.f1662v;
        androidx.fragment.app.f fVar = (androidx.fragment.app.f) iVar.f715b;
        if (!z2) {
            this.f1662v = true;
            androidx.fragment.app.q qVar = fVar.f1189c;
            qVar.f1206B = false;
            qVar.f1207C = false;
            qVar.f1212H.getClass();
            qVar.d(4);
        }
        fVar.f1189c.h(true);
        this.f1661u.d(EnumC0080l.ON_START);
        androidx.fragment.app.q qVar2 = fVar.f1189c;
        qVar2.f1206B = false;
        qVar2.f1207C = false;
        qVar2.f1212H.getClass();
        qVar2.d(5);
    }

    public final void m() {
        super.onStop();
        this.x = true;
        X.i iVar = this.f1660t;
        Iterator it = ((androidx.fragment.app.f) iVar.f715b).f1189c.f1216c.f().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        androidx.fragment.app.q qVar = ((androidx.fragment.app.f) iVar.f715b).f1189c;
        qVar.f1207C = true;
        qVar.f1212H.getClass();
        qVar.d(4);
        this.f1661u.d(EnumC0080l.ON_STOP);
    }

    @Override // androidx.activity.o, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.f1660t.I();
        super.onActivityResult(i2, i3, intent);
    }

    @Override // androidx.activity.o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) g();
        if (layoutInflaterFactory2C0118A.f1531F && layoutInflaterFactory2C0118A.f1573z) {
            layoutInflaterFactory2C0118A.A();
            C0128K c0128k = layoutInflaterFactory2C0118A.f1563o;
            if (c0128k != null) {
                c0128k.O(c0128k.f1607m.getResources().getBoolean(com.a7m3p9xv.t6qk2z8.app.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0294u c0294uA = C0294u.a();
        Context context = layoutInflaterFactory2C0118A.f1559k;
        synchronized (c0294uA) {
            c0294uA.f2462a.l(context);
        }
        layoutInflaterFactory2C0118A.f1543R = new Configuration(layoutInflaterFactory2C0118A.f1559k.getResources().getConfiguration());
        layoutInflaterFactory2C0118A.m(false, false);
    }

    @Override // androidx.activity.o, v.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1661u.d(EnumC0080l.ON_CREATE);
        androidx.fragment.app.q qVar = ((androidx.fragment.app.f) this.f1660t.f715b).f1189c;
        qVar.f1206B = false;
        qVar.f1207C = false;
        qVar.f1212H.getClass();
        qVar.d(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) ((androidx.fragment.app.f) this.f1660t.f715b).f1189c.f1217e.onCreateView(view, str, context, attributeSet);
        return gVar == null ? super.onCreateView(view, str, context, attributeSet) : gVar;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        i();
        g().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intent intentB;
        if (j(i2, menuItem)) {
            return true;
        }
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) g();
        layoutInflaterFactory2C0118A.A();
        C0128K c0128k = layoutInflaterFactory2C0118A.f1563o;
        if (menuItem.getItemId() == 16908332 && c0128k != null && (((h1) c0128k.f1611q).f2355b & 4) != 0 && (intentB = v.d.b(this)) != null) {
            if (!shouldUpRecreateTask(intentB)) {
                navigateUpTo(intentB);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentB2 = v.d.b(this);
            if (intentB2 == null) {
                intentB2 = v.d.b(this);
            }
            if (intentB2 != null) {
                ComponentName component = intentB2.getComponent();
                if (component == null) {
                    component = intentB2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentC = v.d.c(this, component);
                    while (intentC != null) {
                        arrayList.add(size, intentC);
                        intentC = v.d.c(this, intentC.getComponent());
                    }
                    arrayList.add(intentB2);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e2);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f1663w = false;
        ((androidx.fragment.app.f) this.f1660t.f715b).f1189c.d(5);
        this.f1661u.d(EnumC0080l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0118A) g()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        k();
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) g();
        layoutInflaterFactory2C0118A.A();
        C0128K c0128k = layoutInflaterFactory2C0118A.f1563o;
        if (c0128k != null) {
            c0128k.f1602F = true;
        }
    }

    @Override // androidx.activity.o, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f1660t.I();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        X.i iVar = this.f1660t;
        iVar.I();
        super.onResume();
        this.f1663w = true;
        ((androidx.fragment.app.f) iVar.f715b).f1189c.h(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        l();
        ((LayoutInflaterFactory2C0118A) g()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f1660t.I();
    }

    @Override // android.app.Activity
    public void onStop() {
        m();
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) g();
        layoutInflaterFactory2C0118A.A();
        C0128K c0128k = layoutInflaterFactory2C0118A.f1563o;
        if (c0128k != null) {
            c0128k.f1602F = false;
            k.j jVar = c0128k.f1601E;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        g().k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ((LayoutInflaterFactory2C0118A) g()).A();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i2) {
        h();
        g().g(i2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        super.setTheme(i2);
        ((LayoutInflaterFactory2C0118A) g()).f1545T = i2;
    }

    @Override // androidx.activity.o, android.app.Activity
    public void setContentView(View view) {
        h();
        g().h(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        g().i(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) ((androidx.fragment.app.f) this.f1660t.f715b).f1189c.f1217e.onCreateView(null, str, context, attributeSet);
        return gVar == null ? super.onCreateView(str, context, attributeSet) : gVar;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
