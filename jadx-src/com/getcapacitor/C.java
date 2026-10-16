package com.getcapacitor;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import c.C0085a;
import c.InterfaceC0086b;
import com.a7m3p9xv.t6qk2z8.app.MainActivity;
import f0.AbstractC0116c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements InterfaceC0086b, InterfaceC0109n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1358c;

    public /* synthetic */ C(Object obj, int i2, Object obj2) {
        this.f1356a = i2;
        this.f1357b = obj;
        this.f1358c = obj2;
    }

    @Override // c.InterfaceC0086b
    public void a(Object obj) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z2;
        boolean z3;
        boolean zShouldShowRequestPermissionRationale;
        boolean zShouldShowRequestPermissionRationale2;
        Object obj2 = this.f1357b;
        Method method = (Method) this.f1358c;
        switch (this.f1356a) {
            case 0:
                Map map = (Map) obj;
                D d = (D) obj2;
                C0101f c0101f = d.bridge;
                LinkedList linkedList = (LinkedList) c0101f.x.get(d.handle.d);
                String str = null;
                String str2 = linkedList != null ? (String) linkedList.poll() : null;
                E e2 = str2 == null ? null : (E) c0101f.f1431w.get(str2);
                MainActivity mainActivity = d.bridge.f1412b;
                SharedPreferences sharedPreferences = mainActivity.getSharedPreferences("PluginPermStates", 0);
                for (Map.Entry entry : map.entrySet()) {
                    String str3 = (String) entry.getKey();
                    if (!((Boolean) entry.getValue()).booleanValue()) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str3)) {
                            zShouldShowRequestPermissionRationale2 = false;
                        } else if (i2 < 32 && i2 == 31) {
                            try {
                                zShouldShowRequestPermissionRationale = ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(mainActivity.getApplication().getPackageManager(), str3)).booleanValue();
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                                zShouldShowRequestPermissionRationale = mainActivity.shouldShowRequestPermissionRationale(str3);
                            }
                            zShouldShowRequestPermissionRationale2 = zShouldShowRequestPermissionRationale;
                        } else {
                            zShouldShowRequestPermissionRationale2 = mainActivity.shouldShowRequestPermissionRationale(str3);
                        }
                        if (zShouldShowRequestPermissionRationale2) {
                            editorEdit.putString(str3, "prompt-with-rationale");
                        } else {
                            editorEdit.putString(str3, "denied");
                        }
                        editorEdit.apply();
                    } else if (sharedPreferences.getString(str3, str) != null) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        editorEdit2.remove(str3);
                        editorEdit2.apply();
                    }
                    str = null;
                }
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                int length = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = true;
                    } else if (AbstractC0116c.g(mainActivity, strArr[i3])) {
                        i3++;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    z3 = true;
                } else {
                    StringBuilder sb = new StringBuilder("Missing the following permissions in AndroidManifest.xml:\n");
                    for (String str4 : AbstractC0116c.f(mainActivity, strArr)) {
                        sb.append(str4 + "\n");
                    }
                    e2.f(sb.toString(), null, null);
                    z3 = false;
                }
                if (z3) {
                    try {
                        method.setAccessible(true);
                        method.invoke(d, e2);
                        break;
                    } catch (IllegalAccessException | InvocationTargetException e3) {
                        e3.printStackTrace();
                        return;
                    }
                }
                break;
            default:
                D.a((D) obj2, method, (C0085a) obj);
                break;
        }
    }

    @Override // com.getcapacitor.InterfaceC0109n
    public void b(C0085a c0085a) {
        ((ValueCallback) this.f1358c).onReceiveValue(c0085a.f1331a == -1 ? new Uri[]{(Uri) this.f1357b} : null);
    }
}
