package androidx.emoji2.text;

import a.AbstractC0062a;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends AbstractC0062a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0062a f1122c;
    public final /* synthetic */ ThreadPoolExecutor d;

    public l(AbstractC0062a abstractC0062a, ThreadPoolExecutor threadPoolExecutor) {
        this.f1122c = abstractC0062a;
        this.d = threadPoolExecutor;
    }

    @Override // a.AbstractC0062a
    public final void I(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.d;
        try {
            this.f1122c.I(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a.AbstractC0062a
    public final void J(u uVar) {
        ThreadPoolExecutor threadPoolExecutor = this.d;
        try {
            this.f1122c.J(uVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
