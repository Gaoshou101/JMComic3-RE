package androidx.emoji2.text;

import a.AbstractC0062a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1129a;

    /* renamed from: b, reason: collision with root package name */
    public final D.h f1130b;

    /* renamed from: c, reason: collision with root package name */
    public final L.c f1131c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1132e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f1133f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f1134g;
    public AbstractC0062a h;

    public r(Context context, D.h hVar) {
        L.c cVar = s.d;
        this.d = new Object();
        AbstractC0062a.j("Context cannot be null", context);
        this.f1129a = context.getApplicationContext();
        this.f1130b = hVar;
        this.f1131c = cVar;
    }

    @Override // androidx.emoji2.text.i
    public final void a(AbstractC0062a abstractC0062a) {
        synchronized (this.d) {
            this.h = abstractC0062a;
        }
        c();
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.f1132e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1132e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1134g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1133f = null;
                this.f1134g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f1133f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0068a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1134g = threadPoolExecutor;
                    this.f1133f = threadPoolExecutor;
                }
                this.f1133f.execute(new androidx.activity.k(2, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final D.n d() {
        try {
            L.c cVar = this.f1131c;
            Context context = this.f1129a;
            D.h hVar = this.f1130b;
            cVar.getClass();
            Object[] objArr = {hVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            D.m mVarA = D.g.a(context, Collections.unmodifiableList(arrayList));
            int i2 = mVarA.f43a;
            if (i2 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i2 + ")");
            }
            D.n[] nVarArr = (D.n[]) ((List) mVarA.f44b).get(0);
            if (nVarArr == null || nVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return nVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }
}
