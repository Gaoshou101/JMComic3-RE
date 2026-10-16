package com.getcapacitor.plugin;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import androidx.emoji2.text.k;
import c0.InterfaceC0095b;
import com.getcapacitor.C0101f;
import com.getcapacitor.D;
import com.getcapacitor.E;
import com.getcapacitor.I;
import com.getcapacitor.w;
import f0.AbstractC0116c;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONException;

@InterfaceC0095b
/* loaded from: classes.dex */
public class CapacitorCookies extends D {
    a cookieManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$getCookies$0(E e2, String str) throws JSONException, UnsupportedEncodingException {
        String[] strArrSplit = str.substring(1, str.length() - 1).split(";");
        w wVar = new w();
        for (String str2 : strArrSplit) {
            if (str2.length() > 0) {
                String[] strArrSplit2 = str2.split("=", 2);
                if (strArrSplit2.length == 2) {
                    String strTrim = strArrSplit2[0].trim();
                    String strTrim2 = strArrSplit2[1].trim();
                    try {
                        String strTrim3 = strArrSplit2[0].trim();
                        Charset charset = StandardCharsets.UTF_8;
                        strTrim = URLDecoder.decode(strTrim3, charset.name());
                        strTrim2 = URLDecoder.decode(strArrSplit2[1].trim(), charset.name());
                    } catch (UnsupportedEncodingException unused) {
                    }
                    wVar.e(strTrim, strTrim2);
                }
            }
        }
        e2.h(wVar);
    }

    @I
    public void clearAllCookies(E e2) {
        a aVar = this.cookieManager;
        aVar.f1454a.removeAllCookies(null);
        aVar.f1454a.flush();
        e2.g();
    }

    @I
    public void clearCookies(E e2) {
        HttpCookie[] httpCookieArr;
        String strE = e2.e("url", null);
        a aVar = this.cookieManager;
        aVar.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            String strA = aVar.a(strE);
            if (strA != null) {
                for (String str : strA.split(";")) {
                    HttpCookie httpCookie = HttpCookie.parse(str).get(0);
                    httpCookie.setValue(httpCookie.getValue());
                    arrayList.add(httpCookie);
                }
            }
            httpCookieArr = (HttpCookie[]) arrayList.toArray(new HttpCookie[arrayList.size()]);
        } catch (Exception unused) {
            httpCookieArr = new HttpCookie[0];
        }
        for (HttpCookie httpCookie2 : httpCookieArr) {
            this.cookieManager.c(strE, httpCookie2.getName() + "=; Expires=Wed, 31 Dec 2000 23:59:59 GMT");
        }
        e2.g();
    }

    @I
    public void deleteCookie(E e2) {
        String strE = e2.e("key", null);
        if (strE == null) {
            e2.f("Must provide key", null, null);
        }
        String strE2 = e2.e("url", null);
        this.cookieManager.c(strE2, strE + "=; Expires=Wed, 31 Dec 2000 23:59:59 GMT");
        e2.g();
    }

    @I
    public void getCookies(final E e2) {
        C0101f c0101f = this.bridge;
        ValueCallback valueCallback = new ValueCallback() { // from class: com.getcapacitor.plugin.b
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) throws JSONException, UnsupportedEncodingException {
                CapacitorCookies.lambda$getCookies$0(e2, (String) obj);
            }
        };
        c0101f.getClass();
        new Handler(c0101f.f1412b.getMainLooper()).post(new k(c0101f, "document.cookie", valueCallback, 1));
    }

    @Override // com.getcapacitor.D
    public void handleOnDestroy() {
        super.handleOnDestroy();
        this.cookieManager.f1454a.removeSessionCookies(null);
    }

    @JavascriptInterface
    public boolean isEnabled() {
        return AbstractC0116c.a(getBridge().f1411a.b("CapacitorCookies").f1367a, "enabled", false);
    }

    @Override // com.getcapacitor.D
    public void load() {
        this.bridge.f1419k.addJavascriptInterface(this, "CapacitorCookiesAndroidInterface");
        a aVar = new a(CookiePolicy.ACCEPT_ALL, this.bridge);
        this.cookieManager = aVar;
        aVar.f1454a.removeSessionCookies(null);
        CookieHandler.setDefault(this.cookieManager);
        super.load();
    }

    @JavascriptInterface
    public void setCookie(String str, String str2) {
        this.cookieManager.c(str, str2);
    }

    @I
    public void setCookie(E e2) {
        String strE = e2.e("key", null);
        if (strE == null) {
            e2.f("Must provide key", null, null);
        }
        String strE2 = e2.e("value", null);
        if (strE2 == null) {
            e2.f("Must provide value", null, null);
        }
        String strE3 = e2.e("url", null);
        String strE4 = e2.e("expires", "");
        String strE5 = e2.e("path", "/");
        a aVar = this.cookieManager;
        aVar.getClass();
        aVar.c(strE3, strE + "=" + strE2 + "; expires=" + strE4 + "; path=" + strE5);
        e2.g();
    }
}
