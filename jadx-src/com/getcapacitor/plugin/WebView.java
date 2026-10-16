package com.getcapacitor.plugin;

import android.content.SharedPreferences;
import c0.InterfaceC0095b;
import com.getcapacitor.C0101f;
import com.getcapacitor.D;
import com.getcapacitor.E;
import com.getcapacitor.I;
import com.getcapacitor.O;
import com.getcapacitor.RunnableC0098c;
import com.getcapacitor.w;
import org.json.JSONException;

@InterfaceC0095b
/* loaded from: classes.dex */
public class WebView extends D {
    public static final String CAP_SERVER_PATH = "serverBasePath";
    public static final String WEBVIEW_PREFS_NAME = "CapWebViewSettings";

    @I
    public void getServerBasePath(E e2) throws JSONException {
        String str = this.bridge.f1413c.f1385a;
        w wVar = new w();
        wVar.e("path", str);
        e2.h(wVar);
    }

    @I
    public void persistServerBasePath(E e2) {
        String str = this.bridge.f1413c.f1385a;
        SharedPreferences.Editor editorEdit = getContext().getSharedPreferences(WEBVIEW_PREFS_NAME, 0).edit();
        editorEdit.putString(CAP_SERVER_PATH, str);
        editorEdit.apply();
        e2.g();
    }

    @I
    public void setServerAssetPath(E e2) {
        String strE = e2.e("path", null);
        C0101f c0101f = this.bridge;
        O o2 = c0101f.f1413c;
        o2.f1388e = true;
        o2.f1385a = strE;
        o2.a();
        c0101f.f1419k.post(new RunnableC0098c(c0101f, 1));
        e2.g();
    }

    @I
    public void setServerBasePath(E e2) {
        String strE = e2.e("path", null);
        C0101f c0101f = this.bridge;
        O o2 = c0101f.f1413c;
        o2.f1388e = false;
        o2.f1385a = strE;
        o2.a();
        c0101f.f1419k.post(new RunnableC0098c(c0101f, 0));
        e2.g();
    }
}
