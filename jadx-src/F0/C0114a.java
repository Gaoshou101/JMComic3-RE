package f0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114a implements InterfaceC0117d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1520a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final List f1521b;

    public C0114a(List list) {
        if (list == null) {
            throw new IllegalArgumentException("Mask parts can not be null");
        }
        this.f1521b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    @Override // f0.InterfaceC0117d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r9) {
        /*
            r8 = this;
            int r0 = r8.f1520a
            switch(r0) {
                case 0: goto L5e;
                default: goto L5;
            }
        L5:
            r0 = 0
            if (r9 != 0) goto L9
            goto L5d
        L9:
            java.lang.String r1 = "\\."
            java.lang.String[] r9 = r9.split(r1)
            java.util.List r9 = java.util.Arrays.asList(r9)
            java.util.Collections.reverse(r9)
            int r1 = r9.size()
            java.util.List r2 = r8.f1521b
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L26
            if (r1 == r3) goto L26
            goto L5d
        L26:
            int r1 = java.lang.Math.min(r1, r3)
            r3 = r0
        L2b:
            if (r3 >= r1) goto L5c
            java.lang.Object r5 = r2.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r9.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            if (r5 != 0) goto L3d
        L3b:
            r5 = r0
            goto L56
        L3d:
            java.lang.String r7 = "*"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L47
            r5 = r4
            goto L56
        L47:
            if (r6 != 0) goto L4a
            goto L3b
        L4a:
            java.lang.String r5 = r5.toUpperCase()
            java.lang.String r6 = r6.toUpperCase()
            boolean r5 = r5.equals(r6)
        L56:
            if (r5 != 0) goto L59
            goto L5d
        L59:
            int r3 = r3 + 1
            goto L2b
        L5c:
            r0 = r4
        L5d:
            return r0
        L5e:
            java.util.List r0 = r8.f1521b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.next()
            f0.d r1 = (f0.InterfaceC0117d) r1
            boolean r1 = r1.a(r9)
            if (r1 == 0) goto L66
            r9 = 1
            goto L7b
        L7a:
            r9 = 0
        L7b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0114a.a(java.lang.String):boolean");
    }

    public C0114a(ArrayList arrayList) {
        this.f1521b = arrayList;
    }
}
