package m;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: m.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0303y0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f2487a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2488b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2489c;
    public final View d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0301x0 f2490e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0301x0 f2491f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2492g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f2493i = new int[2];

    public AbstractViewOnTouchListenerC0303y0(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2487a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2488b = tapTimeout;
        this.f2489c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0301x0 runnableC0301x0 = this.f2491f;
        View view = this.d;
        if (runnableC0301x0 != null) {
            view.removeCallbacks(runnableC0301x0);
        }
        RunnableC0301x0 runnableC0301x02 = this.f2490e;
        if (runnableC0301x02 != null) {
            view.removeCallbacks(runnableC0301x02);
        }
    }

    public abstract l.D b();

    public abstract boolean c();

    public boolean d() {
        l.D dB = b();
        if (dB == null || !dB.a()) {
            return true;
        }
        dB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.AbstractViewOnTouchListenerC0303y0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2492g = false;
        this.h = -1;
        RunnableC0301x0 runnableC0301x0 = this.f2490e;
        if (runnableC0301x0 != null) {
            this.d.removeCallbacks(runnableC0301x0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
