package com.getcapacitor;

import a.AbstractC0062a;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.webkit.WebView;
import androidx.activity.m;
import androidx.lifecycle.EnumC0080l;
import androidx.lifecycle.EnumC0081m;
import androidx.lifecycle.r;
import c.C0089e;
import c.C0091g;
import c.InterfaceC0086b;
import c0.InterfaceC0095b;
import com.a7m3p9xv.t6qk2z8.app.MainActivity;
import com.getcapacitor.cordova.MockCordovaInterfaceImpl;
import com.getcapacitor.cordova.MockCordovaWebViewImpl;
import f0.InterfaceC0117d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.getcapacitor.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101f {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f1410A;

    /* renamed from: a, reason: collision with root package name */
    public final r f1411a;

    /* renamed from: b, reason: collision with root package name */
    public final MainActivity f1412b;

    /* renamed from: c, reason: collision with root package name */
    public final O f1413c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1414e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1415f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0117d f1416g;
    public final HashSet h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1417i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1418j;

    /* renamed from: k, reason: collision with root package name */
    public final WebView f1419k;

    /* renamed from: l, reason: collision with root package name */
    public final MockCordovaInterfaceImpl f1420l;

    /* renamed from: m, reason: collision with root package name */
    public MockCordovaWebViewImpl f1421m;

    /* renamed from: n, reason: collision with root package name */
    public final N0.q f1422n;

    /* renamed from: o, reason: collision with root package name */
    public final q f1423o;

    /* renamed from: p, reason: collision with root package name */
    public final R.e f1424p;

    /* renamed from: q, reason: collision with root package name */
    public final z f1425q;

    /* renamed from: r, reason: collision with root package name */
    public final HandlerThread f1426r;

    /* renamed from: s, reason: collision with root package name */
    public final Handler f1427s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f1428t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f1429u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f1430v;

    /* renamed from: w, reason: collision with root package name */
    public HashMap f1431w;
    public final HashMap x;

    /* renamed from: y, reason: collision with root package name */
    public E f1432y;

    /* renamed from: z, reason: collision with root package name */
    public final Uri f1433z;

    /* JADX WARN: Removed duplicated region for block: B:132:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0101f(com.a7m3p9xv.t6qk2z8.app.MainActivity r19, android.webkit.WebView r20, java.util.ArrayList r21, java.util.ArrayList r22, com.getcapacitor.cordova.MockCordovaInterfaceImpl r23, N0.K r24, N0.q r25) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getcapacitor.C0101f.<init>(com.a7m3p9xv.t6qk2z8.app.MainActivity, android.webkit.WebView, java.util.ArrayList, java.util.ArrayList, com.getcapacitor.cordova.MockCordovaInterfaceImpl, N0.K, N0.q):void");
    }

    public static String d(Class cls) {
        String strName;
        InterfaceC0095b interfaceC0095b = (InterfaceC0095b) cls.getAnnotation(InterfaceC0095b.class);
        if (interfaceC0095b == null) {
            A a2 = (A) cls.getAnnotation(A.class);
            if (a2 == null) {
                L.c.o("Plugin doesn't have the @CapacitorPlugin annotation. Please add it");
                strName = null;
            } else {
                strName = a2.name();
            }
        } else {
            strName = interfaceC0095b.name();
        }
        String simpleName = cls.getSimpleName();
        if (strName == null) {
            return null;
        }
        if (strName.equals("")) {
            strName = simpleName;
        }
        L.c.j("Registering plugin instance: ".concat(strName));
        return strName;
    }

    public final String a() {
        r rVar = this.f1411a;
        String str = rVar.f1473q;
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String str2 = rVar.f1461c;
        return (rVar.d + "://" + str2) + "/" + str;
    }

    public final G b(int i2) {
        Iterator it = this.f1430v.values().iterator();
        while (it.hasNext()) {
            ((G) it.next()).getClass();
        }
        return null;
    }

    public final boolean c(Uri uri) {
        Boolean boolShouldOverrideLoad;
        Iterator it = this.f1430v.entrySet().iterator();
        while (it.hasNext()) {
            D d = ((G) ((Map.Entry) it.next()).getValue()).f1371e;
            if (d != null && (boolShouldOverrideLoad = d.shouldOverrideLoad(uri)) != null) {
                return boolShouldOverrideLoad.booleanValue();
            }
        }
        if (!uri.getScheme().equals("data") && !uri.getScheme().equals("blob")) {
            Uri uri2 = Uri.parse(this.f1414e);
            if ((!uri2.getHost().equals(uri.getHost()) || !uri.getScheme().equals(uri2.getScheme())) && !this.f1416g.a(uri.getHost())) {
                try {
                    this.f1412b.startActivity(new Intent("android.intent.action.VIEW", uri));
                    return true;
                } catch (ActivityNotFoundException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C0091g e(final P0.b bVar, final InterfaceC0086b interfaceC0086b) {
        MainActivity mainActivity = this.f1412b;
        mainActivity.getClass();
        final androidx.activity.m mVar = mainActivity.f857i;
        x0.g.e("registry", mVar);
        final String str = "activity_rq#" + mainActivity.h.getAndIncrement();
        x0.g.e("key", str);
        androidx.lifecycle.t tVar = mainActivity.f2687a;
        if (tVar.f1311c.compareTo(EnumC0081m.f1303e) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + mainActivity + " is attempting to register while current state is " + tVar.f1311c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        mVar.d(str);
        LinkedHashMap linkedHashMap = mVar.f846c;
        C0089e c0089e = (C0089e) linkedHashMap.get(str);
        if (c0089e == null) {
            c0089e = new C0089e(tVar);
        }
        androidx.lifecycle.p pVar = new androidx.lifecycle.p() { // from class: c.c
            @Override // androidx.lifecycle.p
            public final void b(r rVar, EnumC0080l enumC0080l) {
                m mVar2 = mVar;
                x0.g.e("this$0", mVar2);
                String str2 = str;
                InterfaceC0086b interfaceC0086b2 = interfaceC0086b;
                P0.b bVar2 = bVar;
                EnumC0080l enumC0080l2 = EnumC0080l.ON_START;
                LinkedHashMap linkedHashMap2 = mVar2.f847e;
                if (enumC0080l2 != enumC0080l) {
                    if (EnumC0080l.ON_STOP == enumC0080l) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (EnumC0080l.ON_DESTROY == enumC0080l) {
                            mVar2.e(str2);
                            return;
                        }
                        return;
                    }
                }
                linkedHashMap2.put(str2, new C0088d(bVar2, interfaceC0086b2));
                LinkedHashMap linkedHashMap3 = mVar2.f848f;
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    interfaceC0086b2.a(obj);
                }
                Bundle bundle = mVar2.f849g;
                C0085a c0085a = (C0085a) AbstractC0062a.A(str2, bundle);
                if (c0085a != null) {
                    bundle.remove(str2);
                    interfaceC0086b2.a(bVar2.v(c0085a.f1332b, c0085a.f1331a));
                }
            }
        };
        c0089e.f1338a.a(pVar);
        c0089e.f1339b.add(pVar);
        linkedHashMap.put(str, c0089e);
        return new C0091g(mVar, str, bVar, 0);
    }

    public final void f(Class cls) {
        String strD = d(cls);
        if (strD == null) {
            return;
        }
        try {
            HashMap map = this.f1430v;
            G g2 = new G(cls, this);
            g2.b();
            map.put(strD, g2);
        } catch (H e2) {
            L.c.p("NativePlugin " + cls.getName() + " failed to load", e2);
        } catch (s unused) {
            L.c.o("NativePlugin " + cls.getName() + " is invalid. Ensure the @CapacitorPlugin annotation exists on the plugin class and the class extends Plugin");
        }
    }
}
