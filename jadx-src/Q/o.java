package Q;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final r.h f600a = new r.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f601b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static L.c f602c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? m.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static L.c b() {
        L.c cVar = new L.c(8);
        f602c = cVar;
        r.h hVar = f600a;
        hVar.getClass();
        if (r.g.f2623f.g(hVar, null, cVar)) {
            r.g.b(hVar);
        }
        return f602c;
    }

    public static void c(Context context, boolean z2) {
        n nVarA;
        int i2;
        if (z2 || f602c == null) {
            synchronized (f601b) {
                if (!z2) {
                    try {
                        if (f602c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i4 = 0;
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                nVarA = n.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            nVarA = null;
                        }
                        if (nVarA != null && nVarA.f599c == jA && (i2 = nVarA.f598b) != 2) {
                            i4 = i2;
                        } else if (z3) {
                            i4 = 1;
                        } else if (z4) {
                            i4 = 2;
                        }
                        if (z2 && z4 && i4 != 1) {
                            i4 = 2;
                        }
                        n nVar = new n(1, (nVarA == null || nVarA.f598b != 2 || i4 != 1 || length >= nVarA.d) ? i4 : 3, jA, length2);
                        if (nVarA == null || !nVarA.equals(nVar)) {
                            try {
                                nVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
