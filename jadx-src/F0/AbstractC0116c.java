package f0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import com.a7m3p9xv.t6qk2z8.app.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0116c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0115b f1522a = new C0115b();

    public static boolean a(JSONObject jSONObject, String str, boolean z2) {
        try {
            return c(str, jSONObject).getBoolean(b(str));
        } catch (JSONException unused) {
            return z2;
        }
    }

    public static String b(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length > 0) {
            return strArrSplit[strArrSplit.length - 1];
        }
        return null;
    }

    public static JSONObject c(String str, JSONObject jSONObject) throws JSONException {
        String[] strArrSplit = str.split("\\.");
        for (int i2 = 0; i2 < strArrSplit.length - 1; i2++) {
            jSONObject = jSONObject.getJSONObject(strArrSplit[i2]);
        }
        return jSONObject;
    }

    public static PackageInfo d(PackageManager packageManager, String str, long j2) {
        return Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(j2)) : packageManager.getPackageInfo(str, (int) j2);
    }

    public static String e(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            String string = c(str, jSONObject).getString(b(str));
            return string == null ? str2 : string;
        } catch (JSONException unused) {
            return str2;
        }
    }

    public static String[] f(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] strArr2 = null;
        try {
            PackageInfo packageInfoD = d(context.getPackageManager(), context.getPackageName(), 4096L);
            if (packageInfoD != null) {
                strArr2 = packageInfoD.requestedPermissions;
            }
        } catch (Exception unused) {
        }
        if (strArr2 == null || strArr2.length <= 0) {
            return strArr;
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(strArr2));
        for (String str : strArr) {
            if (!arrayList2.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean g(Context context, String str) {
        String[] strArr = null;
        try {
            PackageInfo packageInfoD = d(context.getPackageManager(), context.getPackageName(), 4096L);
            if (packageInfoD != null) {
                strArr = packageInfoD.requestedPermissions;
            }
        } catch (Exception unused) {
        }
        return strArr != null && strArr.length > 0 && new ArrayList(Arrays.asList(strArr)).contains(str);
    }

    public static boolean h(MainActivity mainActivity, String[] strArr) {
        for (String str : strArr) {
            if (v.d.a(mainActivity, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static int i(String str) {
        if (str.charAt(0) != '#') {
            str = "#".concat(str);
        }
        if (str.length() != 7 && str.length() != 9) {
            throw new IllegalArgumentException("The encoded color space is invalid or unknown");
        }
        if (str.length() == 7) {
            return Color.parseColor(str);
        }
        return Color.parseColor("#" + str.substring(7) + str.substring(1, 7));
    }
}
