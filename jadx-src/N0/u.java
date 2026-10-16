package N0;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public interface u {
    void clearLoadTimeoutTimer();

    Boolean onDispatchKeyEvent(KeyEvent keyEvent);

    boolean onNavigationAttempt(String str);

    void onPageFinishedLoading(String str);

    void onPageStarted(String str);

    void onReceivedError(int i2, String str, String str2);
}
