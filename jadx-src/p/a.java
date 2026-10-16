package P;

import L.c;
import androidx.lifecycle.I;
import p.l;

/* loaded from: classes.dex */
public class a extends I {
    public static final c d = new c(4);

    /* renamed from: c, reason: collision with root package name */
    public final l f555c = new l();

    @Override // androidx.lifecycle.I
    public final void b() {
        l lVar = this.f555c;
        int i2 = lVar.f2600c;
        if (i2 > 0) {
            lVar.f2599b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = lVar.f2599b;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        lVar.f2600c = 0;
    }
}
