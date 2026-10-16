package l;

import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class q implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public X.i f2161a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f2162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f2163c;

    public q(u uVar, ActionProvider actionProvider) {
        this.f2163c = uVar;
        this.f2162b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        X.i iVar = this.f2161a;
        if (iVar != null) {
            n nVar = ((p) iVar.f715b).f2149n;
            nVar.h = true;
            nVar.p(true);
        }
    }
}
