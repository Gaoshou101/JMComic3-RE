package Y;

import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.a7m3p9xv.t6qk2z8.app.MainActivity;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f723a;

    public e(MainActivity mainActivity) {
        this.f723a = mainActivity;
    }

    @JavascriptInterface
    public void openSettings() {
        MainActivity mainActivity = this.f723a;
        mainActivity.f1350D = true;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + mainActivity.getPackageName()));
        mainActivity.startActivity(intent);
    }
}
