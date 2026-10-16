package X;

import a.AbstractC0062a;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final n f719a;

    static {
        n eVar;
        try {
            eVar = new i(15, (WebViewProviderFactoryBoundaryInterface) P0.b.c(WebViewProviderFactoryBoundaryInterface.class, AbstractC0062a.p()));
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new RuntimeException(e);
        }
        f719a = eVar;
    }
}
