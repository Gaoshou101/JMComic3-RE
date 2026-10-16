package g;

import G.C0037m;
import G.O;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import f.AbstractC0113a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC0225a;
import k.C0227c;
import m.C0267g;
import m.C0275k;
import m.C0294u;
import m.InterfaceC0282n0;
import m.InterfaceC0284o0;
import m.c1;
import m.h1;
import m.p1;

/* renamed from: g.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0118A extends AbstractC0143o implements l.l, LayoutInflater.Factory2 {

    /* renamed from: h0, reason: collision with root package name */
    public static final p.k f1523h0 = new p.k(0);

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f1524i0 = {R.attr.windowBackground};

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f1525j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public ViewGroup f1526A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f1527B;

    /* renamed from: C, reason: collision with root package name */
    public View f1528C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1529D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1530E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1531F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1532G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f1533H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1534I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1535J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f1536K;

    /* renamed from: L, reason: collision with root package name */
    public C0154z[] f1537L;

    /* renamed from: M, reason: collision with root package name */
    public C0154z f1538M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1539N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f1540O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1541P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f1542Q;

    /* renamed from: R, reason: collision with root package name */
    public Configuration f1543R;

    /* renamed from: S, reason: collision with root package name */
    public final int f1544S;

    /* renamed from: T, reason: collision with root package name */
    public int f1545T;

    /* renamed from: U, reason: collision with root package name */
    public int f1546U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1547V;

    /* renamed from: W, reason: collision with root package name */
    public C0151w f1548W;

    /* renamed from: X, reason: collision with root package name */
    public C0151w f1549X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1550Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1551Z;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1553b0;

    /* renamed from: c0, reason: collision with root package name */
    public Rect f1554c0;
    public Rect d0;

    /* renamed from: e0, reason: collision with root package name */
    public C0121D f1555e0;

    /* renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f1556f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedCallback f1557g0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1558j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f1559k;

    /* renamed from: l, reason: collision with root package name */
    public Window f1560l;

    /* renamed from: m, reason: collision with root package name */
    public WindowCallbackC0150v f1561m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f1562n;

    /* renamed from: o, reason: collision with root package name */
    public C0128K f1563o;

    /* renamed from: p, reason: collision with root package name */
    public k.h f1564p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f1565q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0282n0 f1566r;

    /* renamed from: s, reason: collision with root package name */
    public C0145q f1567s;

    /* renamed from: t, reason: collision with root package name */
    public C0145q f1568t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0225a f1569u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f1570v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f1571w;
    public RunnableC0144p x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1573z;

    /* renamed from: y, reason: collision with root package name */
    public O f1572y = null;

    /* renamed from: a0, reason: collision with root package name */
    public final RunnableC0144p f1552a0 = new RunnableC0144p(this, 0);

    public LayoutInflaterFactory2C0118A(Context context, Window window, InterfaceC0138j interfaceC0138j, Object obj) {
        AbstractActivityC0137i abstractActivityC0137i = null;
        this.f1544S = -100;
        this.f1559k = context;
        this.f1558j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC0137i)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC0137i = (AbstractActivityC0137i) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC0137i != null) {
                this.f1544S = ((LayoutInflaterFactory2C0118A) abstractActivityC0137i.g()).f1544S;
            }
        }
        if (this.f1544S == -100) {
            p.k kVar = f1523h0;
            Integer num = (Integer) kVar.get(this.f1558j.getClass().getName());
            if (num != null) {
                this.f1544S = num.intValue();
                kVar.remove(this.f1558j.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C0294u.c();
    }

    public static C.f o(Context context) {
        C.f fVar;
        C.f fVarB;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 || (fVar = AbstractC0143o.f1670c) == null) {
            return null;
        }
        C.f fVarY = y(context.getApplicationContext().getResources().getConfiguration());
        C.h hVar = fVar.f8a;
        int i3 = 0;
        if (i2 < 24) {
            fVarB = hVar.isEmpty() ? C.f.f7b : C.f.b(AbstractC0147s.b(hVar.get(0)));
        } else if (hVar.isEmpty()) {
            fVarB = C.f.f7b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i3 < fVarY.f8a.size() + hVar.size()) {
                Locale locale = i3 < hVar.size() ? hVar.get(i3) : fVarY.f8a.get(i3 - hVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i3++;
            }
            fVarB = C.f.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return fVarB.f8a.isEmpty() ? fVarY : fVarB;
    }

    public static Configuration s(Context context, int i2, C.f fVar, Configuration configuration, boolean z2) {
        int i3 = i2 != 1 ? i2 != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (fVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0148t.d(configuration2, fVar);
            } else {
                C.h hVar = fVar.f8a;
                configuration2.setLocale(hVar.get(0));
                configuration2.setLayoutDirection(hVar.get(0));
            }
        }
        return configuration2;
    }

    public static C.f y(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC0148t.b(configuration) : C.f.b(AbstractC0147s.b(configuration.locale));
    }

    public final void A() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v();
        if (this.f1531F && this.f1563o == null) {
            Object obj = this.f1558j;
            if (obj instanceof Activity) {
                this.f1563o = new C0128K((Activity) obj, this.f1532G);
            } else if (obj instanceof Dialog) {
                this.f1563o = new C0128K((Dialog) obj);
            }
            C0128K c0128k = this.f1563o;
            if (c0128k != null) {
                c0128k.N(this.f1553b0);
            }
        }
    }

    public final void B(int i2) {
        this.f1551Z = (1 << i2) | this.f1551Z;
        if (this.f1550Y) {
            return;
        }
        View decorView = this.f1560l.getDecorView();
        RunnableC0144p runnableC0144p = this.f1552a0;
        WeakHashMap weakHashMap = G.K.f146a;
        decorView.postOnAnimation(runnableC0144p);
        this.f1550Y = true;
    }

    public final int C(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return x(context).e();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f1549X == null) {
                    this.f1549X = new C0151w(this, context);
                }
                return this.f1549X.e();
            }
        }
        return i2;
    }

    public final boolean D() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        InterfaceC0284o0 interfaceC0284o0;
        c1 c1Var;
        boolean z2 = this.f1539N;
        this.f1539N = false;
        C0154z c0154zZ = z(0);
        if (c0154zZ.f1699m) {
            if (!z2) {
                r(c0154zZ, true);
            }
            return true;
        }
        AbstractC0225a abstractC0225a = this.f1569u;
        if (abstractC0225a != null) {
            abstractC0225a.a();
            return true;
        }
        A();
        C0128K c0128k = this.f1563o;
        if (c0128k == null || (interfaceC0284o0 = c0128k.f1611q) == null || (c1Var = ((h1) interfaceC0284o0).f2354a.f1000L) == null || c1Var.f2337b == null) {
            return false;
        }
        c1 c1Var2 = ((h1) interfaceC0284o0).f2354a.f1000L;
        l.p pVar = c1Var2 == null ? null : c1Var2.f2337b;
        if (pVar != null) {
            pVar.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0173, code lost:
    
        if (r3.f2104f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(g.C0154z r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0118A.E(g.z, android.view.KeyEvent):void");
    }

    public final boolean F(C0154z c0154z, int i2, KeyEvent keyEvent) {
        l.n nVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0154z.f1697k || G(c0154z, keyEvent)) && (nVar = c0154z.h) != null) {
            return nVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    public final boolean G(C0154z c0154z, KeyEvent keyEvent) {
        InterfaceC0282n0 interfaceC0282n0;
        InterfaceC0282n0 interfaceC0282n02;
        Resources.Theme themeNewTheme;
        InterfaceC0282n0 interfaceC0282n03;
        InterfaceC0282n0 interfaceC0282n04;
        if (this.f1542Q) {
            return false;
        }
        if (c0154z.f1697k) {
            return true;
        }
        C0154z c0154z2 = this.f1538M;
        if (c0154z2 != null && c0154z2 != c0154z) {
            r(c0154z2, false);
        }
        Window.Callback callback = this.f1560l.getCallback();
        int i2 = c0154z.f1689a;
        if (callback != null) {
            c0154z.f1694g = callback.onCreatePanelView(i2);
        }
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (interfaceC0282n04 = this.f1566r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0282n04;
            actionBarOverlayLayout.k();
            ((h1) actionBarOverlayLayout.f946e).f2363l = true;
        }
        if (c0154z.f1694g == null) {
            l.n nVar = c0154z.h;
            if (nVar == null || c0154z.f1701o) {
                if (nVar == null) {
                    Context context = this.f1559k;
                    if ((i2 == 0 || i2 == 108) && this.f1566r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.a7m3p9xv.t6qk2z8.app.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.a7m3p9xv.t6qk2z8.app.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.a7m3p9xv.t6qk2z8.app.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            C0227c c0227c = new C0227c(context, 0);
                            c0227c.getTheme().setTo(themeNewTheme);
                            context = c0227c;
                        }
                    }
                    l.n nVar2 = new l.n(context);
                    nVar2.f2114e = this;
                    l.n nVar3 = c0154z.h;
                    if (nVar2 != nVar3) {
                        if (nVar3 != null) {
                            nVar3.r(c0154z.f1695i);
                        }
                        c0154z.h = nVar2;
                        l.j jVar = c0154z.f1695i;
                        if (jVar != null) {
                            nVar2.b(jVar, nVar2.f2111a);
                        }
                    }
                    if (c0154z.h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0282n02 = this.f1566r) != null) {
                    if (this.f1567s == null) {
                        this.f1567s = new C0145q(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0282n02).l(c0154z.h, this.f1567s);
                }
                c0154z.h.w();
                if (!callback.onCreatePanelMenu(i2, c0154z.h)) {
                    l.n nVar4 = c0154z.h;
                    if (nVar4 != null) {
                        if (nVar4 != null) {
                            nVar4.r(c0154z.f1695i);
                        }
                        c0154z.h = null;
                    }
                    if (z2 && (interfaceC0282n0 = this.f1566r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0282n0).l(null, this.f1567s);
                    }
                    return false;
                }
                c0154z.f1701o = false;
            }
            c0154z.h.w();
            Bundle bundle = c0154z.f1702p;
            if (bundle != null) {
                c0154z.h.s(bundle);
                c0154z.f1702p = null;
            }
            if (!callback.onPreparePanel(0, c0154z.f1694g, c0154z.h)) {
                if (z2 && (interfaceC0282n03 = this.f1566r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0282n03).l(null, this.f1567s);
                }
                c0154z.h.v();
                return false;
            }
            c0154z.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c0154z.h.v();
        }
        c0154z.f1697k = true;
        c0154z.f1698l = false;
        this.f1538M = c0154z;
        return true;
    }

    public final void H() {
        if (this.f1573z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f1556f0 != null && (z(0).f1699m || this.f1569u != null)) {
                z2 = true;
            }
            if (z2 && this.f1557g0 == null) {
                this.f1557g0 = AbstractC0149u.b(this.f1556f0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f1557g0) == null) {
                    return;
                }
                AbstractC0149u.c(this.f1556f0, onBackInvokedCallback);
                this.f1557g0 = null;
            }
        }
    }

    @Override // g.AbstractC0143o
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1559k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0118A) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.AbstractC0143o
    public final void c() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strD;
        this.f1540O = true;
        m(false, true);
        w();
        Object obj = this.f1558j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strD = v.d.d(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                strD = null;
            }
            if (strD != null) {
                C0128K c0128k = this.f1563o;
                if (c0128k == null) {
                    this.f1553b0 = true;
                } else {
                    c0128k.N(true);
                }
            }
            synchronized (AbstractC0143o.h) {
                AbstractC0143o.e(this);
                AbstractC0143o.f1673g.add(new WeakReference(this));
            }
        }
        this.f1543R = new Configuration(this.f1559k.getResources().getConfiguration());
        this.f1541P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // g.AbstractC0143o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1558j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = g.AbstractC0143o.h
            monitor-enter(r0)
            g.AbstractC0143o.e(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f1550Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f1560l
            android.view.View r0 = r0.getDecorView()
            g.p r1 = r3.f1552a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f1542Q = r0
            int r0 = r3.f1544S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f1558j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            p.k r0 = g.LayoutInflaterFactory2C0118A.f1523h0
            java.lang.Object r1 = r3.f1558j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f1544S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            p.k r0 = g.LayoutInflaterFactory2C0118A.f1523h0
            java.lang.Object r1 = r3.f1558j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            g.w r0 = r3.f1548W
            if (r0 == 0) goto L63
            r0.c()
        L63:
            g.w r0 = r3.f1549X
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0118A.d():void");
    }

    @Override // g.AbstractC0143o
    public final boolean f(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.f1535J && i2 == 108) {
            return false;
        }
        if (this.f1531F && i2 == 1) {
            this.f1531F = false;
        }
        if (i2 == 1) {
            H();
            this.f1535J = true;
            return true;
        }
        if (i2 == 2) {
            H();
            this.f1529D = true;
            return true;
        }
        if (i2 == 5) {
            H();
            this.f1530E = true;
            return true;
        }
        if (i2 == 10) {
            H();
            this.f1533H = true;
            return true;
        }
        if (i2 == 108) {
            H();
            this.f1531F = true;
            return true;
        }
        if (i2 != 109) {
            return this.f1560l.requestFeature(i2);
        }
        H();
        this.f1532G = true;
        return true;
    }

    @Override // g.AbstractC0143o
    public final void g(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f1526A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1559k).inflate(i2, viewGroup);
        this.f1561m.a(this.f1560l.getCallback());
    }

    @Override // g.AbstractC0143o
    public final void h(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f1526A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1561m.a(this.f1560l.getCallback());
    }

    @Override // g.AbstractC0143o
    public final void i(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f1526A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1561m.a(this.f1560l.getCallback());
    }

    @Override // l.l
    public final boolean j(l.n nVar, MenuItem menuItem) {
        C0154z c0154z;
        Window.Callback callback = this.f1560l.getCallback();
        if (callback != null && !this.f1542Q) {
            l.n nVarK = nVar.k();
            C0154z[] c0154zArr = this.f1537L;
            int length = c0154zArr != null ? c0154zArr.length : 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    c0154z = c0154zArr[i2];
                    if (c0154z != null && c0154z.h == nVarK) {
                        break;
                    }
                    i2++;
                } else {
                    c0154z = null;
                    break;
                }
            }
            if (c0154z != null) {
                return callback.onMenuItemSelected(c0154z.f1689a, menuItem);
            }
        }
        return false;
    }

    @Override // g.AbstractC0143o
    public final void k(CharSequence charSequence) {
        this.f1565q = charSequence;
        InterfaceC0282n0 interfaceC0282n0 = this.f1566r;
        if (interfaceC0282n0 != null) {
            interfaceC0282n0.setWindowTitle(charSequence);
            return;
        }
        C0128K c0128k = this.f1563o;
        if (c0128k == null) {
            TextView textView = this.f1527B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        h1 h1Var = (h1) c0128k.f1611q;
        if (h1Var.f2359g) {
            return;
        }
        h1Var.h = charSequence;
        if ((h1Var.f2355b & 8) != 0) {
            Toolbar toolbar = h1Var.f2354a;
            toolbar.setTitle(charSequence);
            if (h1Var.f2359g) {
                G.K.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // l.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(l.n r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0118A.l(l.n):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(boolean r17, boolean r18) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0118A.m(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.f1560l
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof g.WindowCallbackC0150v
            if (r2 != 0) goto L7a
            g.v r1 = new g.v
            r1.<init>(r7, r0)
            r7.f1561m = r1
            r8.setCallback(r1)
            int[] r0 = g.LayoutInflaterFactory2C0118A.f1524i0
            android.content.Context r1 = r7.f1559k
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            m.u r4 = m.C0294u.a()
            monitor-enter(r4)
            m.Q0 r5 = r4.f2462a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r1 = r5.g(r1, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            r1 = r2
        L40:
            if (r1 == 0) goto L45
            r8.setBackgroundDrawable(r1)
        L45:
            r0.recycle()
            r7.f1560l = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f1556f0
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.f1557g0
            if (r0 == 0) goto L5f
            g.AbstractC0149u.c(r8, r0)
            r7.f1557g0 = r2
        L5f:
            java.lang.Object r8 = r7.f1558j
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = g.AbstractC0149u.a(r8)
            r7.f1556f0 = r8
            goto L76
        L74:
            r7.f1556f0 = r2
        L76:
            r7.I()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0118A.n(android.view.Window):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r18, java.lang.String r19, android.content.Context r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0118A.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(int i2, C0154z c0154z, l.n nVar) {
        if (nVar == null) {
            if (c0154z == null && i2 >= 0) {
                C0154z[] c0154zArr = this.f1537L;
                if (i2 < c0154zArr.length) {
                    c0154z = c0154zArr[i2];
                }
            }
            if (c0154z != null) {
                nVar = c0154z.h;
            }
        }
        if ((c0154z == null || c0154z.f1699m) && !this.f1542Q) {
            WindowCallbackC0150v windowCallbackC0150v = this.f1561m;
            Window.Callback callback = this.f1560l.getCallback();
            windowCallbackC0150v.getClass();
            try {
                windowCallbackC0150v.d = true;
                callback.onPanelClosed(i2, nVar);
            } finally {
                windowCallbackC0150v.d = false;
            }
        }
    }

    public final void q(l.n nVar) {
        C0275k c0275k;
        if (this.f1536K) {
            return;
        }
        this.f1536K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1566r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((h1) actionBarOverlayLayout.f946e).f2354a.f1006a;
        if (actionMenuView != null && (c0275k = actionMenuView.f970t) != null) {
            c0275k.f();
            C0267g c0267g = c0275k.f2388t;
            if (c0267g != null && c0267g.b()) {
                c0267g.f2178i.dismiss();
            }
        }
        Window.Callback callback = this.f1560l.getCallback();
        if (callback != null && !this.f1542Q) {
            callback.onPanelClosed(108, nVar);
        }
        this.f1536K = false;
    }

    public final void r(C0154z c0154z, boolean z2) {
        C0153y c0153y;
        InterfaceC0282n0 interfaceC0282n0;
        C0275k c0275k;
        if (z2 && c0154z.f1689a == 0 && (interfaceC0282n0 = this.f1566r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0282n0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((h1) actionBarOverlayLayout.f946e).f2354a.f1006a;
            if (actionMenuView != null && (c0275k = actionMenuView.f970t) != null && c0275k.j()) {
                q(c0154z.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f1559k.getSystemService("window");
        if (windowManager != null && c0154z.f1699m && (c0153y = c0154z.f1692e) != null) {
            windowManager.removeView(c0153y);
            if (z2) {
                p(c0154z.f1689a, c0154z, null);
            }
        }
        c0154z.f1697k = false;
        c0154z.f1698l = false;
        c0154z.f1699m = false;
        c0154z.f1693f = null;
        c0154z.f1700n = true;
        if (this.f1538M == c0154z) {
            this.f1538M = null;
        }
        if (c0154z.f1689a == 0) {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.LayoutInflaterFactory2C0118A.t(android.view.KeyEvent):boolean");
    }

    public final void u(int i2) {
        C0154z c0154zZ = z(i2);
        if (c0154zZ.h != null) {
            Bundle bundle = new Bundle();
            c0154zZ.h.t(bundle);
            if (bundle.size() > 0) {
                c0154zZ.f1702p = bundle;
            }
            c0154zZ.h.w();
            c0154zZ.h.clear();
        }
        c0154zZ.f1701o = true;
        c0154zZ.f1700n = true;
        if ((i2 == 108 || i2 == 0) && this.f1566r != null) {
            C0154z c0154zZ2 = z(0);
            c0154zZ2.f1697k = false;
            G(c0154zZ2, null);
        }
    }

    public final void v() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        int i2 = 1;
        int i3 = 0;
        if (this.f1573z) {
            return;
        }
        int[] iArr = AbstractC0113a.f1504j;
        Context context = this.f1559k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            f(10);
        }
        this.f1534I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        w();
        this.f1560l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f1535J) {
            viewGroup = this.f1533H ? (ViewGroup) layoutInflaterFrom.inflate(com.a7m3p9xv.t6qk2z8.app.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.a7m3p9xv.t6qk2z8.app.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f1534I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.a7m3p9xv.t6qk2z8.app.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f1532G = false;
            this.f1531F = false;
        } else if (this.f1531F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.a7m3p9xv.t6qk2z8.app.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0227c(context, typedValue.resourceId) : context).inflate(com.a7m3p9xv.t6qk2z8.app.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0282n0 interfaceC0282n0 = (InterfaceC0282n0) viewGroup.findViewById(com.a7m3p9xv.t6qk2z8.app.R.id.decor_content_parent);
            this.f1566r = interfaceC0282n0;
            interfaceC0282n0.setWindowCallback(this.f1560l.getCallback());
            if (this.f1532G) {
                ((ActionBarOverlayLayout) this.f1566r).j(109);
            }
            if (this.f1529D) {
                ((ActionBarOverlayLayout) this.f1566r).j(2);
            }
            if (this.f1530E) {
                ((ActionBarOverlayLayout) this.f1566r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1531F + ", windowActionBarOverlay: " + this.f1532G + ", android:windowIsFloating: " + this.f1534I + ", windowActionModeOverlay: " + this.f1533H + ", windowNoTitle: " + this.f1535J + " }");
        }
        C0145q c0145q = new C0145q(this, i3);
        WeakHashMap weakHashMap = G.K.f146a;
        G.D.i(viewGroup, c0145q);
        if (this.f1566r == null) {
            this.f1527B = (TextView) viewGroup.findViewById(com.a7m3p9xv.t6qk2z8.app.R.id.title);
        }
        boolean z2 = p1.f2438a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.a7m3p9xv.t6qk2z8.app.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1560l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f1560l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0145q(this, i2));
        this.f1526A = viewGroup;
        Object obj = this.f1558j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1565q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0282n0 interfaceC0282n02 = this.f1566r;
            if (interfaceC0282n02 != null) {
                interfaceC0282n02.setWindowTitle(title);
            } else {
                C0128K c0128k = this.f1563o;
                if (c0128k != null) {
                    h1 h1Var = (h1) c0128k.f1611q;
                    if (!h1Var.f2359g) {
                        h1Var.h = title;
                        if ((h1Var.f2355b & 8) != 0) {
                            Toolbar toolbar = h1Var.f2354a;
                            toolbar.setTitle(title);
                            if (h1Var.f2359g) {
                                G.K.i(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f1527B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f1526A.findViewById(R.id.content);
        View decorView = this.f1560l.getDecorView();
        contentFrameLayout2.f985g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f1573z = true;
        C0154z c0154zZ = z(0);
        if (this.f1542Q || c0154zZ.h != null) {
            return;
        }
        B(108);
    }

    public final void w() {
        if (this.f1560l == null) {
            Object obj = this.f1558j;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f1560l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0152x x(Context context) {
        if (this.f1548W == null) {
            if (C0037m.d == null) {
                Context applicationContext = context.getApplicationContext();
                C0037m.d = new C0037m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1548W = new C0151w(this, C0037m.d);
        }
        return this.f1548W;
    }

    public final C0154z z(int i2) {
        C0154z[] c0154zArr = this.f1537L;
        if (c0154zArr == null || c0154zArr.length <= i2) {
            C0154z[] c0154zArr2 = new C0154z[i2 + 1];
            if (c0154zArr != null) {
                System.arraycopy(c0154zArr, 0, c0154zArr2, 0, c0154zArr.length);
            }
            this.f1537L = c0154zArr2;
            c0154zArr = c0154zArr2;
        }
        C0154z c0154z = c0154zArr[i2];
        if (c0154z != null) {
            return c0154z;
        }
        C0154z c0154z2 = new C0154z();
        c0154z2.f1689a = i2;
        c0154z2.f1700n = false;
        c0154zArr[i2] = c0154z2;
        return c0154z2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
