package G;

import a.AbstractC0062a;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import g.C0125H;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import m.C0294u;
import org.xmlpull.v1.XmlPullParserException;
import y.AbstractC0344b;
import y.InterfaceC0346d;

/* renamed from: G.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037m implements I.h {
    public static C0037m d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f195a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f196b;

    /* renamed from: c, reason: collision with root package name */
    public Object f197c;

    public /* synthetic */ C0037m(Object obj, Object obj2, Object obj3) {
        this.f195a = obj;
        this.f196b = obj2;
        this.f197c = obj3;
    }

    public static boolean e(Editable editable, KeyEvent keyEvent, boolean z2) {
        androidx.emoji2.text.y[] yVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (yVarArr = (androidx.emoji2.text.y[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.y.class)) != null && yVarArr.length > 0) {
            for (androidx.emoji2.text.y yVar : yVarArr) {
                int spanStart = editable.getSpanStart(yVar);
                int spanEnd = editable.getSpanEnd(yVar);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static C0037m m(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new C0037m(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    @Override // I.h
    public Uri b() {
        return (Uri) this.f197c;
    }

    @Override // I.h
    public Object c() {
        return null;
    }

    @Override // I.h
    public Uri d() {
        return (Uri) this.f195a;
    }

    public androidx.lifecycle.I f(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return g("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public androidx.lifecycle.I g(String str, Class cls) {
        androidx.lifecycle.I iA;
        x0.g.e("key", str);
        androidx.lifecycle.L l2 = (androidx.lifecycle.L) this.f195a;
        l2.getClass();
        LinkedHashMap linkedHashMap = l2.f1285a;
        androidx.lifecycle.I i2 = (androidx.lifecycle.I) linkedHashMap.get(str);
        boolean zIsInstance = cls.isInstance(i2);
        androidx.lifecycle.K k2 = (androidx.lifecycle.K) this.f196b;
        if (zIsInstance) {
            if (k2 instanceof androidx.lifecycle.H) {
            }
            x0.g.c("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", i2);
            return i2;
        }
        O.c cVar = new O.c((O.b) this.f197c);
        cVar.f541a.put(androidx.lifecycle.J.f1284b, str);
        try {
            iA = k2.v(cls, cVar);
        } catch (AbstractMethodError unused) {
            iA = k2.a(cls);
        }
        x0.g.e("viewModel", iA);
        androidx.lifecycle.I i3 = (androidx.lifecycle.I) linkedHashMap.put(str, iA);
        if (i3 != null) {
            i3.b();
        }
        return iA;
    }

    @Override // I.h
    public ClipDescription getDescription() {
        return (ClipDescription) this.f196b;
    }

    public ColorStateList h(int i2) {
        int resourceId;
        ColorStateList colorStateListT;
        TypedArray typedArray = (TypedArray) this.f196b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListT = AbstractC0062a.t((Context) this.f195a, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListT;
    }

    public Drawable i(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f196b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0062a.v((Context) this.f195a, resourceId);
    }

    public Drawable j(int i2) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.f196b).hasValue(i2) || (resourceId = ((TypedArray) this.f196b).getResourceId(i2, 0)) == 0) {
            return null;
        }
        C0294u c0294uA = C0294u.a();
        Context context = (Context) this.f195a;
        synchronized (c0294uA) {
            drawableG = c0294uA.f2462a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface k(int i2, int i3, m.V v2) throws Resources.NotFoundException {
        int i4 = 7;
        int resourceId = ((TypedArray) this.f196b).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f197c) == null) {
            this.f197c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f197c;
        ThreadLocal threadLocal = y.k.f2735a;
        Context context = (Context) this.f195a;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            v2.a();
            return null;
        }
        int i5 = typedValue.assetCookie;
        p.j jVar = z.g.f2756b;
        Typeface typeface = (Typeface) jVar.a(z.g.b(resources, resourceId, string, i5, i3));
        if (typeface != null) {
            new Handler(Looper.getMainLooper()).post(new Q.h(v2, i4, typeface));
            return typeface;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                InterfaceC0346d interfaceC0346dG = AbstractC0344b.g(resources.getXml(resourceId), resources);
                if (interfaceC0346dG != null) {
                    return z.g.a(context, interfaceC0346dG, resources, resourceId, string, typedValue.assetCookie, i3, v2);
                }
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                v2.a();
                return null;
            }
            int i6 = typedValue.assetCookie;
            Typeface typefaceF = z.g.f2755a.f(context, resources, resourceId, string, i3);
            if (typefaceF != null) {
                jVar.b(z.g.b(resources, resourceId, string, i6, i3), typefaceF);
            }
            if (typefaceF != null) {
                new Handler(Looper.getMainLooper()).post(new Q.h(v2, i4, typefaceF));
            } else {
                v2.a();
            }
            return typefaceF;
        } catch (IOException e2) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e2);
            v2.a();
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e3);
            v2.a();
            return null;
        }
    }

    public boolean l(CharSequence charSequence, int i2, int i3, androidx.emoji2.text.x xVar) {
        if ((xVar.f1149c & 3) == 0) {
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) this.f197c;
            L.a aVarC = xVar.c();
            int iA = aVarC.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarC.d).getShort(iA + aVarC.f137a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f1102b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = dVar.f1103a;
            String string = sb.toString();
            int i4 = z.d.f2752a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i5 = xVar.f1149c & 4;
            xVar.f1149c = zHasGlyph ? i5 | 2 : i5 | 1;
        }
        return (xVar.f1149c & 3) == 2;
    }

    public void n() {
        Iterator it = ((CopyOnWriteArrayList) this.f196b).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.q qVar = ((androidx.fragment.app.k) it.next()).f1198a;
            if (qVar.f1231t >= 1) {
                Iterator it2 = qVar.f1216c.f().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
    }

    public void o() {
        Iterator it = ((CopyOnWriteArrayList) this.f196b).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.q qVar = ((androidx.fragment.app.k) it.next()).f1198a;
            if (qVar.f1231t >= 1) {
                Iterator it2 = qVar.f1216c.f().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
    }

    public void p() {
        Iterator it = ((CopyOnWriteArrayList) this.f196b).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.q qVar = ((androidx.fragment.app.k) it.next()).f1198a;
            if (qVar.f1231t >= 1) {
                Iterator it2 = qVar.f1216c.f().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
    }

    public Object q(CharSequence charSequence, int i2, int i3, int i4, boolean z2, androidx.emoji2.text.p pVar) {
        int i5;
        char c2;
        androidx.emoji2.text.q qVar = new androidx.emoji2.text.q((androidx.emoji2.text.t) ((androidx.emoji2.text.u) this.f196b).f1142c);
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        boolean zB = true;
        int i6 = 0;
        int iCharCount = i2;
        loop0: while (true) {
            i5 = iCharCount;
            while (iCharCount < i3 && i6 < i4 && zB) {
                SparseArray sparseArray = qVar.f1126c.f1138a;
                androidx.emoji2.text.t tVar = sparseArray == null ? null : (androidx.emoji2.text.t) sparseArray.get(iCodePointAt);
                if (qVar.f1124a == 2) {
                    if (tVar != null) {
                        qVar.f1126c = tVar;
                        qVar.f1128f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            qVar.a();
                        } else if (iCodePointAt != 65039) {
                            androidx.emoji2.text.t tVar2 = qVar.f1126c;
                            if (tVar2.f1139b != null) {
                                if (qVar.f1128f != 1) {
                                    qVar.d = tVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.d = qVar.f1126c;
                                    qVar.a();
                                } else {
                                    qVar.a();
                                }
                                c2 = 3;
                            } else {
                                qVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (tVar == null) {
                    qVar.a();
                    c2 = 1;
                } else {
                    qVar.f1124a = 2;
                    qVar.f1126c = tVar;
                    qVar.f1128f = 1;
                    c2 = 2;
                }
                qVar.f1127e = iCodePointAt;
                if (c2 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                    if (iCharCount < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c2 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c2 == 3) {
                    if (z2 || !l(charSequence, i5, iCharCount, qVar.d.f1139b)) {
                        zB = pVar.b(charSequence, i5, iCharCount, qVar.d.f1139b);
                        i6++;
                    }
                }
            }
            break loop0;
        }
        if (qVar.f1124a == 2 && qVar.f1126c.f1139b != null && ((qVar.f1128f > 1 || qVar.b()) && i6 < i4 && zB && (z2 || !l(charSequence, i5, iCharCount, qVar.f1126c.f1139b)))) {
            pVar.b(charSequence, i5, iCharCount, qVar.f1126c.f1139b);
        }
        return pVar.a();
    }

    public void r() {
        ((TypedArray) this.f196b).recycle();
    }

    public C0037m(androidx.lifecycle.L l2, androidx.lifecycle.K k2, O.b bVar) {
        x0.g.e("store", l2);
        x0.g.e("defaultCreationExtras", bVar);
        this.f195a = l2;
        this.f196b = k2;
        this.f197c = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0037m(androidx.lifecycle.L l2, androidx.lifecycle.K k2) {
        this(l2, k2, (O.b) O.a.f540b);
        x0.g.e("store", l2);
    }

    public C0037m(Runnable runnable) {
        this.f196b = new CopyOnWriteArrayList();
        this.f197c = new HashMap();
        this.f195a = runnable;
    }

    public C0037m(Context context, TypedArray typedArray) {
        this.f195a = context;
        this.f196b = typedArray;
    }

    public C0037m(Context context, LocationManager locationManager) {
        this.f197c = new C0125H();
        this.f195a = context;
        this.f196b = locationManager;
    }

    public C0037m(androidx.emoji2.text.u uVar, L.c cVar, androidx.emoji2.text.d dVar, Set set) {
        this.f195a = cVar;
        this.f196b = uVar;
        this.f197c = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            q(str, 0, str.length(), 1, true, new K0.u(str, 1));
        }
    }

    @Override // I.h
    public void a() {
    }
}
