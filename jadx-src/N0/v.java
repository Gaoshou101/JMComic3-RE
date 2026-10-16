package N0;

import android.view.View;
import android.webkit.ValueCallback;

/* loaded from: classes.dex */
public interface v {
    boolean canGoBack();

    void clearCache();

    void clearHistory();

    void destroy();

    void evaluateJavascript(String str, ValueCallback valueCallback);

    C getCookieManager();

    String getUrl();

    View getView();

    boolean goBack();

    void init(t tVar, m mVar, u uVar, s sVar, K k2, H h);

    void loadUrl(String str, boolean z2);

    void setPaused(boolean z2);
}
