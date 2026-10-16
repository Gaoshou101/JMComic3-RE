package com.getcapacitor;

import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import c.C0085a;

/* renamed from: com.getcapacitor.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0105j implements InterfaceC0109n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f1442b;

    public /* synthetic */ C0105j(ValueCallback valueCallback, int i2) {
        this.f1441a = i2;
        this.f1442b = valueCallback;
    }

    @Override // com.getcapacitor.InterfaceC0109n
    public final void b(C0085a c0085a) {
        Uri[] result;
        ValueCallback valueCallback = this.f1442b;
        switch (this.f1441a) {
            case 0:
                valueCallback.onReceiveValue(c0085a.f1331a == -1 ? new Uri[]{c0085a.f1332b.getData()} : null);
                break;
            default:
                Intent intent = c0085a.f1332b;
                int i2 = c0085a.f1331a;
                if (i2 != -1 || intent.getClipData() == null) {
                    result = WebChromeClient.FileChooserParams.parseResult(i2, intent);
                } else {
                    int itemCount = intent.getClipData().getItemCount();
                    result = new Uri[itemCount];
                    for (int i3 = 0; i3 < itemCount; i3++) {
                        result[i3] = intent.getClipData().getItemAt(i3).getUri();
                    }
                }
                valueCallback.onReceiveValue(result);
                break;
        }
    }
}
