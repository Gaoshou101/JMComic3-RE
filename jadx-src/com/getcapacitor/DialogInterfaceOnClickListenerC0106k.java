package com.getcapacitor;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

/* renamed from: com.getcapacitor.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0106k implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsResult f1444b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0106k(JsResult jsResult, int i2) {
        this.f1443a = i2;
        this.f1444b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.f1443a) {
            case 0:
                dialogInterface.dismiss();
                this.f1444b.confirm();
                break;
            case 1:
                dialogInterface.dismiss();
                this.f1444b.cancel();
                break;
            case 2:
                dialogInterface.dismiss();
                this.f1444b.confirm();
                break;
            default:
                dialogInterface.dismiss();
                ((JsPromptResult) this.f1444b).cancel();
                break;
        }
    }
}
