package l0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i extends P0.b {
    public static List K(Object... objArr) {
        if (objArr.length <= 0) {
            return p.f2191b;
        }
        List listAsList = Arrays.asList(objArr);
        x0.g.d("asList(...)", listAsList);
        return listAsList;
    }
}
