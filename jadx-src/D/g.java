package D;

import a.AbstractC0062a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import y.AbstractC0344b;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final p.j f26a = new p.j(2);

    /* renamed from: b, reason: collision with root package name */
    public static final d f27b = new d();

    public static m a(Context context, List list) {
        AbstractC0062a.e("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                h hVar = (h) list.get(i2);
                ProviderInfo providerInfoB = b(context.getPackageManager(), hVar, context.getResources());
                if (providerInfoB == null) {
                    m mVar = new m();
                    mVar.f43a = 1;
                    mVar.f44b = Collections.singletonList(null);
                    Trace.endSection();
                    return mVar;
                }
                arrayList.add(c(context, hVar, providerInfoB.authority));
            }
            m mVar2 = new m(arrayList);
            Trace.endSection();
            return mVar2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static ProviderInfo b(PackageManager packageManager, h hVar, Resources resources) {
        AbstractC0062a.e("FontProvider.getProvider");
        try {
            List listH = hVar.d;
            String str = hVar.f28a;
            String str2 = hVar.f29b;
            if (listH == null) {
                listH = AbstractC0344b.h(resources, 0);
            }
            f fVar = new f();
            fVar.f23a = str;
            fVar.f24b = str2;
            fVar.f25c = listH;
            p.j jVar = f26a;
            ProviderInfo providerInfo = (ProviderInfo) jVar.a(fVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            d dVar = f27b;
            Collections.sort(arrayList, dVar);
            for (int i2 = 0; i2 < listH.size(); i2++) {
                ArrayList arrayList2 = new ArrayList((Collection) listH.get(i2));
                Collections.sort(arrayList2, dVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                            break;
                        }
                    }
                    jVar.b(fVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136 A[Catch: all -> 0x013a, TRY_ENTER, TryCatch #3 {all -> 0x013a, blocks: (B:3:0x000b, B:5:0x003e, B:65:0x0136, B:68:0x013c, B:75:0x0152, B:76:0x0155, B:77:0x0158, B:6:0x0045, B:8:0x004c, B:32:0x00a5, B:34:0x00ab, B:36:0x00b1, B:37:0x00da, B:41:0x00e3, B:46:0x00f1, B:49:0x00fc, B:53:0x0111, B:57:0x011d, B:61:0x0129, B:51:0x0106, B:72:0x014c, B:73:0x014f, B:10:0x0065, B:11:0x006d, B:12:0x0070, B:16:0x007b, B:20:0x0082, B:22:0x008b, B:26:0x0096, B:30:0x009d), top: B:85:0x000b, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static D.n[] c(android.content.Context r20, D.h r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.g.c(android.content.Context, D.h, java.lang.String):D.n[]");
    }
}
