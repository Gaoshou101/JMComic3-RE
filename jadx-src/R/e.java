package R;

import android.os.Bundle;
import androidx.lifecycle.EnumC0081m;
import androidx.lifecycle.t;
import androidx.savedstate.Recreator;
import java.util.Map;
import o.C0321d;
import x0.g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f613a;

    /* renamed from: b, reason: collision with root package name */
    public Object f614b;

    /* renamed from: c, reason: collision with root package name */
    public Object f615c = new d();

    public e(f fVar) {
        this.f614b = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R.f, androidx.lifecycle.r, java.lang.Object] */
    public void a() {
        ?? r02 = this.f614b;
        t tVarD = r02.d();
        if (tVarD.f1311c != EnumC0081m.f1302c) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        tVarD.a(new Recreator(r02));
        d dVar = (d) this.f615c;
        dVar.getClass();
        if (dVar.f608a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        tVarD.a(new androidx.activity.e(2, dVar));
        dVar.f608a = true;
        this.f613a = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.r, java.lang.Object] */
    public void b(Bundle bundle) {
        if (!this.f613a) {
            a();
        }
        t tVarD = this.f614b.d();
        if (tVarD.f1311c.compareTo(EnumC0081m.f1303e) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + tVarD.f1311c).toString());
        }
        d dVar = (d) this.f615c;
        if (!dVar.f608a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f609b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f611e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f609b = true;
    }

    public void c(Bundle bundle) {
        g.e("outBundle", bundle);
        d dVar = (d) this.f615c;
        dVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) dVar.f611e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o.f fVar = (o.f) dVar.d;
        fVar.getClass();
        C0321d c0321d = new C0321d(fVar);
        fVar.d.put(c0321d, Boolean.FALSE);
        while (c0321d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0321d.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
