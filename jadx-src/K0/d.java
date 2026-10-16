package K0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f379a;

    static {
        try {
            Iterator it = Arrays.asList(new G0.b()).iterator();
            x0.g.e("<this>", it);
            f379a = D0.e.K(new D0.a(new D0.c(1, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
