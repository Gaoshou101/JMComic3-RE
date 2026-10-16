package F0;

import java.util.concurrent.CancellationException;

/* renamed from: F0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f113a;

    /* renamed from: b, reason: collision with root package name */
    public final w0.q f114b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f115c;
    public final Throwable d;

    public C0009j(Object obj, w0.q qVar, Object obj2, Throwable th) {
        this.f113a = obj;
        this.f114b = qVar;
        this.f115c = obj2;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0009j)) {
            return false;
        }
        C0009j c0009j = (C0009j) obj;
        return x0.g.a(this.f113a, c0009j.f113a) && x0.g.a(null, null) && x0.g.a(this.f114b, c0009j.f114b) && x0.g.a(this.f115c, c0009j.f115c) && x0.g.a(this.d, c0009j.d);
    }

    public final int hashCode() {
        Object obj = this.f113a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 961;
        w0.q qVar = this.f114b;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f115c;
        int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.d;
        return iHashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f113a + ", cancelHandler=null, onCancellation=" + this.f114b + ", idempotentResume=" + this.f115c + ", cancelCause=" + this.d + ')';
    }

    public /* synthetic */ C0009j(Object obj, w0.q qVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 4) != 0 ? null : qVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
