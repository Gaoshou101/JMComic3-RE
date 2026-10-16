package K0;

import F0.AbstractC0019u;

/* loaded from: classes.dex */
public final /* synthetic */ class i extends x0.b implements w0.a, C0.a {
    public final boolean h;

    public i(j jVar) {
        super(jVar, AbstractC0019u.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.h = false;
    }

    @Override // w0.a
    public final Object a() {
        return this.f2695c.getClass().getSimpleName();
    }

    public final C0.a d() {
        if (!this.h) {
            C0.a aVar = this.f2694b;
            if (aVar != null) {
                return aVar;
            }
            x0.k.f2707a.getClass();
            this.f2694b = this;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return c().equals(iVar.c()) && this.f2696e.equals(iVar.f2696e) && this.f2697f.equals(iVar.f2697f) && x0.g.a(this.f2695c, iVar.f2695c);
        }
        if (obj instanceof i) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f2697f.hashCode() + ((this.f2696e.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        C0.a aVarD = d();
        if (aVarD != this) {
            return aVarD.toString();
        }
        return "property " + this.f2696e + " (Kotlin reflection is not available)";
    }
}
