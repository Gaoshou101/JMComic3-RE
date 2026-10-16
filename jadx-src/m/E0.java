package m;

/* loaded from: classes.dex */
public final class E0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I0 f2221c;

    public /* synthetic */ E0(I0 i02, int i2) {
        this.f2220b = i2;
        this.f2221c = i02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2220b) {
            case 0:
                C0297v0 c0297v0 = this.f2221c.f2237c;
                if (c0297v0 != null) {
                    c0297v0.setListSelectionHidden(true);
                    c0297v0.requestLayout();
                    break;
                }
                break;
            default:
                I0 i02 = this.f2221c;
                C0297v0 c0297v02 = i02.f2237c;
                if (c0297v02 != null && c0297v02.isAttachedToWindow() && i02.f2237c.getCount() > i02.f2237c.getChildCount() && i02.f2237c.getChildCount() <= i02.f2245m) {
                    i02.f2256y.setInputMethodMode(2);
                    i02.f();
                    break;
                }
                break;
        }
    }
}
