package N0;

import org.apache.cordova.CordovaWebViewImpl;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f534c;
    public final /* synthetic */ String d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CordovaWebViewImpl f536f;

    public x(CordovaWebViewImpl cordovaWebViewImpl, int i2, w wVar, String str, boolean z2) {
        this.f536f = cordovaWebViewImpl;
        this.f533b = i2;
        this.f534c = wVar;
        this.d = str;
        this.f535e = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f533b;
        CordovaWebViewImpl cordovaWebViewImpl = this.f536f;
        if (i2 > 0) {
            cordovaWebViewImpl.f2535c.getThreadPool().execute(this.f534c);
        }
        cordovaWebViewImpl.f2534b.loadUrl(this.d, this.f535e);
    }
}
