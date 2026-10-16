package androidx.activity;

import G.C0037m;
import G.InterfaceC0036l;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0081m;
import c.InterfaceC0092h;
import g.AbstractActivityC0137i;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import w.InterfaceC0342b;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements b.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0137i f834b;

    public /* synthetic */ g(AbstractActivityC0137i abstractActivityC0137i, int i2) {
        this.f833a = i2;
        this.f834b = abstractActivityC0137i;
    }

    @Override // b.b
    public final void a(o oVar) {
        int i2;
        Bundle bundle;
        Bundle bundle2;
        switch (this.f833a) {
            case 0:
                AbstractActivityC0137i abstractActivityC0137i = this.f834b;
                x0.g.e("it", oVar);
                Bundle bundleC = ((R.d) abstractActivityC0137i.d.f615c).c("android:support:activity-result");
                if (bundleC != null) {
                    m mVar = abstractActivityC0137i.f857i;
                    mVar.getClass();
                    ArrayList<Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        mVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle3 = bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle4 = mVar.f849g;
                    if (bundle3 != null) {
                        bundle4.putAll(bundle3);
                    }
                    int size = stringArrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        String str = stringArrayList.get(i3);
                        LinkedHashMap linkedHashMap = mVar.f845b;
                        boolean zContainsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = mVar.f844a;
                        if (zContainsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle4.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof y0.a) {
                                    x0.m.b("kotlin.collections.MutableMap", linkedHashMap2);
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i3);
                        x0.g.d("rcs[i]", num2);
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i3);
                        x0.g.d("keys[i]", str2);
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        linkedHashMap.put(str3, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
            default:
                androidx.fragment.app.f fVar = (androidx.fragment.app.f) this.f834b.f1660t.f715b;
                androidx.fragment.app.q qVar = fVar.f1189c;
                if (qVar.f1232u != null) {
                    throw new IllegalStateException("Already attached");
                }
                qVar.f1232u = fVar;
                qVar.f1233v = fVar;
                qVar.f1225n.add(fVar);
                AbstractActivityC0137i abstractActivityC0137i2 = fVar.d;
                C c2 = (C) abstractActivityC0137i2.f866r.a();
                qVar.f1218f = c2;
                c2.a(fVar, qVar.f1220i);
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) new C0037m(abstractActivityC0137i2.c(), androidx.fragment.app.s.f1243g).f(androidx.fragment.app.s.class);
                qVar.f1212H = sVar;
                androidx.emoji2.text.u uVar = qVar.f1216c;
                uVar.d = sVar;
                androidx.fragment.app.f fVar2 = qVar.f1232u;
                if (fVar2 instanceof R.f) {
                    R.d dVarA = fVar2.a();
                    dVarA.e("android:support:fragments", new f(2, qVar));
                    Bundle bundleC2 = dVarA.c("android:support:fragments");
                    if (bundleC2 != null) {
                        for (String str4 : bundleC2.keySet()) {
                            if (str4.startsWith("result_") && (bundle2 = bundleC2.getBundle(str4)) != null) {
                                bundle2.setClassLoader(qVar.f1232u.f1187a.getClassLoader());
                                qVar.f1223l.put(str4.substring(7), bundle2);
                            }
                        }
                        HashMap map = new HashMap();
                        for (String str5 : bundleC2.keySet()) {
                            if (str5.startsWith("fragment_") && (bundle = bundleC2.getBundle(str5)) != null) {
                                bundle.setClassLoader(qVar.f1232u.f1187a.getClassLoader());
                                map.put(str5.substring(9), bundle);
                            }
                        }
                        HashMap map2 = (HashMap) uVar.f1142c;
                        map2.clear();
                        map2.putAll(map);
                        androidx.fragment.app.r rVar = (androidx.fragment.app.r) bundleC2.getParcelable("state");
                        if (rVar != null) {
                            HashMap map3 = (HashMap) uVar.f1141b;
                            map3.clear();
                            Iterator it = rVar.f1237a.iterator();
                            while (it.hasNext()) {
                                Bundle bundle5 = (Bundle) map2.remove((String) it.next());
                                if (bundle5 != null) {
                                    if (qVar.f1212H.f1244c.get(((androidx.fragment.app.t) bundle5.getParcelable("state")).f1248b) != null) {
                                        throw new ClassCastException();
                                    }
                                    qVar.f1232u.f1187a.getClassLoader();
                                    qVar.f1234w.a(((androidx.fragment.app.t) bundle5.getParcelable("state")).f1247a);
                                    throw null;
                                }
                            }
                            androidx.fragment.app.s sVar2 = qVar.f1212H;
                            sVar2.getClass();
                            Iterator it2 = new ArrayList(sVar2.f1244c.values()).iterator();
                            if (it2.hasNext()) {
                                throw androidx.fragment.app.x.a(it2);
                            }
                            ArrayList arrayList = rVar.f1238b;
                            ((ArrayList) uVar.f1140a).clear();
                            if (arrayList != null) {
                                Iterator it3 = arrayList.iterator();
                                if (it3.hasNext()) {
                                    String str6 = (String) it3.next();
                                    androidx.fragment.app.x.b(map3.get(str6));
                                    throw new IllegalStateException(Q.d.a("No instantiated fragment for (", str6, ")"));
                                }
                            }
                            if (rVar.f1239c != null) {
                                qVar.d = new ArrayList(rVar.f1239c.length);
                                int i4 = 0;
                                while (true) {
                                    androidx.fragment.app.b[] bVarArr = rVar.f1239c;
                                    if (i4 < bVarArr.length) {
                                        androidx.fragment.app.b bVar = bVarArr[i4];
                                        bVar.getClass();
                                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(qVar);
                                        int i5 = 0;
                                        int i6 = 0;
                                        while (true) {
                                            int[] iArr = bVar.f1171a;
                                            boolean z2 = true;
                                            if (i5 < iArr.length) {
                                                androidx.fragment.app.u uVar2 = new androidx.fragment.app.u();
                                                int i7 = i5 + 1;
                                                uVar2.f1260a = iArr[i5];
                                                if (Log.isLoggable("FragmentManager", 2)) {
                                                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i6 + " base fragment #" + iArr[i7]);
                                                }
                                                uVar2.f1265g = EnumC0081m.values()[bVar.f1173c[i6]];
                                                uVar2.h = EnumC0081m.values()[bVar.d[i6]];
                                                int i8 = i5 + 2;
                                                if (iArr[i7] == 0) {
                                                    z2 = false;
                                                }
                                                uVar2.f1261b = z2;
                                                int i9 = iArr[i8];
                                                uVar2.f1262c = i9;
                                                int i10 = iArr[i5 + 3];
                                                uVar2.d = i10;
                                                int i11 = i5 + 5;
                                                int i12 = iArr[i5 + 4];
                                                uVar2.f1263e = i12;
                                                i5 += 6;
                                                int i13 = iArr[i11];
                                                uVar2.f1264f = i13;
                                                aVar.f1155b = i9;
                                                aVar.f1156c = i10;
                                                aVar.d = i12;
                                                aVar.f1157e = i13;
                                                aVar.f1154a.add(uVar2);
                                                uVar2.f1262c = aVar.f1155b;
                                                uVar2.d = aVar.f1156c;
                                                uVar2.f1263e = aVar.d;
                                                uVar2.f1264f = aVar.f1157e;
                                                i6++;
                                            } else {
                                                aVar.f1158f = bVar.f1174e;
                                                aVar.h = bVar.f1175f;
                                                aVar.f1159g = true;
                                                aVar.f1160i = bVar.h;
                                                aVar.f1161j = bVar.f1177i;
                                                aVar.f1162k = bVar.f1178j;
                                                aVar.f1163l = bVar.f1179k;
                                                aVar.f1164m = bVar.f1180l;
                                                aVar.f1165n = bVar.f1181m;
                                                aVar.f1166o = bVar.f1182n;
                                                aVar.f1170s = bVar.f1176g;
                                                int i14 = 0;
                                                while (true) {
                                                    ArrayList arrayList2 = bVar.f1172b;
                                                    if (i14 < arrayList2.size()) {
                                                        String str7 = (String) arrayList2.get(i14);
                                                        if (str7 != null) {
                                                            androidx.fragment.app.u uVar3 = (androidx.fragment.app.u) aVar.f1154a.get(i14);
                                                            androidx.fragment.app.x.b(((HashMap) uVar.f1141b).get(str7));
                                                            uVar3.getClass();
                                                        }
                                                        i14++;
                                                    } else {
                                                        aVar.b(1);
                                                        if (Log.isLoggable("FragmentManager", 2)) {
                                                            Log.v("FragmentManager", "restoreAllState: back stack #" + i4 + " (index " + aVar.f1170s + "): " + aVar);
                                                            PrintWriter printWriter = new PrintWriter(new androidx.fragment.app.v());
                                                            aVar.d("  ", printWriter, false);
                                                            printWriter.close();
                                                        }
                                                        qVar.d.add(aVar);
                                                        i4++;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                }
                            } else {
                                i2 = 0;
                                qVar.d = new ArrayList();
                            }
                            qVar.f1221j.set(rVar.d);
                            String str8 = rVar.f1240e;
                            if (str8 != null) {
                                androidx.fragment.app.x.b(((HashMap) uVar.f1141b).get(str8));
                            }
                            ArrayList arrayList3 = rVar.f1241f;
                            if (arrayList3 != null) {
                                for (int i15 = i2; i15 < arrayList3.size(); i15++) {
                                    qVar.f1222k.put((String) arrayList3.get(i15), (androidx.fragment.app.c) rVar.f1242g.get(i15));
                                }
                            }
                            qVar.f1205A = new ArrayDeque(rVar.h);
                        }
                    }
                }
                androidx.fragment.app.f fVar3 = qVar.f1232u;
                if (fVar3 instanceof InterfaceC0092h) {
                    AbstractActivityC0137i abstractActivityC0137i3 = fVar3.d;
                    androidx.fragment.app.m mVar2 = new androidx.fragment.app.m(2);
                    androidx.fragment.app.j jVar = new androidx.fragment.app.j(qVar, 1);
                    m mVar3 = abstractActivityC0137i3.f857i;
                    qVar.x = mVar3.c("FragmentManager:StartActivityForResult", mVar2, jVar);
                    qVar.f1235y = mVar3.c("FragmentManager:StartIntentSenderForResult", new androidx.fragment.app.m(0), new androidx.fragment.app.j(qVar, 2));
                    qVar.f1236z = mVar3.c("FragmentManager:RequestPermissions", new androidx.fragment.app.m(1), new androidx.fragment.app.j(qVar, 0));
                }
                androidx.fragment.app.f fVar4 = qVar.f1232u;
                if (fVar4 instanceof InterfaceC0342b) {
                    AbstractActivityC0137i abstractActivityC0137i4 = fVar4.d;
                    androidx.fragment.app.i iVar = qVar.f1226o;
                    x0.g.e("listener", iVar);
                    abstractActivityC0137i4.f858j.add(iVar);
                }
                androidx.fragment.app.f fVar5 = qVar.f1232u;
                if (fVar5 instanceof w.c) {
                    AbstractActivityC0137i abstractActivityC0137i5 = fVar5.d;
                    androidx.fragment.app.i iVar2 = qVar.f1227p;
                    x0.g.e("listener", iVar2);
                    abstractActivityC0137i5.f859k.add(iVar2);
                }
                androidx.fragment.app.f fVar6 = qVar.f1232u;
                if (fVar6 instanceof v.j) {
                    AbstractActivityC0137i abstractActivityC0137i6 = fVar6.d;
                    androidx.fragment.app.i iVar3 = qVar.f1228q;
                    x0.g.e("listener", iVar3);
                    abstractActivityC0137i6.f861m.add(iVar3);
                }
                androidx.fragment.app.f fVar7 = qVar.f1232u;
                if (fVar7 instanceof v.k) {
                    AbstractActivityC0137i abstractActivityC0137i7 = fVar7.d;
                    androidx.fragment.app.i iVar4 = qVar.f1229r;
                    x0.g.e("listener", iVar4);
                    abstractActivityC0137i7.f862n.add(iVar4);
                }
                androidx.fragment.app.f fVar8 = qVar.f1232u;
                if (fVar8 instanceof InterfaceC0036l) {
                    AbstractActivityC0137i abstractActivityC0137i8 = fVar8.d;
                    androidx.fragment.app.k kVar = qVar.f1230s;
                    x0.g.e("provider", kVar);
                    C0037m c0037m = abstractActivityC0137i8.f853c;
                    ((CopyOnWriteArrayList) c0037m.f196b).add(kVar);
                    ((Runnable) c0037m.f195a).run();
                    return;
                }
                return;
        }
    }
}
