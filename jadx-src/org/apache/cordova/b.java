package org.apache.cordova;

import org.apache.cordova.CordovaWebViewImpl;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CordovaWebViewImpl.EngineClient f2559b;

    public b(CordovaWebViewImpl.EngineClient engineClient) {
        this.f2559b = engineClient;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        CordovaWebViewImpl.EngineClient engineClient = this.f2559b;
        try {
            Thread.sleep(2000L);
            if (CordovaWebViewImpl.this.f2535c.getActivity() != null) {
                CordovaWebViewImpl.this.f2535c.getActivity().runOnUiThread(new a(this));
            }
        } catch (InterruptedException unused) {
        }
    }
}
