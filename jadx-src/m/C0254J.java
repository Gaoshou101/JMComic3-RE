package m;

/* renamed from: m.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254J extends AbstractViewOnTouchListenerC0303y0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f2257j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T f2258k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0254J(T t2, T t3, P p2) {
        super(t3);
        this.f2258k = t2;
        this.f2257j = p2;
    }

    @Override // m.AbstractViewOnTouchListenerC0303y0
    public final l.D b() {
        return this.f2257j;
    }

    @Override // m.AbstractViewOnTouchListenerC0303y0
    public final boolean c() {
        T t2 = this.f2258k;
        if (t2.getInternalPopup().a()) {
            return true;
        }
        t2.f2299f.d(t2.getTextDirection(), t2.getTextAlignment());
        return true;
    }
}
