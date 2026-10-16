package l0;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h extends n {
    public static final void M(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, w0.l lVar) {
        x0.g.e("separator", charSequence);
        x0.g.e("prefix", charSequence2);
        x0.g.e("postfix", charSequence3);
        x0.g.e("truncated", charSequence4);
        sb.append(charSequence2);
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.g(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) String.valueOf(next));
                }
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String O(Collection collection, String str, String str2, E0.k kVar, int i2) {
        String str3 = (i2 & 2) != 0 ? "" : str;
        String str4 = (i2 & 4) != 0 ? "" : str2;
        if ((i2 & 32) != 0) {
            kVar = null;
        }
        x0.g.e("prefix", str3);
        x0.g.e("postfix", str4);
        StringBuilder sb = new StringBuilder();
        M(collection, sb, ", ", str3, str4, -1, "...", kVar);
        String string = sb.toString();
        x0.g.d("toString(...)", string);
        return string;
    }

    public static Object P(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static final void Q(Iterable iterable, AbstractCollection abstractCollection) {
        x0.g.e("<this>", iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static ArrayList R(Collection collection) {
        x0.g.e("<this>", collection);
        return new ArrayList(collection);
    }

    public static Set S(ArrayList arrayList) {
        r rVar = r.f2193b;
        int size = arrayList.size();
        if (size == 0) {
            return rVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(s.a0(arrayList.size()));
            Q(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(arrayList.get(0));
        x0.g.d("singleton(...)", setSingleton);
        return setSingleton;
    }
}
