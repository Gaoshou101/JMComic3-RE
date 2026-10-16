package androidx.emoji2.text;

import G.C0037m;
import a.AbstractC0062a;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f1110j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f1111k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f1112a;

    /* renamed from: b, reason: collision with root package name */
    public final p.g f1113b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1114c;
    public final Handler d;

    /* renamed from: e, reason: collision with root package name */
    public final f f1115e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1116f;

    /* renamed from: g, reason: collision with root package name */
    public final L.c f1117g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final d f1118i;

    public j(s sVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1112a = reentrantReadWriteLock;
        this.f1114c = 3;
        i iVar = sVar.f1135a;
        this.f1116f = iVar;
        int i2 = sVar.f1136b;
        this.h = i2;
        this.f1118i = sVar.f1137c;
        this.d = new Handler(Looper.getMainLooper());
        this.f1113b = new p.g();
        this.f1117g = new L.c(10);
        f fVar = new f(this);
        this.f1115e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f1114c = 0;
            } catch (Throwable th) {
                this.f1112a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.a(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f1110j) {
            try {
                jVar = f1111k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f1112a.readLock().lock();
        try {
            return this.f1114c;
        } finally {
            this.f1112a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f1112a.writeLock().lock();
        try {
            if (this.f1114c == 0) {
                return;
            }
            this.f1114c = 0;
            this.f1112a.writeLock().unlock();
            f fVar = this.f1115e;
            j jVar = fVar.f1105a;
            try {
                jVar.f1116f.a(new e(fVar));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f1112a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1112a.writeLock().lock();
        try {
            this.f1114c = 2;
            arrayList.addAll(this.f1113b);
            this.f1113b.clear();
            this.f1112a.writeLock().unlock();
            this.d.post(new h(arrayList, this.f1114c, th));
        } catch (Throwable th2) {
            this.f1112a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence e(CharSequence charSequence, int i2, int i3) {
        y[] yVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i2 <= i3)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        A a2 = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i3 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        C0037m c0037m = this.f1115e.f1106b;
        c0037m.getClass();
        boolean z2 = charSequence instanceof w;
        if (z2) {
            ((w) charSequence).a();
        }
        if (z2) {
            a2 = new A((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    a2 = new A((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i2 - 1, i3 + 1, y.class) <= i3) {
                    a2 = new A();
                    a2.f1097b = false;
                    a2.f1098c = new SpannableString(charSequence);
                }
            } finally {
                if (z2) {
                    ((w) charSequence).b();
                }
            }
        }
        if (a2 != null && (yVarArr = (y[]) a2.f1098c.getSpans(i2, i3, y.class)) != null && yVarArr.length > 0) {
            for (y yVar : yVarArr) {
                int spanStart = a2.f1098c.getSpanStart(yVar);
                int spanEnd = a2.f1098c.getSpanEnd(yVar);
                if (spanStart != i3) {
                    a2.removeSpan(yVar);
                }
                i2 = Math.min(spanStart, i2);
                i3 = Math.max(spanEnd, i3);
            }
        }
        int i4 = i2;
        int i5 = i3;
        if (i4 != i5 && i4 < charSequence.length()) {
            A a3 = (A) c0037m.q(charSequence, i4, i5, Integer.MAX_VALUE, false, new D.c(a2, 5, (L.c) c0037m.f195a));
            if (a3 != null) {
                Spannable spannable = a3.f1098c;
                if (z2) {
                    ((w) charSequence).b();
                }
                return spannable;
            }
            if (!z2) {
                return charSequence;
            }
        } else if (!z2) {
            return charSequence;
        }
        return charSequence;
    }

    public final void f(g gVar) {
        AbstractC0062a.j("initCallback cannot be null", gVar);
        this.f1112a.writeLock().lock();
        try {
            if (this.f1114c == 1 || this.f1114c == 2) {
                this.d.post(new h(Arrays.asList(gVar), this.f1114c, null));
            } else {
                this.f1113b.add(gVar);
            }
            this.f1112a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1112a.writeLock().unlock();
            throw th;
        }
    }
}
