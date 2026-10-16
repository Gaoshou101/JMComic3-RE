package F0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class M extends CancellationException {

    /* renamed from: b, reason: collision with root package name */
    public final transient T f90b;

    public M(String str, Throwable th, T t2) {
        super(str);
        this.f90b = t2;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof M) {
                M m2 = (M) obj;
                if (!x0.g.a(m2.getMessage(), getMessage()) || !x0.g.a(m2.f90b, this.f90b) || !x0.g.a(m2.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        x0.g.b(message);
        int iHashCode = (this.f90b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f90b;
    }
}
