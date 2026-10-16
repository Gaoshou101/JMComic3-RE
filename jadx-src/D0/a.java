package D0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f54a;

    public a(d dVar) {
        this.f54a = new AtomicReference(dVar);
    }

    @Override // D0.d
    public final Iterator iterator() {
        d dVar = (d) this.f54a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
