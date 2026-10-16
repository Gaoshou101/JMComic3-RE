package K0;

import a.AbstractC0062a;
import k0.C0232e;
import p0.AbstractC0326a;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f405a = 0;

    static {
        Object objM;
        Object objM2;
        Exception exc = new Exception();
        String simpleName = AbstractC0062a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objM = AbstractC0326a.class.getCanonicalName();
        } catch (Throwable th) {
            objM = AbstractC0062a.m(th);
        }
        if (C0232e.a(objM) != null) {
            objM = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objM2 = t.class.getCanonicalName();
        } catch (Throwable th2) {
            objM2 = AbstractC0062a.m(th2);
        }
        if (C0232e.a(objM2) != null) {
            objM2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
