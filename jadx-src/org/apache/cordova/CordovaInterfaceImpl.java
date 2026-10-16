package org.apache.cordova;

import N0.K;
import N0.L;
import N0.m;
import N0.n;
import N0.o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import g.AbstractActivityC0137i;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CordovaInterfaceImpl implements m {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0137i f2525a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f2526b;

    /* renamed from: c, reason: collision with root package name */
    public K f2527c;
    public n d;

    /* renamed from: e, reason: collision with root package name */
    public final D.m f2528e;

    /* renamed from: f, reason: collision with root package name */
    public o f2529f;

    /* renamed from: g, reason: collision with root package name */
    public String f2530g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2531i;

    /* renamed from: j, reason: collision with root package name */
    public Bundle f2532j;

    public CordovaInterfaceImpl(AbstractActivityC0137i abstractActivityC0137i) {
        this(abstractActivityC0137i, Executors.newCachedThreadPool());
    }

    @Override // N0.m
    public AbstractActivityC0137i getActivity() {
        return this.f2525a;
    }

    public Context getContext() {
        return this.f2525a;
    }

    @Override // N0.m
    public ExecutorService getThreadPool() {
        return this.f2526b;
    }

    public boolean hasPermission(String str) {
        return this.f2525a.checkSelfPermission(str) == 0;
    }

    public boolean onActivityResult(int i2, int i3, Intent intent) {
        String str;
        o oVarC = this.f2529f;
        if (oVarC == null && (str = this.f2530g) != null) {
            n nVar = new n();
            nVar.f520a = i2;
            nVar.f521b = i3;
            nVar.f522c = intent;
            this.d = nVar;
            K k2 = this.f2527c;
            if (k2 != null && (oVarC = k2.c(str)) != null) {
                oVarC.onRestoreStateForActivityResult(this.f2532j.getBundle(oVarC.getServiceName()), new ResumeCallback(oVarC.getServiceName(), this.f2527c));
            }
        }
        this.f2529f = null;
        if (oVarC == null) {
            return false;
        }
        this.f2530g = null;
        this.d = null;
        oVarC.onActivityResult(i2, i3, intent);
        return true;
    }

    public void onCordovaInit(K k2) {
        CoreAndroid coreAndroid;
        this.f2527c = k2;
        n nVar = this.d;
        if (nVar != null) {
            onActivityResult(nVar.f520a, nVar.f521b, nVar.f522c);
            return;
        }
        if (this.f2531i) {
            this.f2531i = false;
            if (k2 == null || (coreAndroid = (CoreAndroid) k2.c(CoreAndroid.PLUGIN_NAME)) == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("action", "resume");
            } catch (JSONException e2) {
                Log.e("CordovaInterfaceImpl", "Failed to create event message", e2);
            }
            coreAndroid.sendResumeEvent(new L(2, jSONObject));
        }
    }

    @Override // N0.m
    public Object onMessage(String str, Object obj) {
        if (!"exit".equals(str)) {
            return null;
        }
        this.f2525a.finish();
        return null;
    }

    public void onRequestPermissionResult(int i2, String[] strArr, int[] iArr) {
        Pair pairC = this.f2528e.c(i2);
        if (pairC != null) {
            ((o) pairC.first).onRequestPermissionResult(((Integer) pairC.second).intValue(), strArr, iArr);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundleOnSaveInstanceState;
        o oVar = this.f2529f;
        if (oVar != null) {
            bundle.putString("callbackService", oVar.getServiceName());
        }
        K k2 = this.f2527c;
        if (k2 != null) {
            k2.getClass();
            Bundle bundle2 = new Bundle();
            synchronized (k2.f484a) {
                try {
                    for (o oVar2 : k2.f484a.values()) {
                        if (oVar2 != null && (bundleOnSaveInstanceState = oVar2.onSaveInstanceState()) != null) {
                            bundle2.putBundle(oVar2.getServiceName(), bundleOnSaveInstanceState);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bundle.putBundle("plugin", bundle2);
        }
    }

    public void requestPermission(o oVar, int i2, String str) {
        requestPermissions(oVar, i2, new String[]{str});
    }

    public void requestPermissions(o oVar, int i2, String[] strArr) {
        int i3;
        D.m mVar = this.f2528e;
        synchronized (mVar) {
            i3 = mVar.f43a;
            mVar.f43a = i3 + 1;
            ((SparseArray) mVar.f44b).put(i3, new Pair(oVar, Integer.valueOf(i2)));
        }
        getActivity().requestPermissions(strArr, i3);
    }

    public void restoreInstanceState(Bundle bundle) {
        this.f2530g = bundle.getString("callbackService");
        this.f2532j = bundle.getBundle("plugin");
        this.f2531i = true;
    }

    public void setActivityResultCallback(o oVar) {
        o oVar2 = this.f2529f;
        if (oVar2 != null) {
            oVar2.onActivityResult(this.h, 0, null);
        }
        this.f2529f = oVar;
    }

    public void setActivityResultRequestCode(int i2) {
        this.h = i2;
    }

    @Override // N0.m
    public void startActivityForResult(o oVar, Intent intent, int i2) {
        setActivityResultCallback(oVar);
        try {
            this.f2525a.startActivityForResult(intent, i2);
        } catch (RuntimeException e2) {
            this.f2529f = null;
            throw e2;
        }
    }

    public CordovaInterfaceImpl(AbstractActivityC0137i abstractActivityC0137i, ExecutorService executorService) {
        this.f2531i = false;
        this.f2525a = abstractActivityC0137i;
        this.f2526b = executorService;
        D.m mVar = new D.m();
        mVar.f43a = 0;
        mVar.f44b = new SparseArray();
        this.f2528e = mVar;
    }
}
