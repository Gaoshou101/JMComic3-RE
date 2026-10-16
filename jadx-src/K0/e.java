package K0;

import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final transient InterfaceC0316i f380b;

    public e(InterfaceC0316i interfaceC0316i) {
        this.f380b = interfaceC0316i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f380b.toString();
    }
}
