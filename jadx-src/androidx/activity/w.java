package androidx.activity;

import android.window.OnBackInvokedCallback;
import g.LayoutInflaterFactory2C0118A;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f878b;

    public /* synthetic */ w(int i2, Object obj) {
        this.f877a = i2;
        this.f878b = obj;
    }

    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f877a) {
            case 0:
                w0.a aVar = (w0.a) this.f878b;
                x0.g.e("$onBackInvoked", aVar);
                aVar.a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0118A) this.f878b).D();
                break;
            default:
                ((Runnable) this.f878b).run();
                break;
        }
    }
}
