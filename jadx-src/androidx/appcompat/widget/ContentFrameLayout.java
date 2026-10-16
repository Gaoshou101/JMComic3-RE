package androidx.appcompat.widget;

import G.O;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import g.C0145q;
import g.LayoutInflaterFactory2C0118A;
import l.n;
import m.C0267g;
import m.C0275k;
import m.InterfaceC0280m0;
import m.InterfaceC0282n0;
import m.h1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f980a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f981b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f982c;
    public TypedValue d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f983e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f984f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f985g;
    public InterfaceC0280m0 h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f985g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f983e == null) {
            this.f983e = new TypedValue();
        }
        return this.f983e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f984f == null) {
            this.f984f = new TypedValue();
        }
        return this.f984f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f982c == null) {
            this.f982c = new TypedValue();
        }
        return this.f982c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f980a == null) {
            this.f980a = new TypedValue();
        }
        return this.f980a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f981b == null) {
            this.f981b = new TypedValue();
        }
        return this.f981b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0280m0 interfaceC0280m0 = this.h;
        if (interfaceC0280m0 != null) {
            interfaceC0280m0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0275k c0275k;
        super.onDetachedFromWindow();
        InterfaceC0280m0 interfaceC0280m0 = this.h;
        if (interfaceC0280m0 != null) {
            LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = ((C0145q) interfaceC0280m0).f1678b;
            InterfaceC0282n0 interfaceC0282n0 = layoutInflaterFactory2C0118A.f1566r;
            if (interfaceC0282n0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0282n0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((h1) actionBarOverlayLayout.f946e).f2354a.f1006a;
                if (actionMenuView != null && (c0275k = actionMenuView.f970t) != null) {
                    c0275k.f();
                    C0267g c0267g = c0275k.f2388t;
                    if (c0267g != null && c0267g.b()) {
                        c0267g.f2178i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0118A.f1571w != null) {
                layoutInflaterFactory2C0118A.f1560l.getDecorView().removeCallbacks(layoutInflaterFactory2C0118A.x);
                if (layoutInflaterFactory2C0118A.f1571w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0118A.f1571w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0118A.f1571w = null;
            }
            O o2 = layoutInflaterFactory2C0118A.f1572y;
            if (o2 != null) {
                o2.b();
            }
            n nVar = layoutInflaterFactory2C0118A.z(0).h;
            if (nVar != null) {
                nVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0280m0 interfaceC0280m0) {
        this.h = interfaceC0280m0;
    }
}
