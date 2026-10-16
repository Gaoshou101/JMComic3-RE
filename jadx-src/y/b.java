package Y;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f721a;

    public b(c cVar) {
        this.f721a = cVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        try {
            this.f721a.f722f.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
            return true;
        } catch (Exception e2) {
            Log.e("VolumeKeyTest", "Failed to open URL: " + string, e2);
            return true;
        }
    }
}
