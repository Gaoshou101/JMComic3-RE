package p0;

import n0.InterfaceC0311d;
import x0.k;

/* loaded from: classes.dex */
public abstract class g extends c implements x0.e {

    /* renamed from: e, reason: collision with root package name */
    public final int f2606e;

    public g(int i2, InterfaceC0311d interfaceC0311d) {
        super(interfaceC0311d);
        this.f2606e = i2;
    }

    @Override // x0.e
    public final int b() {
        return this.f2606e;
    }

    @Override // p0.AbstractC0326a
    public final String toString() {
        if (this.f2601b != null) {
            return super.toString();
        }
        k.f2707a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        x0.g.d("renderLambdaToString(...)", string);
        return string;
    }
}
