package Y;

import android.webkit.WebView;
import com.getcapacitor.q;

/* loaded from: classes.dex */
public final class d extends q {
    @Override // com.getcapacitor.q, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        webView.evaluateJavascript("window.__IS_NATIVE_APP__ = true;window.__openNativeSettings = function() { AndroidBridge.openSettings(); };", null);
    }
}
