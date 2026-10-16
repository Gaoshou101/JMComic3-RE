package M0;

import F0.AbstractC0019u;

/* loaded from: classes.dex */
public final class j extends i {
    public final Runnable d;

    public j(Runnable runnable, long j2, boolean z2) {
        super(j2, z2);
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0019u.b(runnable));
        sb.append(", ");
        sb.append(this.f459b);
        sb.append(", ");
        sb.append(this.f460c ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
