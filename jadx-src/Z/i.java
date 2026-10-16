package z;

import D.n;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends w.d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2761a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor f2762b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f2763c;
    public static final Method d;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f2762b = constructor;
        f2761a = cls;
        f2763c = method2;
        d = method;
    }

    public static boolean h(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f2763c.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface i(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f2761a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005b A[SYNTHETIC] */
    @Override // w.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface b(android.content.Context r17, y.C0347e r18, android.content.res.Resources r19, int r20) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = z.i.f2762b     // Catch: java.lang.Throwable -> L9
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            if (r2 != 0) goto Ld
            return r1
        Ld:
            r0 = r18
            y.f[] r3 = r0.f2720a
            int r4 = r3.length
            r0 = 0
            r5 = r0
        L14:
            if (r5 >= r4) goto L71
            r6 = r3[r5]
            int r0 = r6.f2725f
            java.io.File r7 = z.f.h(r17)
            if (r7 != 0) goto L24
            r8 = r19
        L22:
            r0 = r1
            goto L59
        L24:
            r8 = r19
            boolean r0 = z.f.d(r7, r8, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L30
            r7.delete()
            goto L22
        L30:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r9.<init>(r7)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L49
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L49
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L49
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L49
            r9.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L49:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L4f
            goto L54
        L4f:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r10     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r7.delete()
        L59:
            if (r0 != 0) goto L5c
            return r1
        L5c:
            int r7 = r6.f2722b
            boolean r9 = r6.f2723c
            int r6 = r6.f2724e
            boolean r0 = h(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L69
            return r1
        L69:
            int r5 = r5 + 1
            goto L14
        L6c:
            r0 = move-exception
            r7.delete()
            throw r0
        L71:
            android.graphics.Typeface r0 = i(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.i.b(android.content.Context, y.e, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // w.d
    public final Typeface c(Context context, n[] nVarArr, int i2) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f2762b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        p.k kVar = new p.k(0);
        for (n nVar : nVarArr) {
            Uri uri = nVar.f45a;
            ByteBuffer byteBufferI = (ByteBuffer) kVar.get(uri);
            if (byteBufferI == null) {
                byteBufferI = f.i(context, uri);
                kVar.put(uri, byteBufferI);
            }
            if (byteBufferI == null) {
                return null;
            }
            if (!h(objNewInstance, byteBufferI, nVar.f46b, nVar.f47c, nVar.d)) {
                return null;
            }
        }
        Typeface typefaceI = i(objNewInstance);
        if (typefaceI == null) {
            return null;
        }
        return Typeface.create(typefaceI, i2);
    }
}
