package Y;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.a7m3p9xv.t6qk2z8.app.MainActivity;

/* loaded from: classes.dex */
public final class a implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f720a;

    public a(MainActivity mainActivity) {
        this.f720a = mainActivity;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f720a.startActivity(intent);
    }
}
