package g;

import G.InterfaceC0035k;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.EnumC0080l;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC0135g extends Dialog implements DialogInterface, InterfaceC0138j, androidx.lifecycle.r, R.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.t f1654a;

    /* renamed from: b, reason: collision with root package name */
    public final R.e f1655b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.activity.C f1656c;
    public LayoutInflaterFactory2C0118A d;

    /* renamed from: e, reason: collision with root package name */
    public final C0119B f1657e;

    /* renamed from: f, reason: collision with root package name */
    public final C0134f f1658f;

    /* JADX WARN: Type inference failed for: r2v4, types: [g.B] */
    public DialogC0135g(ContextThemeWrapper contextThemeWrapper, int i2) {
        int i3;
        int iJ = j(contextThemeWrapper, i2);
        if (iJ == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i3 = typedValue.resourceId;
        } else {
            i3 = iJ;
        }
        super(contextThemeWrapper, i3);
        this.f1655b = new R.e(this);
        this.f1656c = new androidx.activity.C(new androidx.activity.k(1, this));
        this.f1657e = new InterfaceC0035k() { // from class: g.B
            @Override // G.InterfaceC0035k
            public final boolean b(KeyEvent keyEvent) {
                return this.f1574a.l(keyEvent);
            }
        };
        AbstractC0143o abstractC0143oC = c();
        if (iJ == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iJ = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0118A) abstractC0143oC).f1545T = iJ;
        abstractC0143oC.c();
        this.f1658f = new C0134f(getContext(), this, getWindow());
    }

    public static void b(DialogC0135g dialogC0135g) {
        x0.g.e("this$0", dialogC0135g);
        super.onBackPressed();
    }

    public static int j(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // R.f
    public final R.d a() {
        return (R.d) this.f1655b.f615c;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) c();
        layoutInflaterFactory2C0118A.v();
        ((ViewGroup) layoutInflaterFactory2C0118A.f1526A.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0118A.f1561m.a(layoutInflaterFactory2C0118A.f1560l.getCallback());
    }

    public final AbstractC0143o c() {
        if (this.d == null) {
            ExecutorC0141m executorC0141m = AbstractC0143o.f1668a;
            this.d = new LayoutInflaterFactory2C0118A(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return e();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return P0.b.j(this.f1657e, getWindow().getDecorView(), this, keyEvent);
    }

    public final androidx.lifecycle.t e() {
        androidx.lifecycle.t tVar = this.f1654a;
        if (tVar != null) {
            return tVar;
        }
        androidx.lifecycle.t tVar2 = new androidx.lifecycle.t(this);
        this.f1654a = tVar2;
        return tVar2;
    }

    public final void f() {
        View decorView = getWindow().getDecorView();
        x0.g.e("<this>", decorView);
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        x0.g.e("<this>", decorView2);
        decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView3 = getWindow().getDecorView();
        x0.g.e("<this>", decorView3);
        decorView3.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) c();
        layoutInflaterFactory2C0118A.v();
        return layoutInflaterFactory2C0118A.f1560l.findViewById(i2);
    }

    public final void g(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            x0.g.d("onBackInvokedDispatcher", onBackInvokedDispatcher);
            androidx.activity.C c2 = this.f1656c;
            c2.getClass();
            c2.f814e = onBackInvokedDispatcher;
            c2.d(c2.f816g);
        }
        this.f1655b.b(bundle);
        e().d(EnumC0080l.ON_CREATE);
    }

    public final void h(Bundle bundle) {
        c().a();
        g(bundle);
        c().c();
    }

    public final void i() {
        e().d(EnumC0080l.ON_DESTROY);
        this.f1654a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) c();
        if (layoutInflaterFactory2C0118A.f1563o != null) {
            layoutInflaterFactory2C0118A.A();
            layoutInflaterFactory2C0118A.f1563o.getClass();
            layoutInflaterFactory2C0118A.B(0);
        }
    }

    public final void k(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().k(charSequence);
    }

    public final boolean l(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1656c.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        h(bundle);
        C0134f c0134f = this.f1658f;
        c0134f.f1634b.setContentView(c0134f.f1647q);
        Window window = c0134f.f1635c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupA = C0134f.a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupA2 = C0134f.a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupA3 = C0134f.a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0134f.f1639i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0134f.f1639i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupA2.findViewById(android.R.id.message);
        c0134f.f1643m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0134f.f1639i.removeView(c0134f.f1643m);
            if (c0134f.f1636e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0134f.f1639i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c0134f.f1639i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c0134f.f1636e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupA2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupA3.findViewById(android.R.id.button1);
        c0134f.f1637f = button;
        ViewOnClickListenerC0129a viewOnClickListenerC0129a = c0134f.f1653w;
        button.setOnClickListener(viewOnClickListenerC0129a);
        if (TextUtils.isEmpty(null)) {
            c0134f.f1637f.setVisibility(8);
            i2 = 0;
        } else {
            c0134f.f1637f.setText((CharSequence) null);
            c0134f.f1637f.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) viewGroupA3.findViewById(android.R.id.button2);
        c0134f.f1638g = button2;
        button2.setOnClickListener(viewOnClickListenerC0129a);
        if (TextUtils.isEmpty(null)) {
            c0134f.f1638g.setVisibility(8);
        } else {
            c0134f.f1638g.setText((CharSequence) null);
            c0134f.f1638g.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) viewGroupA3.findViewById(android.R.id.button3);
        c0134f.h = button3;
        button3.setOnClickListener(viewOnClickListenerC0129a);
        if (TextUtils.isEmpty(null)) {
            c0134f.h.setVisibility(8);
        } else {
            c0134f.h.setText((CharSequence) null);
            c0134f.h.setVisibility(0);
            i2 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0134f.f1633a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i2 == 1) {
                Button button4 = c0134f.f1637f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i2 == 2) {
                Button button5 = c0134f.f1638g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i2 == 4) {
                Button button6 = c0134f.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i2 == 0) {
            viewGroupA3.setVisibility(8);
        }
        if (c0134f.f1644n != null) {
            viewGroupA.addView(c0134f.f1644n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0134f.f1641k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0134f.d) || !c0134f.f1651u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0134f.f1641k.setVisibility(8);
                viewGroupA.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0134f.f1642l = textView2;
                textView2.setText(c0134f.d);
                Drawable drawable = c0134f.f1640j;
                if (drawable != null) {
                    c0134f.f1641k.setImageDrawable(drawable);
                } else {
                    c0134f.f1642l.setPadding(c0134f.f1641k.getPaddingLeft(), c0134f.f1641k.getPaddingTop(), c0134f.f1641k.getPaddingRight(), c0134f.f1641k.getPaddingBottom());
                    c0134f.f1641k.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupA == null || viewGroupA.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupA3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupA2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = c0134f.f1639i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c0134f.f1636e != null ? viewGroupA.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupA2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0134f.f1636e;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z3 || i3 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f884a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f885b);
            }
        }
        if (!z2) {
            View view = c0134f.f1636e;
            if (view == null) {
                view = c0134f.f1639i;
            }
            if (view != null) {
                int i4 = (z3 ? 2 : 0) | i3;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = G.K.f146a;
                G.E.b(view, i4, 3);
                if (viewFindViewById11 != null) {
                    viewGroupA2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupA2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0134f.f1636e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0134f.f1645o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i5 = c0134f.f1646p;
        if (i5 > -1) {
            alertController$RecycleListView2.setItemChecked(i5, true);
            alertController$RecycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1658f.f1639i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1658f.f1639i;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        x0.g.d("super.onSaveInstanceState()", bundleOnSaveInstanceState);
        this.f1655b.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        e().d(EnumC0080l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        i();
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) c();
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

    @Override // android.app.Dialog
    public final void setContentView(int i2) {
        f();
        c().g(i2);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i2) {
        super.setTitle(i2);
        c().k(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        f();
        c().h(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        k(charSequence);
        C0134f c0134f = this.f1658f;
        c0134f.d = charSequence;
        TextView textView = c0134f.f1642l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        c().i(view, layoutParams);
    }
}
