package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.lang.reflect.InvocationTargetException;

/* renamed from: m.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0297v0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f2465a;

    /* renamed from: b, reason: collision with root package name */
    public int f2466b;

    /* renamed from: c, reason: collision with root package name */
    public int f2467c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2468e;

    /* renamed from: f, reason: collision with root package name */
    public int f2469f;

    /* renamed from: g, reason: collision with root package name */
    public C0293t0 f2470g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2471i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2472j;

    /* renamed from: k, reason: collision with root package name */
    public J.d f2473k;

    /* renamed from: l, reason: collision with root package name */
    public D.b f2474l;

    public C0297v0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2465a = new Rect();
        this.f2466b = 0;
        this.f2467c = 0;
        this.d = 0;
        this.f2468e = 0;
        this.f2471i = z2;
        setCacheColorHint(0);
    }

    public final int a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i2, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i3) {
                return i3;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r17, int r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0297v0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2465a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2474l != null) {
            return;
        }
        super.drawableStateChanged();
        C0293t0 c0293t0 = this.f2470g;
        if (c0293t0 != null) {
            c0293t0.f2459b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2472j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2471i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2471i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2471i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2471i && this.h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2474l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i2 = 5;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2474l == null) {
            D.b bVar = new D.b(i2, this);
            this.f2474l = bVar;
            post(bVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i3 < 30 || !AbstractC0289r0.d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC0289r0.f2447a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0289r0.f2448b.invoke(this, Integer.valueOf(iPointToPosition));
                            AbstractC0289r0.f2449c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f2472j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2469f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        D.b bVar = this.f2474l;
        if (bVar != null) {
            C0297v0 c0297v0 = (C0297v0) bVar.f17c;
            c0297v0.f2474l = null;
            c0297v0.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0293t0 c0293t0 = null;
        if (drawable != null) {
            C0293t0 c0293t02 = new C0293t0();
            Drawable drawable2 = c0293t02.f2458a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0293t02.f2458a = drawable;
            drawable.setCallback(c0293t02);
            c0293t02.f2459b = true;
            c0293t0 = c0293t02;
        }
        this.f2470g = c0293t0;
        super.setSelector(c0293t0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2466b = rect.left;
        this.f2467c = rect.top;
        this.d = rect.right;
        this.f2468e = rect.bottom;
    }
}
