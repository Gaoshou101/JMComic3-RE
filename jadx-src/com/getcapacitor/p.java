package com.getcapacitor;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.core.content.FileProvider;
import c.C0085a;
import c.C0091g;
import c.InterfaceC0086b;
import com.a7m3p9xv.t6qk2z8.app.MainActivity;
import f0.AbstractC0116c;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w.C0341a;

/* loaded from: classes.dex */
public class p extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final C0091g f1450a;

    /* renamed from: b, reason: collision with root package name */
    public final C0091g f1451b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0110o f1452c;
    public InterfaceC0109n d;

    /* renamed from: e, reason: collision with root package name */
    public final C0101f f1453e;

    public p(C0101f c0101f) {
        this.f1453e = c0101f;
        final int i2 = 0;
        this.f1450a = c0101f.e(new androidx.fragment.app.m(1), new InterfaceC0086b(this) { // from class: com.getcapacitor.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f1440b;

            {
                this.f1440b = this;
            }

            @Override // c.InterfaceC0086b
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        Map map = (Map) obj;
                        p pVar = this.f1440b;
                        if (pVar.f1452c != null) {
                            Iterator it = map.entrySet().iterator();
                            boolean z2 = true;
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    z2 = false;
                                }
                            }
                            pVar.f1452c.a(Boolean.valueOf(z2));
                            break;
                        }
                        break;
                    default:
                        C0085a c0085a = (C0085a) obj;
                        InterfaceC0109n interfaceC0109n = this.f1440b.d;
                        if (interfaceC0109n != null) {
                            interfaceC0109n.b(c0085a);
                            break;
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        this.f1451b = c0101f.e(new androidx.fragment.app.m(2), new InterfaceC0086b(this) { // from class: com.getcapacitor.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f1440b;

            {
                this.f1440b = this;
            }

            @Override // c.InterfaceC0086b
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        Map map = (Map) obj;
                        p pVar = this.f1440b;
                        if (pVar.f1452c != null) {
                            Iterator it = map.entrySet().iterator();
                            boolean z2 = true;
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    z2 = false;
                                }
                            }
                            pVar.f1452c.a(Boolean.valueOf(z2));
                            break;
                        }
                        break;
                    default:
                        C0085a c0085a = (C0085a) obj;
                        InterfaceC0109n interfaceC0109n = this.f1440b.d;
                        if (interfaceC0109n != null) {
                            interfaceC0109n.b(c0085a);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final Uri a() throws IOException {
        C0101f c0101f = this.f1453e;
        MainActivity mainActivity = c0101f.f1412b;
        File fileCreateTempFile = File.createTempFile(Q.d.a("JPEG_", new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()), "_"), ".jpg", mainActivity.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
        C0341a c0341aC = FileProvider.c(mainActivity, c0101f.f1412b.getPackageName() + ".fileprovider");
        try {
            String canonicalPath = fileCreateTempFile.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c0341aC.f2692b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (C0341a.a(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(c0341aC.f2691a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + fileCreateTempFile);
        }
    }

    public final void b(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent intentCreateIntent = fileChooserParams.createIntent();
        if (fileChooserParams.getMode() == 1) {
            intentCreateIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        if (fileChooserParams.getAcceptTypes().length > 1 || intentCreateIntent.getType().startsWith(".")) {
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            ArrayList arrayList = new ArrayList();
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            for (String str : acceptTypes) {
                if (str.startsWith(".")) {
                    String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(str.substring(1));
                    if (mimeTypeFromExtension != null && !arrayList.contains(mimeTypeFromExtension)) {
                        arrayList.add(mimeTypeFromExtension);
                    }
                } else if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            Object[] array = arrayList.toArray();
            String[] strArr = (String[]) Arrays.copyOf(array, array.length, String[].class);
            intentCreateIntent.putExtra("android.intent.extra.MIME_TYPES", strArr);
            if (intentCreateIntent.getType().startsWith(".")) {
                intentCreateIntent.setType(strArr[0]);
            }
        }
        try {
            this.d = new C0105j(valueCallback, 1);
            this.f1451b.a(intentCreateIntent);
        } catch (ActivityNotFoundException unused) {
            valueCallback.onReceiveValue(null);
        }
    }

    public final void c(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams, boolean z2) {
        boolean z3 = Build.VERSION.SDK_INT >= 24;
        C0091g c0091g = this.f1451b;
        C0101f c0101f = this.f1453e;
        if (z2 && z3) {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            if (intent.resolveActivity(c0101f.f1412b.getPackageManager()) != null) {
                this.d = new C0105j(valueCallback, 0);
                c0091g.a(intent);
                return;
            }
        } else {
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent2.resolveActivity(c0101f.f1412b.getPackageManager()) != null) {
                try {
                    Uri uriA = a();
                    intent2.putExtra("output", uriA);
                    this.d = new C(uriA, 2, valueCallback);
                    c0091g.a(intent2);
                    return;
                } catch (Exception e2) {
                    L.c.o("Unable to create temporary media capture file: " + e2.getMessage());
                }
            }
        }
        String strF = L.c.F("FileChooser");
        if (L.c.E()) {
            Log.w(strF, "Media capture intent could not be launched. Falling back to default file picker.");
        }
        b(valueCallback, fileChooserParams);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strF = L.c.F("Console");
        if (consoleMessage.message() != null) {
            String strMessage = consoleMessage.message();
            if (!strMessage.contains("%cresult %c") && !strMessage.contains("%cnative %c") && !strMessage.equalsIgnoreCase("[object Object]") && !strMessage.equalsIgnoreCase("console.groupEnd")) {
                String str = String.format("File: %s - Line %d - Msg: %s", consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.message());
                String strName = consoleMessage.messageLevel().name();
                if ("ERROR".equalsIgnoreCase(strName)) {
                    L.c.q(strF, str, null);
                } else if ("WARNING".equalsIgnoreCase(strName)) {
                    if (L.c.E()) {
                        Log.w(strF, str);
                    }
                } else if ("TIP".equalsIgnoreCase(strName)) {
                    L.c.l(strF, str);
                } else if (L.c.E()) {
                    Log.i(strF, str);
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        L.c.j("onGeolocationPermissionsShowPrompt: DOING IT HERE FOR ORIGIN: " + str);
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        if (AbstractC0116c.h(this.f1453e.f1412b, strArr)) {
            callback.invoke(str, true, false);
            L.c.j("onGeolocationPermissionsShowPrompt: has required permission");
        } else {
            this.f1452c = new InterfaceC0110o() { // from class: com.getcapacitor.h
                @Override // com.getcapacitor.InterfaceC0110o
                public final void a(Boolean bool) {
                    p pVar = this.f1436a;
                    pVar.getClass();
                    boolean zBooleanValue = bool.booleanValue();
                    GeolocationPermissions.Callback callback2 = callback;
                    String str2 = str;
                    if (zBooleanValue) {
                        callback2.invoke(str2, true, false);
                        return;
                    }
                    String[] strArr2 = {"android.permission.ACCESS_COARSE_LOCATION"};
                    if (Build.VERSION.SDK_INT < 31 || !AbstractC0116c.h(pVar.f1453e.f1412b, strArr2)) {
                        callback2.invoke(str2, false, false);
                    } else {
                        callback2.invoke(str2, true, false);
                    }
                }
            };
            this.f1450a.a(strArr);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (this.f1453e.f1412b.isFinishing()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        builder.setMessage(str2).setPositiveButton("OK", new DialogInterfaceOnClickListenerC0106k(jsResult, 2)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0107l(jsResult, 1));
        builder.create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (this.f1453e.f1412b.isFinishing()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        builder.setMessage(str2).setPositiveButton("OK", new DialogInterfaceOnClickListenerC0106k(jsResult, 0)).setNegativeButton("Cancel", new DialogInterfaceOnClickListenerC0106k(jsResult, 1)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0107l(jsResult, 0));
        builder.create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        if (this.f1453e.f1412b.isFinishing()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        final EditText editText = new EditText(webView.getContext());
        builder.setMessage(str2).setView(editText).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.getcapacitor.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                jsPromptResult.confirm(editText.getText().toString().trim());
            }
        }).setNegativeButton("Cancel", new DialogInterfaceOnClickListenerC0106k(jsPromptResult, 3)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0107l(jsPromptResult, 2));
        builder.create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList(permissionRequest.getResources()).contains("android.webkit.resource.VIDEO_CAPTURE")) {
            arrayList.add("android.permission.CAMERA");
        }
        if (Arrays.asList(permissionRequest.getResources()).contains("android.webkit.resource.AUDIO_CAPTURE")) {
            arrayList.add("android.permission.MODIFY_AUDIO_SETTINGS");
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant(permissionRequest.getResources());
            return;
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f1452c = new I.d(permissionRequest);
        this.f1450a.a(strArr);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, final ValueCallback valueCallback, final WebChromeClient.FileChooserParams fileChooserParams) {
        List listAsList = Arrays.asList(fileChooserParams.getAcceptTypes());
        boolean zIsCaptureEnabled = fileChooserParams.isCaptureEnabled();
        final boolean z2 = false;
        boolean z3 = zIsCaptureEnabled && listAsList.contains("image/*");
        if (zIsCaptureEnabled && listAsList.contains("video/*")) {
            z2 = true;
        }
        if (z3 || z2) {
            C0101f c0101f = this.f1453e;
            if (AbstractC0116c.h(c0101f.f1412b, new String[]{"android.permission.CAMERA"}) || !AbstractC0116c.g(c0101f.f1412b, "android.permission.CAMERA")) {
                c(valueCallback, fileChooserParams, z2);
            } else {
                this.f1452c = new InterfaceC0110o() { // from class: com.getcapacitor.m
                    @Override // com.getcapacitor.InterfaceC0110o
                    public final void a(Boolean bool) {
                        p pVar = this.f1447a;
                        pVar.getClass();
                        boolean zBooleanValue = bool.booleanValue();
                        ValueCallback valueCallback2 = valueCallback;
                        if (zBooleanValue) {
                            pVar.c(valueCallback2, fileChooserParams, z2);
                            return;
                        }
                        String strF = L.c.F("FileChooser");
                        if (L.c.E()) {
                            Log.w(strF, "Camera permission not granted");
                        }
                        valueCallback2.onReceiveValue(null);
                    }
                };
                this.f1450a.a(new String[]{"android.permission.CAMERA"});
            }
        } else {
            b(valueCallback, fileChooserParams);
        }
        return true;
    }
}
