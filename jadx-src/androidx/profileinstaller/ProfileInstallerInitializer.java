package androidx.profileinstaller;

import L.c;
import Q.h;
import Q.k;
import S.b;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // S.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // S.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new c(7);
        }
        k.a(new h(this, 0, context.getApplicationContext()));
        return new c(7);
    }
}
