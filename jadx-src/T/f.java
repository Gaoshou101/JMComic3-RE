package t;

import G.D;
import G.K;
import android.view.View;
import java.util.Comparator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        WeakHashMap weakHashMap = K.f146a;
        float fE = D.e((View) obj);
        float fE2 = D.e((View) obj2);
        if (fE > fE2) {
            return -1;
        }
        return fE < fE2 ? 1 : 0;
    }
}
