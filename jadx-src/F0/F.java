package F0;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class F extends AbstractC0015p {
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84e;

    /* renamed from: f, reason: collision with root package name */
    public l0.f f85f;

    public final void i() {
        long j2 = this.d - 4294967296L;
        this.d = j2;
        if (j2 <= 0 && this.f84e) {
            n();
        }
    }

    public abstract Thread k();

    public final void l(boolean z2) {
        this.d = (z2 ? 4294967296L : 1L) + this.d;
        if (z2) {
            return;
        }
        this.f84e = true;
    }

    public final boolean m() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        l0.f fVar = this.f85f;
        if (fVar == null) {
            return false;
        }
        AbstractC0024z abstractC0024z = (AbstractC0024z) (fVar.isEmpty() ? null : fVar.removeFirst());
        if (abstractC0024z == null) {
            return false;
        }
        abstractC0024z.run();
        return true;
    }

    public abstract void n();
}
