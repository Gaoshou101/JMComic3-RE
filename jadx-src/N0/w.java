package N0;

import org.apache.cordova.CordovaWebViewImpl;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f531c;
    public final /* synthetic */ D.a d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CordovaWebViewImpl f532e;

    public w(CordovaWebViewImpl cordovaWebViewImpl, int i2, int i3, D.a aVar) {
        this.f532e = cordovaWebViewImpl;
        this.f530b = i2;
        this.f531c = i3;
        this.d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (this) {
                wait(this.f530b);
            }
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        CordovaWebViewImpl cordovaWebViewImpl = this.f532e;
        if (cordovaWebViewImpl.d != this.f531c || cordovaWebViewImpl.f2535c.getActivity() == null) {
            this.f532e.f2535c.getActivity();
        } else {
            this.f532e.f2535c.getActivity().runOnUiThread(this.d);
        }
    }
}
