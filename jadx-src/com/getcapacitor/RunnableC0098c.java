package com.getcapacitor;

/* renamed from: com.getcapacitor.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0098c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0101f f1395c;

    public /* synthetic */ RunnableC0098c(C0101f c0101f, int i2) {
        this.f1394b = i2;
        this.f1395c = c0101f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1394b) {
            case 0:
                C0101f c0101f = this.f1395c;
                c0101f.f1419k.loadUrl(c0101f.f1414e);
                break;
            default:
                C0101f c0101f2 = this.f1395c;
                c0101f2.f1419k.loadUrl(c0101f2.f1414e);
                break;
        }
    }
}
