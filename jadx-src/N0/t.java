package N0;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.webkit.WebChromeClient;
import java.util.Map;

/* loaded from: classes.dex */
public interface t {
    boolean backHistory();

    void clearCache();

    void clearHistory();

    Context getContext();

    K getPluginManager();

    q getPreferences();

    void handleDestroy();

    void handlePause(boolean z2);

    void handleResume(boolean z2);

    void handleStart();

    void handleStop();

    void hideCustomView();

    boolean isButtonPlumbedToJs(int i2);

    void onNewIntent(Intent intent);

    void sendPluginResult(L l2, String str);

    void setButtonPlumbedToJs(int i2, boolean z2);

    void showCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback);

    void showWebPage(String str, boolean z2, boolean z3, Map map);
}
