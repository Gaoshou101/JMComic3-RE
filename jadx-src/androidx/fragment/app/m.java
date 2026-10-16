package androidx.fragment.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import c.C0085a;
import c.C0093i;
import g.AbstractActivityC0137i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k0.C0230c;

/* loaded from: classes.dex */
public final class m extends P0.b {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1201m;

    public /* synthetic */ m(int i2) {
        this.f1201m = i2;
    }

    @Override // P0.b
    public final Intent g(AbstractActivityC0137i abstractActivityC0137i, Object obj) {
        Bundle bundleExtra;
        switch (this.f1201m) {
            case 0:
                C0093i c0093i = (C0093i) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c0093i.f1345b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c0093i = new C0093i(c0093i.f1344a, null, c0093i.f1346c, c0093i.d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0093i);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                x0.g.e("input", strArr);
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                x0.g.d("Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)", intentPutExtra);
                return intentPutExtra;
            default:
                Intent intent3 = (Intent) obj;
                x0.g.e("input", intent3);
                return intent3;
        }
    }

    @Override // P0.b
    public X.i p(AbstractActivityC0137i abstractActivityC0137i, Object obj) {
        switch (this.f1201m) {
            case 1:
                String[] strArr = (String[]) obj;
                x0.g.e("input", strArr);
                if (strArr.length == 0) {
                    return new X.i(19, l0.q.f2192b);
                }
                for (String str : strArr) {
                    if (v.d.a(abstractActivityC0137i, str) != 0) {
                        return null;
                    }
                }
                int iA0 = l0.s.a0(strArr.length);
                if (iA0 < 16) {
                    iA0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new X.i(19, linkedHashMap);
            default:
                return super.p(abstractActivityC0137i, obj);
        }
    }

    @Override // P0.b
    public final Object v(Intent intent, int i2) {
        switch (this.f1201m) {
            case 0:
                return new C0085a(intent, i2);
            case 1:
                l0.q qVar = l0.q.f2192b;
                if (i2 != -1 || intent == null) {
                    return qVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return qVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i3 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i3 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(l0.j.L(arrayList2), l0.j.L(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new C0230c(it.next(), it2.next()));
                }
                return l0.s.b0(arrayList3);
            default:
                return new C0085a(intent, i2);
        }
    }
}
