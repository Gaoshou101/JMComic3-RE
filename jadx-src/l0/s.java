package l0;

import a.AbstractC0062a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k0.C0230c;

/* loaded from: classes.dex */
public abstract class s extends AbstractC0062a {
    public static int a0(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map b0(ArrayList arrayList) {
        q qVar = q.f2192b;
        int size = arrayList.size();
        if (size == 0) {
            return qVar;
        }
        if (size == 1) {
            C0230c c0230c = (C0230c) arrayList.get(0);
            x0.g.e("pair", c0230c);
            Map mapSingletonMap = Collections.singletonMap(c0230c.f2022b, c0230c.f2023c);
            x0.g.d("singletonMap(...)", mapSingletonMap);
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0230c c0230c2 = (C0230c) it.next();
            linkedHashMap.put(c0230c2.f2022b, c0230c2.f2023c);
        }
        return linkedHashMap;
    }
}
