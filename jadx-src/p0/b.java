package P0;

import D.h;
import E0.l;
import F0.AbstractC0015p;
import G.InterfaceC0035k;
import G.J;
import G.K;
import J0.m;
import K0.f;
import Q.d;
import X.i;
import a.AbstractC0062a;
import a0.c;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.InputFilter;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.emoji2.text.s;
import com.a7m3p9xv.t6qk2z8.app.R;
import com.getcapacitor.w;
import g.AbstractActivityC0137i;
import j0.AbstractC0214e;
import j0.C0202A;
import j0.C0213d;
import j0.C0215f;
import j0.C0216g;
import j0.C0217h;
import j0.C0218i;
import j0.C0219j;
import j0.C0221l;
import j0.C0222m;
import j0.C0223n;
import j0.C0224o;
import j0.q;
import j0.r;
import j0.t;
import j0.v;
import j0.y;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import l0.j;
import l0.p;
import n0.C0312e;
import n0.C0317j;
import n0.InterfaceC0311d;
import n0.InterfaceC0313f;
import n0.InterfaceC0316i;
import o0.C0323b;
import o0.C0324c;
import o0.EnumC0322a;
import org.json.JSONException;
import p0.AbstractC0326a;
import x0.g;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f557a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f558b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f559c = false;
    public static Field d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f560e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f561f;

    /* renamed from: g, reason: collision with root package name */
    public static Class f562g;
    public static boolean h;

    /* renamed from: i, reason: collision with root package name */
    public static Field f563i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f564j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f565k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f566l;

    public static void C(Drawable drawable, int i2) {
        drawable.setTint(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [l0.p] */
    public static final u0.b F(File file) {
        int length;
        List listS;
        ?? arrayList;
        int iP;
        String path = file.getPath();
        g.b(path);
        char c2 = File.separatorChar;
        int iP2 = l.P(path, c2, 0, 4);
        if (iP2 != 0) {
            length = (iP2 <= 0 || path.charAt(iP2 + (-1)) != ':') ? (iP2 == -1 && path.length() > 0 && AbstractC0062a.o(path.charAt(l.L(path)), ':', false)) ? path.length() : 0 : iP2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c2 || (iP = l.P(path, c2, 2, 4)) < 0) {
            length = 1;
        } else {
            int iP3 = l.P(path, c2, iP + 1, 4);
            length = iP3 >= 0 ? iP3 + 1 : path.length();
        }
        String strSubstring = path.substring(0, length);
        g.d("substring(...)", strSubstring);
        String strSubstring2 = path.substring(length);
        g.d("substring(...)", strSubstring2);
        if (strSubstring2.length() == 0) {
            arrayList = p.f2191b;
        } else {
            String strValueOf = String.valueOf(new char[]{c2}[0]);
            int iM = l.M(strSubstring2, strValueOf, 0, false);
            if (iM != -1) {
                ArrayList arrayList2 = new ArrayList(10);
                int length2 = 0;
                do {
                    arrayList2.add(strSubstring2.subSequence(length2, iM).toString());
                    length2 = strValueOf.length() + iM;
                    iM = l.M(strSubstring2, strValueOf, length2, false);
                } while (iM != -1);
                arrayList2.add(strSubstring2.subSequence(length2, strSubstring2.length()).toString());
                listS = arrayList2;
            } else {
                listS = s(strSubstring2.toString());
            }
            arrayList = new ArrayList(j.L(listS));
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
        }
        return new u0.b(new File(strSubstring), arrayList);
    }

    public static final a0.b G(String str, Throwable th) {
        g.e("<this>", th);
        g.e("methodName", str);
        if (th instanceof t) {
            a0.b bVar = c.f737a;
            String str2 = ((t) th).f1945b;
            g.e("path", str2);
            return new a0.b(c.b(6), d.a("Invalid ", l.Q(str2) ? "" : d.a("'", str2, "' "), "path."));
        }
        if (th instanceof C0224o) {
            a0.b bVar2 = c.f737a;
            String str3 = ((C0224o) th).f1942b;
            g.e("path", str3);
            return new a0.b(c.b(8), "'" + str + "' failed because file " + (l.Q(str3) ? "" : d.a("at '", str3, "' ")) + "does not exist.");
        }
        if (th instanceof j0.p) {
            return c.d(str, "content:// URIs");
        }
        if (th instanceof q) {
            return c.d(str, "directories");
        }
        if (th instanceof r) {
            return c.d(str, "files, only directories are supported");
        }
        if (th instanceof C0221l) {
            a0.b bVar3 = c.f737a;
            return c.a(((C0221l) th).f1941b);
        }
        if (th instanceof C0222m) {
            return c.f738b;
        }
        if (th instanceof C0223n) {
            return c.f739c;
        }
        if (th instanceof C0217h ? true : th instanceof C0216g ? true : th instanceof C0219j) {
            return c.d(str, "the provided source and destinations");
        }
        if (th instanceof C0215f) {
            a0.b bVar4 = c.f737a;
            return c.a(((C0215f) th).f1940b);
        }
        if (th instanceof C0218i) {
            return c.f738b;
        }
        a0.b bVar5 = c.f737a;
        String localizedMessage = th.getLocalizedMessage();
        return c.e(str, localizedMessage != null ? localizedMessage : "");
    }

    public static final w H(y yVar) throws JSONException {
        g.e("<this>", yVar);
        w wVar = new w();
        wVar.e("name", yVar.f1958b);
        wVar.e("type", yVar.f1960e instanceof v ? "directory" : "file");
        wVar.c("size", yVar.d);
        wVar.c("mtime", yVar.f1962g);
        wVar.d("ctime", yVar.f1961f);
        wVar.d("uri", yVar.f1959c);
        return wVar;
    }

    public static final Object I(InterfaceC0316i interfaceC0316i, Object obj, Object obj2, w0.p pVar, InterfaceC0311d interfaceC0311d) {
        Object objF;
        Object objN = K0.a.n(interfaceC0316i, obj2);
        try {
            m mVar = new m(interfaceC0311d, interfaceC0316i);
            if (pVar instanceof AbstractC0326a) {
                x0.m.a(2, pVar);
                objF = pVar.f(obj, mVar);
            } else {
                objF = J(pVar, obj, mVar);
            }
            K0.a.i(interfaceC0316i, objN);
            if (objF == EnumC0322a.f2519b) {
                g.e("frame", interfaceC0311d);
            }
            return objF;
        } catch (Throwable th) {
            K0.a.i(interfaceC0316i, objN);
            throw th;
        }
    }

    public static Object J(w0.p pVar, Object obj, InterfaceC0311d interfaceC0311d) {
        Object c0324c;
        g.e("<this>", pVar);
        InterfaceC0316i context = interfaceC0311d.getContext();
        if (context == C0317j.f2507b) {
            c0324c = new C0323b(interfaceC0311d);
            if (interfaceC0311d.getContext() != C0317j.f2507b) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
            }
        } else {
            c0324c = new C0324c(interfaceC0311d, context);
        }
        x0.m.a(2, pVar);
        return pVar.f(obj, c0324c);
    }

    public static void a(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        g.e("<this>", th);
        g.e("exception", th2);
        if (th != th2) {
            Integer num = s0.a.f2631a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = r0.a.f2628a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static Object c(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void d(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
        if (i2 <= i3) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
    }

    public static final long e(InputStream inputStream, OutputStream outputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = inputStream.read(bArr);
        long j2 = 0;
        while (i3 >= 0) {
            outputStream.write(bArr, 0, i3);
            j2 += i3;
            i3 = inputStream.read(bArr);
        }
        return j2;
    }

    public static s f(Context context) {
        ProviderInfo providerInfo;
        h hVar;
        ApplicationInfo applicationInfo;
        L.c cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(9) : new L.c(9);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0062a.j("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            hVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrT = cVar.t(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrT) {
                    arrayList.add(signature.toByteArray());
                }
                hVar = new h(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
        }
        if (hVar == null) {
            return null;
        }
        return new s(new androidx.emoji2.text.r(context, hVar));
    }

    public static final w h(Uri uri) throws JSONException {
        g.e("uri", uri);
        w wVar = new w();
        wVar.e("uri", uri.toString());
        return wVar;
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = K.f146a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = J.d;
        J j2 = (J) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (j2 == null) {
            j2 = new J();
            j2.f143a = null;
            j2.f144b = null;
            j2.f145c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, j2);
        }
        WeakReference weakReference2 = j2.f145c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        j2.f145c = new WeakReference(keyEvent);
        if (j2.f144b == null) {
            j2.f144b = new SparseArray();
        }
        SparseArray sparseArray = j2.f144b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean j(InterfaceC0035k interfaceC0035k, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0035k == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0035k.b(keyEvent);
        }
        if (!(callback instanceof Activity)) {
            if (!(callback instanceof Dialog)) {
                return (view != null && K.b(view, keyEvent)) || interfaceC0035k.b(keyEvent);
            }
            Dialog dialog = (Dialog) callback;
            if (!f559c) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    d = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f559c = true;
            }
            Field field = d;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused2) {
                }
            } else {
                onKeyListener = null;
            }
            if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (K.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        Activity activity = (Activity) callback;
        activity.onUserInteraction();
        Window window2 = activity.getWindow();
        if (window2.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!f557a) {
                    try {
                        f558b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused3) {
                    }
                    f557a = true;
                }
                Method method = f558b;
                if (method != null) {
                    try {
                        Object objInvoke = method.invoke(actionBar, keyEvent);
                        if (objInvoke != null) {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                    }
                }
                if (zBooleanValue) {
                    return true;
                }
            }
        }
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (K.b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView2 != null ? decorView2.getKeyDispatcherState() : null, activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:40:0x009f, B:41:0x00a6, B:42:0x00a8, B:43:0x00a9, B:44:0x00b0, B:20:0x0049, B:24:0x0054), top: B:61:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [H0.s] */
    /* JADX WARN: Type inference failed for: r9v6, types: [H0.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0094 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(I0.c r8, H0.q r9, boolean r10, p0.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.b.k(I0.c, H0.q, boolean, p0.c):java.lang.Object");
    }

    public static void l(Object obj) throws NoSuchFieldException, SecurityException {
        LongSparseArray longSparseArray;
        if (!h) {
            try {
                f562g = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            h = true;
        }
        Class cls = f562g;
        if (cls == null) {
            return;
        }
        if (!f564j) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f563i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f564j = true;
        }
        Field field = f563i;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static float m(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return J.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Set n() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static InterfaceC0311d q(InterfaceC0311d interfaceC0311d) {
        g.e("<this>", interfaceC0311d);
        p0.c cVar = interfaceC0311d instanceof p0.c ? (p0.c) interfaceC0311d : null;
        if (cVar == null) {
            return interfaceC0311d;
        }
        InterfaceC0311d interfaceC0311d2 = cVar.d;
        if (interfaceC0311d2 != null) {
            return interfaceC0311d2;
        }
        InterfaceC0313f interfaceC0313f = (InterfaceC0313f) cVar.getContext().g(C0312e.f2506b);
        InterfaceC0311d fVar = interfaceC0313f != null ? new f((AbstractC0015p) interfaceC0313f, cVar) : cVar;
        cVar.d = fVar;
        return fVar;
    }

    public static boolean r(String str) {
        X.b bVar = X.l.f716a;
        Set<X.d> setUnmodifiableSet = Collections.unmodifiableSet(X.c.f707c);
        HashSet hashSet = new HashSet();
        for (X.d dVar : setUnmodifiableSet) {
            if (((X.c) dVar).f708a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            X.c cVar = (X.c) ((X.d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static List s(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        g.d("singletonList(...)", listSingletonList);
        return listSingletonList;
    }

    public static void t(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float u(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return J.c.c(edgeEffect, f2, f3);
        }
        J.b.a(edgeEffect, f2, f3);
        return f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r5 < 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r6 = l0.p.f2191b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r5 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r5 < r12) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (r12 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (r12 == 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        r6 = new java.util.ArrayList(r12);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (r7 >= r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        r6.add(java.lang.Byte.valueOf(r2[r7]));
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        r6 = s(java.lang.Byte.valueOf(r2[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if (r5 != 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        r6 = s(java.lang.Byte.valueOf(r2[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        r6 = new java.util.ArrayList(r5);
        r7 = 0;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
    
        if (r7 >= r12) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        r6.add(java.lang.Byte.valueOf(r2[r7]));
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        if (r8 != r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c6, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        r2 = new byte[r6.size()];
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        if (r6.hasNext() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        r2[r4] = ((java.lang.Number) r6.next()).byteValue();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
    
        r4 = r13.f1963a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        if ((r4 instanceof j0.C0213d) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ef, code lost:
    
        r6 = new java.lang.String(r2, ((j0.C0213d) r4).f1938b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f9, code lost:
    
        r6 = android.util.Base64.encodeToString(r2, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
    
        x0.g.b(r6);
        r0.f1911e = r11;
        r0.f1912f = r13;
        r0.f1913g = r15;
        r0.h = r14;
        r0.f1914i = r12;
        r0.f1915j = r5;
        r0.f1917l = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0113, code lost:
    
        if (r15.f(r6, r0) != r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0116, code lost:
    
        r4 = r11;
        r2 = r13;
        r13 = r14;
        r14 = r15;
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013d, code lost:
    
        throw new java.lang.IllegalArgumentException(("Requested element count " + r5 + " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013e, code lost:
    
        if (r5 <= 0) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:27:0x0075, B:26:0x0073], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:27:0x0075, B:66:0x0075], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[LOOP:0: B:22:0x0064->B:67:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [l0.p] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0116 -> B:59:0x011b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(java.io.InputStream r11, j0.z r12, int r13, w0.p r14, p0.c r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.b.w(java.io.InputStream, j0.z, int, w0.p, p0.c):java.lang.Object");
    }

    public static String x(AssetManager assetManager, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(assetManager.open(str)));
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = sb.toString();
                    bufferedReader.close();
                    return string;
                }
                sb.append(line);
                sb.append("\n");
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final String y(InputStream inputStream, C0202A c0202a) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        g.e("options", c0202a);
        AbstractC0214e abstractC0214e = c0202a.f1921a;
        if (!(abstractC0214e instanceof C0213d)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
            e(inputStream, byteArrayOutputStream, 8192);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            g.d("toByteArray(...)", byteArray);
            String strEncodeToString = Base64.encodeToString(byteArray, 2);
            g.b(strEncodeToString);
            return strEncodeToString;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, ((C0213d) abstractC0214e).f1938b);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i2 = inputStreamReader.read(cArr); i2 >= 0; i2 = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i2);
            }
            String string = stringWriter.toString();
            g.d("toString(...)", string);
            AbstractC0062a.k(inputStreamReader, null);
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0062a.k(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public abstract void A(boolean z2);

    public abstract void B(boolean z2);

    public abstract void D();

    public abstract void E();

    public boolean b() {
        return false;
    }

    public abstract Intent g(AbstractActivityC0137i abstractActivityC0137i, Object obj);

    public abstract InputFilter[] o(InputFilter[] inputFilterArr);

    public i p(AbstractActivityC0137i abstractActivityC0137i, Object obj) {
        return null;
    }

    public abstract Object v(Intent intent, int i2);

    public void z() {
    }
}
