package u0;

import a.AbstractC0062a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class l extends P0.b {
    public static boolean K(File file, File file2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        m mVar = m.f2671c;
        if (!file.exists()) {
            mVar.f(file, new a(file, null, "The source file doesn't exist."));
            throw null;
        }
        try {
            h hVar = new h(new j(file, k.f2669b, new n(mVar), Integer.MAX_VALUE));
            while (hVar.hasNext()) {
                File file3 = (File) hVar.next();
                if (!file3.exists()) {
                    mVar.f(file3, new a(file3, null, "The source file doesn't exist."));
                    throw null;
                }
                File file4 = new File(file2, N(file3, file));
                if (file4.exists() && (!file3.isDirectory() || !file4.isDirectory())) {
                    mVar.f(file4, new a(file3, file4, "The destination file already exists."));
                    throw null;
                }
                if (file3.isDirectory()) {
                    file4.mkdirs();
                } else {
                    L(file3, file4, false);
                    if (file4.length() != file3.length()) {
                        mVar.f(file3, new IOException("Source file wasn't copied completely, length of destination file differs."));
                        throw null;
                    }
                }
            }
            return true;
        } catch (p unused) {
            return false;
        }
    }

    public static void L(File file, File file2, boolean z2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (!file.exists()) {
            throw new a(file, null, "The source file doesn't exist.");
        }
        if (file2.exists()) {
            if (!z2) {
                throw new a(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new a(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new c(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                P0.b.e(fileInputStream, fileOutputStream, 8192);
                AbstractC0062a.k(fileOutputStream, null);
                AbstractC0062a.k(fileInputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0062a.k(fileInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final b M(b bVar) {
        File file = bVar.f2652a;
        ?? r6 = bVar.f2653b;
        ArrayList arrayList = new ArrayList(r6.size());
        for (File file2 : r6) {
            String name = file2.getName();
            if (!x0.g.a(name, ".")) {
                if (!x0.g.a(name, "..")) {
                    arrayList.add(file2);
                } else if (arrayList.isEmpty() || x0.g.a(((File) l0.h.P(arrayList)).getName(), "..")) {
                    arrayList.add(file2);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return new b(file, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [l0.p] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [l0.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String N(java.io.File r10, java.io.File r11) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.l.N(java.io.File, java.io.File):java.lang.String");
    }
}
