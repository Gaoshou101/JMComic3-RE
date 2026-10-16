package a;

import C.c;
import C.e;
import E0.l;
import F0.AbstractC0019u;
import F0.C0010k;
import F0.C0016q;
import F0.I;
import F0.J;
import G.P;
import J.g;
import J.j;
import K0.r;
import L.b;
import M0.d;
import X.i;
import a0.C0064a;
import a0.z;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.webkit.WebView;
import android.widget.TextView;
import c.C0085a;
import com.a7m3p9xv.t6qk2z8.app.MainActivity;
import com.getcapacitor.C0101f;
import com.getcapacitor.E;
import com.getcapacitor.u;
import com.getcapacitor.w;
import j0.AbstractC0214e;
import j0.C0208G;
import j0.C0210a;
import j0.C0211b;
import j0.C0212c;
import j0.C0213d;
import j0.C0221l;
import j0.C0222m;
import j0.C0223n;
import j0.C0224o;
import j0.s;
import j0.v;
import j0.x;
import j0.y;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import k0.C0231d;
import k0.C0235h;
import m.C0266f0;
import m.Q0;
import m.i1;
import m.k1;
import n0.C0317j;
import n0.InterfaceC0314g;
import n0.InterfaceC0315h;
import n0.InterfaceC0316i;
import o0.EnumC0322a;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import r.C0331c;
import r.C0334f;
import u0.h;
import u0.k;
import w0.p;
import x0.m;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0062a implements P, g {

    /* renamed from: a, reason: collision with root package name */
    public static long f729a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f730b;

    public static Object A(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C0085a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String B(java.util.Collection r17) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0062a.B(java.util.Collection):java.lang.String");
    }

    public static final C0208G C(E e2) {
        x0.g.e("<this>", e2);
        String strE = e2.e("path", null);
        if (strE == null) {
            return null;
        }
        String strE2 = e2.e("directory", null);
        x.d.getClass();
        return new C0208G(L.c.r(strE2), strE);
    }

    public static final z D(E e2) {
        x0.g.e("<this>", e2);
        C0208G c0208gC = C(e2);
        if (c0208gC == null) {
            return null;
        }
        Boolean boolB = e2.b("recursive", null);
        if (boolB == null) {
            boolB = Boolean.FALSE;
        }
        return new z(c0208gC, boolB.booleanValue());
    }

    public static E.c E(C0266f0 c0266f0) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new E.c(A.a.i(c0266f0));
        }
        TextPaint textPaint = new TextPaint(c0266f0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c0266f0.getBreakStrategy();
        int hyphenationFrequency = c0266f0.getHyphenationFrequency();
        if (c0266f0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (c0266f0.getInputType() & 15) != 3) {
                boolean z2 = c0266f0.getLayoutDirection() == 1;
                switch (c0266f0.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(A.a.a(e.b(c0266f0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new E.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static Boolean F(C0101f c0101f, URL url) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("io.ionic.sslpinning.SSLPinning");
            return (Boolean) cls.getDeclaredMethod("isDomainExcluded", C0101f.class, URL.class).invoke(cls.getDeclaredConstructor(null).newInstance(null), c0101f, url);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public static boolean G() {
        if (Build.VERSION.SDK_INT >= 29) {
            return T.a.a();
        }
        try {
            if (f730b == null) {
                f729a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f730b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f730b.invoke(null, Long.valueOf(f729a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static InterfaceC0316i H(InterfaceC0314g interfaceC0314g, InterfaceC0315h interfaceC0315h) {
        x0.g.e("key", interfaceC0315h);
        return x0.g.a(interfaceC0314g.getKey(), interfaceC0315h) ? C0317j.f2507b : interfaceC0314g;
    }

    public static Object K(String str) {
        new JSONObject();
        try {
            if ("null".equals(str.trim())) {
                return JSONObject.NULL;
            }
            if ("true".equals(str.trim())) {
                return Boolean.TRUE;
            }
            if ("false".equals(str.trim())) {
                return Boolean.FALSE;
            }
            if (str.trim().length() <= 0) {
                return "";
            }
            if (str.trim().matches("^\".*\"$")) {
                return str.trim().substring(1, str.trim().length() - 1);
            }
            if (str.trim().matches("^-?\\d+$")) {
                return Integer.valueOf(Integer.parseInt(str.trim()));
            }
            if (str.trim().matches("^-?\\d+(\\.\\d+)?$")) {
                return Double.valueOf(Double.parseDouble(str.trim()));
            }
            try {
                return new w(str);
            } catch (JSONException unused) {
                return new u(str);
            }
        } catch (JSONException unused2) {
            return str;
        }
    }

    public static b N(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    b bVar = new b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.d = byteBufferDuplicate;
                    bVar.f137a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f138b = i7;
                    bVar.f139c = ((ByteBuffer) bVar.d).getShort(i7);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static String O(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null) {
                sb.append(line);
                line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(System.getProperty("line.separator"));
                }
            }
            String string = sb.toString();
            bufferedReader.close();
            return string;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.getcapacitor.w P(com.getcapacitor.E r20, java.lang.String r21, com.getcapacitor.C0101f r22) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0062a.P(com.getcapacitor.E, java.lang.String, com.getcapacitor.f):com.getcapacitor.w");
    }

    public static final void Q(E e2, a0.b bVar) {
        x0.g.e("<this>", e2);
        x0.g.e("error", bVar);
        e2.f(bVar.f736b, bVar.f735a, null);
    }

    public static void R(E e2, w wVar, int i2) {
        if ((i2 & 1) != 0) {
            wVar = null;
        }
        x0.g.e("<this>", e2);
        e2.f1366f = false;
        if (wVar != null) {
            e2.h(wVar);
        } else {
            e2.g();
        }
    }

    public static void S(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            A.a.j(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void T(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void U(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public static void V(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            i1.a(view, charSequence);
            return;
        }
        k1 k1Var = k1.f2403k;
        if (k1Var != null && k1Var.f2405a == view) {
            k1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new k1(view, charSequence);
            return;
        }
        k1 k1Var2 = k1.f2404l;
        if (k1Var2 != null && k1Var2.f2405a == view) {
            k1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final Object W(r rVar, r rVar2, p pVar) throws Throwable {
        Object c0010k;
        Object objB;
        I i2;
        try {
            m.a(2, pVar);
            c0010k = pVar.f(rVar2, rVar);
        } catch (Throwable th) {
            c0010k = new C0010k(th, false);
        }
        EnumC0322a enumC0322a = EnumC0322a.f2519b;
        if (c0010k == enumC0322a || (objB = rVar.B(c0010k)) == AbstractC0019u.d) {
            return enumC0322a;
        }
        if (objB instanceof C0010k) {
            throw ((C0010k) objB).f117a;
        }
        J j2 = objB instanceof J ? (J) objB : null;
        return (j2 == null || (i2 = j2.f87a) == null) ? objB : i2;
    }

    public static final void X(Object obj) {
        if (obj instanceof C0231d) {
            throw ((C0231d) obj).f2024b;
        }
    }

    public static ActionMode.Callback Y(ActionMode.Callback callback) {
        return (!(callback instanceof j) || Build.VERSION.SDK_INT < 26) ? callback : ((j) callback).f334a;
    }

    public static ActionMode.Callback Z(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof j) || callback == null) ? callback : new j(callback, textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(I0.n r5, a0.m r6, java.lang.Throwable r7, p0.c r8) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            boolean r0 = r8 instanceof I0.f
            if (r0 == 0) goto L13
            r0 = r8
            I0.f r0 = (I0.f) r0
            int r1 = r0.f285g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f285g = r1
            goto L18
        L13:
            I0.f r0 = new I0.f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f284f
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f285g
            k0.h r3 = k0.C0235h.f2029a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Throwable r7 = r0.f283e
            X(r8)     // Catch: java.lang.Throwable -> L2b
            goto L42
        L2b:
            r5 = move-exception
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            X(r8)
            r0.f283e = r7     // Catch: java.lang.Throwable -> L2b
            r0.f285g = r4     // Catch: java.lang.Throwable -> L2b
            r6.e(r5, r7, r0)     // Catch: java.lang.Throwable -> L2b
            if (r3 != r1) goto L42
            goto L43
        L42:
            r1 = r3
        L43:
            return r1
        L44:
            if (r7 == 0) goto L4b
            if (r7 == r5) goto L4b
            P0.b.a(r5, r7)
        L4b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0062a.d(I0.n, a0.m, java.lang.Throwable, p0.c):java.lang.Object");
    }

    public static void e(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable i(I0.b r5, I0.c r6, p0.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof I0.j
            if (r0 == 0) goto L13
            r0 = r7
            I0.j r0 = (I0.j) r0
            int r1 = r0.f298g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f298g = r1
            goto L18
        L13:
            I0.j r0 = new I0.j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f297f
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f298g
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            x0.j r5 = r0.f296e
            X(r7)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r6 = move-exception
            r1 = r6
            goto L54
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            X(r7)
            x0.j r7 = new x0.j
            r7.<init>()
            I0.l r2 = new I0.l     // Catch: java.lang.Throwable -> L52
            r4 = 0
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L52
            r0.f296e = r7     // Catch: java.lang.Throwable -> L52
            r0.f298g = r3     // Catch: java.lang.Throwable -> L52
            java.lang.Object r5 = r5.o(r2, r0)     // Catch: java.lang.Throwable -> L52
            if (r5 != r1) goto L4d
            goto L95
        L4d:
            r1 = 0
            goto L95
        L4f:
            r1 = r5
            r5 = r7
            goto L54
        L52:
            r5 = move-exception
            goto L4f
        L54:
            java.lang.Object r5 = r5.f2706b
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L60
            boolean r6 = r5.equals(r1)
            if (r6 != 0) goto L92
        L60:
            n0.i r6 = r0.f2603c
            x0.g.b(r6)
            F0.q r7 = F0.C0016q.f123c
            n0.g r6 = r6.g(r7)
            F0.L r6 = (F0.L) r6
            if (r6 == 0) goto L93
            F0.T r6 = (F0.T) r6
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = F0.T.f97b
            java.lang.Object r7 = r7.get(r6)
            boolean r0 = r7 instanceof F0.C0010k
            if (r0 != 0) goto L87
            boolean r0 = r7 instanceof F0.S
            if (r0 == 0) goto L93
            F0.S r7 = (F0.S) r7
            boolean r7 = r7.e()
            if (r7 == 0) goto L93
        L87:
            java.util.concurrent.CancellationException r6 = r6.t()
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L92
            goto L93
        L92:
            throw r1
        L93:
            if (r5 != 0) goto L96
        L95:
            return r1
        L96:
            boolean r6 = r1 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L9e
            P0.b.a(r5, r1)
            throw r5
        L9e:
            P0.b.a(r1, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0062a.i(I0.b, I0.c, p0.c):java.io.Serializable");
    }

    public static void j(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void k(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                P0.b.a(th, th2);
            }
        }
    }

    public static final Object l(String str, C0210a c0210a, boolean z2) {
        x0.g.e("fullPath", str);
        x0.g.e("options", c0210a);
        try {
            File file = new File(str);
            if (file.exists()) {
                throw new C0221l(str);
            }
            boolean z3 = c0210a.f1935a;
            File parentFile = file.getParentFile();
            boolean z4 = false;
            if (parentFile != null && (parentFile.exists() || (z3 && parentFile.mkdirs()))) {
                z4 = true;
            }
            if (!z4) {
                throw new C0222m("Missing parent directories - either recursive=false was received or parent directory creation failed", null);
            }
            if (z2 && !file.mkdir()) {
                throw new s(null);
            }
            if (!z2 && !file.createNewFile()) {
                throw new s(null);
            }
            return C0235h.f2029a;
        } catch (Throwable th) {
            return m(th);
        }
    }

    public static final C0231d m(Throwable th) {
        x0.g.e("exception", th);
        return new C0231d(th);
    }

    public static final Object n(String str, C0211b c0211b) {
        boolean zDelete;
        x0.g.e("fullPath", str);
        x0.g.e("options", c0211b);
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new C0224o(str, null);
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0 && !c0211b.f1936a) {
                    throw new C0223n("Received recursive=false but directory is not-empty", null);
                }
                h hVar = new h(new u0.j(file, k.f2670c, null, Integer.MAX_VALUE));
                loop0: while (true) {
                    zDelete = true;
                    while (hVar.hasNext()) {
                        File file2 = (File) hVar.next();
                        if ((file2.delete() || !file2.exists()) && zDelete) {
                            break;
                        }
                        zDelete = false;
                    }
                }
            } else {
                zDelete = file.delete();
            }
            if (zDelete) {
                return C0235h.f2029a;
            }
            throw new s(null);
        } catch (Throwable th) {
            return m(th);
        }
    }

    public static final boolean o(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static InvocationHandler p() throws NoSuchMethodException, SecurityException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static final I0.b q(i iVar, d dVar) {
        if (dVar.g(C0016q.f123c) == null) {
            return dVar.equals(C0317j.f2507b) ? iVar : new J0.d(iVar, dVar, -3, H0.a.f224b);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + dVar).toString());
    }

    public static AbstractC0214e r(String str) {
        if (str == null || l.Q(str)) {
            C0213d c0213d = AbstractC0214e.f1939a;
            return C0212c.f1937b;
        }
        try {
            Charset charsetForName = Charset.forName(str);
            x0.g.d("forName(...)", charsetForName);
            return new C0213d(charsetForName);
        } catch (Exception unused) {
            return AbstractC0214e.f1939a;
        }
    }

    public static InterfaceC0314g s(InterfaceC0314g interfaceC0314g, InterfaceC0315h interfaceC0315h) {
        x0.g.e("key", interfaceC0315h);
        if (x0.g.a(interfaceC0314g.getKey(), interfaceC0315h)) {
            return interfaceC0314g;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r5.f2732c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList t(android.content.Context r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            y.i r1 = new y.i
            r1.<init>(r0, r8)
            java.lang.Object r2 = y.k.f2737c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = y.k.f2736b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            y.h r5 = (y.h) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.f2731b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r8 != 0) goto L3e
            int r6 = r5.f2732c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L92
        L3e:
            if (r8 == 0) goto L4c
            int r6 = r5.f2732c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.f2730a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            goto L91
        L54:
            java.lang.ThreadLocal r2 = y.k.f2735a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L86
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = y.AbstractC0345c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
            goto L86
        L7e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L86:
            if (r4 == 0) goto L8d
            y.k.a(r1, r9, r4, r8)
            r3 = r4
            goto L91
        L8d:
            android.content.res.ColorStateList r3 = r0.getColorStateList(r9, r8)
        L91:
            return r3
        L92:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0062a.t(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static final C0064a u(E e2) {
        x xVarR;
        x0.g.e("<this>", e2);
        String strE = e2.e("from", null);
        if (strE == null) {
            return null;
        }
        L.c cVar = x.d;
        String strE2 = e2.e("directory", null);
        cVar.getClass();
        x xVarR2 = L.c.r(strE2);
        String strE3 = e2.e("to", null);
        if (strE3 == null) {
            return null;
        }
        String strE4 = e2.e("toDirectory", null);
        if (strE4 == null || (xVarR = L.c.r(strE4)) == null) {
            xVarR = xVarR2;
        }
        return new C0064a(new C0208G(xVarR2, strE), new C0208G(xVarR, strE3));
    }

    public static Drawable v(Context context, int i2) {
        return Q0.d().f(context, i2);
    }

    public static String w(Context context, String str) throws IOException {
        String[] list;
        StringBuilder sb = new StringBuilder();
        try {
            list = context.getAssets().list(str);
        } catch (IOException unused) {
            L.c.G("Unable to read file at path " + str);
        }
        if (list.length <= 0) {
            return P0.b.x(context.getAssets(), str);
        }
        for (String str2 : list) {
            if (!str2.endsWith(".map")) {
                sb.append(w(context, str + "/" + str2));
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class x(C0.b bVar) {
        x0.g.e("<this>", bVar);
        Class clsA = ((x0.c) bVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsA;
    }

    public static final y y(File file) throws IOException {
        P0.b wVar;
        Long lValueOf;
        x0.g.e("fileObject", file);
        String absolutePath = file.getAbsolutePath();
        String name = file.getName();
        long length = file.length();
        Uri uriFromFile = Uri.fromFile(file);
        if (file.isDirectory()) {
            wVar = v.f1946m;
        } else {
            String name2 = file.getName();
            x0.g.d("getName(...)", name2);
            String strV = l.V(name2, "");
            if (l.Q(strV)) {
                strV = file.getPath();
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strV);
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = x0.g.a(strV, "3ga") ? "audio/3gpp" : x0.g.a(strV, "js") ? "text/javascript" : "application/octet-binary";
            }
            wVar = new j0.w(mimeTypeFromExtension);
        }
        P0.b bVar = wVar;
        if (Build.VERSION.SDK_INT > 26) {
            BasicFileAttributes attributes = Files.readAttributes(file.toPath(), (Class<BasicFileAttributes>) E.b.e(), new LinkOption[0]);
            lValueOf = Long.valueOf(Math.min(attributes.creationTime().toMillis(), attributes.lastAccessTime().toMillis()));
        } else {
            lValueOf = null;
        }
        Long l2 = lValueOf;
        long jLastModified = file.lastModified();
        x0.g.b(absolutePath);
        x0.g.b(name);
        x0.g.b(uriFromFile);
        return new y(absolutePath, name, uriFromFile, length, bVar, l2, jLastModified);
    }

    public static String z(ArrayList arrayList, MainActivity mainActivity) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                arrayList2.add(P0.b.x(mainActivity.getAssets(), "public/" + str));
            } catch (IOException unused) {
                L.c.o("Unable to read public/" + str);
            }
        }
        return TextUtils.join("\n", arrayList2);
    }

    public abstract void I(Throwable th);

    public abstract void J(androidx.emoji2.text.u uVar);

    public abstract void L(C0334f c0334f, C0334f c0334f2);

    public abstract void M(C0334f c0334f, Thread thread);

    public abstract boolean f(r.g gVar, C0331c c0331c);

    public abstract boolean g(r.g gVar, Object obj, Object obj2);

    public abstract boolean h(r.g gVar, C0334f c0334f, C0334f c0334f2);

    @Override // G.P
    public void b() {
    }

    @Override // G.P
    public void c() {
    }
}
