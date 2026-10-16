package y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2735a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f2736b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2737c = new Object();

    public static void a(i iVar, int i2, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f2737c) {
            try {
                WeakHashMap weakHashMap = f2736b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(iVar, sparseArray);
                }
                sparseArray.append(i2, new h(colorStateList, iVar.f2733a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
