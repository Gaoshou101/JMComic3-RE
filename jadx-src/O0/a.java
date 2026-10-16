package O0;

import N0.C0056g;
import android.webkit.JavascriptInterface;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0056g f543a;

    public a(C0056g c0056g) {
        this.f543a = c0056g;
    }

    @JavascriptInterface
    public String exec(int i2, String str, String str2, String str3, String str4) {
        return this.f543a.a(i2, str, str2, str3, str4);
    }

    @JavascriptInterface
    public String retrieveJsMessages(int i2, boolean z2) {
        C0056g c0056g = this.f543a;
        if (c0056g.b(i2)) {
            return c0056g.f508b.d(z2);
        }
        return null;
    }

    @JavascriptInterface
    public void setNativeToJsBridgeMode(int i2, int i3) {
        C0056g c0056g = this.f543a;
        if (c0056g.b(i2)) {
            c0056g.f508b.f(i3);
        }
    }
}
