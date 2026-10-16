package D0;

import E0.k;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final E0.c f61a;

    /* renamed from: b, reason: collision with root package name */
    public final k f62b;

    public i(E0.c cVar, k kVar) {
        this.f61a = cVar;
        this.f62b = kVar;
    }

    @Override // D0.d
    public final Iterator iterator() {
        return new h(this);
    }
}
