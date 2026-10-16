package org.apache.cordova;

import N0.A;
import N0.C0053d;
import N0.L;
import N0.o;
import N0.z;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CoreAndroid extends o {
    public static final String PLUGIN_NAME = "CoreAndroid";

    /* renamed from: b, reason: collision with root package name */
    public A f2546b;

    /* renamed from: c, reason: collision with root package name */
    public C0053d f2547c;
    public L d;

    /* renamed from: e, reason: collision with root package name */
    public L f2548e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2549f = new Object();

    public static Object getBuildConfigValue(Context context, String str) {
        try {
            return Class.forName(context.getClass().getPackage().getName() + ".BuildConfig").getField(str).get(null);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        } catch (NullPointerException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public void backHistory() {
        this.cordova.getActivity().runOnUiThread(new z(this, 3));
    }

    public void clearCache() {
        this.cordova.getActivity().runOnUiThread(new z(this, 1));
    }

    public void clearHistory() {
        this.cordova.getActivity().runOnUiThread(new z(this, 2));
    }

    @Override // N0.o
    public boolean execute(String str, JSONArray jSONArray, C0053d c0053d) {
        try {
            if (str.equals("clearCache")) {
                clearCache();
            } else if (str.equals("show")) {
                this.cordova.getActivity().runOnUiThread(new z(this, 0));
            } else if (str.equals("loadUrl")) {
                loadUrl(jSONArray.getString(0), jSONArray.optJSONObject(1));
            } else if (!str.equals("cancelLoadUrl")) {
                if (str.equals("clearHistory")) {
                    clearHistory();
                } else if (str.equals("backHistory")) {
                    backHistory();
                } else if (str.equals("overrideButton")) {
                    overrideButton(jSONArray.getString(0), jSONArray.getBoolean(1));
                } else if (str.equals("overrideBackbutton")) {
                    overrideBackbutton(jSONArray.getBoolean(0));
                } else if (str.equals("exitApp")) {
                    exitApp();
                } else if (str.equals("messageChannel")) {
                    synchronized (this.f2549f) {
                        try {
                            this.f2547c = c0053d;
                            L l2 = this.f2548e;
                            if (l2 != null) {
                                l2.f491c = true;
                                if (c0053d != null) {
                                    c0053d.sendPluginResult(l2);
                                }
                                this.f2548e = null;
                            }
                            L l3 = this.d;
                            if (l3 != null) {
                                l3.f491c = true;
                                C0053d c0053d2 = this.f2547c;
                                if (c0053d2 != null) {
                                    c0053d2.sendPluginResult(l3);
                                }
                                this.d = null;
                            }
                        } finally {
                        }
                    }
                    return true;
                }
            }
            c0053d.sendPluginResult(new L("", 2));
            return true;
        } catch (JSONException unused) {
            c0053d.sendPluginResult(new L(9));
            return false;
        }
    }

    public void exitApp() {
        this.webView.getPluginManager().k("exit", null);
    }

    public void fireJavascriptEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (JSONException e2) {
            Log.e("CordovaApp", "Failed to create event message", e2);
        }
        L l2 = new L(2, jSONObject);
        C0053d c0053d = this.f2547c;
        if (c0053d != null) {
            l2.f491c = true;
            if (c0053d != null) {
                c0053d.sendPluginResult(l2);
                return;
            }
            return;
        }
        if ("pause".equals(str)) {
            this.f2548e = l2;
        } else if ("resume".equals(str)) {
            this.f2548e = null;
        }
    }

    public boolean isBackbuttonOverridden() {
        return this.webView.isButtonPlumbedToJs(4);
    }

    public void loadUrl(String str, JSONObject jSONObject) throws JSONException {
        boolean z2;
        boolean z3;
        Objects.toString(jSONObject);
        HashMap map = new HashMap();
        int i2 = 0;
        if (jSONObject != null) {
            JSONArray jSONArrayNames = jSONObject.names();
            int i3 = 0;
            z2 = false;
            z3 = false;
            while (i2 < jSONArrayNames.length()) {
                String string = jSONArrayNames.getString(i2);
                if (string.equals("wait")) {
                    i3 = jSONObject.getInt(string);
                } else if (string.equalsIgnoreCase("openexternal")) {
                    z2 = jSONObject.getBoolean(string);
                } else if (string.equalsIgnoreCase("clearhistory")) {
                    z3 = jSONObject.getBoolean(string);
                } else {
                    Object obj = jSONObject.get(string);
                    if (obj != null) {
                        if (obj.getClass().equals(String.class)) {
                            map.put(string, (String) obj);
                        } else if (obj.getClass().equals(Boolean.class)) {
                            map.put(string, (Boolean) obj);
                        } else if (obj.getClass().equals(Integer.class)) {
                            map.put(string, (Integer) obj);
                        }
                    }
                }
                i2++;
            }
            i2 = i3;
        } else {
            z2 = false;
            z3 = false;
        }
        if (i2 > 0) {
            try {
                synchronized (this) {
                    wait(i2);
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        this.webView.showWebPage(str, z2, z3, map);
    }

    @Override // N0.o
    public void onDestroy() {
        this.webView.getContext().unregisterReceiver(this.f2546b);
    }

    public void overrideBackbutton(boolean z2) {
        this.webView.setButtonPlumbedToJs(4, z2);
    }

    public void overrideButton(String str, boolean z2) {
        if (str.equals("volumeup")) {
            this.webView.setButtonPlumbedToJs(24, z2);
        } else if (str.equals("volumedown")) {
            this.webView.setButtonPlumbedToJs(25, z2);
        } else if (str.equals("menubutton")) {
            this.webView.setButtonPlumbedToJs(82, z2);
        }
    }

    @Override // N0.o
    public void pluginInitialize() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        this.f2546b = new A(0, this);
        this.webView.getContext().registerReceiver(this.f2546b, intentFilter);
    }

    public void sendResumeEvent(L l2) {
        synchronized (this.f2549f) {
            C0053d c0053d = this.f2547c;
            if (c0053d != null) {
                l2.f491c = true;
                if (c0053d != null) {
                    c0053d.sendPluginResult(l2);
                }
            } else {
                this.d = l2;
            }
        }
    }
}
