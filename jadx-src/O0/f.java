package O0;

import N0.C0056g;
import N0.H;
import N0.K;
import N0.o;
import N0.r;
import N0.s;
import X.i;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.MimeTypeMap;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import org.apache.cordova.CordovaClientCertRequest;
import org.apache.cordova.CordovaHttpAuthHandler;
import org.apache.cordova.engine.SystemWebViewEngine;

/* loaded from: classes.dex */
public final class f extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final SystemWebViewEngine f552a;

    /* renamed from: b, reason: collision with root package name */
    public final i f553b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f554c;
    public final Hashtable d = new Hashtable();

    public f(SystemWebViewEngine systemWebViewEngine) {
        this.f552a = systemWebViewEngine;
        ArrayList arrayList = new ArrayList();
        String strB = systemWebViewEngine.f2565c.b("hostname", "localhost");
        arrayList.add(new F.b("/", new e(this, systemWebViewEngine)));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            F.b bVar = (F.b) it.next();
            arrayList2.add(new W.a(strB, (String) bVar.f77a, (e) bVar.f78b));
        }
        this.f553b = new i(13, arrayList2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.f554c || str.startsWith("about:")) {
            this.f554c = false;
            this.f552a.f2566e.onPageFinishedLoading(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f554c = true;
        C0056g c0056g = this.f552a.d;
        H h = c0056g.f508b;
        synchronized (h) {
            h.f477b.clear();
            h.f(-1);
        }
        c0056g.f509c = -1;
        this.f552a.f2566e.onPageStarted(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        K k2 = this.f552a.h;
        if (k2 != null) {
            CordovaClientCertRequest cordovaClientCertRequest = new CordovaClientCertRequest(clientCertRequest);
            synchronized (k2.f484a) {
                for (o oVar : k2.f484a.values()) {
                    if (oVar != null && oVar.onReceivedClientCertRequest(k2.d, cordovaClientCertRequest)) {
                        this.f552a.f2566e.clearLoadTimeoutTimer();
                        return;
                    }
                }
            }
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        if (this.f554c) {
            SystemWebViewEngine systemWebViewEngine = this.f552a;
            if (i2 == -10) {
                systemWebViewEngine.f2566e.clearLoadTimeoutTimer();
                if (webView.canGoBack()) {
                    webView.goBack();
                    return;
                }
                super.onReceivedError(webView, i2, str, str2);
            }
            systemWebViewEngine.f2566e.onReceivedError(i2, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        Hashtable hashtable = this.d;
        if (hashtable.get(str.concat(str2)) != null) {
            throw new ClassCastException();
        }
        if (hashtable.get(str) != null) {
            throw new ClassCastException();
        }
        if (hashtable.get(str2) != null) {
            throw new ClassCastException();
        }
        if (hashtable.get("") != null) {
            throw new ClassCastException();
        }
        K k2 = this.f552a.h;
        if (k2 != null) {
            CordovaHttpAuthHandler cordovaHttpAuthHandler = new CordovaHttpAuthHandler(httpAuthHandler);
            synchronized (k2.f484a) {
                for (o oVar : k2.f484a.values()) {
                    if (oVar != null && oVar.onReceivedHttpAuthRequest(k2.d, cordovaHttpAuthHandler, str, str2)) {
                        this.f552a.f2566e.clearLoadTimeoutTimer();
                        return;
                    }
                }
            }
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        SystemWebViewEngine systemWebViewEngine = this.f552a;
        try {
            if ((systemWebViewEngine.f2568g.getActivity().getPackageManager().getApplicationInfo(systemWebViewEngine.f2568g.getActivity().getPackageName(), 128).flags & 2) != 0) {
                sslErrorHandler.proceed();
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        SystemWebViewEngine systemWebViewEngine = this.f552a;
        try {
            if (!systemWebViewEngine.h.m(str)) {
                return new WebResourceResponse("text/plain", "UTF-8", null);
            }
            s sVar = systemWebViewEngine.f2569i;
            Uri uri = Uri.parse(str);
            Uri uriE = sVar.e(uri);
            if (uri.equals(uriE)) {
                if (s.c(uri) == 1) {
                    if (uri.getQuery() == null && uri.getFragment() == null) {
                        uri.toString().contains("%");
                    }
                }
                if (!"content".equals(uri.getScheme())) {
                    return null;
                }
            }
            r rVarD = sVar.d(uriE);
            return new WebResourceResponse(rVarD.f526b, "UTF-8", rVarD.f525a);
        } catch (IOException e2) {
            if (!(e2 instanceof FileNotFoundException)) {
                Log.e("SystemWebViewClient", "Error occurred while loading a file (returning a 404).", e2);
            }
            return new WebResourceResponse("text/plain", "UTF-8", null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f552a.f2566e.onNavigationAttempt(str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) throws IOException {
        WebResourceResponse webResourceResponse;
        Uri url = webResourceRequest.getUrl();
        Iterator it = ((ArrayList) this.f553b.f715b).iterator();
        while (true) {
            webResourceResponse = null;
            if (!it.hasNext()) {
                break;
            }
            W.a aVar = (W.a) it.next();
            aVar.getClass();
            boolean zEquals = url.getScheme().equals("http");
            String str = aVar.f704c;
            e eVar = ((!zEquals || aVar.f702a) && (url.getScheme().equals("http") || url.getScheme().equals("https")) && url.getAuthority().equals(aVar.f703b) && url.getPath().startsWith(str)) ? aVar.d : null;
            if (eVar != null) {
                String strReplaceFirst = url.getPath().replaceFirst(str, "");
                SystemWebViewEngine systemWebViewEngine = eVar.f551b;
                f fVar = eVar.f550a;
                fVar.getClass();
                try {
                    K k2 = fVar.f552a.h;
                    if (k2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (o oVar : k2.f484a.values()) {
                            if (oVar != null) {
                                oVar.getPathHandler();
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            if (it2.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    if (strReplaceFirst.isEmpty()) {
                        strReplaceFirst = "index.html";
                    }
                    InputStream inputStreamOpen = systemWebViewEngine.f2563a.getContext().getAssets().open("www/" + strReplaceFirst, 2);
                    String mimeTypeFromExtension = "text/html";
                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(strReplaceFirst);
                    if (fileExtensionFromUrl != null) {
                        if (!strReplaceFirst.endsWith(".js") && !strReplaceFirst.endsWith(".mjs")) {
                            if (strReplaceFirst.endsWith(".wasm")) {
                                mimeTypeFromExtension = "application/wasm";
                            } else {
                                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                            }
                        } else {
                            mimeTypeFromExtension = "application/javascript";
                        }
                    }
                    webResourceResponse = new WebResourceResponse(mimeTypeFromExtension, null, inputStreamOpen);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    Log.e("SystemWebViewClient", e2.getMessage());
                }
                if (webResourceResponse != null) {
                    break;
                }
            }
        }
        return webResourceResponse;
    }
}
