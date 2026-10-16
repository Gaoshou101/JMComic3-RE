package N0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: N0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051b {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f497a = new ArrayList();

    public final void a(String str) {
        String str2 = "*";
        if (this.f497a != null) {
            try {
                if (str.compareTo("*") == 0) {
                    this.f497a = null;
                    return;
                }
                Matcher matcher = Pattern.compile("^((\\*|[A-Za-z-]+):(//)?)?(\\*|((\\*\\.)?[^*/:]+))?(:(\\d+))?(/.*)?").matcher(str);
                if (matcher.matches()) {
                    String strGroup = matcher.group(2);
                    String strGroup2 = matcher.group(4);
                    if ((!"file".equals(strGroup) && !"content".equals(strGroup)) || strGroup2 != null) {
                        str2 = strGroup2;
                    }
                    String strGroup3 = matcher.group(8);
                    String strGroup4 = matcher.group(9);
                    if (strGroup != null) {
                        this.f497a.add(new C0050a(strGroup, str2, strGroup3, strGroup4));
                    } else {
                        this.f497a.add(new C0050a("http", str2, strGroup3, strGroup4));
                        this.f497a.add(new C0050a("https", str2, strGroup3, strGroup4));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final boolean b(String str) {
        if (this.f497a == null) {
            return true;
        }
        Uri uri = Uri.parse(str);
        Iterator it = this.f497a.iterator();
        while (it.hasNext()) {
            C0050a c0050a = (C0050a) it.next();
            c0050a.getClass();
            try {
                Pattern pattern = c0050a.f494a;
                if (pattern == null || pattern.matcher(uri.getScheme()).matches()) {
                    Pattern pattern2 = c0050a.f495b;
                    if (pattern2 == null || pattern2.matcher(uri.getHost()).matches()) {
                        Integer num = c0050a.f496c;
                        if (num == null || num.equals(Integer.valueOf(uri.getPort()))) {
                            Pattern pattern3 = c0050a.d;
                            if (pattern3 == null || pattern3.matcher(uri.getPath()).matches()) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.toString();
            }
        }
        return false;
    }
}
