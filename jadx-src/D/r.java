package D;

import a.AbstractC0062a;
import android.os.Handler;
import com.getcapacitor.E;
import com.getcapacitor.plugin.CapacitorHttp;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51b = 0;

    /* renamed from: c, reason: collision with root package name */
    public Object f52c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f53e;

    public /* synthetic */ r() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f51b) {
            case 0:
                try {
                    objCall = ((i) this.f52c).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f53e).post(new a((j) this.d, 1, objCall));
                return;
            default:
                E e2 = (E) this.f52c;
                CapacitorHttp capacitorHttp = (CapacitorHttp) this.f53e;
                try {
                    try {
                        e2.h(AbstractC0062a.P(e2, (String) this.d, capacitorHttp.getBridge()));
                    } finally {
                        capacitorHttp.activeRequests.remove(this);
                    }
                } catch (Exception e3) {
                    e2.f(e3.getLocalizedMessage(), e3.getClass().getSimpleName(), e3);
                }
                return;
        }
    }

    public r(CapacitorHttp capacitorHttp, E e2, String str) {
        this.f53e = capacitorHttp;
        this.f52c = e2;
        this.d = str;
    }
}
