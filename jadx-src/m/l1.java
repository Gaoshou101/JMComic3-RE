package m;

import e0.C0112a;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f2416a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2417b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2418c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2419e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f2420f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2421g;

    public static void a(StringBuilder sb, String str, String str2, boolean z2) throws UnsupportedEncodingException {
        if (z2) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
                str2 = URLEncoder.encode(str2, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        sb.append(str);
        sb.append("=");
        sb.append(str2);
    }

    public void b() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URL) this.f2420f).openConnection();
        this.f2421g = new C0112a(httpURLConnection);
        httpURLConnection.setAllowUserInteraction(false);
        ((C0112a) this.f2421g).f1496a.setRequestMethod((String) this.f2419e);
        Integer num = (Integer) this.f2416a;
        if (num != null) {
            C0112a c0112a = (C0112a) this.f2421g;
            int iIntValue = num.intValue();
            if (iIntValue < 0) {
                c0112a.getClass();
                throw new IllegalArgumentException("timeout can not be negative");
            }
            c0112a.f1496a.setConnectTimeout(iIntValue);
        }
        Integer num2 = (Integer) this.f2417b;
        if (num2 != null) {
            C0112a c0112a2 = (C0112a) this.f2421g;
            int iIntValue2 = num2.intValue();
            if (iIntValue2 < 0) {
                c0112a2.getClass();
                throw new IllegalArgumentException("timeout can not be negative");
            }
            c0112a2.f1496a.setReadTimeout(iIntValue2);
        }
        if (((Boolean) this.f2418c) != null) {
            ((C0112a) this.f2421g).f1496a.setInstanceFollowRedirects(!r0.booleanValue());
        }
        C0112a c0112a3 = (C0112a) this.f2421g;
        com.getcapacitor.w wVar = (com.getcapacitor.w) this.d;
        c0112a3.getClass();
        Iterator<String> itKeys = wVar.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c0112a3.f1496a.setRequestProperty(next, wVar.getString(next));
        }
    }

    public void c(com.getcapacitor.w wVar, boolean z2) {
        String query = ((URL) this.f2420f).getQuery();
        if (query == null) {
            query = "";
        }
        Iterator<String> itKeys = wVar.keys();
        if (itKeys.hasNext()) {
            StringBuilder sb = new StringBuilder(query);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    StringBuilder sb2 = new StringBuilder();
                    JSONArray jSONArray = wVar.getJSONArray(next);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        a(sb2, next, jSONArray.getString(i2), z2);
                        if (i2 != jSONArray.length() - 1) {
                            sb2.append("&");
                        }
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append((CharSequence) sb2);
                } catch (JSONException unused) {
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    a(sb, next, wVar.getString(next), z2);
                }
            }
            String string = sb.toString();
            URI uri = ((URL) this.f2420f).toURI();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(uri.getScheme());
            sb3.append("://");
            sb3.append(uri.getAuthority());
            sb3.append(uri.getPath());
            sb3.append(!string.equals("") ? "?".concat(string) : "");
            sb3.append(uri.getFragment() != null ? uri.getFragment() : "");
            this.f2420f = new URL(sb3.toString());
        }
    }
}
