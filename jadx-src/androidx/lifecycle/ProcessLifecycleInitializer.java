package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements S.b {
    @Override // S.b
    public final List a() {
        return l0.p.f2191b;
    }

    @Override // S.b
    public final Object b(Context context) {
        x0.g.e("context", context);
        S.a aVarC = S.a.c(context);
        x0.g.d("getInstance(context)", aVarC);
        if (!aVarC.f618b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!o.f1306a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            x0.g.c("null cannot be cast to non-null type android.app.Application", applicationContext);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
        }
        y yVar = y.f1317i;
        yVar.getClass();
        yVar.f1321e = new Handler();
        yVar.f1322f.d(EnumC0080l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        x0.g.c("null cannot be cast to non-null type android.app.Application", applicationContext2);
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new x(yVar));
        return yVar;
    }
}
