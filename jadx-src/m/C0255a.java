package m;

import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255a implements G.P {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2318a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f2320c;

    public C0255a(ActionBarContextView actionBarContextView) {
        this.f2320c = actionBarContextView;
    }

    @Override // G.P
    public final void a() {
        if (this.f2318a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f2320c;
        actionBarContextView.f924f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f2319b);
    }

    @Override // G.P
    public final void b() {
        this.f2318a = true;
    }

    @Override // G.P
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f2318a = false;
    }
}
