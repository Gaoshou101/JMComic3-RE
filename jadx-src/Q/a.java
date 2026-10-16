package Q;

import android.content.Intent;
import android.content.IntentSender;
import c.C0088d;
import c.InterfaceC0086b;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f568c;
    public final /* synthetic */ Object d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f569e;

    public /* synthetic */ a(Object obj, int i2, Object obj2, int i3) {
        this.f567b = i3;
        this.d = obj;
        this.f568c = i2;
        this.f569e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f567b) {
            case 0:
                ((b) this.d).f571b.g(this.f568c, (Serializable) this.f569e);
                break;
            case 1:
                androidx.activity.m mVar = (androidx.activity.m) this.d;
                x0.g.e("this$0", mVar);
                Object obj = ((X.i) this.f569e).f715b;
                String str = (String) mVar.f844a.get(Integer.valueOf(this.f568c));
                if (str != null) {
                    C0088d c0088d = (C0088d) mVar.f847e.get(str);
                    if ((c0088d != null ? c0088d.f1336a : null) != null) {
                        InterfaceC0086b interfaceC0086b = c0088d.f1336a;
                        if (mVar.d.remove(str)) {
                            interfaceC0086b.a(obj);
                            break;
                        }
                    } else {
                        mVar.f849g.remove(str);
                        mVar.f848f.put(str, obj);
                        break;
                    }
                }
                break;
            default:
                androidx.activity.m mVar2 = (androidx.activity.m) this.d;
                x0.g.e("this$0", mVar2);
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.f569e;
                x0.g.e("$e", sendIntentException);
                mVar2.a(this.f568c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
        }
    }
}
