package androidx.fragment.app;

import android.util.Log;
import c.InterfaceC0086b;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements InterfaceC0086b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1197b;

    public /* synthetic */ j(q qVar, int i2) {
        this.f1196a = i2;
        this.f1197b = qVar;
    }

    @Override // c.InterfaceC0086b
    public final void a(Object obj) {
        switch (this.f1196a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                q qVar = this.f1197b;
                n nVar = (n) qVar.f1205A.pollFirst();
                if (nVar == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = nVar.f1202a;
                    qVar.f1216c.b();
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    break;
                }
            case 1:
                q qVar2 = this.f1197b;
                n nVar2 = (n) qVar2.f1205A.pollLast();
                if (nVar2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    String str2 = nVar2.f1202a;
                    qVar2.f1216c.b();
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    break;
                }
            default:
                q qVar3 = this.f1197b;
                n nVar3 = (n) qVar3.f1205A.pollFirst();
                if (nVar3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    String str3 = nVar3.f1202a;
                    qVar3.f1216c.b();
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    break;
                }
        }
    }
}
