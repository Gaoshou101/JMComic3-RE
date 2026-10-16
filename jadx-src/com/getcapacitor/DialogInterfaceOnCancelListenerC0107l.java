package com.getcapacitor;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

/* renamed from: com.getcapacitor.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC0107l implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsResult f1446b;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0107l(JsResult jsResult, int i2) {
        this.f1445a = i2;
        this.f1446b = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f1445a) {
            case 0:
                dialogInterface.dismiss();
                this.f1446b.cancel();
                break;
            case 1:
                dialogInterface.dismiss();
                this.f1446b.cancel();
                break;
            default:
                dialogInterface.dismiss();
                ((JsPromptResult) this.f1446b).cancel();
                break;
        }
    }
}
