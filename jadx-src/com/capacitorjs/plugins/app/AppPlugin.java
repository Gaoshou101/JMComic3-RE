package com.capacitorjs.plugins.app;

import A.a;
import L.c;
import R.e;
import Z.b;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import androidx.activity.C;
import c0.InterfaceC0095b;
import com.getcapacitor.D;
import com.getcapacitor.E;
import com.getcapacitor.I;
import com.getcapacitor.K;
import com.getcapacitor.w;
import f0.AbstractC0116c;
import org.json.JSONException;

@InterfaceC0095b(name = "App")
/* loaded from: classes.dex */
public class AppPlugin extends D {
    private static final String EVENT_BACK_BUTTON = "backButton";
    private static final String EVENT_PAUSE = "pause";
    private static final String EVENT_RESTORED_RESULT = "appRestoredResult";
    private static final String EVENT_RESUME = "resume";
    private static final String EVENT_STATE_CHANGE = "appStateChange";
    private static final String EVENT_URL_OPEN = "appUrlOpen";
    private boolean hasPausedEver = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$load$0(Boolean bool) throws JSONException {
        c.l(getLogTag(), "Firing change: " + bool);
        w wVar = new w();
        wVar.d("isActive", bool);
        notifyListeners(EVENT_STATE_CHANGE, wVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$load$1(K k2) throws JSONException {
        w wVarA;
        c.l(getLogTag(), "Firing restored result");
        k2.getClass();
        w wVar = new w();
        w wVar2 = k2.f1375a;
        wVar.e("pluginId", wVar2.getString("pluginId"));
        wVar.e("methodName", wVar2.getString("methodName"));
        Boolean boolValueOf = Boolean.FALSE;
        try {
            boolValueOf = Boolean.valueOf(wVar2.getBoolean("success"));
        } catch (JSONException unused) {
        }
        wVar.d("success", boolValueOf);
        w wVarA2 = null;
        try {
            wVarA = wVar2.a("data", null);
        } catch (JSONException unused2) {
            wVarA = null;
        }
        wVar.d("data", wVarA);
        try {
            wVarA2 = wVar2.a("error", null);
        } catch (JSONException unused3) {
        }
        wVar.d("error", wVarA2);
        notifyListeners(EVENT_RESTORED_RESULT, wVar, true);
    }

    private void unsetAppListeners() {
        e eVar = this.bridge.f1424p;
        eVar.f614b = null;
        eVar.f615c = null;
    }

    @I
    public void exitApp(E e2) {
        unsetAppListeners();
        e2.g();
        getBridge().f1412b.finish();
    }

    @I
    public void getInfo(E e2) {
        w wVar = new w();
        try {
            PackageInfo packageInfoD = AbstractC0116c.d(getContext().getPackageManager(), getContext().getPackageName(), 0L);
            ApplicationInfo applicationInfo = getContext().getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            wVar.e("name", i2 == 0 ? applicationInfo.nonLocalizedLabel.toString() : getContext().getString(i2));
            wVar.e("id", packageInfoD.packageName);
            wVar.e("build", Integer.toString((int) (Build.VERSION.SDK_INT >= 28 ? a.b(packageInfoD) : packageInfoD.versionCode)));
            wVar.e("version", packageInfoD.versionName);
            e2.h(wVar);
        } catch (Exception unused) {
            e2.f("Unable to get App Info", null, null);
        }
    }

    @I
    public void getLaunchUrl(E e2) throws JSONException {
        Uri uri = this.bridge.f1433z;
        if (uri == null) {
            e2.g();
            return;
        }
        w wVar = new w();
        wVar.e("url", uri.toString());
        e2.h(wVar);
    }

    @I
    public void getState(E e2) throws JSONException {
        w wVar = new w();
        wVar.f("isActive", this.bridge.f1424p.f613a);
        e2.h(wVar);
    }

    @Override // com.getcapacitor.D
    public void handleOnDestroy() {
        unsetAppListeners();
    }

    @Override // com.getcapacitor.D
    public void handleOnNewIntent(Intent intent) throws JSONException {
        super.handleOnNewIntent(intent);
        String action = intent.getAction();
        Uri data = intent.getData();
        if (!"android.intent.action.VIEW".equals(action) || data == null) {
            return;
        }
        w wVar = new w();
        wVar.e("url", data.toString());
        notifyListeners(EVENT_URL_OPEN, wVar, true);
    }

    @Override // com.getcapacitor.D
    public void handleOnPause() {
        super.handleOnPause();
        this.hasPausedEver = true;
        notifyListeners(EVENT_PAUSE, null);
    }

    @Override // com.getcapacitor.D
    public void handleOnResume() {
        super.handleOnResume();
        if (this.hasPausedEver) {
            notifyListeners(EVENT_RESUME, null);
        }
    }

    @Override // com.getcapacitor.D
    public void load() {
        e eVar = this.bridge.f1424p;
        eVar.f614b = new Z.a(this);
        eVar.f615c = new Z.a(this);
        ((C) getActivity().f866r.a()).a(getActivity(), new b(this));
    }

    @I
    public void minimizeApp(E e2) {
        getActivity().moveTaskToBack(true);
        e2.g();
    }
}
