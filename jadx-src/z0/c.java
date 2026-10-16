package z0;

import java.util.Random;
import x0.g;

/* loaded from: classes.dex */
public final class c extends a {
    public final b d = new b();

    @Override // z0.a
    public final Random a() {
        Object obj = this.d.get();
        g.d("get(...)", obj);
        return (Random) obj;
    }
}
