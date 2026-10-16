package e0;

import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.getcapacitor.C0101f;
import com.getcapacitor.w;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112a {

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f1496a;

    public C0112a(HttpURLConnection httpURLConnection) {
        String str;
        this.f1496a = httpURLConnection;
        Locale locale = Build.VERSION.SDK_INT >= 24 ? LocaleList.getDefault().get(0) : Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (TextUtils.isEmpty(language)) {
            str = "";
        } else if (TextUtils.isEmpty(country)) {
            str = language + ";q=0.5";
        } else {
            str = language + "-" + country + "," + language + ";q=0.5";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        httpURLConnection.setRequestProperty("Accept-Language", str);
    }

    public final void a(C0101f c0101f) {
        try {
            Class<?> cls = Class.forName("io.ionic.sslpinning.SSLPinning");
            SSLSocketFactory sSLSocketFactory = (SSLSocketFactory) cls.getDeclaredMethod("getSSLSocketFactory", C0101f.class).invoke(cls.getDeclaredConstructor(null).newInstance(null), c0101f);
            if (sSLSocketFactory != null) {
                ((HttpsURLConnection) this.f1496a).setSSLSocketFactory(sSLSocketFactory);
            }
        } catch (Exception unused) {
        }
    }

    public final void b(w wVar) {
        DataOutputStream dataOutputStream = new DataOutputStream(this.f1496a.getOutputStream());
        try {
            Iterator<String> itKeys = wVar.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = wVar.get(next);
                dataOutputStream.writeBytes(next);
                dataOutputStream.writeBytes("=");
                dataOutputStream.writeBytes(URLEncoder.encode(obj.toString(), "UTF-8"));
                if (itKeys.hasNext()) {
                    dataOutputStream.writeBytes("&");
                }
            }
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c(String str) {
        DataOutputStream dataOutputStream = new DataOutputStream(this.f1496a.getOutputStream());
        try {
            dataOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
