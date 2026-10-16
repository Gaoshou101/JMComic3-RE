package Q;

import G.C0037m;
import N0.H;
import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaScannerConnection;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import androidx.activity.C;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.a7m3p9xv.t6qk2z8.app.MainActivity;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import com.getcapacitor.C0101f;
import com.getcapacitor.E;
import com.getcapacitor.cordova.MockCordovaWebViewImpl;
import com.getcapacitor.w;
import g.AbstractActivityC0137i;
import g.ExecutorC0141m;
import java.util.Random;
import m.V;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f593c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, int i2, Object obj2) {
        this.f592b = i2;
        this.f593c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        Object obj = this.d;
        Object obj2 = this.f593c;
        switch (this.f592b) {
            case 0:
                ((ProfileInstallerInitializer) obj2).getClass();
                (Build.VERSION.SDK_INT >= 28 ? l.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new i((Context) obj, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 1:
                C0101f c0101f = ((MainActivity) obj2).f1352z;
                if (c0101f == null || (webView = c0101f.f1419k) == null) {
                    return;
                }
                webView.evaluateJavascript("window.dispatchEvent(new CustomEvent('volumeKeyPressed', { detail: { direction: '" + ((String) obj) + "' } }));", null);
                return;
            case 2:
                C0037m c0037m = (C0037m) obj2;
                w wVar = (w) obj;
                FilesystemPlugin filesystemPlugin = (FilesystemPlugin) c0037m.f195a;
                if (filesystemPlugin.legacyImplementation != null) {
                    String str = (String) c0037m.f196b;
                    if ("DOCUMENTS".equals(str) || "EXTERNAL_STORAGE".equals(str)) {
                        MediaScannerConnection.scanFile(filesystemPlugin.getContext(), new String[]{wVar.getString("path")}, null, null);
                    }
                }
                ((E) c0037m.f197c).h(wVar);
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                Exception exc = (Exception) obj;
                ((E) ((C0037m) obj2).f197c).f("Error downloading file: " + exc.getLocalizedMessage(), null, exc);
                return;
            case 4:
                AbstractActivityC0137i abstractActivityC0137i = (AbstractActivityC0137i) obj2;
                int i2 = androidx.activity.o.f851s;
                abstractActivityC0137i.f2687a.a(new androidx.activity.h((C) obj, abstractActivityC0137i));
                return;
            case 5:
                MockCordovaWebViewImpl.CapacitorEvalBridgeMode capacitorEvalBridgeMode = (MockCordovaWebViewImpl.CapacitorEvalBridgeMode) obj2;
                capacitorEvalBridgeMode.getClass();
                String strE = ((H) obj).e();
                if (strE != null) {
                    capacitorEvalBridgeMode.f1403a.evaluateJavascript(strE, null);
                    return;
                }
                return;
            case 6:
                Runnable runnable = (Runnable) obj;
                ExecutorC0141m executorC0141m = (ExecutorC0141m) obj2;
                executorC0141m.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0141m.a();
                }
            default:
                ((V) obj2).b((Typeface) obj);
                return;
        }
    }
}
