package O0;

import N0.DialogInterfaceOnCancelListenerC0058i;
import N0.DialogInterfaceOnClickListenerC0057h;
import N0.DialogInterfaceOnClickListenerC0060k;
import N0.DialogInterfaceOnKeyListenerC0059j;
import N0.o;
import android.R;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.util.Arrays;
import org.apache.cordova.engine.SystemWebViewEngine;

/* loaded from: classes.dex */
public final class d extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final long f547a = 104857600;

    /* renamed from: b, reason: collision with root package name */
    public final SystemWebViewEngine f548b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f549c;
    public final D.c d;

    public d(SystemWebViewEngine systemWebViewEngine) {
        this.f548b = systemWebViewEngine;
        this.d = new D.c(systemWebViewEngine.f2563a.getContext());
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        if (this.f549c == null) {
            SystemWebViewEngine systemWebViewEngine = this.f548b;
            LinearLayout linearLayout = new LinearLayout(systemWebViewEngine.getView().getContext());
            linearLayout.setOrientation(1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            linearLayout.setLayoutParams(layoutParams);
            View progressBar = new ProgressBar(systemWebViewEngine.getView().getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            progressBar.setLayoutParams(layoutParams2);
            linearLayout.addView(progressBar);
            this.f549c = linearLayout;
        }
        return this.f549c;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j2, long j3, long j4, WebStorage.QuotaUpdater quotaUpdater) {
        quotaUpdater.updateQuota(this.f547a);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        callback.invoke(str, true, false);
        o oVarC = this.f548b.h.c("Geolocation");
        if (oVarC == null || oVarC.hasPermisssion()) {
            return;
        }
        oVarC.requestPermissions(0);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        this.f548b.getCordovaWebView().hideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        b bVar = new b(jsResult, 0);
        D.c cVar = this.d;
        cVar.getClass();
        AlertDialog.Builder builder = new AlertDialog.Builder((Context) cVar.f19b);
        builder.setMessage(str2);
        builder.setTitle("Alert");
        builder.setCancelable(true);
        builder.setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0057h(0, bVar));
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC0058i(0, bVar));
        builder.setOnKeyListener(new DialogInterfaceOnKeyListenerC0059j(0, bVar));
        cVar.f20c = builder.show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        b bVar = new b(jsResult, 1);
        D.c cVar = this.d;
        cVar.getClass();
        AlertDialog.Builder builder = new AlertDialog.Builder((Context) cVar.f19b);
        builder.setMessage(str2);
        builder.setTitle("Confirm");
        builder.setCancelable(true);
        builder.setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0060k(bVar, 0));
        builder.setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0060k(bVar, 1));
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC0058i(1, bVar));
        builder.setOnKeyListener(new DialogInterfaceOnKeyListenerC0059j(1, bVar));
        cVar.f20c = builder.show();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0141 A[PHI: r1
  0x0141: PHI (r1v10 java.lang.String) = (r1v0 java.lang.String), (r1v0 java.lang.String), (r1v12 java.lang.String) binds: [B:47:0x00b3, B:49:0x00bb, B:42:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onJsPrompt(android.webkit.WebView r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, android.webkit.JsPromptResult r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.d.onJsPrompt(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, android.webkit.JsPromptResult):boolean");
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        Arrays.toString(permissionRequest.getResources());
        permissionRequest.grant(permissionRequest.getResources());
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f548b.getCordovaWebView().showCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Boolean bool = Boolean.FALSE;
        if (fileChooserParams.getMode() == 1) {
            bool = Boolean.TRUE;
        }
        Intent intentCreateIntent = fileChooserParams.createIntent();
        intentCreateIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", bool);
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        if (acceptTypes.length > 1) {
            intentCreateIntent.setType("*/*");
            intentCreateIntent.putExtra("android.intent.extra.MIME_TYPES", acceptTypes);
        }
        try {
            this.f548b.f2568g.startActivityForResult(new c(valueCallback), intentCreateIntent, 5173);
        } catch (ActivityNotFoundException unused) {
            valueCallback.onReceiveValue(null);
        }
        return true;
    }
}
