package D0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l0.p;

/* loaded from: classes.dex */
public abstract class e extends f {
    public static List K(d dVar) {
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return p.f2191b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return P0.b.s(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
