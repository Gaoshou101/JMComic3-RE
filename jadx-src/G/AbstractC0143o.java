package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: g.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0143o {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorC0141m f1668a = new ExecutorC0141m(new ExecutorC0142n());

    /* renamed from: b, reason: collision with root package name */
    public static final int f1669b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static C.f f1670c = null;
    public static C.f d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f1671e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1672f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final p.g f1673g = new p.g();
    public static final Object h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f1674i = new Object();

    public static boolean b(Context context) {
        if (f1671e == null) {
            try {
                int i2 = AbstractServiceC0123F.f1584a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0123F.class), Build.VERSION.SDK_INT >= 24 ? AbstractC0122E.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f1671e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1671e = Boolean.FALSE;
            }
        }
        return f1671e.booleanValue();
    }

    public static void e(LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A) {
        synchronized (h) {
            try {
                p.g gVar = f1673g;
                gVar.getClass();
                p.b bVar = new p.b(gVar);
                while (bVar.hasNext()) {
                    AbstractC0143o abstractC0143o = (AbstractC0143o) ((WeakReference) bVar.next()).get();
                    if (abstractC0143o == layoutInflaterFactory2C0118A || abstractC0143o == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i2);

    public abstract void g(int i2);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}
