package G0;

import F0.A;
import F0.AbstractC0015p;
import F0.C0016q;
import F0.InterfaceC0022x;
import F0.L;
import K0.n;
import M0.e;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import n0.InterfaceC0316i;
import x0.g;

/* loaded from: classes.dex */
public final class c extends AbstractC0015p implements InterfaceC0022x {
    public final Handler d;

    /* renamed from: e, reason: collision with root package name */
    public final String f211e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f212f;

    /* renamed from: g, reason: collision with root package name */
    public final c f213g;

    public c(Handler handler, String str, boolean z2) {
        this.d = handler;
        this.f211e = str;
        this.f212f = z2;
        this.f213g = z2 ? this : new c(handler, str, true);
    }

    @Override // F0.AbstractC0015p
    public final void d(InterfaceC0316i interfaceC0316i, Runnable runnable) {
        if (this.d.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        L l2 = (L) interfaceC0316i.g(C0016q.f123c);
        if (l2 != null) {
            l2.a(cancellationException);
        }
        e eVar = A.f80a;
        M0.d.d.d(interfaceC0316i, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.d == this.d && cVar.f212f == this.f212f) {
                return true;
            }
        }
        return false;
    }

    @Override // F0.AbstractC0015p
    public final boolean f(InterfaceC0316i interfaceC0316i) {
        return (this.f212f && g.a(Looper.myLooper(), this.d.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.d) ^ (this.f212f ? 1231 : 1237);
    }

    @Override // F0.AbstractC0015p
    public final String toString() {
        c cVar;
        String str;
        e eVar = A.f80a;
        c cVar2 = n.f400a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f213g;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f211e;
        if (string == null) {
            string = this.d.toString();
        }
        if (!this.f212f) {
            return string;
        }
        return string + ".immediate";
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
