package g;

import G.O;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import f.AbstractC0113a;
import g.C0128K;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.InterfaceC0261d;
import m.InterfaceC0284o0;
import m.h1;

/* renamed from: g.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128K extends P0.b implements InterfaceC0261d {

    /* renamed from: K, reason: collision with root package name */
    public static final AccelerateInterpolator f1595K = new AccelerateInterpolator();

    /* renamed from: L, reason: collision with root package name */
    public static final DecelerateInterpolator f1596L = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1597A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1598B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1599C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1600D;

    /* renamed from: E, reason: collision with root package name */
    public k.j f1601E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1602F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1603G;

    /* renamed from: H, reason: collision with root package name */
    public final C0126I f1604H;

    /* renamed from: I, reason: collision with root package name */
    public final C0126I f1605I;

    /* renamed from: J, reason: collision with root package name */
    public final X.i f1606J;

    /* renamed from: m, reason: collision with root package name */
    public Context f1607m;

    /* renamed from: n, reason: collision with root package name */
    public Context f1608n;

    /* renamed from: o, reason: collision with root package name */
    public ActionBarOverlayLayout f1609o;

    /* renamed from: p, reason: collision with root package name */
    public ActionBarContainer f1610p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0284o0 f1611q;

    /* renamed from: r, reason: collision with root package name */
    public ActionBarContextView f1612r;

    /* renamed from: s, reason: collision with root package name */
    public final View f1613s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1614t;

    /* renamed from: u, reason: collision with root package name */
    public C0127J f1615u;

    /* renamed from: v, reason: collision with root package name */
    public C0127J f1616v;

    /* renamed from: w, reason: collision with root package name */
    public D.c f1617w;
    public boolean x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f1618y;

    /* renamed from: z, reason: collision with root package name */
    public int f1619z;

    public C0128K(Activity activity, boolean z2) {
        new ArrayList();
        this.f1618y = new ArrayList();
        this.f1619z = 0;
        this.f1597A = true;
        this.f1600D = true;
        this.f1604H = new C0126I(this, 0);
        this.f1605I = new C0126I(this, 1);
        this.f1606J = new X.i(20, this);
        View decorView = activity.getWindow().getDecorView();
        M(decorView);
        if (z2) {
            return;
        }
        this.f1613s = decorView.findViewById(R.id.content);
    }

    public final void K(boolean z2) {
        O oI;
        O oI2;
        if (z2) {
            if (!this.f1599C) {
                this.f1599C = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1609o;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                P(false);
            }
        } else if (this.f1599C) {
            this.f1599C = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1609o;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            P(false);
        }
        if (!this.f1610p.isLaidOut()) {
            if (z2) {
                ((h1) this.f1611q).f2354a.setVisibility(4);
                this.f1612r.setVisibility(0);
                return;
            } else {
                ((h1) this.f1611q).f2354a.setVisibility(0);
                this.f1612r.setVisibility(8);
                return;
            }
        }
        if (z2) {
            h1 h1Var = (h1) this.f1611q;
            oI = G.K.a(h1Var.f2354a);
            oI.a(0.0f);
            oI.c(100L);
            oI.d(new k.i(h1Var, 4));
            oI2 = this.f1612r.i(0, 200L);
        } else {
            h1 h1Var2 = (h1) this.f1611q;
            O oA = G.K.a(h1Var2.f2354a);
            oA.a(1.0f);
            oA.c(200L);
            oA.d(new k.i(h1Var2, 0));
            oI = this.f1612r.i(8, 100L);
            oI2 = oA;
        }
        k.j jVar = new k.j();
        ArrayList arrayList = jVar.f2017a;
        arrayList.add(oI);
        View view = (View) oI.f154a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) oI2.f154a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(oI2);
        jVar.b();
    }

    public final Context L() {
        if (this.f1608n == null) {
            TypedValue typedValue = new TypedValue();
            this.f1607m.getTheme().resolveAttribute(com.a7m3p9xv.t6qk2z8.app.R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f1608n = new ContextThemeWrapper(this.f1607m, i2);
            } else {
                this.f1608n = this.f1607m;
            }
        }
        return this.f1608n;
    }

    public final void M(View view) {
        InterfaceC0284o0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.a7m3p9xv.t6qk2z8.app.R.id.decor_content_parent);
        this.f1609o = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.a7m3p9xv.t6qk2z8.app.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0284o0) {
            wrapper = (InterfaceC0284o0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f1611q = wrapper;
        this.f1612r = (ActionBarContextView) view.findViewById(com.a7m3p9xv.t6qk2z8.app.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.a7m3p9xv.t6qk2z8.app.R.id.action_bar_container);
        this.f1610p = actionBarContainer;
        InterfaceC0284o0 interfaceC0284o0 = this.f1611q;
        if (interfaceC0284o0 == null || this.f1612r == null || actionBarContainer == null) {
            throw new IllegalStateException(C0128K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((h1) interfaceC0284o0).f2354a.getContext();
        this.f1607m = context;
        if ((((h1) this.f1611q).f2355b & 4) != 0) {
            this.f1614t = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.f1611q.getClass();
        O(context.getResources().getBoolean(com.a7m3p9xv.t6qk2z8.app.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f1607m.obtainStyledAttributes(null, AbstractC0113a.f1497a, com.a7m3p9xv.t6qk2z8.app.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1609o;
            if (!actionBarOverlayLayout2.f948g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f1603G = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1610p;
            WeakHashMap weakHashMap = G.K.f146a;
            G.D.h(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void N(boolean z2) {
        if (this.f1614t) {
            return;
        }
        int i2 = z2 ? 4 : 0;
        h1 h1Var = (h1) this.f1611q;
        int i3 = h1Var.f2355b;
        this.f1614t = true;
        h1Var.a((i2 & 4) | (i3 & (-5)));
    }

    public final void O(boolean z2) {
        if (z2) {
            this.f1610p.setTabContainer(null);
            ((h1) this.f1611q).getClass();
        } else {
            ((h1) this.f1611q).getClass();
            this.f1610p.setTabContainer(null);
        }
        this.f1611q.getClass();
        ((h1) this.f1611q).f2354a.setCollapsible(false);
        this.f1609o.setHasNonEmbeddedTabs(false);
    }

    public final void P(boolean z2) {
        boolean z3 = this.f1599C || !this.f1598B;
        View view = this.f1613s;
        final X.i iVar = this.f1606J;
        if (!z3) {
            if (this.f1600D) {
                this.f1600D = false;
                k.j jVar = this.f1601E;
                if (jVar != null) {
                    jVar.a();
                }
                int i2 = this.f1619z;
                C0126I c0126i = this.f1604H;
                if (i2 != 0 || (!this.f1602F && !z2)) {
                    c0126i.a();
                    return;
                }
                this.f1610p.setAlpha(1.0f);
                this.f1610p.setTransitioning(true);
                k.j jVar2 = new k.j();
                float f2 = -this.f1610p.getHeight();
                if (z2) {
                    this.f1610p.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                O oA = G.K.a(this.f1610p);
                oA.e(f2);
                final View view2 = (View) oA.f154a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(iVar != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: G.M
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((C0128K) this.f151a.f715b).f1610p.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z4 = jVar2.f2020e;
                ArrayList arrayList = jVar2.f2017a;
                if (!z4) {
                    arrayList.add(oA);
                }
                if (this.f1597A && view != null) {
                    O oA2 = G.K.a(view);
                    oA2.e(f2);
                    if (!jVar2.f2020e) {
                        arrayList.add(oA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f1595K;
                boolean z5 = jVar2.f2020e;
                if (!z5) {
                    jVar2.f2019c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f2018b = 250L;
                }
                if (!z5) {
                    jVar2.d = c0126i;
                }
                this.f1601E = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f1600D) {
            return;
        }
        this.f1600D = true;
        k.j jVar3 = this.f1601E;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f1610p.setVisibility(0);
        int i3 = this.f1619z;
        C0126I c0126i2 = this.f1605I;
        if (i3 == 0 && (this.f1602F || z2)) {
            this.f1610p.setTranslationY(0.0f);
            float f3 = -this.f1610p.getHeight();
            if (z2) {
                this.f1610p.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f1610p.setTranslationY(f3);
            k.j jVar4 = new k.j();
            O oA3 = G.K.a(this.f1610p);
            oA3.e(0.0f);
            final View view3 = (View) oA3.f154a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(iVar != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: G.M
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((C0128K) this.f151a.f715b).f1610p.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z6 = jVar4.f2020e;
            ArrayList arrayList2 = jVar4.f2017a;
            if (!z6) {
                arrayList2.add(oA3);
            }
            if (this.f1597A && view != null) {
                view.setTranslationY(f3);
                O oA4 = G.K.a(view);
                oA4.e(0.0f);
                if (!jVar4.f2020e) {
                    arrayList2.add(oA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f1596L;
            boolean z7 = jVar4.f2020e;
            if (!z7) {
                jVar4.f2019c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f2018b = 250L;
            }
            if (!z7) {
                jVar4.d = c0126i2;
            }
            this.f1601E = jVar4;
            jVar4.b();
        } else {
            this.f1610p.setAlpha(1.0f);
            this.f1610p.setTranslationY(0.0f);
            if (this.f1597A && view != null) {
                view.setTranslationY(0.0f);
            }
            c0126i2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1609o;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = G.K.f146a;
            G.B.c(actionBarOverlayLayout);
        }
    }

    public C0128K(Dialog dialog) {
        new ArrayList();
        this.f1618y = new ArrayList();
        this.f1619z = 0;
        this.f1597A = true;
        this.f1600D = true;
        this.f1604H = new C0126I(this, 0);
        this.f1605I = new C0126I(this, 1);
        this.f1606J = new X.i(20, this);
        M(dialog.getWindow().getDecorView());
    }
}
