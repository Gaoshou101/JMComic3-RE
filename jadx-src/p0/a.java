package P0;

import X.i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final i f556a;

    public a(i iVar) {
        this.f556a = iVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, i.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f556a, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getTargetException();
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Reflection failed for method " + method, e3);
        }
    }
}
