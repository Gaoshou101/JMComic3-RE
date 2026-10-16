package com.getcapacitor;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import c.C0085a;
import c.C0091g;
import c0.InterfaceC0094a;
import f0.AbstractC0116c;
import g.AbstractActivityC0137i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class D {
    private static final String BUNDLE_PERSISTED_OPTIONS_JSON_KEY = "_json";
    protected C0101f bridge;
    protected G handle;
    private String lastPluginCallId;

    @Deprecated
    protected E savedLastCall;
    private final Map<String, C0091g> activityLaunchers = new HashMap();
    private final Map<String, C0091g> permissionLaunchers = new HashMap();
    private final Map<String, List<E>> eventListeners = new HashMap();
    private final Map<String, List<w>> retainedEventArguments = new HashMap();

    public static void a(D d, Method method, C0085a c0085a) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        E e2;
        C0101f c0101f = d.bridge;
        String str = d.lastPluginCallId;
        if (str == null) {
            c0101f.getClass();
            e2 = null;
        } else {
            e2 = (E) c0101f.f1431w.get(str);
        }
        if (e2 == null) {
            C0101f c0101f2 = d.bridge;
            E e3 = c0101f2.f1432y;
            c0101f2.f1432y = null;
            e2 = e3;
        }
        try {
            method.setAccessible(true);
            method.invoke(d, e2, c0085a);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }

    @I(returnType = "none")
    public void addListener(E e2) {
        String strE = e2.e("eventName", null);
        e2.f1366f = true;
        List<E> list = this.eventListeners.get(strE);
        if (list != null && !list.isEmpty()) {
            list.add(e2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.eventListeners.put(strE, arrayList);
        arrayList.add(e2);
        List<w> list2 = this.retainedEventArguments.get(strE);
        if (list2 == null) {
            return;
        }
        this.retainedEventArguments.remove(strE);
        Iterator<w> it = list2.iterator();
        while (it.hasNext()) {
            notifyListeners(strE, it.next());
        }
    }

    public final void b(String[] strArr, E e2, String str) {
        C0091g c0091g = this.permissionLaunchers.get(str);
        if (c0091g == null) {
            Locale locale = Locale.US;
            String str2 = "There is no PermissionCallback method registered for the name: " + str + ". Please define a callback method annotated with @PermissionCallback that receives arguments: (PluginCall)";
            L.c.o(str2);
            c0091g = null;
            e2.f(str2, null, null);
        }
        if (c0091g == null) {
            return;
        }
        C0101f c0101f = this.bridge;
        if (e2 != null) {
            HashMap map = c0101f.x;
            String str3 = e2.f1363b;
            if (!map.containsKey(str3)) {
                map.put(str3, new LinkedList());
            }
            LinkedList linkedList = (LinkedList) map.get(str3);
            String str4 = e2.f1364c;
            linkedList.add(str4);
            c0101f.f1431w.put(str4, e2);
        } else {
            c0101f.getClass();
        }
        c0091g.a(strArr);
    }

    @c0.d
    @I
    public void checkPermissions(E e2) throws JSONException {
        Map<String, B> permissionStates = getPermissionStates();
        if (permissionStates.size() == 0) {
            e2.g();
            return;
        }
        w wVar = new w();
        for (Map.Entry<String, B> entry : permissionStates.entrySet()) {
            wVar.d(entry.getKey(), entry.getValue());
        }
        e2.h(wVar);
    }

    public void execute(Runnable runnable) {
        this.bridge.f1427s.post(runnable);
    }

    @Deprecated
    public void freeSavedCall() {
        E e2 = this.savedLastCall;
        C0101f c0101f = this.bridge;
        e2.f1366f = false;
        c0101f.getClass();
        c0101f.f1431w.remove(e2.f1364c);
        this.savedLastCall = null;
    }

    public AbstractActivityC0137i getActivity() {
        return this.bridge.f1412b;
    }

    public String getAppId() {
        return getContext().getPackageName();
    }

    public C0101f getBridge() {
        return this.bridge;
    }

    public F getConfig() {
        return this.bridge.f1411a.b(this.handle.d);
    }

    @Deprecated
    public Object getConfigValue(String str) {
        try {
            return getConfig().f1367a.get(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public Context getContext() {
        return this.bridge.f1412b;
    }

    public String getLogTag(String... strArr) {
        return L.c.F(strArr);
    }

    public B getPermissionState(String str) {
        return getPermissionStates().get(str);
    }

    public Map<String, B> getPermissionStates() {
        this.bridge.getClass();
        new HashMap();
        getPluginHandle().getClass();
        throw null;
    }

    public G getPluginHandle() {
        return this.handle;
    }

    @Deprecated
    public E getSavedCall() {
        return this.savedLastCall;
    }

    @Deprecated
    public void handleOnActivityResult(int i2, int i3, Intent intent) {
    }

    public void handleOnConfigurationChanged(Configuration configuration) {
    }

    public void handleOnDestroy() {
    }

    public void handleOnNewIntent(Intent intent) {
    }

    public void handleOnPause() {
    }

    public void handleOnRestart() {
    }

    public void handleOnResume() {
    }

    public void handleOnStart() {
    }

    public void handleOnStop() {
    }

    @Deprecated
    public void handleRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (hasDefinedPermissions(strArr)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Missing the following permissions in AndroidManifest.xml:\n");
        for (String str : AbstractC0116c.f(getContext(), strArr)) {
            sb.append(str + "\n");
        }
        this.savedLastCall.f(sb.toString(), null, null);
        this.savedLastCall = null;
    }

    @Deprecated
    public boolean hasDefinedPermissions(String[] strArr) {
        for (String str : strArr) {
            if (!AbstractC0116c.g(getContext(), str)) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public boolean hasDefinedRequiredPermissions() {
        this.handle.getClass();
        throw null;
    }

    public boolean hasListeners(String str) {
        if (this.eventListeners.get(str) == null) {
            return false;
        }
        return !r2.isEmpty();
    }

    @Deprecated
    public boolean hasPermission(String str) {
        return v.d.a(getContext(), str) == 0;
    }

    @Deprecated
    public boolean hasRequiredPermissions() {
        this.handle.getClass();
        throw null;
    }

    public void initializeActivityLaunchers() {
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = getClass(); !superclass.getName().equals(Object.class.getName()); superclass = superclass.getSuperclass()) {
            arrayList.addAll(Arrays.asList(superclass.getDeclaredMethods()));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Method method = (Method) it.next();
            if (method.isAnnotationPresent(InterfaceC0094a.class)) {
                this.activityLaunchers.put(method.getName(), this.bridge.e(new androidx.fragment.app.m(2), new C(this, 1, method)));
            } else if (method.isAnnotationPresent(c0.d.class)) {
                this.permissionLaunchers.put(method.getName(), this.bridge.e(new androidx.fragment.app.m(1), new C(this, 0, method)));
            }
        }
    }

    public boolean isPermissionDeclared(String str) {
        this.handle.getClass();
        L.c.o("isPermissionDeclared: No alias defined for " + str + " or missing @CapacitorPlugin annotation.");
        return false;
    }

    public void load() {
    }

    public void notifyListeners(String str, w wVar, boolean z2) {
        String logTag = getLogTag();
        String str2 = "Notifying listeners for event " + str;
        if (L.c.E()) {
            Log.v(logTag, str2);
        }
        List<E> list = this.eventListeners.get(str);
        if (list != null && !list.isEmpty()) {
            Iterator it = new CopyOnWriteArrayList(list).iterator();
            while (it.hasNext()) {
                ((E) it.next()).h(wVar);
            }
            return;
        }
        L.c.l(getLogTag(), "No listeners found for event " + str);
        if (z2) {
            List<w> arrayList = this.retainedEventArguments.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(wVar);
            this.retainedEventArguments.put(str, arrayList);
        }
    }

    @Deprecated
    public void pluginRequestAllPermissions() {
        this.handle.getClass();
        getActivity();
        throw null;
    }

    @Deprecated
    public void pluginRequestPermission(String str, int i2) {
        v.d.g(getActivity(), new String[]{str}, i2);
    }

    @Deprecated
    public void pluginRequestPermissions(String[] strArr, int i2) {
        v.d.g(getActivity(), strArr, i2);
    }

    @I(returnType = "promise")
    public void removeAllListeners(E e2) {
        this.eventListeners.clear();
        e2.g();
    }

    @I(returnType = "none")
    public void removeListener(E e2) {
        E e3 = null;
        String strE = e2.e("eventName", null);
        String strE2 = e2.e("callbackId", null);
        C0101f c0101f = this.bridge;
        if (strE2 == null) {
            c0101f.getClass();
        } else {
            e3 = (E) c0101f.f1431w.get(strE2);
        }
        if (e3 != null) {
            List<E> list = this.eventListeners.get(strE);
            if (list != null) {
                list.remove(e3);
            }
            C0101f c0101f2 = this.bridge;
            c0101f2.getClass();
            c0101f2.f1431w.remove(e3.f1364c);
        }
    }

    public void requestAllPermissions(E e2, String str) {
        this.handle.getClass();
    }

    public void requestPermissionForAlias(String str, E e2, String str2) {
        requestPermissionForAliases(new String[]{str}, e2, str2);
    }

    public void requestPermissionForAliases(String[] strArr, E e2, String str) {
        if (strArr.length == 0) {
            L.c.o("No permission alias was provided");
        } else {
            this.handle.getClass();
            new HashSet();
            throw null;
        }
    }

    @I
    public void requestPermissions(E e2) {
        this.handle.getClass();
        throw null;
    }

    public void restoreState(Bundle bundle) {
    }

    @Deprecated
    public void saveCall(E e2) {
        this.savedLastCall = e2;
    }

    public Bundle saveInstanceState() {
        E e2;
        C0101f c0101f = this.bridge;
        String str = this.lastPluginCallId;
        if (str == null) {
            c0101f.getClass();
            e2 = null;
        } else {
            e2 = (E) c0101f.f1431w.get(str);
        }
        if (e2 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        w wVar = e2.f1365e;
        if (wVar != null) {
            bundle.putString(BUNDLE_PERSISTED_OPTIONS_JSON_KEY, wVar.toString());
        }
        return bundle;
    }

    public void setBridge(C0101f c0101f) {
        this.bridge = c0101f;
    }

    public void setPluginHandle(G g2) {
        this.handle = g2;
    }

    public Boolean shouldOverrideLoad(Uri uri) {
        return null;
    }

    public void startActivityForResult(E e2, Intent intent, String str) {
        C0091g c0091g = this.activityLaunchers.get(str);
        if (c0091g == null) {
            Locale locale = Locale.US;
            String str2 = "There is no ActivityCallback method registered for the name: " + str + ". Please define a callback method annotated with @ActivityCallback that receives arguments: (PluginCall, ActivityResult)";
            L.c.o(str2);
            c0091g = null;
            e2.f(str2, null, null);
        }
        if (c0091g == null) {
            return;
        }
        C0101f c0101f = this.bridge;
        c0101f.f1432y = e2;
        String str3 = e2.f1364c;
        this.lastPluginCallId = str3;
        c0101f.f1431w.put(str3, e2);
        c0091g.a(intent);
    }

    public String getLogTag() {
        return L.c.F(getClass().getSimpleName());
    }

    public void removeAllListeners() {
        this.eventListeners.clear();
    }

    public void notifyListeners(String str, w wVar) {
        notifyListeners(str, wVar, false);
    }

    @Deprecated
    public void startActivityForResult(E e2, Intent intent, int i2) {
        C0101f c0101f = this.bridge;
        c0101f.getClass();
        L.c.j("Starting activity for result");
        c0101f.f1432y = e2;
        c0101f.f1412b.startActivityForResult(intent, i2);
    }
}
