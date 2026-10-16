package org.apache.cordova;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f2558b;

    public a(b bVar) {
        this.f2558b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CordovaWebViewImpl.this.f2533a.k("spinner", "stop");
    }
}
