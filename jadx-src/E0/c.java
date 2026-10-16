package E0;

import java.util.Iterator;
import w0.p;

/* loaded from: classes.dex */
public final class c implements D0.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f72a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74c;
    public final x0.h d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(CharSequence charSequence, int i2, int i3, p pVar) {
        x0.g.e("input", charSequence);
        this.f72a = charSequence;
        this.f73b = i2;
        this.f74c = i3;
        this.d = (x0.h) pVar;
    }

    @Override // D0.d
    public final Iterator iterator() {
        return new b(this);
    }
}
