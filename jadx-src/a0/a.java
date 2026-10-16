package A0;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import x0.g;

/* loaded from: classes.dex */
public final class a extends z0.a {
    @Override // z0.a
    public final Random a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        g.d("current(...)", threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}
