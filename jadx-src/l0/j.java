package l0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class j extends i {
    public static int L(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
