package com.getcapacitor.plugin;

import D.r;
import android.webkit.JavascriptInterface;
import c0.InterfaceC0095b;
import c0.c;
import com.getcapacitor.C0101f;
import com.getcapacitor.D;
import com.getcapacitor.E;
import com.getcapacitor.I;
import com.getcapacitor.w;
import e0.C0112a;
import f0.AbstractC0116c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@InterfaceC0095b(permissions = {@c(alias = "HttpWrite", strings = {"android.permission.WRITE_EXTERNAL_STORAGE"}), @c(alias = "HttpRead", strings = {"android.permission.READ_EXTERNAL_STORAGE"})})
/* loaded from: classes.dex */
public class CapacitorHttp extends D {
    private final Map<Runnable, E> activeRequests = new ConcurrentHashMap();
    private final ExecutorService executor = Executors.newCachedThreadPool();

    private void http(E e2, String str) {
        r rVar = new r(this, e2, str);
        if (this.executor.isShutdown()) {
            e2.f("Failed to execute request - Http Plugin was shutdown", null, null);
        } else {
            this.activeRequests.put(rVar, e2);
            this.executor.submit(rVar);
        }
    }

    @I
    public void delete(E e2) {
        http(e2, "DELETE");
    }

    @I
    public void get(E e2) {
        http(e2, "GET");
    }

    @Override // com.getcapacitor.D
    public void handleOnDestroy() {
        super.handleOnDestroy();
        for (Map.Entry<Runnable, E> entry : this.activeRequests.entrySet()) {
            entry.getKey();
            E value = entry.getValue();
            w wVar = value.f1365e;
            if (wVar.has("activeCapacitorHttpUrlConnection")) {
                try {
                    ((C0112a) wVar.get("activeCapacitorHttpUrlConnection")).f1496a.disconnect();
                    wVar.remove("activeCapacitorHttpUrlConnection");
                } catch (Exception unused) {
                }
            }
            C0101f bridge = getBridge();
            bridge.getClass();
            bridge.f1431w.remove(value.f1364c);
        }
        this.activeRequests.clear();
        this.executor.shutdownNow();
    }

    @JavascriptInterface
    public boolean isEnabled() {
        return AbstractC0116c.a(getBridge().f1411a.b("CapacitorHttp").f1367a, "enabled", false);
    }

    @Override // com.getcapacitor.D
    public void load() {
        this.bridge.f1419k.addJavascriptInterface(this, "CapacitorHttpAndroidInterface");
        super.load();
    }

    @I
    public void patch(E e2) {
        http(e2, "PATCH");
    }

    @I
    public void post(E e2) {
        http(e2, "POST");
    }

    @I
    public void put(E e2) {
        http(e2, "PUT");
    }

    @I
    public void request(E e2) {
        http(e2, null);
    }
}
