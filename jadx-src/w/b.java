package W;

import I.d;
import X.i;
import X.l;
import X.m;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f705a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(WebView webView, String str, Set set) {
        if (!l.d.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }

    public static void b(WebView webView, HashSet hashSet, d dVar) {
        if (!l.f718c.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        m.f719a.createWebView(webView).addWebMessageListener("androidBridge", (String[]) hashSet.toArray(new String[0]), new P0.a(new i(0, dVar)));
    }

    public static PackageInfo c() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
