package N0;

import java.net.MalformedURLException;
import java.util.regex.Pattern;

/* renamed from: N0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050a {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f494a;

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f495b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f496c;
    public final Pattern d;

    public C0050a(String str, String str2, String str3, String str4) throws MalformedURLException {
        try {
            if ("*".equals(str)) {
                this.f494a = null;
            } else {
                this.f494a = Pattern.compile(a(str, false), 2);
            }
            if ("*".equals(str2)) {
                this.f495b = null;
            } else if (str2.startsWith("*.")) {
                this.f495b = Pattern.compile("([a-z0-9.-]*\\.)?" + a(str2.substring(2), false), 2);
            } else {
                this.f495b = Pattern.compile(a(str2, false), 2);
            }
            if (str3 == null || "*".equals(str3)) {
                this.f496c = null;
            } else {
                this.f496c = Integer.valueOf(Integer.parseInt(str3, 10));
            }
            if (str4 != null && !"/*".equals(str4)) {
                this.d = Pattern.compile(a(str4, true));
                return;
            }
            this.d = null;
        } catch (NumberFormatException unused) {
            throw new MalformedURLException("Port must be a number");
        }
    }

    public static String a(String str, boolean z2) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '*' && z2) {
                sb.append(".");
            } else if ("\\.[]{}()^$?+|".indexOf(cCharAt) > -1) {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
