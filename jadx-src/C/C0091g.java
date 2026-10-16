package c;

import androidx.activity.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: c.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f1342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1343c;
    public final /* synthetic */ P0.b d;

    public /* synthetic */ C0091g(m mVar, String str, P0.b bVar, int i2) {
        this.f1341a = i2;
        this.f1342b = mVar;
        this.f1343c = str;
        this.d = bVar;
    }

    public final void a(Object obj) {
        switch (this.f1341a) {
            case 0:
                m mVar = this.f1342b;
                LinkedHashMap linkedHashMap = mVar.f845b;
                String str = this.f1343c;
                Object obj2 = linkedHashMap.get(str);
                P0.b bVar = this.d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                ArrayList arrayList = mVar.d;
                arrayList.add(str);
                try {
                    mVar.b(iIntValue, bVar, obj);
                    return;
                } catch (Exception e2) {
                    arrayList.remove(str);
                    throw e2;
                }
            default:
                m mVar2 = this.f1342b;
                LinkedHashMap linkedHashMap2 = mVar2.f845b;
                String str2 = this.f1343c;
                Object obj3 = linkedHashMap2.get(str2);
                P0.b bVar2 = this.d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                ArrayList arrayList2 = mVar2.d;
                arrayList2.add(str2);
                try {
                    mVar2.b(iIntValue2, bVar2, obj);
                    return;
                } catch (Exception e3) {
                    arrayList2.remove(str2);
                    throw e3;
                }
        }
    }
}
