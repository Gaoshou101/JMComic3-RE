package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.InterfaceC0072d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements S.b {
    @Override // S.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // S.b
    public final Object b(Context context) {
        m mVar = new m();
        mVar.f1123a = context.getApplicationContext();
        s sVar = new s(mVar);
        sVar.f1136b = 1;
        if (j.f1111k == null) {
            synchronized (j.f1110j) {
                try {
                    if (j.f1111k == null) {
                        j.f1111k = new j(sVar);
                    }
                } finally {
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object objB;
        S.a aVarC = S.a.c(context);
        aVarC.getClass();
        synchronized (S.a.f616e) {
            try {
                objB = aVarC.f617a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final androidx.lifecycle.t tVarD = ((androidx.lifecycle.r) objB).d();
        tVarD.a(new InterfaceC0072d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0072d
            public final void a() {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new n(), 500L);
                tVarD.f(this);
            }
        });
    }
}
