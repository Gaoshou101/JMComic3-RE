package com.getcapacitor;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f1376e = Pattern.compile("/");

    /* renamed from: a, reason: collision with root package name */
    public M f1377a;

    /* renamed from: b, reason: collision with root package name */
    public int f1378b;

    /* renamed from: c, reason: collision with root package name */
    public String f1379c;
    public ArrayList d;

    public final void a(String str, String str2, String str3, M m2) {
        String[] strArrSplit;
        String strSubstring = str3;
        if (strSubstring != null) {
            if (!str3.isEmpty() && strSubstring.charAt(0) == '/') {
                strSubstring = strSubstring.substring(1);
            }
            strArrSplit = f1376e.split(strSubstring);
        } else {
            strArrSplit = null;
        }
        int length = strArrSplit != null ? strArrSplit.length : 0;
        L l2 = this;
        int i2 = -2;
        while (i2 < length) {
            String str4 = i2 == -2 ? str : i2 == -1 ? str2 : strArrSplit[i2];
            ArrayList arrayList = l2.d;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                L l3 = (L) arrayList.get(i3);
                if (str4.equals(l3.f1379c)) {
                    l2 = l3;
                    break;
                }
                i3++;
            }
            if (i3 == size) {
                L l4 = new L();
                l4.f1377a = null;
                l4.f1378b = -1;
                l4.d = new ArrayList();
                l4.f1379c = null;
                if (i2 == -1 && str4.contains("*")) {
                    l4.f1378b = 3;
                } else if (str4.equals("**")) {
                    l4.f1378b = 2;
                } else if (str4.equals("*")) {
                    l4.f1378b = 1;
                } else {
                    l4.f1378b = 0;
                }
                l4.f1379c = str4;
                l2.d.add(l4);
                l2 = l4;
            }
            i2++;
        }
        l2.f1377a = m2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080 A[LOOP:1: B:20:0x0039->B:44:0x0080, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007e A[EDGE_INSN: B:54:0x007e->B:43:0x007e BREAK  A[LOOP:1: B:20:0x0039->B:44:0x0080], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.net.Uri r14) {
        /*
            r13 = this;
            java.util.List r0 = r14.getPathSegments()
            int r1 = r0.size()
            if (r1 != 0) goto L13
            java.lang.String r2 = r14.getAuthority()
            if (r2 != 0) goto L13
            com.getcapacitor.M r14 = r13.f1377a
            return r14
        L13:
            r2 = -2
            r4 = r13
            r3 = r2
        L16:
            if (r3 >= r1) goto L89
            if (r3 != r2) goto L1f
            java.lang.String r5 = r14.getScheme()
            goto L2d
        L1f:
            r5 = -1
            if (r3 != r5) goto L27
            java.lang.String r5 = r14.getAuthority()
            goto L2d
        L27:
            java.lang.Object r5 = r0.get(r3)
            java.lang.String r5 = (java.lang.String) r5
        L2d:
            java.util.ArrayList r6 = r4.d
            if (r6 != 0) goto L32
            goto L89
        L32:
            int r4 = r6.size()
            r7 = 0
            r8 = 0
            r9 = r7
        L39:
            if (r8 >= r4) goto L7e
            java.lang.Object r10 = r6.get(r8)
            com.getcapacitor.L r10 = (com.getcapacitor.L) r10
            int r11 = r10.f1378b
            if (r11 == 0) goto L73
            r12 = 1
            if (r11 == r12) goto L7b
            r12 = 2
            if (r11 == r12) goto L70
            r12 = 3
            if (r11 == r12) goto L4f
            goto L7c
        L4f:
            java.lang.String r11 = r10.f1379c
            if (r11 != 0) goto L56
            f0.b r11 = f0.AbstractC0116c.f1522a
            goto L69
        L56:
            java.lang.String r12 = "\\."
            java.lang.String[] r11 = r11.split(r12)
            java.util.List r11 = java.util.Arrays.asList(r11)
            java.util.Collections.reverse(r11)
            f0.a r12 = new f0.a
            r12.<init>(r11)
            r11 = r12
        L69:
            boolean r11 = r11.a(r5)
            if (r11 == 0) goto L7c
            goto L7b
        L70:
            com.getcapacitor.M r14 = r10.f1377a
            return r14
        L73:
            java.lang.String r11 = r10.f1379c
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L7c
        L7b:
            r9 = r10
        L7c:
            if (r9 == 0) goto L80
        L7e:
            r4 = r9
            goto L83
        L80:
            int r8 = r8 + 1
            goto L39
        L83:
            if (r4 != 0) goto L86
            return r7
        L86:
            int r3 = r3 + 1
            goto L16
        L89:
            com.getcapacitor.M r14 = r4.f1377a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getcapacitor.L.b(android.net.Uri):java.lang.Object");
    }
}
