package androidx.emoji2.text;

import android.os.Trace;

/* loaded from: classes.dex */
public final class n implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = C.k.f13a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (j.f1111k != null) {
                j.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i3 = C.k.f13a;
            Trace.endSection();
            throw th;
        }
    }
}
