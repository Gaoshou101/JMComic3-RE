package D;

import F0.AbstractC0015p;
import F0.AbstractC0019u;
import N0.H;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m.V;
import n0.C0317j;
import org.apache.cordova.CordovaWebViewImpl;
import org.apache.cordova.NativeToJsMessageQueue$EvalBridgeMode;
import org.apache.cordova.NativeToJsMessageQueue$LoadUrlBridgeMode;
import org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewEngine;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import v.AbstractC0340c;
import v.C0339b;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj, int i2, Object obj2) {
        this.f14b = i2;
        this.f15c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i2 = 0;
        Object obj = this.d;
        switch (this.f14b) {
            case 0:
                V v2 = (V) ((X.i) this.f15c).f715b;
                if (v2 != null) {
                    v2.b((Typeface) obj);
                    return;
                }
                return;
            case 1:
                ((j) this.f15c).a(obj);
                return;
            case 2:
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                CordovaWebViewImpl cordovaWebViewImpl = (CordovaWebViewImpl) obj;
                cordovaWebViewImpl.stopLoading();
                Log.e(CordovaWebViewImpl.TAG, "CordovaWebView: TIMEOUT ERROR!");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errorCode", -6);
                    jSONObject.put("description", "The connection to the server was unsuccessful.");
                    jSONObject.put("url", (String) this.f15c);
                } catch (JSONException unused) {
                }
                cordovaWebViewImpl.f2533a.k("onReceivedError", jSONObject);
                return;
            case 4:
                String strE = ((H) this.f15c).e();
                if (strE != null) {
                    ((NativeToJsMessageQueue$EvalBridgeMode) obj).f2550a.evaluateJavascript(strE, null);
                    return;
                }
                return;
            case 5:
                String strE2 = ((H) this.f15c).e();
                if (strE2 != null) {
                    ((NativeToJsMessageQueue$LoadUrlBridgeMode) obj).f2552a.loadUrl("javascript:".concat(strE2), false);
                    return;
                }
                return;
            case 6:
                if (((H) this.f15c).f477b.isEmpty()) {
                    return;
                }
                NativeToJsMessageQueue$OnlineEventsBridgeMode nativeToJsMessageQueue$OnlineEventsBridgeMode = (NativeToJsMessageQueue$OnlineEventsBridgeMode) obj;
                nativeToJsMessageQueue$OnlineEventsBridgeMode.f2556c = false;
                boolean z2 = nativeToJsMessageQueue$OnlineEventsBridgeMode.f2555b;
                SystemWebView systemWebView = ((SystemWebViewEngine) ((X.i) nativeToJsMessageQueue$OnlineEventsBridgeMode.f2554a).f715b).f2563a;
                if (systemWebView != null) {
                    systemWebView.setNetworkAvailable(z2);
                    return;
                }
                return;
            case 7:
                ((C0339b) this.f15c).f2675a = obj;
                return;
            case 8:
                ((Application) this.f15c).unregisterActivityLifecycleCallbacks((C0339b) obj);
                return;
            default:
                try {
                    Method method = AbstractC0340c.d;
                    Object obj2 = this.f15c;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0340c.f2683e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
        }
        while (true) {
            try {
                ((Runnable) this.f15c).run();
            } catch (Throwable th2) {
                AbstractC0019u.d(th2, C0317j.f2507b);
            }
            K0.g gVar = (K0.g) obj;
            Runnable runnableI = gVar.i();
            if (runnableI == null) {
                return;
            }
            this.f15c = runnableI;
            i2++;
            if (i2 >= 16) {
                AbstractC0015p abstractC0015p = gVar.d;
                if (abstractC0015p.f(gVar)) {
                    abstractC0015p.d(gVar, this);
                    return;
                }
            }
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i2, boolean z2) {
        this.f14b = i2;
        this.d = obj;
        this.f15c = obj2;
    }
}
