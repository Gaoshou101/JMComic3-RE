package z;

import D.n;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import y.C0347e;

/* loaded from: classes.dex */
public class j extends h {

    /* renamed from: f, reason: collision with root package name */
    public final Class f2764f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor f2765g;
    public final Method h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f2766i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f2767j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f2768k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f2769l;

    public j() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodQ;
        Constructor<?> constructor;
        Method methodP;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodP = p(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodQ = q(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            methodQ = null;
            constructor = null;
            methodP = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f2764f = cls;
        this.f2765g = constructor;
        this.h = methodP;
        this.f2766i = method;
        this.f2767j = method2;
        this.f2768k = method3;
        this.f2769l = methodQ;
    }

    public static Method p(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // z.h, w.d
    public final Typeface b(Context context, C0347e c0347e, Resources resources, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!n()) {
            return super.b(context, c0347e, resources, i2);
        }
        Object objO = o();
        if (objO == null) {
            return null;
        }
        for (y.f fVar : c0347e.f2720a) {
            if (!k(context, objO, fVar.f2721a, fVar.f2724e, fVar.f2722b, fVar.f2723c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.d))) {
                j(objO);
                return null;
            }
        }
        if (m(objO)) {
            return l(objO);
        }
        return null;
    }

    @Override // z.h, w.d
    public final Typeface c(Context context, n[] nVarArr, int i2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceL;
        boolean zBooleanValue;
        if (nVarArr.length < 1) {
            return null;
        }
        if (!n()) {
            n nVarG = g(nVarArr, i2);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(nVarG.f45a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(nVarG.f47c).setItalic(nVarG.d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (n nVar : nVarArr) {
            if (nVar.f48e == 0) {
                Uri uri = nVar.f45a;
                if (!map.containsKey(uri)) {
                    map.put(uri, f.i(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objO = o();
        if (objO == null) {
            return null;
        }
        int length = nVarArr.length;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < length) {
            n nVar2 = nVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(nVar2.f45a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f2766i.invoke(objO, byteBuffer, Integer.valueOf(nVar2.f46b), null, Integer.valueOf(nVar2.f47c), Integer.valueOf(nVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    j(objO);
                    return null;
                }
                z2 = true;
            }
            i3++;
            z2 = z2;
        }
        if (!z2) {
            j(objO);
            return null;
        }
        if (m(objO) && (typefaceL = l(objO)) != null) {
            return Typeface.create(typefaceL, i2);
        }
        return null;
    }

    @Override // w.d
    public final Typeface f(Context context, Resources resources, int i2, String str, int i3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!n()) {
            return super.f(context, resources, i2, str, i3);
        }
        Object objO = o();
        if (objO == null) {
            return null;
        }
        if (!k(context, objO, str, 0, -1, -1, null)) {
            j(objO);
            return null;
        }
        if (m(objO)) {
            return l(objO);
        }
        return null;
    }

    public final void j(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f2768k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean k(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface l(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2764f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2769l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean m(Object obj) {
        try {
            return ((Boolean) this.f2767j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean n() {
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object o() {
        try {
            return this.f2765g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method q(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
