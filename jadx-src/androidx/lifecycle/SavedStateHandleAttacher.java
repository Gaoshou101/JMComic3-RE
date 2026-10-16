package androidx.lifecycle;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements p {

    /* renamed from: b, reason: collision with root package name */
    public final F f1290b;

    public SavedStateHandleAttacher(F f2) {
        this.f1290b = f2;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, EnumC0080l enumC0080l) {
        if (enumC0080l != EnumC0080l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0080l).toString());
        }
        rVar.d().f(this);
        F f2 = this.f1290b;
        if (f2.f1278b) {
            return;
        }
        Bundle bundleC = f2.f1277a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = f2.f1279c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleC != null) {
            bundle.putAll(bundleC);
        }
        f2.f1279c = bundle;
        f2.f1278b = true;
    }
}
