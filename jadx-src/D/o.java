package D;

import android.os.Process;

/* loaded from: classes.dex */
public final class o extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final int f49b;

    public o(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f49b = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f49b);
        super.run();
    }
}
