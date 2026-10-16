package androidx.activity;

import g.AbstractActivityC0137i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0137i f828c;

    public /* synthetic */ d(AbstractActivityC0137i abstractActivityC0137i, int i2) {
        this.f827b = i2;
        this.f828c = abstractActivityC0137i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f827b) {
            case 0:
                this.f828c.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!x0.g.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!x0.g.a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
