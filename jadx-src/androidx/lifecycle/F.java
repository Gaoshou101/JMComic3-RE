package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import k0.C0233f;

/* loaded from: classes.dex */
public final class F implements R.c {

    /* renamed from: a, reason: collision with root package name */
    public final R.d f1277a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1278b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1279c;
    public final C0233f d;

    public F(R.d dVar, androidx.activity.o oVar) {
        x0.g.e("savedStateRegistry", dVar);
        this.f1277a = dVar;
        this.d = new C0233f(new a0.e(1, oVar));
    }

    @Override // R.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1279c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((G) this.d.a()).f1280c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1278b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((C) entry.getValue()).getClass();
        throw null;
    }
}
