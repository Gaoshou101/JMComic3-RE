package w;

import D.n;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import v.e;
import y.C0347e;
import z.f;

/* loaded from: classes.dex */
public abstract class d {
    public d() {
        new ConcurrentHashMap();
    }

    public static int a(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                if (iNoteProxyOpNoThrow == 0) {
                    iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, e.a(context)) : 1;
                }
            } else {
                iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
            }
            if (iNoteProxyOpNoThrow != 0) {
                return -2;
            }
        }
        return 0;
    }

    public abstract Typeface b(Context context, C0347e c0347e, Resources resources, int i2);

    public abstract Typeface c(Context context, n[] nVarArr, int i2);

    public Typeface d(Context context, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface e(Context context, InputStream inputStream) {
        File fileH = f.h(context);
        if (fileH == null) {
            return null;
        }
        try {
            if (f.e(fileH, inputStream)) {
                return Typeface.createFromFile(fileH.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileH.delete();
        }
    }

    public Typeface f(Context context, Resources resources, int i2, String str, int i3) {
        File fileH = f.h(context);
        if (fileH == null) {
            return null;
        }
        try {
            if (f.d(fileH, resources, i2)) {
                return Typeface.createFromFile(fileH.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileH.delete();
        }
    }

    public n g(n[] nVarArr, int i2) {
        new L.c(21);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        n nVar = null;
        int i4 = Integer.MAX_VALUE;
        for (n nVar2 : nVarArr) {
            int iAbs = (Math.abs(nVar2.f47c - i3) * 2) + (nVar2.d == z2 ? 0 : 1);
            if (nVar == null || i4 > iAbs) {
                nVar = nVar2;
                i4 = iAbs;
            }
        }
        return nVar;
    }
}
