package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1285a = new LinkedHashMap();

    public final void a() {
        for (I i2 : this.f1285a.values()) {
            i2.getClass();
            HashMap map = i2.f1281a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = i2.f1281a.values().iterator();
                        while (it.hasNext()) {
                            I.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = i2.f1282b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = i2.f1282b.iterator();
                        while (it2.hasNext()) {
                            I.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            i2.b();
        }
        this.f1285a.clear();
    }
}
