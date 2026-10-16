package X;

import G.AbstractC0027c;
import G.C0031g;
import G.C0037m;
import G.InterfaceC0028d;
import G.InterfaceC0030f;
import G.InterfaceC0042s;
import G.e0;
import N0.G;
import a.AbstractC0062a;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.q;
import androidx.lifecycle.I;
import androidx.lifecycle.K;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.getcapacitor.D;
import com.getcapacitor.H;
import j0.C0224o;
import j0.s;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import k0.C0232e;
import l.F;
import l.RunnableC0244f;
import l.p;
import l.y;
import m.C0275k;
import m.InterfaceC0260c0;
import m.InterfaceC0281n;
import m.J0;
import m.a1;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class i implements WebMessageListenerBoundaryInterface, InterfaceC0028d, InterfaceC0030f, I0.b, K, G, Q.f, n, J0, y, l.l, InterfaceC0260c0, InterfaceC0042s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f714a;

    /* renamed from: b, reason: collision with root package name */
    public Object f715b;

    public /* synthetic */ i(int i2) {
        this.f714a = i2;
    }

    public static Integer C(Cursor cursor, List list) {
        Integer num;
        Iterator it = list.iterator();
        do {
            num = null;
            if (!it.hasNext()) {
                break;
            }
            int columnIndex = cursor.getColumnIndex((String) it.next());
            Integer numValueOf = Integer.valueOf(columnIndex);
            if (columnIndex >= 0) {
                num = numValueOf;
            }
        } while (num == null);
        return num;
    }

    public static long D(Cursor cursor) {
        Integer numC = C(cursor, l0.i.K("datetaken", "date_added"));
        if (numC != null) {
            String string = cursor.getString(numC.intValue());
            x0.g.d("getString(...)", string);
            Long lW = E0.l.W(string);
            if (lW != null) {
                return lW.longValue();
            }
        }
        return 0L;
    }

    public static Throwable H(Throwable th, Uri uri) {
        if (!(th instanceof FileNotFoundException)) {
            return th instanceof UnsupportedOperationException ? new s(th) : th;
        }
        String string = uri.toString();
        x0.g.d("toString(...)", string);
        return new C0224o(string, th);
    }

    public static final long y(i iVar, Cursor cursor, Uri uri) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Long lW;
        iVar.getClass();
        int columnIndex = cursor.getColumnIndex("_size");
        Long l2 = null;
        if (columnIndex >= 0) {
            String string = cursor.getString(columnIndex);
            x0.g.d("getString(...)", string);
            lW = E0.l.W(string);
        } else {
            lW = null;
        }
        if (lW != null) {
            return lW.longValue();
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = ((ContentResolver) iVar.f715b).openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            try {
                Long lValueOf = Long.valueOf(assetFileDescriptorOpenAssetFileDescriptor.getLength());
                AbstractC0062a.k(assetFileDescriptorOpenAssetFileDescriptor, null);
                l2 = lValueOf;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC0062a.k(assetFileDescriptorOpenAssetFileDescriptor, th);
                    throw th2;
                }
            }
        }
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    public static final Object z(i iVar, Object obj, Uri uri) {
        iVar.getClass();
        Throwable thA = C0232e.a(obj);
        return thA != null ? AbstractC0062a.m(H(thA, uri)) : obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(android.net.Uri r6, java.lang.String r7, p0.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h0.C0173a
            if (r0 == 0) goto L13
            r0 = r8
            h0.a r0 = (h0.C0173a) r0
            int r1 = r0.f1784g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1784g = r1
            goto L18
        L13:
            h0.a r0 = new h0.a
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1782e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1784g
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
            h0.b r2 = new h0.b
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.f1784g = r3
            java.lang.Object r8 = F0.AbstractC0019u.l(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r6 = r8.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.i.A(android.net.Uri, java.lang.String, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(android.net.Uri r6, p0.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof h0.C0175c
            if (r0 == 0) goto L13
            r0 = r7
            h0.c r0 = (h0.C0175c) r0
            int r1 = r0.f1790g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1790g = r1
            goto L18
        L13:
            h0.c r0 = new h0.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f1788e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1790g
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
            h0.d r2 = new h0.d
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f1790g = r3
            java.lang.Object r7 = F0.AbstractC0019u.l(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            k0.e r7 = (k0.C0232e) r7
            java.lang.Object r6 = r7.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.i.B(android.net.Uri, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(android.net.Uri r6, p0.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof h0.C0177e
            if (r0 == 0) goto L13
            r0 = r7
            h0.e r0 = (h0.C0177e) r0
            int r1 = r0.f1795g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1795g = r1
            goto L18
        L13:
            h0.e r0 = new h0.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f1793e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1795g
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
            h0.f r2 = new h0.f
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f1795g = r3
            java.lang.Object r7 = F0.AbstractC0019u.l(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            k0.e r7 = (k0.C0232e) r7
            java.lang.Object r6 = r7.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.i.E(android.net.Uri, p0.c):java.lang.Object");
    }

    public void F(String str, boolean z2) {
        JsPromptResult jsPromptResult = (JsPromptResult) this.f715b;
        if (z2) {
            jsPromptResult.confirm(str);
        } else {
            jsPromptResult.cancel();
        }
    }

    public ArrayList G() throws H, IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((AssetManager) this.f715b).open("capacitor.plugins.json")));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                }
                JSONArray jSONArray = new JSONArray(sb.toString());
                bufferedReader.close();
                ArrayList arrayList = new ArrayList();
                try {
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        arrayList.add(Class.forName(jSONArray.getJSONObject(i2).getString("classpath")).asSubclass(D.class));
                    }
                    return arrayList;
                } catch (ClassNotFoundException e2) {
                    throw new H("Could not find class by class path: " + e2.getMessage());
                } catch (JSONException unused) {
                    throw new H("Could not parse capacitor.plugins.json as JSON");
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused2) {
            throw new H("Could not load capacitor.plugins.json");
        } catch (JSONException unused3) {
            throw new H("Could not parse capacitor.plugins.json as JSON");
        }
    }

    public void I() {
        q qVar = ((androidx.fragment.app.f) this.f715b).f1189c;
        if (qVar.f1232u == null) {
            return;
        }
        qVar.f1206B = false;
        qVar.f1207C = false;
        qVar.f1212H.getClass();
        Iterator it = qVar.f1216c.f().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J(android.net.Uri r6, j0.C0202A r7, p0.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h0.C0179g
            if (r0 == 0) goto L13
            r0 = r8
            h0.g r0 = (h0.C0179g) r0
            int r1 = r0.f1800g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1800g = r1
            goto L18
        L13:
            h0.g r0 = new h0.g
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f1798e
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.f1800g
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
            h0.h r2 = new h0.h
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.f1800g = r3
            java.lang.Object r8 = F0.AbstractC0019u.l(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            k0.e r8 = (k0.C0232e) r8
            java.lang.Object r6 = r8.f2025b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.i.J(android.net.Uri, j0.A, p0.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.K
    public I a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // l.y
    public void b(l.n nVar, boolean z2) {
        if (nVar instanceof F) {
            ((F) nVar).f2049z.k().c(false);
        }
        y yVar = ((C0275k) this.f715b).f2374e;
        if (yVar != null) {
            yVar.b(nVar, z2);
        }
    }

    @Override // G.InterfaceC0030f
    public ClipData c() {
        return ((ContentInfo) this.f715b).getClip();
    }

    @Override // X.n
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) P0.b.c(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f715b).createWebView(webView));
    }

    @Override // l.y
    public boolean d(l.n nVar) {
        C0275k c0275k = (C0275k) this.f715b;
        if (nVar == c0275k.f2373c) {
            return false;
        }
        ((F) nVar).f2048A.getClass();
        c0275k.getClass();
        y yVar = c0275k.f2374e;
        if (yVar != null) {
            return yVar.d(nVar);
        }
        return false;
    }

    @Override // m.J0
    public void e(l.n nVar, p pVar) {
        l.h hVar = (l.h) this.f715b;
        hVar.f2079f.removeCallbacksAndMessages(null);
        ArrayList arrayList = hVar.h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (nVar == ((l.g) arrayList.get(i2)).f2074b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        hVar.f2079f.postAtTime(new RunnableC0244f(this, i3 < arrayList.size() ? (l.g) arrayList.get(i3) : null, pVar, nVar), nVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // G.InterfaceC0028d
    public C0031g f() {
        return new C0031g(new i(((ContentInfo.Builder) this.f715b).build()));
    }

    @Override // Q.f
    public void g(int i2, Serializable serializable) {
        String str;
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
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f715b).setResultCode(i2);
    }

    @Override // X.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) P0.b.c(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f715b).getStatics());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // G.InterfaceC0042s
    public e0 h(View view, e0 e0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f715b;
        if (!Objects.equals(coordinatorLayout.f1045k, e0Var)) {
            coordinatorLayout.f1045k = e0Var;
            boolean z2 = e0Var.d() > 0;
            coordinatorLayout.f1046l = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            if (!e0Var.f186a.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    WeakHashMap weakHashMap = G.K.f146a;
                    if (childAt.getFitsSystemWindows()) {
                        ((t.c) childAt.getLayoutParams()).getClass();
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return e0Var;
    }

    @Override // G.InterfaceC0030f
    public int i() {
        return ((ContentInfo) this.f715b).getFlags();
    }

    @Override // l.l
    public boolean j(l.n nVar, MenuItem menuItem) {
        InterfaceC0281n interfaceC0281n = ((ActionMenuView) this.f715b).f975z;
        if (interfaceC0281n == null) {
            return false;
        }
        ((a1) interfaceC0281n).f2321a.f995G.o();
        return false;
    }

    @Override // Q.f
    public void k() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // l.l
    public void l(l.n nVar) {
        a1 a1Var = ((ActionMenuView) this.f715b).f971u;
        if (a1Var != null) {
            a1Var.l(nVar);
        }
    }

    @Override // X.n
    public String[] m() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f715b).getSupportedFeatures();
    }

    @Override // G.InterfaceC0030f
    public ContentInfo n() {
        return (ContentInfo) this.f715b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [p0.g, w0.p] */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(I0.c r7, p0.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof I0.a
            if (r0 == 0) goto L13
            r0 = r8
            I0.a r0 = (I0.a) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            I0.a r0 = new I0.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f274f
            o0.a r1 = o0.EnumC0322a.f2519b
            int r2 = r0.h
            k0.h r3 = k0.C0235h.f2029a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            J0.h r7 = r0.f273e
            a.AbstractC0062a.X(r8)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L2b:
            r8 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            a.AbstractC0062a.X(r8)
            J0.h r8 = new J0.h
            n0.i r2 = r0.f2603c
            x0.g.b(r2)
            r8.<init>(r7, r2)
            r0.f273e = r8     // Catch: java.lang.Throwable -> L5e
            r0.h = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r6.f715b     // Catch: java.lang.Throwable -> L5e
            p0.g r7 = (p0.g) r7     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r7.f(r8, r0)     // Catch: java.lang.Throwable -> L5e
            if (r7 != r1) goto L51
            goto L52
        L51:
            r7 = r3
        L52:
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = r8
        L56:
            r7.l()
            return r3
        L5a:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L60
        L5e:
            r7 = move-exception
            goto L5a
        L60:
            r7.l()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.i.o(I0.c, p0.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPostMessage(android.webkit.WebView r5, java.lang.reflect.InvocationHandler r6, android.net.Uri r7, boolean r8, java.lang.reflect.InvocationHandler r9) {
        /*
            r4 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r5 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r5 = P0.b.c(r5, r6)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r5 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r5
            java.lang.reflect.InvocationHandler[] r6 = r5.getPorts()
            int r7 = r6.length
            X.i[] r7 = new X.i[r7]
            r0 = 0
        L10:
            int r1 = r6.length
            if (r0 >= r1) goto L2b
            X.i r1 = new X.i
            r2 = r6[r0]
            r3 = 14
            r1.<init>(r3)
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r3 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r2 = P0.b.c(r3, r2)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r2 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r2
            r1.f715b = r2
            r7[r0] = r1
            int r0 = r0 + 1
            goto L10
        L2b:
            X.b r6 = X.l.f716a
            boolean r6 = r6.b()
            r7 = 1
            if (r6 == 0) goto L68
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r6 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r5 = r5.getMessagePayload()
            java.lang.Object r5 = P0.b.c(r6, r5)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r5 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r5
            int r6 = r5.getType()
            if (r6 == 0) goto L5e
            if (r6 == r7) goto L4a
            r5 = 0
            goto L72
        L4a:
            D.m r6 = new D.m
            byte[] r5 = r5.getAsArrayBuffer()
            r6.<init>()
            java.util.Objects.requireNonNull(r5)
            r5 = 0
            r6.f44b = r5
            r5 = 1
            r6.f43a = r5
        L5c:
            r5 = r6
            goto L72
        L5e:
            D.m r6 = new D.m
            java.lang.String r5 = r5.getAsString()
            r6.<init>(r5)
            goto L5c
        L68:
            D.m r6 = new D.m
            java.lang.String r5 = r5.getData()
            r6.<init>(r5)
            goto L5c
        L72:
            if (r5 == 0) goto Lcd
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r6 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r6 = P0.b.c(r6, r9)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r6 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r6
            X.f r9 = new X.f
            r9.<init>()
            java.lang.Object r6 = r6.getOrCreatePeer(r9)
            X.g r6 = (X.g) r6
            java.lang.Object r9 = r4.f715b
            I.d r9 = (I.d) r9
            java.lang.Object r9 = r9.f269a
            com.getcapacitor.z r9 = (com.getcapacitor.z) r9
            if (r8 == 0) goto Lc8
            int r8 = r5.f43a
            if (r8 != 0) goto L9f
            java.lang.Object r5 = r5.f44b
            java.lang.String r5 = (java.lang.String) r5
            r9.postMessage(r5)
            r9.d = r6
            goto Lcd
        L9f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "Wrong data accessor type detected. "
            r6.<init>(r9)
            java.lang.String r9 = "String"
            if (r8 == 0) goto Lb4
            if (r8 == r7) goto Lb1
            java.lang.String r7 = "Unknown"
            goto Lb5
        Lb1:
            java.lang.String r7 = "ArrayBuffer"
            goto Lb5
        Lb4:
            r7 = r9
        Lb5:
            r6.append(r7)
            java.lang.String r7 = " expected, but got "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Lc8:
            java.lang.String r5 = "Plugin execution is allowed in Main Frame only"
            L.c.G(r5)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.i.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override // G.InterfaceC0028d
    public void q(Bundle bundle) {
        ((ContentInfo.Builder) this.f715b).setExtras(bundle);
    }

    @Override // G.InterfaceC0028d
    public void s(Uri uri) {
        ((ContentInfo.Builder) this.f715b).setLinkUri(uri);
    }

    @Override // m.J0
    public void t(l.n nVar, p pVar) {
        ((l.h) this.f715b).f2079f.removeCallbacksAndMessages(nVar);
    }

    public String toString() {
        switch (this.f714a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f715b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // G.InterfaceC0030f
    public int u() {
        return ((ContentInfo) this.f715b).getSource();
    }

    @Override // androidx.lifecycle.K
    public I v(Class cls, O.c cVar) {
        I i2 = null;
        for (O.d dVar : (O.d[]) this.f715b) {
            if (dVar.f542a.equals(cls)) {
                i2 = (I) androidx.lifecycle.D.f1272c.g(cVar);
            }
        }
        if (i2 != null) {
            return i2;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // G.InterfaceC0028d
    public void x(int i2) {
        ((ContentInfo.Builder) this.f715b).setFlags(i2);
    }

    public /* synthetic */ i(int i2, Object obj) {
        this.f714a = i2;
        this.f715b = obj;
    }

    public i() {
        this.f714a = 27;
        this.f715b = new LinkedHashMap(0, 0.75f, true);
    }

    public i(O.d[] dVarArr) {
        this.f714a = 9;
        x0.g.e("initializers", dVarArr);
        this.f715b = dVarArr;
    }

    public i(TextView textView) {
        this.f714a = 8;
        this.f715b = new M.g(textView);
    }

    public i(EditText editText) {
        this.f714a = 7;
        this.f715b = new D.c(editText);
    }

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f714a = 4;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f715b = new I.g(uri, clipDescription, uri2);
        } else {
            this.f715b = new C0037m(uri, clipDescription, uri2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(w0.p pVar) {
        this.f714a = 5;
        this.f715b = (p0.g) pVar;
    }

    public i(ContentInfo contentInfo) {
        this.f714a = 2;
        contentInfo.getClass();
        this.f715b = AbstractC0027c.e(contentInfo);
    }

    public i(ClipData clipData, int i2) {
        this.f714a = 1;
        this.f715b = AbstractC0027c.c(clipData, i2);
    }

    @Override // m.InterfaceC0260c0
    public void p(int i2) {
    }

    @Override // m.InterfaceC0260c0
    public void r(int i2) {
    }

    @Override // m.InterfaceC0260c0
    public void w(int i2, float f2) {
    }
}
