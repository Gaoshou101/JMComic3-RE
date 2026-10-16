package com.getcapacitor;

import a.AbstractC0062a;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.a7m3p9xv.t6qk2z8.app.MainActivity;
import e0.C0112a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m.l1;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public String f1385a;

    /* renamed from: b, reason: collision with root package name */
    public final L f1386b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.emoji2.text.m f1387c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1388e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1389f;

    /* renamed from: g, reason: collision with root package name */
    public final v f1390g;
    public final C0101f h;

    public O(MainActivity mainActivity, C0101f c0101f, v vVar, ArrayList arrayList, boolean z2) {
        L l2 = new L();
        l2.f1377a = null;
        l2.f1378b = -1;
        l2.d = new ArrayList();
        l2.f1379c = null;
        this.f1386b = l2;
        this.f1389f = z2;
        Context applicationContext = mainActivity.getApplicationContext();
        androidx.emoji2.text.m mVar = new androidx.emoji2.text.m();
        mVar.f1123a = applicationContext;
        this.f1387c = mVar;
        this.d = arrayList;
        this.h = c0101f;
        this.f1390g = vVar;
    }

    public static String b(InputStream inputStream, String str) throws IOException {
        String strGuessContentTypeFromName;
        try {
            strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (strGuessContentTypeFromName != null) {
                try {
                    if (str.endsWith(".js") && strGuessContentTypeFromName.equals("image/x-icon")) {
                        L.c.j("We shouldn't be here");
                    }
                } catch (Exception e2) {
                    e = e2;
                    L.c.p("Unable to get mime type" + str, e);
                    return strGuessContentTypeFromName;
                }
            }
            if (strGuessContentTypeFromName != null) {
                return strGuessContentTypeFromName;
            }
            if (!str.endsWith(".js") && !str.endsWith(".mjs")) {
                if (str.endsWith(".wasm")) {
                    return "application/wasm";
                }
                strGuessContentTypeFromName = URLConnection.guessContentTypeFromStream(inputStream);
                return strGuessContentTypeFromName;
            }
            return "application/javascript";
        } catch (Exception e3) {
            e = e3;
            strGuessContentTypeFromName = null;
        }
    }

    public final void a() {
        String str = this.f1385a;
        if (str.indexOf(42) != -1) {
            throw new IllegalArgumentException("assetPath cannot contain the '*' character.");
        }
        M m2 = new M(this, str);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            e("http", m2, str2);
            e("https", m2, str2);
            String str3 = this.h.f1411a.d;
            if (!str3.equals("http") && !str3.equals("https")) {
                e(str3, m2, str2);
            }
        }
    }

    public final WebResourceResponse c(WebResourceRequest webResourceRequest) throws JSONException, IOException {
        String str;
        URL url = new URL(webResourceRequest.getUrl().getQueryParameter("u"));
        w wVar = new w();
        for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
            wVar.e(entry.getKey(), entry.getValue());
        }
        String string = wVar.getString("x-cap-user-agent");
        if (string != null) {
            wVar.e("User-Agent", string);
        }
        wVar.remove("x-cap-user-agent");
        l1 l1Var = new l1();
        l1Var.f2420f = url;
        l1Var.f2419e = webResourceRequest.getMethod();
        l1Var.d = wVar;
        l1Var.b();
        C0112a c0112a = (C0112a) l1Var.f2421g;
        C0101f c0101f = this.h;
        if (!AbstractC0062a.F(c0101f, url).booleanValue()) {
            c0112a.a(c0101f);
        }
        c0112a.f1496a.connect();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HttpURLConnection httpURLConnection = c0112a.f1496a;
        String str2 = null;
        String strTrim = null;
        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = entry2.getValue().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(", ");
            }
            sb.setLength(sb.length() - 2);
            if ("Content-Type".equalsIgnoreCase(entry2.getKey())) {
                String[] strArrSplit = sb.toString().split(";");
                String strTrim2 = strArrSplit[0].trim();
                if (strArrSplit.length > 1) {
                    String[] strArrSplit2 = strArrSplit[1].split("=");
                    if (strArrSplit2.length > 1) {
                        strTrim = strArrSplit2[1].trim();
                    }
                }
                str2 = strTrim2;
            } else {
                linkedHashMap.put(entry2.getKey(), sb.toString());
            }
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            errorStream = httpURLConnection.getInputStream();
        }
        InputStream inputStream = errorStream;
        String strB = str2 == null ? b(inputStream, webResourceRequest.getUrl().getPath()) : str2;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 100) {
            str = "Continue";
        } else if (responseCode == 101) {
            str = "Switching Protocols";
        } else if (responseCode == 400) {
            str = "Bad Request";
        } else if (responseCode != 401) {
            switch (responseCode) {
                case 200:
                    str = "OK";
                    break;
                case 201:
                    str = "Created";
                    break;
                case 202:
                    str = "Accepted";
                    break;
                case 203:
                    str = "Non-Authoritative Information";
                    break;
                case 204:
                    str = "No Content";
                    break;
                case 205:
                    str = "Reset Content";
                    break;
                case 206:
                    str = "Partial Content";
                    break;
                default:
                    switch (responseCode) {
                        case 300:
                            str = "Multiple Choices";
                            break;
                        case 301:
                            str = "Moved Permanently";
                            break;
                        case 302:
                            str = "Found";
                            break;
                        case 303:
                            str = "See Other";
                            break;
                        case 304:
                            str = "Not Modified";
                            break;
                        default:
                            switch (responseCode) {
                                case 403:
                                    str = "Forbidden";
                                    break;
                                case 404:
                                    str = "Not Found";
                                    break;
                                case 405:
                                    str = "Method Not Allowed";
                                    break;
                                case 406:
                                    str = "Not Acceptable";
                                    break;
                                case 407:
                                    str = "Proxy Authentication Required";
                                    break;
                                case 408:
                                    str = "Request Timeout";
                                    break;
                                case 409:
                                    str = "Conflict";
                                    break;
                                case 410:
                                    str = "Gone";
                                    break;
                                default:
                                    switch (responseCode) {
                                        case 500:
                                            str = "Internal Server Error";
                                            break;
                                        case 501:
                                            str = "Not Implemented";
                                            break;
                                        case 502:
                                            str = "Bad Gateway";
                                            break;
                                        case 503:
                                            str = "Service Unavailable";
                                            break;
                                        case 504:
                                            str = "Gateway Timeout";
                                            break;
                                        case 505:
                                            str = "HTTP Version Not Supported";
                                            break;
                                        default:
                                            str = "Unknown";
                                            break;
                                    }
                            }
                    }
            }
        } else {
            str = "Unauthorized";
        }
        return new WebResourceResponse(strB, strTrim, responseCode, str, linkedHashMap, inputStream);
    }

    public final void d(Uri uri, M m2) {
        synchronized (this.f1386b) {
            this.f1386b.a(uri.getScheme(), uri.getAuthority(), uri.getPath(), m2);
        }
    }

    public final void e(String str, M m2, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(str);
        builder.authority(str2);
        builder.path("");
        Uri uriBuild = builder.build();
        d(Uri.withAppendedPath(uriBuild, "/"), m2);
        d(Uri.withAppendedPath(uriBuild, "**"), m2);
    }

    public final WebResourceResponse f(WebResourceRequest webResourceRequest) throws IOException, NumberFormatException {
        M m2;
        int i2;
        InputStream inputStreamC;
        int i3;
        WebResourceResponse webResourceResponse;
        int i4;
        Uri url = webResourceRequest.getUrl();
        if (url.getPath() != null && url.getPath().startsWith("/_capacitor_http_interceptor_")) {
            L.c.j("Handling CapacitorHttp request: " + url);
            try {
                return c(webResourceRequest);
            } catch (Exception e2) {
                L.c.o(e2.getLocalizedMessage());
                return null;
            }
        }
        synchronized (this.f1386b) {
            m2 = (M) this.f1386b.b(webResourceRequest.getUrl());
        }
        if (m2 == null) {
            return null;
        }
        String path = url.getPath();
        if (!path.startsWith("/_capacitor_content_") && !path.startsWith("/_capacitor_file_")) {
            C0101f c0101f = this.h;
            if (c0101f.f1411a.f1460b != null || !url.getHost().equalsIgnoreCase(c0101f.f1411a.f1461c)) {
                C0101f c0101f2 = this.h;
                if ((c0101f2.f1411a.f1460b != null || c0101f2.f1416g.a(url.getHost())) && !url.toString().equals(this.h.a())) {
                    v vVar = this.f1390g;
                    if (vVar == null) {
                        return null;
                    }
                    String method = webResourceRequest.getMethod();
                    if (!method.equals("GET")) {
                        return null;
                    }
                    try {
                        String string = webResourceRequest.getUrl().toString();
                        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                        for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                            if (entry.getKey().equalsIgnoreCase("Accept") && entry.getValue().toLowerCase().contains("text/html")) {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                                for (Map.Entry<String, String> entry2 : requestHeaders.entrySet()) {
                                    httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
                                }
                                String cookie = CookieManager.getInstance().getCookie(string);
                                if (cookie != null) {
                                    httpURLConnection.setRequestProperty("Cookie", cookie);
                                }
                                httpURLConnection.setRequestMethod(method);
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setConnectTimeout(30000);
                                if (webResourceRequest.getUrl().getUserInfo() != null) {
                                    httpURLConnection.setRequestProperty("Authorization", "Basic " + Base64.encodeToString(webResourceRequest.getUrl().getUserInfo().getBytes(StandardCharsets.UTF_8), 2));
                                }
                                List<String> list = httpURLConnection.getHeaderFields().get("Set-Cookie");
                                if (list != null) {
                                    Iterator<String> it = list.iterator();
                                    while (it.hasNext()) {
                                        CookieManager.getInstance().setCookie(string, it.next());
                                    }
                                }
                                return new WebResourceResponse("text/html", null, 200, "OK", m2.f1380a, vVar.a(httpURLConnection.getInputStream()));
                            }
                        }
                        return null;
                    } catch (Exception e3) {
                        C0101f c0101f3 = this.h;
                        c0101f3.getClass();
                        if (!(e3 instanceof SocketTimeoutException)) {
                            return null;
                        }
                        L.c.p("Unable to load app. Ensure the server is running at " + c0101f3.f1414e + ", or modify the appUrl setting in capacitor.config.json (make sure to npx cap copy after to commit changes).", e3);
                        return null;
                    }
                }
            }
        }
        L.c.j("Handling local request: " + webResourceRequest.getUrl().toString());
        String path2 = webResourceRequest.getUrl().getPath();
        if (webResourceRequest.getRequestHeaders().get("Range") != null) {
            N n2 = new N(m2, webResourceRequest);
            String strB = b(n2, path2);
            Map map = m2.f1380a;
            try {
                int iAvailable = n2.available();
                String[] strArrSplit = webResourceRequest.getRequestHeaders().get("Range").split("=")[1].split("-");
                String str = strArrSplit[0];
                int i5 = iAvailable - 1;
                if (strArrSplit.length > 1) {
                    i5 = Integer.parseInt(strArrSplit[1]);
                }
                map.put("Accept-Ranges", "bytes");
                map.put("Content-Range", "bytes " + str + "-" + i5 + "/" + iAvailable);
                i = 206;
            } catch (IOException unused) {
            }
            webResourceResponse = new WebResourceResponse(strB, null, i, "OK", map, n2);
        } else {
            String path3 = webResourceRequest.getUrl().getPath();
            if ((path3.startsWith("/_capacitor_content_") || path3.startsWith("/_capacitor_file_")) || webResourceRequest.getUrl().toString().equals(this.h.a())) {
                N n3 = new N(m2, webResourceRequest);
                String strB2 = b(n3, webResourceRequest.getUrl().getPath());
                try {
                    i2 = n3.available() != -1 ? 200 : 404;
                } catch (IOException unused2) {
                    i2 = 500;
                }
                return new WebResourceResponse(strB2, null, i2, "OK", m2.f1380a, n3);
            }
            if (path2.equals("/cordova.js")) {
                return new WebResourceResponse("application/javascript", null, 200, "OK", m2.f1380a, null);
            }
            boolean zEquals = path2.equals("/");
            v vVar2 = this.f1390g;
            if (zEquals || (!webResourceRequest.getUrl().getLastPathSegment().contains(".") && this.f1389f)) {
                try {
                    String str2 = this.f1385a + "/index.html";
                    this.h.getClass();
                    boolean z2 = this.f1388e;
                    androidx.emoji2.text.m mVar = this.f1387c;
                    if (z2) {
                        inputStreamC = mVar.f1123a.getAssets().open(str2, 2);
                    } else {
                        mVar.getClass();
                        inputStreamC = androidx.emoji2.text.m.c(str2);
                    }
                    if (vVar2 != null) {
                        inputStreamC = vVar2.a(inputStreamC);
                    }
                    InputStream inputStream = inputStreamC;
                    try {
                        i3 = inputStream.available() != -1 ? 200 : 404;
                    } catch (IOException unused3) {
                        i3 = 500;
                    }
                    return new WebResourceResponse("text/html", null, i3, "OK", m2.f1380a, inputStream);
                } catch (IOException e4) {
                    L.c.p("Unable to open index.html", e4);
                    return null;
                }
            }
            if ("/favicon.ico".equalsIgnoreCase(path2)) {
                try {
                    webResourceResponse = new WebResourceResponse("image/png", null, null);
                } catch (Exception e5) {
                    L.c.p("favicon handling failed", e5);
                }
            } else {
                if (path2.lastIndexOf(".") < 0) {
                    return null;
                }
                String strSubstring = path2.substring(path2.lastIndexOf("."));
                InputStream n4 = new N(m2, webResourceRequest);
                if (strSubstring.equals(".html") && vVar2 != null) {
                    n4 = vVar2.a(n4);
                }
                String strB3 = b(n4, path2);
                try {
                    i4 = n4.available() != -1 ? 200 : 404;
                } catch (IOException unused4) {
                    i4 = 500;
                }
                webResourceResponse = new WebResourceResponse(strB3, null, i4, "OK", m2.f1380a, n4);
            }
        }
        return webResourceResponse;
    }
}
