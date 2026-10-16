package androidx.fragment.app;

import G.B;
import G.K;
import G.e0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.a7m3p9xv.t6qk2z8.app.R;
import g.AbstractActivityC0137i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1190a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1191b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1192c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, q qVar) {
        super(context, attributeSet);
        x0.g.e("context", context);
        x0.g.e("attrs", attributeSet);
        x0.g.e("fm", qVar);
        this.f1190a = new ArrayList();
        this.f1191b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N.a.f471b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        qVar.j();
        if (classAttribute == null) {
            Iterator it = qVar.f1216c.d().iterator();
            if (it.hasNext()) {
                throw x.a(it);
            }
        } else {
            if (id == -1) {
                throw new IllegalStateException(Q.d.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            context.getClassLoader();
            qVar.f1234w.a(classAttribute);
            x0.g.d("fm.fragmentFactory.insta…ontext.classLoader, name)", null);
            throw null;
        }
    }

    public final void a(View view) {
        if (this.f1191b.contains(view)) {
            this.f1190a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        x0.g.e("child", view);
        view.getTag(R.id.fragment_container_view_tag);
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        e0 e0VarG;
        x0.g.e("insets", windowInsets);
        e0 e0VarG2 = e0.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1192c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            x0.g.d("onApplyWindowInsetsListe…lyWindowInsets(v, insets)", windowInsetsOnApplyWindowInsets);
            e0VarG = e0.g(windowInsetsOnApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = K.f146a;
            WindowInsets windowInsetsF = e0VarG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = B.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    e0VarG2 = e0.g(windowInsetsB, this);
                }
            }
            e0VarG = e0VarG2;
        }
        if (!e0VarG.f186a.m()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                WeakHashMap weakHashMap2 = K.f146a;
                WindowInsets windowInsetsF2 = e0VarG.f();
                if (windowInsetsF2 != null) {
                    WindowInsets windowInsetsA = B.a(childAt, windowInsetsF2);
                    if (!windowInsetsA.equals(windowInsetsF2)) {
                        e0.g(windowInsetsA, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x0.g.e("canvas", canvas);
        if (this.d) {
            Iterator it = this.f1190a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        x0.g.e("canvas", canvas);
        x0.g.e("child", view);
        if (this.d) {
            ArrayList arrayList = this.f1190a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        x0.g.e("view", view);
        this.f1191b.remove(view);
        if (this.f1190a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends d> F getFragment() {
        AbstractActivityC0137i abstractActivityC0137i;
        View view = this;
        while (view != null) {
            view.getTag(R.id.fragment_container_view_tag);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC0137i = null;
                break;
            }
            if (context instanceof AbstractActivityC0137i) {
                abstractActivityC0137i = (AbstractActivityC0137i) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC0137i != null) {
            f fVar = (f) abstractActivityC0137i.f1660t.f715b;
            getId();
            fVar.f1189c.j();
            return null;
        }
        throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        x0.g.e("insets", windowInsets);
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                x0.g.d("view", childAt);
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        x0.g.e("view", view);
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i2) {
        View childAt = getChildAt(i2);
        x0.g.d("view", childAt);
        a(childAt);
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        x0.g.e("view", view);
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            x0.g.d("view", childAt);
            a(childAt);
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            x0.g.d("view", childAt);
            a(childAt);
        }
        super.removeViewsInLayout(i2, i3);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        x0.g.e("listener", onApplyWindowInsetsListener);
        this.f1192c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        x0.g.e("view", view);
        if (view.getParent() == this) {
            this.f1191b.add(view);
        }
        super.startViewTransition(view);
    }
}
