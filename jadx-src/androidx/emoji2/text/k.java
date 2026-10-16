package androidx.emoji2.text;

import a.AbstractC0062a;
import android.webkit.ValueCallback;
import com.getcapacitor.C0101f;
import com.getcapacitor.cordova.MockCordovaWebViewImpl;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1120c;
    public final /* synthetic */ Object d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1121e;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i2) {
        this.f1119b = i2;
        this.f1120c = obj;
        this.d = obj2;
        this.f1121e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1119b) {
            case 0:
                m mVar = (m) this.f1120c;
                AbstractC0062a abstractC0062a = (AbstractC0062a) this.d;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1121e;
                mVar.getClass();
                try {
                    s sVarF = P0.b.f(mVar.f1123a);
                    if (sVarF == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) sVarF.f1135a;
                    synchronized (rVar.d) {
                        rVar.f1133f = threadPoolExecutor;
                    }
                    sVarF.f1135a.a(new l(abstractC0062a, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0062a.I(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ((C0101f) this.f1120c).f1419k.evaluateJavascript((String) this.d, (ValueCallback) this.f1121e);
                return;
            default:
                ((MockCordovaWebViewImpl) this.f1120c).h.evaluateJavascript((String) this.d, (ValueCallback) this.f1121e);
                return;
        }
    }
}
