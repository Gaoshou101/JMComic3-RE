package L;

import E0.l;
import N0.C;
import Q.f;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import androidx.fragment.app.s;
import androidx.lifecycle.I;
import androidx.lifecycle.K;
import com.getcapacitor.r;
import j0.x;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import l.n;
import l.y;
import org.apache.cordova.engine.SystemWebView;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import x0.g;

/* loaded from: classes.dex */
public class c implements C, K, f, y {

    /* renamed from: b, reason: collision with root package name */
    public static c f412b;

    /* renamed from: c, reason: collision with root package name */
    public static r f413c;
    public static c d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f414a;

    public /* synthetic */ c(int i2) {
        this.f414a = i2;
    }

    public static boolean E() {
        r rVar = f413c;
        return rVar == null || rVar.f1468l;
    }

    public static String F(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return "Capacitor";
        }
        return "Capacitor/" + TextUtils.join("/", strArr);
    }

    public static void G(String str) {
        if (E()) {
            Log.w("Capacitor", str);
        }
    }

    public static String c(String str) {
        g.e("alias", str);
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isLetter(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        g.d("toString(...)", string);
        String lowerCase = string.toLowerCase(Locale.ROOT);
        g.d("toLowerCase(...)", lowerCase);
        return lowerCase;
    }

    public static void j(String str) {
        l("Capacitor", str);
    }

    public static void l(String str, String str2) {
        if (E()) {
            Log.d(str, str2);
        }
    }

    public static void o(String str) {
        q("Capacitor", str, null);
    }

    public static void p(String str, Exception exc) {
        q("Capacitor", str, exc);
    }

    public static void q(String str, String str2, Exception exc) {
        if (E()) {
            Log.e(str, str2, exc);
        }
    }

    public static x r(String str) {
        Object obj = null;
        if (str == null || l.Q(str)) {
            return null;
        }
        q0.a aVar = x.f1954l;
        aVar.getClass();
        l0.a aVar2 = new l0.a(0, aVar);
        loop0: while (aVar2.hasNext()) {
            Object next = aVar2.next();
            x xVar = (x) next;
            c cVar = x.d;
            String strName = xVar.name();
            cVar.getClass();
            if (!c(str).equals(c(strName))) {
                List<String> list = xVar.f1956c;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (String str2 : list) {
                        x.d.getClass();
                        if (c(str).equals(c(str2))) {
                        }
                    }
                }
            }
            obj = next;
        }
        return (x) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:91:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean u(M.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.u(M.b, android.text.Editable, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(java.lang.String r6, j0.C0202A r7, p0.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h0.C0162D
            if (r0 == 0) goto L13
            r0 = r8
            h0.D r0 = (h0.C0162D) r0
            int r1 = r0.f1751g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1751g = r1
            goto L18
        L13:
            h0.D r0 = new h0.D
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1749e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1751g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0062a.X(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0062a.X(r8)
            M0.e r8 = F0.A.f80a
            M0.d r8 = M0.d.d
            h0.E r2 = new h0.E
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f1751g = r3
            java.lang.Object r8 = F0.AbstractC0019u.l(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r6 = r8.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.B(java.lang.String, j0.A, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(java.lang.String r6, java.lang.String r7, p0.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h0.C0166H
            if (r0 == 0) goto L13
            r0 = r8
            h0.H r0 = (h0.C0166H) r0
            int r1 = r0.f1761g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1761g = r1
            goto L18
        L13:
            h0.H r0 = new h0.H
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1759e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1761g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0062a.X(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0062a.X(r8)
            M0.e r8 = F0.A.f80a
            M0.d r8 = M0.d.d
            h0.I r2 = new h0.I
            r4 = 0
            r2.<init>(r6, r7, r5, r4)
            r0.f1761g = r3
            java.lang.Object r8 = F0.AbstractC0019u.l(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r6 = r8.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.C(java.lang.String, java.lang.String, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(java.lang.String r6, j0.C0204C r7, p0.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h0.C0168J
            if (r0 == 0) goto L13
            r0 = r8
            h0.J r0 = (h0.C0168J) r0
            int r1 = r0.f1769g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1769g = r1
            goto L18
        L13:
            h0.J r0 = new h0.J
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1767e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1769g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0062a.X(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0062a.X(r8)
            M0.e r8 = F0.A.f80a
            M0.d r8 = M0.d.d
            h0.K r2 = new h0.K
            r4 = 0
            r2.<init>(r6, r5, r7, r4)
            r0.f1769g = r3
            java.lang.Object r8 = F0.AbstractC0019u.l(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r6 = r8.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.D(java.lang.String, j0.C, p0.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.K
    public I a(Class cls) {
        switch (this.f414a) {
            case 4:
                return new P.a();
            default:
                return new s(true);
        }
    }

    @Override // l.y
    public boolean d(n nVar) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r6, java.lang.String r7, p0.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h0.C0184l
            if (r0 == 0) goto L13
            r0 = r8
            h0.l r0 = (h0.C0184l) r0
            int r1 = r0.f1814g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1814g = r1
            goto L18
        L13:
            h0.l r0 = new h0.l
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1812e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1814g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0062a.X(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0062a.X(r8)
            M0.e r8 = F0.A.f80a
            M0.d r8 = M0.d.d
            h0.m r2 = new h0.m
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f1814g = r3
            java.lang.Object r8 = F0.AbstractC0019u.l(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r6 = r8.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.e(java.lang.String, java.lang.String, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.String r6, java.lang.String r7, p0.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h0.v
            if (r0 == 0) goto L13
            r0 = r8
            h0.v r0 = (h0.v) r0
            int r1 = r0.f1842g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1842g = r1
            goto L18
        L13:
            h0.v r0 = new h0.v
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1840e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1842g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0062a.X(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0062a.X(r8)
            M0.e r8 = F0.A.f80a
            M0.d r8 = M0.d.d
            h0.w r2 = new h0.w
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f1842g = r3
            java.lang.Object r8 = F0.AbstractC0019u.l(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r6 = r8.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.f(java.lang.String, java.lang.String, p0.c):java.lang.Object");
    }

    @Override // Q.f
    public void g(int i2, Serializable serializable) {
        String str;
        switch (this.f414a) {
            case 5:
                break;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i2 != 6 && i2 != 7 && i2 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r6, j0.C0210a r7, p0.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h0.C0186n
            if (r0 == 0) goto L13
            r0 = r8
            h0.n r0 = (h0.C0186n) r0
            int r1 = r0.f1819g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1819g = r1
            goto L18
        L13:
            h0.n r0 = new h0.n
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1817e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1819g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0062a.X(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0062a.X(r8)
            M0.e r8 = F0.A.f80a
            M0.d r8 = M0.d.d
            h0.o r2 = new h0.o
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f1819g = r3
            java.lang.Object r8 = F0.AbstractC0019u.l(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r6 = r8.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.h(java.lang.String, j0.a, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.String r6, j0.C0210a r7, p0.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h0.x
            if (r0 == 0) goto L13
            r0 = r8
            h0.x r0 = (h0.x) r0
            int r1 = r0.f1847g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1847g = r1
            goto L18
        L13:
            h0.x r0 = new h0.x
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1845e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1847g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0062a.X(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0062a.X(r8)
            M0.e r8 = F0.A.f80a
            M0.d r8 = M0.d.d
            h0.y r2 = new h0.y
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f1847g = r3
            java.lang.Object r8 = F0.AbstractC0019u.l(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r6 = r8.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.i(java.lang.String, j0.a, p0.c):java.lang.Object");
    }

    @Override // Q.f
    public void k() {
        switch (this.f414a) {
            case 5:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(java.lang.String r6, j0.C0211b r7, p0.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h0.C0188p
            if (r0 == 0) goto L13
            r0 = r8
            h0.p r0 = (h0.C0188p) r0
            int r1 = r0.f1824g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1824g = r1
            goto L18
        L13:
            h0.p r0 = new h0.p
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1822e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1824g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0062a.X(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0062a.X(r8)
            M0.e r8 = F0.A.f80a
            M0.d r8 = M0.d.d
            h0.q r2 = new h0.q
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f1824g = r3
            java.lang.Object r8 = F0.AbstractC0019u.l(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r6 = r8.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.m(java.lang.String, j0.b, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.String r6, p0.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof h0.z
            if (r0 == 0) goto L13
            r0 = r7
            h0.z r0 = (h0.z) r0
            int r1 = r0.f1852g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1852g = r1
            goto L18
        L13:
            h0.z r0 = new h0.z
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f1850e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1852g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0062a.X(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0062a.X(r7)
            M0.e r7 = F0.A.f80a
            M0.d r7 = M0.d.d
            h0.A r2 = new h0.A
            r4 = 0
            r2.<init>(r6, r4)
            r0.f1852g = r3
            java.lang.Object r7 = F0.AbstractC0019u.l(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            k0.e r7 = (k0.C0232e) r7
            java.lang.Object r6 = r7.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.n(java.lang.String, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(java.lang.String r6, p0.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof h0.C0160B
            if (r0 == 0) goto L13
            r0 = r7
            h0.B r0 = (h0.C0160B) r0
            int r1 = r0.f1746g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1746g = r1
            goto L18
        L13:
            h0.B r0 = new h0.B
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f1744e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1746g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0062a.X(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0062a.X(r7)
            M0.e r7 = F0.A.f80a
            M0.d r7 = M0.d.d
            h0.C r2 = new h0.C
            r4 = 0
            r2.<init>(r6, r4)
            r0.f1746g = r3
            java.lang.Object r7 = F0.AbstractC0019u.l(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            k0.e r7 = (k0.C0232e) r7
            java.lang.Object r6 = r7.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.s(java.lang.String, p0.c):java.lang.Object");
    }

    public Signature[] t(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // androidx.lifecycle.K
    public I v(Class cls, O.c cVar) {
        switch (this.f414a) {
        }
        return a(cls);
    }

    public boolean w(CharSequence charSequence) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(java.lang.String r6, p0.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof h0.C0190r
            if (r0 == 0) goto L13
            r0 = r7
            h0.r r0 = (h0.C0190r) r0
            int r1 = r0.f1829g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1829g = r1
            goto L18
        L13:
            h0.r r0 = new h0.r
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f1827e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1829g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0062a.X(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0062a.X(r7)
            M0.e r7 = F0.A.f80a
            M0.d r7 = M0.d.d
            h0.s r2 = new h0.s
            r4 = 0
            r2.<init>(r6, r4)
            r0.f1829g = r3
            java.lang.Object r7 = F0.AbstractC0019u.l(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            k0.e r7 = (k0.C0232e) r7
            java.lang.Object r6 = r7.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.x(java.lang.String, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(java.lang.String r6, java.lang.String r7, p0.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h0.C0192t
            if (r0 == 0) goto L13
            r0 = r8
            h0.t r0 = (h0.C0192t) r0
            int r1 = r0.f1834g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1834g = r1
            goto L18
        L13:
            h0.t r0 = new h0.t
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1832e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1834g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0062a.X(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.AbstractC0062a.X(r8)
            M0.e r8 = F0.A.f80a
            M0.d r8 = M0.d.d
            h0.u r2 = new h0.u
            r4 = 0
            r2.<init>(r6, r7, r5, r4)
            r0.f1834g = r3
            java.lang.Object r8 = F0.AbstractC0019u.l(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r6 = r8.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.c.y(java.lang.String, java.lang.String, p0.c):java.lang.Object");
    }

    public c(SystemWebView systemWebView) {
        this.f414a = 3;
        CookieManager cookieManager = CookieManager.getInstance();
        CookieManager.setAcceptFileSchemeCookies(true);
        cookieManager.setAcceptThirdPartyCookies(systemWebView, true);
    }

    private final void z() {
    }

    private final void A(int i2, Serializable serializable) {
    }

    @Override // l.y
    public void b(n nVar, boolean z2) {
    }
}
