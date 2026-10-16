package N0;

import android.content.Intent;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final Map f484a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f485b;

    /* renamed from: c, reason: collision with root package name */
    public final m f486c;
    public final t d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f487e;

    static {
        Debug.isDebuggerConnected();
    }

    public K(t tVar, m mVar, List list) {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        this.f484a = mapSynchronizedMap;
        Map mapSynchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        this.f485b = mapSynchronizedMap2;
        this.f486c = mVar;
        this.d = tVar;
        if (this.f487e) {
            g(false);
            e();
            mapSynchronizedMap.clear();
            mapSynchronizedMap2.clear();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I i2 = (I) it.next();
            this.f485b.put(i2.f479a, i2);
        }
        if (this.f487e) {
            o();
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        o oVarC = c(str);
        t tVar = this.d;
        if (oVarC == null) {
            tVar.sendPluginResult(new L(3), str3);
            return;
        }
        C0053d c0053d = new C0053d(str3, tVar);
        try {
            System.currentTimeMillis();
            boolean zExecute = oVarC.execute(str2, str4, c0053d);
            System.currentTimeMillis();
            if (zExecute) {
                return;
            }
            c0053d.sendPluginResult(new L(8));
        } catch (JSONException unused) {
            c0053d.sendPluginResult(new L(9));
        } catch (Exception e2) {
            Log.e("PluginManager", "Uncaught exception from plugin", e2);
            c0053d.error(e2.getMessage());
        }
    }

    public final String b() {
        t tVar = this.d;
        if (tVar.getPreferences().a("AndroidInsecureFileModeEnabled", false)) {
            return "file://";
        }
        return tVar.getPreferences().b("scheme", "https").toLowerCase() + "://" + tVar.getPreferences().b("hostname", "localhost") + '/';
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final N0.o c(java.lang.String r7) {
        /*
            r6 = this;
            java.util.Map r0 = r6.f484a
            java.lang.Object r1 = r0.get(r7)
            N0.o r1 = (N0.o) r1
            if (r1 != 0) goto L6b
            java.util.Map r1 = r6.f485b
            java.lang.Object r1 = r1.get(r7)
            N0.I r1 = (N0.I) r1
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            java.lang.String r1 = r1.f480b
            if (r1 == 0) goto L29
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Exception -> L27
            if (r3 != 0) goto L29
            java.lang.Class r3 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L27
            goto L2a
        L27:
            r3 = move-exception
            goto L41
        L29:
            r3 = r2
        L2a:
            if (r3 == 0) goto L2e
            r4 = 1
            goto L2f
        L2e:
            r4 = 0
        L2f:
            java.lang.Class<N0.o> r5 = N0.o.class
            boolean r5 = r5.isAssignableFrom(r3)     // Catch: java.lang.Exception -> L27
            r4 = r4 & r5
            if (r4 == 0) goto L3f
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.Exception -> L27
            N0.o r3 = (N0.o) r3     // Catch: java.lang.Exception -> L27
            r2 = r3
        L3f:
            r1 = r2
            goto L5d
        L41:
            r3.printStackTrace()
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Error adding plugin "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = "."
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.println(r1)
            goto L3f
        L5d:
            N0.t r2 = r6.d
            N0.q r3 = r2.getPreferences()
            N0.m r4 = r6.f486c
            r1.privateInitialize(r7, r4, r2, r3)
            r0.put(r7, r1)
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.K.c(java.lang.String):N0.o");
    }

    public final void d() {
        this.f487e = true;
        g(false);
        e();
        this.f484a.clear();
        o();
    }

    public final void e() {
        synchronized (this.f484a) {
            try {
                for (o oVar : this.f484a.values()) {
                    if (oVar != null) {
                        oVar.onDestroy();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Intent intent) {
        synchronized (this.f484a) {
            try {
                for (o oVar : this.f484a.values()) {
                    if (oVar != null) {
                        oVar.onNewIntent(intent);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(boolean z2) {
        synchronized (this.f484a) {
            try {
                for (o oVar : this.f484a.values()) {
                    if (oVar != null) {
                        oVar.onPause(z2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(boolean z2) {
        synchronized (this.f484a) {
            try {
                for (o oVar : this.f484a.values()) {
                    if (oVar != null) {
                        oVar.onResume(z2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f484a) {
            try {
                for (o oVar : this.f484a.values()) {
                    if (oVar != null) {
                        oVar.onStart();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.f484a) {
            try {
                for (o oVar : this.f484a.values()) {
                    if (oVar != null) {
                        oVar.onStop();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [N0.J] */
    public final Object k(final String str, final Object obj) {
        Object objOnMessage;
        synchronized (this.f484a) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f484a.forEach(new BiConsumer() { // from class: N0.J
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj2, Object obj3) {
                            String str2 = str;
                            Object obj4 = obj;
                            o oVar = (o) obj3;
                            if (oVar != null) {
                                oVar.onMessage(str2, obj4);
                            }
                        }
                    });
                } else {
                    for (o oVar : this.f484a.values()) {
                        if (oVar != null && (objOnMessage = oVar.onMessage(str, obj)) != null) {
                            return objOnMessage;
                        }
                    }
                }
                return this.f486c.onMessage(str, obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l(String str) {
        Boolean boolShouldAllowNavigation;
        synchronized (this.f485b) {
            try {
                Iterator it = this.f485b.values().iterator();
                while (it.hasNext()) {
                    o oVar = (o) this.f484a.get(((I) it.next()).f479a);
                    if (oVar != null && (boolShouldAllowNavigation = oVar.shouldAllowNavigation(str)) != null) {
                        return boolShouldAllowNavigation.booleanValue();
                    }
                }
                return str.startsWith(b()) || str.startsWith("about:blank");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m(String str) {
        Boolean boolShouldAllowRequest;
        synchronized (this.f485b) {
            try {
                Iterator it = this.f485b.values().iterator();
                while (it.hasNext()) {
                    o oVar = (o) this.f484a.get(((I) it.next()).f479a);
                    if (oVar != null && (boolShouldAllowRequest = oVar.shouldAllowRequest(str)) != null) {
                        return boolShouldAllowRequest.booleanValue();
                    }
                }
                if (str.startsWith("blob:") || str.startsWith("data:") || str.startsWith("about:blank") || str.startsWith("https://ssl.gstatic.com/accessibility/javascript/android/")) {
                    return true;
                }
                if (str.startsWith("file://")) {
                    return !str.contains("/app_webview/");
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Boolean n(String str) {
        Boolean boolShouldOpenExternalUrl;
        synchronized (this.f485b) {
            try {
                Iterator it = this.f485b.values().iterator();
                while (it.hasNext()) {
                    o oVar = (o) this.f484a.get(((I) it.next()).f479a);
                    if (oVar != null && (boolShouldOpenExternalUrl = oVar.shouldOpenExternalUrl(str)) != null) {
                        return boolShouldOpenExternalUrl;
                    }
                }
                return Boolean.FALSE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        synchronized (this.f485b) {
            try {
                for (I i2 : this.f485b.values()) {
                    if (i2.f481c) {
                        c(i2.f479a);
                    } else {
                        this.f484a.put(i2.f479a, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
