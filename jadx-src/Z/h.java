package z;

import D.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y.C0347e;

/* loaded from: classes.dex */
public class h extends w.d {

    /* renamed from: a, reason: collision with root package name */
    public static Class f2757a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor f2758b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f2759c = null;
    public static Method d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2760e = false;

    public static boolean h(Object obj, String str, int i2, boolean z2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        i();
        try {
            return ((Boolean) f2759c.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void i() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2760e) {
            return;
        }
        f2760e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f2758b = constructor;
        f2757a = cls;
        f2759c = method2;
        d = method;
    }

    @Override // w.d
    public Typeface b(Context context, C0347e c0347e, Resources resources, int i2) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        i();
        try {
            Object objNewInstance = f2758b.newInstance(null);
            for (y.f fVar : c0347e.f2720a) {
                File fileH = f.h(context);
                if (fileH == null) {
                    return null;
                }
                try {
                    if (!f.d(fileH, resources, fVar.f2725f)) {
                        return null;
                    }
                    if (!h(objNewInstance, fileH.getPath(), fVar.f2722b, fVar.f2723c)) {
                        return null;
                    }
                    fileH.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileH.delete();
                }
            }
            i();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f2757a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // w.d
    public Typeface c(Context context, n[] nVarArr, int i2) throws IOException {
        String str;
        if (nVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(g(nVarArr, i2).f45a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceE = e(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceE;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
