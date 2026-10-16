package l;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0244f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f2070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f2071c;
    public final /* synthetic */ n d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X.i f2072e;

    public RunnableC0244f(X.i iVar, g gVar, p pVar, n nVar) {
        this.f2072e = iVar;
        this.f2070b = gVar;
        this.f2071c = pVar;
        this.d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f2070b;
        if (gVar != null) {
            X.i iVar = this.f2072e;
            ((h) iVar.f715b).f2097z = true;
            gVar.f2074b.c(false);
            ((h) iVar.f715b).f2097z = false;
        }
        p pVar = this.f2071c;
        if (pVar.isEnabled() && pVar.hasSubMenu()) {
            this.d.q(pVar, null, 4);
        }
    }
}
