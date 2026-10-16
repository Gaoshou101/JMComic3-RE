package androidx.activity;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0080l;
import g.AbstractActivityC0137i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements R.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f832b;

    public /* synthetic */ f(int i2, Object obj) {
        this.f831a = i2;
        this.f832b = obj;
    }

    @Override // R.c
    public final Bundle a() {
        ArrayList arrayList;
        androidx.fragment.app.b[] bVarArr;
        switch (this.f831a) {
            case 0:
                AbstractActivityC0137i abstractActivityC0137i = (AbstractActivityC0137i) this.f832b;
                Bundle bundle = new Bundle();
                m mVar = abstractActivityC0137i.f857i;
                mVar.getClass();
                LinkedHashMap linkedHashMap = mVar.f845b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(mVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(mVar.f849g));
                return bundle;
            case 1:
                AbstractActivityC0137i abstractActivityC0137i2 = (AbstractActivityC0137i) this.f832b;
                Iterator it = ((androidx.fragment.app.f) abstractActivityC0137i2.f1660t.f715b).f1189c.f1216c.f().iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
                abstractActivityC0137i2.f1661u.d(EnumC0080l.ON_STOP);
                return new Bundle();
            default:
                androidx.fragment.app.q qVar = (androidx.fragment.app.q) this.f832b;
                qVar.getClass();
                Bundle bundle2 = new Bundle();
                qVar.k();
                qVar.e();
                qVar.h(true);
                qVar.f1206B = true;
                qVar.f1212H.getClass();
                androidx.emoji2.text.u uVar = qVar.f1216c;
                uVar.getClass();
                HashMap map = (HashMap) uVar.f1141b;
                ArrayList arrayList2 = new ArrayList(map.size());
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    androidx.fragment.app.x.b(it2.next());
                }
                HashMap map2 = (HashMap) qVar.f1216c.f1142c;
                if (!map2.isEmpty()) {
                    androidx.emoji2.text.u uVar2 = qVar.f1216c;
                    synchronized (((ArrayList) uVar2.f1140a)) {
                        try {
                            if (((ArrayList) uVar2.f1140a).isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(((ArrayList) uVar2.f1140a).size());
                                Iterator it3 = ((ArrayList) uVar2.f1140a).iterator();
                                if (it3.hasNext()) {
                                    if (it3.next() == null) {
                                        throw null;
                                    }
                                    throw new ClassCastException();
                                }
                            }
                        } finally {
                        }
                    }
                    int size = qVar.d.size();
                    if (size > 0) {
                        bVarArr = new androidx.fragment.app.b[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            bVarArr[i2] = new androidx.fragment.app.b((androidx.fragment.app.a) qVar.d.get(i2));
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + qVar.d.get(i2));
                            }
                        }
                    } else {
                        bVarArr = null;
                    }
                    androidx.fragment.app.r rVar = new androidx.fragment.app.r();
                    rVar.f1240e = null;
                    ArrayList arrayList3 = new ArrayList();
                    rVar.f1241f = arrayList3;
                    ArrayList arrayList4 = new ArrayList();
                    rVar.f1242g = arrayList4;
                    rVar.f1237a = arrayList2;
                    rVar.f1238b = arrayList;
                    rVar.f1239c = bVarArr;
                    rVar.d = qVar.f1221j.get();
                    arrayList3.addAll(qVar.f1222k.keySet());
                    arrayList4.addAll(qVar.f1222k.values());
                    rVar.h = new ArrayList(qVar.f1205A);
                    bundle2.putParcelable("state", rVar);
                    for (String str : qVar.f1223l.keySet()) {
                        bundle2.putBundle("result_" + str, (Bundle) qVar.f1223l.get(str));
                    }
                    for (String str2 : map2.keySet()) {
                        bundle2.putBundle("fragment_" + str2, (Bundle) map2.get(str2));
                    }
                } else if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "saveAllState: no fragments!");
                }
                return bundle2;
        }
    }
}
