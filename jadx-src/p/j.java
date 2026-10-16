package p;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f2591a;

    /* renamed from: b, reason: collision with root package name */
    public final X.i f2592b;

    /* renamed from: c, reason: collision with root package name */
    public final L.c f2593c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2594e;

    /* renamed from: f, reason: collision with root package name */
    public int f2595f;

    public j(int i2) {
        this.f2591a = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2592b = new X.i();
        this.f2593c = new L.c(20);
    }

    public final Object a(Object obj) {
        x0.g.e("key", obj);
        synchronized (this.f2593c) {
            X.i iVar = this.f2592b;
            iVar.getClass();
            Object obj2 = ((LinkedHashMap) iVar.f715b).get(obj);
            if (obj2 != null) {
                this.f2594e++;
                return obj2;
            }
            this.f2595f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        x0.g.e("key", obj);
        synchronized (this.f2593c) {
            this.d++;
            X.i iVar = this.f2592b;
            iVar.getClass();
            objPut = ((LinkedHashMap) iVar.f715b).put(obj, obj2);
            if (objPut != null) {
                this.d--;
            }
        }
        c(this.f2591a);
        return objPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r6) {
        /*
            r5 = this;
        L0:
            L.c r0 = r5.f2593c
            monitor-enter(r0)
            int r1 = r5.d     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L8d
            X.i r1 = r5.f2592b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.f715b     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            int r1 = r5.d     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8d
            goto L1b
        L18:
            r6 = move-exception
            goto L95
        L1b:
            int r1 = r5.d     // Catch: java.lang.Throwable -> L18
            if (r1 <= r6) goto L8b
            X.i r1 = r5.f2592b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.f715b     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L2c
            goto L8b
        L2c:
            X.i r1 = r5.f2592b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.f715b     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L18
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "map.entries"
            x0.g.d(r2, r1)     // Catch: java.lang.Throwable -> L18
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L18
            r3 = 0
            if (r2 == 0) goto L4f
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L18
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L49
            goto L5e
        L49:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L18
            goto L5e
        L4f:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L18
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L5a
            goto L5e
        L5a:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L18
        L5e:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L64
            monitor-exit(r0)
            return
        L64:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L18
            X.i r3 = r5.f2592b     // Catch: java.lang.Throwable -> L18
            r3.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "key"
            x0.g.e(r4, r1)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r3.f715b     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L18
            r3.remove(r1)     // Catch: java.lang.Throwable -> L18
            int r1 = r5.d     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "value"
            x0.g.e(r3, r2)     // Catch: java.lang.Throwable -> L18
            int r1 = r1 + (-1)
            r5.d = r1     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            goto L0
        L8b:
            monitor-exit(r0)
            return
        L8d:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L18
            throw r1     // Catch: java.lang.Throwable -> L18
        L95:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j.c(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.f2593c) {
            try {
                int i2 = this.f2594e;
                int i3 = this.f2595f + i2;
                str = "LruCache[maxSize=" + this.f2591a + ",hits=" + this.f2594e + ",misses=" + this.f2595f + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
