package g;

import G.O;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.AbstractC0225a;
import k.C0227c;

/* renamed from: g.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class WindowCallbackC0150v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f1680a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1681b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1682c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0118A f1683e;

    public WindowCallbackC0150v(LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A, Window.Callback callback) {
        this.f1683e = layoutInflaterFactory2C0118A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f1680a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f1681b = true;
            callback.onContentChanged();
        } finally {
            this.f1681b = false;
        }
    }

    public final boolean b(int i2, Menu menu) {
        return this.f1680a.onMenuOpened(i2, menu);
    }

    public final void c(int i2, Menu menu) {
        this.f1680a.onPanelClosed(i2, menu);
    }

    public final void d(List list, Menu menu, int i2) {
        k.l.a(this.f1680a, list, menu, i2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1680a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f1682c;
        Window.Callback callback = this.f1680a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f1683e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f1680a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            g.A r2 = r6.f1683e
            r2.A()
            g.K r3 = r2.f1563o
            r4 = 0
            if (r3 == 0) goto L3d
            g.J r3 = r3.f1615u
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            l.n r3 = r3.d
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            g.z r0 = r2.f1538M
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.F(r0, r3, r7)
            if (r0 == 0) goto L52
            g.z r7 = r2.f1538M
            if (r7 == 0) goto L3b
            r7.f1698l = r1
            goto L3b
        L52:
            g.z r0 = r2.f1538M
            if (r0 != 0) goto L6a
            g.z r0 = r2.z(r4)
            r2.G(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.F(r0, r3, r7)
            r0.f1697k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            r1 = r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.WindowCallbackC0150v.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1680a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1680a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1680a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f1680a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f1680a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f1680a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f1681b) {
            this.f1680a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0 || (menu instanceof l.n)) {
            return this.f1680a.onCreatePanelMenu(i2, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i2) {
        return this.f1680a.onCreatePanelView(i2);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f1680a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f1680a.onMenuItemSelected(i2, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i2, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(i2, menu);
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = this.f1683e;
        if (i2 == 108) {
            layoutInflaterFactory2C0118A.A();
            C0128K c0128k = layoutInflaterFactory2C0118A.f1563o;
            if (c0128k != null && true != c0128k.x) {
                c0128k.x = true;
                ArrayList arrayList = c0128k.f1618y;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0118A.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.d) {
            this.f1680a.onPanelClosed(i2, menu);
            return;
        }
        c(i2, menu);
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = this.f1683e;
        if (i2 != 108) {
            if (i2 != 0) {
                layoutInflaterFactory2C0118A.getClass();
                return;
            }
            C0154z c0154zZ = layoutInflaterFactory2C0118A.z(i2);
            if (c0154zZ.f1699m) {
                layoutInflaterFactory2C0118A.r(c0154zZ, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0118A.A();
        C0128K c0128k = layoutInflaterFactory2C0118A.f1563o;
        if (c0128k == null || !c0128k.x) {
            return;
        }
        c0128k.x = false;
        ArrayList arrayList = c0128k.f1618y;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        k.m.a(this.f1680a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        l.n nVar = menu instanceof l.n ? (l.n) menu : null;
        if (i2 == 0 && nVar == null) {
            return false;
        }
        if (nVar != null) {
            nVar.x = true;
        }
        boolean zOnPreparePanel = this.f1680a.onPreparePanel(i2, view, menu);
        if (nVar != null) {
            nVar.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        l.n nVar = this.f1683e.z(0).h;
        if (nVar != null) {
            d(list, nVar, i2);
        } else {
            d(list, menu, i2);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.k.a(this.f1680a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1680a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f1680a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        int i3 = 1;
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = this.f1683e;
        layoutInflaterFactory2C0118A.getClass();
        if (i2 != 0) {
            return k.k.b(this.f1680a, callback, i2);
        }
        androidx.emoji2.text.u uVar = new androidx.emoji2.text.u(layoutInflaterFactory2C0118A.f1559k, callback);
        AbstractC0225a abstractC0225a = layoutInflaterFactory2C0118A.f1569u;
        if (abstractC0225a != null) {
            abstractC0225a.a();
        }
        D.c cVar = new D.c(layoutInflaterFactory2C0118A, uVar);
        layoutInflaterFactory2C0118A.A();
        C0128K c0128k = layoutInflaterFactory2C0118A.f1563o;
        if (c0128k != null) {
            C0127J c0127j = c0128k.f1615u;
            if (c0127j != null) {
                c0127j.a();
            }
            c0128k.f1609o.setHideOnContentScrollEnabled(false);
            c0128k.f1612r.e();
            C0127J c0127j2 = new C0127J(c0128k, c0128k.f1612r.getContext(), cVar);
            l.n nVar = c0127j2.d;
            nVar.w();
            try {
                if (((androidx.emoji2.text.u) c0127j2.f1592e.f19b).h(c0127j2, nVar)) {
                    c0128k.f1615u = c0127j2;
                    c0127j2.g();
                    c0128k.f1612r.c(c0127j2);
                    c0128k.K(true);
                } else {
                    c0127j2 = null;
                }
                layoutInflaterFactory2C0118A.f1569u = c0127j2;
            } finally {
                nVar.v();
            }
        }
        if (layoutInflaterFactory2C0118A.f1569u == null) {
            O o2 = layoutInflaterFactory2C0118A.f1572y;
            if (o2 != null) {
                o2.b();
            }
            AbstractC0225a abstractC0225a2 = layoutInflaterFactory2C0118A.f1569u;
            if (abstractC0225a2 != null) {
                abstractC0225a2.a();
            }
            if (layoutInflaterFactory2C0118A.f1570v == null) {
                boolean z2 = layoutInflaterFactory2C0118A.f1534I;
                Context context = layoutInflaterFactory2C0118A.f1559k;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C0227c c0227c = new C0227c(context, 0);
                        c0227c.getTheme().setTo(themeNewTheme);
                        context = c0227c;
                    }
                    layoutInflaterFactory2C0118A.f1570v = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0118A.f1571w = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    layoutInflaterFactory2C0118A.f1571w.setContentView(layoutInflaterFactory2C0118A.f1570v);
                    layoutInflaterFactory2C0118A.f1571w.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0118A.f1570v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0118A.f1571w.setHeight(-2);
                    layoutInflaterFactory2C0118A.x = new RunnableC0144p(layoutInflaterFactory2C0118A, i3);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0118A.f1526A.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0118A.A();
                        C0128K c0128k2 = layoutInflaterFactory2C0118A.f1563o;
                        Context contextL = c0128k2 != null ? c0128k2.L() : null;
                        if (contextL != null) {
                            context = contextL;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C0118A.f1570v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0118A.f1570v != null) {
                O o3 = layoutInflaterFactory2C0118A.f1572y;
                if (o3 != null) {
                    o3.b();
                }
                layoutInflaterFactory2C0118A.f1570v.e();
                Context context2 = layoutInflaterFactory2C0118A.f1570v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0118A.f1570v;
                k.d dVar = new k.d();
                dVar.f1972c = context2;
                dVar.d = actionBarContextView;
                dVar.f1973e = cVar;
                l.n nVar2 = new l.n(actionBarContextView.getContext());
                nVar2.f2120l = 1;
                dVar.h = nVar2;
                nVar2.f2114e = dVar;
                if (((androidx.emoji2.text.u) cVar.f19b).h(dVar, nVar2)) {
                    dVar.g();
                    layoutInflaterFactory2C0118A.f1570v.c(dVar);
                    layoutInflaterFactory2C0118A.f1569u = dVar;
                    if (layoutInflaterFactory2C0118A.f1573z && (viewGroup = layoutInflaterFactory2C0118A.f1526A) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0118A.f1570v.setAlpha(0.0f);
                        O oA = G.K.a(layoutInflaterFactory2C0118A.f1570v);
                        oA.a(1.0f);
                        layoutInflaterFactory2C0118A.f1572y = oA;
                        oA.d(new C0146r(i3, layoutInflaterFactory2C0118A));
                    } else {
                        layoutInflaterFactory2C0118A.f1570v.setAlpha(1.0f);
                        layoutInflaterFactory2C0118A.f1570v.setVisibility(0);
                        if (layoutInflaterFactory2C0118A.f1570v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0118A.f1570v.getParent();
                            WeakHashMap weakHashMap = G.K.f146a;
                            G.B.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0118A.f1571w != null) {
                        layoutInflaterFactory2C0118A.f1560l.getDecorView().post(layoutInflaterFactory2C0118A.x);
                    }
                } else {
                    layoutInflaterFactory2C0118A.f1569u = null;
                }
            }
            layoutInflaterFactory2C0118A.I();
            layoutInflaterFactory2C0118A.f1569u = layoutInflaterFactory2C0118A.f1569u;
        }
        layoutInflaterFactory2C0118A.I();
        AbstractC0225a abstractC0225a3 = layoutInflaterFactory2C0118A.f1569u;
        if (abstractC0225a3 != null) {
            return uVar.c(abstractC0225a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f1680a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
