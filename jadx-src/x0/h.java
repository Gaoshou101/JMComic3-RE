package x0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class h implements e, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f2704b;

    public h(int i2) {
        this.f2704b = i2;
    }

    @Override // x0.e
    public final int b() {
        return this.f2704b;
    }

    public final String toString() {
        k.f2707a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        g.d("renderLambdaToString(...)", string);
        return string;
    }
}
