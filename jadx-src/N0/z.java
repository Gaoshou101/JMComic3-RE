package N0;

import org.apache.cordova.CoreAndroid;

/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoreAndroid f539c;

    public /* synthetic */ z(CoreAndroid coreAndroid, int i2) {
        this.f538b = i2;
        this.f539c = coreAndroid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f538b) {
            case 0:
                this.f539c.webView.getPluginManager().k("spinner", "stop");
                break;
            case 1:
                this.f539c.webView.clearCache();
                break;
            case 2:
                this.f539c.webView.clearHistory();
                break;
            default:
                this.f539c.webView.backHistory();
                break;
        }
    }
}
