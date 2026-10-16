package O0;

import android.webkit.JsResult;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsResult f545b;

    public /* synthetic */ b(JsResult jsResult, int i2) {
        this.f544a = i2;
        this.f545b = jsResult;
    }

    public final void a(String str, boolean z2) {
        switch (this.f544a) {
            case 0:
                JsResult jsResult = this.f545b;
                if (!z2) {
                    jsResult.cancel();
                    break;
                } else {
                    jsResult.confirm();
                    break;
                }
            default:
                JsResult jsResult2 = this.f545b;
                if (!z2) {
                    jsResult2.cancel();
                    break;
                } else {
                    jsResult2.confirm();
                    break;
                }
        }
    }
}
