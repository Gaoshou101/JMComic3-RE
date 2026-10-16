package com.getcapacitor.plugin;

import L.c;
import android.util.Log;
import com.getcapacitor.C0101f;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends CookieManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.CookieManager f1454a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1455b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1456c;

    public a(CookiePolicy cookiePolicy, C0101f c0101f) {
        super(null, cookiePolicy);
        this.f1454a = android.webkit.CookieManager.getInstance();
        this.f1455b = c0101f.d;
        this.f1456c = c0101f.f1411a.f1460b;
    }

    public final String a(String str) {
        try {
            String strB = b(str);
            String str2 = "Getting cookies at: '" + strB + "'";
            if (c.E()) {
                Log.i("CapacitorCookies", str2);
            }
            return this.f1454a.getCookie(strB);
        } catch (Exception e2) {
            c.q("CapacitorCookies", "Failed to get cookies at the given URL.", e2);
            return null;
        }
    }

    public final String b(String str) throws Exception {
        String str2 = this.f1456c;
        if ((str2 == null || str2.isEmpty() || !(str == null || str.isEmpty() || str2.contains(str))) && ((str2 = this.f1455b) == null || str2.isEmpty() || !(str == null || str.isEmpty() || str2.contains(str)))) {
            try {
                String scheme = new URI(str).getScheme();
                if (scheme == null || scheme.isEmpty()) {
                    str = "https://" + str;
                }
            } catch (URISyntaxException e2) {
                c.q("CapacitorCookies", "Failed to get scheme from URL.", e2);
            }
        } else {
            str = str2;
        }
        try {
            new URI(str);
            return str;
        } catch (Exception e3) {
            c.q("CapacitorCookies", "Failed to get sanitized URL.", e3);
            throw e3;
        }
    }

    public final void c(String str, String str2) {
        android.webkit.CookieManager cookieManager = this.f1454a;
        try {
            String strB = b(str);
            String str3 = "Setting cookie '" + str2 + "' at: '" + strB + "'";
            if (c.E()) {
                Log.i("CapacitorCookies", str3);
            }
            cookieManager.setCookie(strB, str2);
            cookieManager.flush();
        } catch (Exception e2) {
            c.q("CapacitorCookies", "Failed to set cookie.", e2);
        }
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public final Map get(URI uri, Map map) {
        if (uri == null || map == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        String string = uri.toString();
        HashMap map2 = new HashMap();
        String strA = a(string);
        if (strA != null) {
            map2.put("Cookie", Collections.singletonList(strA));
        }
        return map2;
    }

    @Override // java.net.CookieManager
    public final CookieStore getCookieStore() {
        throw new UnsupportedOperationException();
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public final void put(URI uri, Map map) {
        if (uri == null || map == null) {
            return;
        }
        for (String str : map.keySet()) {
            if (str != null && (str.equalsIgnoreCase("Set-Cookie2") || str.equalsIgnoreCase("Set-Cookie"))) {
                List<String> list = (List) map.get(str);
                Objects.requireNonNull(list);
                for (String str2 : list) {
                    try {
                        c(uri.toString(), str2);
                        String[] strArrSplit = str2.toLowerCase(Locale.ROOT).split("domain=");
                        c(b(strArrSplit.length <= 1 ? null : strArrSplit[1].split(";")[0].trim()), str2);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
