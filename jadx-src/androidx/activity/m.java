package androidx.activity;

import a.AbstractC0062a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c.C0085a;
import c.C0088d;
import c.C0089e;
import c.C0091g;
import c.C0093i;
import c.InterfaceC0086b;
import g.AbstractActivityC0137i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f844a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f845b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f846c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f847e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f848f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f849g = new Bundle();
    public final /* synthetic */ AbstractActivityC0137i h;

    public m(AbstractActivityC0137i abstractActivityC0137i) {
        this.h = abstractActivityC0137i;
    }

    public final boolean a(int i2, int i3, Intent intent) {
        String str = (String) this.f844a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        C0088d c0088d = (C0088d) this.f847e.get(str);
        if ((c0088d != null ? c0088d.f1336a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                c0088d.f1336a.a(c0088d.f1337b.v(intent, i3));
                arrayList.remove(str);
                return true;
            }
        }
        this.f848f.remove(str);
        this.f849g.putParcelable(str, new C0085a(intent, i3));
        return true;
    }

    public final void b(int i2, P0.b bVar, Object obj) {
        Bundle bundle;
        AbstractActivityC0137i abstractActivityC0137i = this.h;
        X.i iVarP = bVar.p(abstractActivityC0137i, obj);
        if (iVarP != null) {
            new Handler(Looper.getMainLooper()).post(new Q.a(this, i2, iVarP, 1));
            return;
        }
        Intent intentG = bVar.g(abstractActivityC0137i, obj);
        if (intentG.getExtras() != null) {
            Bundle extras = intentG.getExtras();
            x0.g.b(extras);
            if (extras.getClassLoader() == null) {
                intentG.setExtrasClassLoader(abstractActivityC0137i.getClassLoader());
            }
        }
        if (intentG.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentG.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentG.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentG.getAction())) {
            String[] stringArrayExtra = intentG.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            v.d.g(abstractActivityC0137i, stringArrayExtra, i2);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentG.getAction())) {
            abstractActivityC0137i.startActivityForResult(intentG, i2, bundle);
            return;
        }
        C0093i c0093i = (C0093i) intentG.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            x0.g.b(c0093i);
            abstractActivityC0137i.startIntentSenderForResult(c0093i.f1344a, i2, c0093i.f1345b, c0093i.f1346c, c0093i.d, 0, bundle);
        } catch (IntentSender.SendIntentException e2) {
            new Handler(Looper.getMainLooper()).post(new Q.a(this, i2, e2, 2));
        }
    }

    public final C0091g c(String str, P0.b bVar, InterfaceC0086b interfaceC0086b) {
        x0.g.e("key", str);
        d(str);
        this.f847e.put(str, new C0088d(bVar, interfaceC0086b));
        LinkedHashMap linkedHashMap = this.f848f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC0086b.a(obj);
        }
        Bundle bundle = this.f849g;
        C0085a c0085a = (C0085a) AbstractC0062a.A(str, bundle);
        if (c0085a != null) {
            bundle.remove(str);
            interfaceC0086b.a(bVar.v(c0085a.f1332b, c0085a.f1331a));
        }
        return new C0091g(this, str, bVar, 1);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.f845b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = new D0.a(new D0.c(0, new D0.g(1))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int iIntValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f844a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                int iIntValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        x0.g.e("key", str);
        if (!this.d.contains(str) && (num = (Integer) this.f845b.remove(str)) != null) {
            this.f844a.remove(num);
        }
        this.f847e.remove(str);
        LinkedHashMap linkedHashMap = this.f848f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f849g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0085a) AbstractC0062a.A(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f846c;
        C0089e c0089e = (C0089e) linkedHashMap2.get(str);
        if (c0089e != null) {
            ArrayList arrayList = c0089e.f1339b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0089e.f1338a.f((androidx.lifecycle.p) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
