package Y;

import android.os.Message;
import android.webkit.WebView;
import com.a7m3p9xv.t6qk2z8.app.MainActivity;
import com.getcapacitor.C0101f;
import com.getcapacitor.p;

/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MainActivity f722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MainActivity mainActivity, C0101f c0101f) {
        super(c0101f);
        this.f722f = mainActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z2, boolean z3, Message message) {
        WebView webView2 = new WebView(this.f722f);
        webView2.setWebViewClient(new b(this));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
