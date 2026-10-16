package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import q.AbstractC0328a;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: i, reason: collision with root package name */
    public static Q0 f2280i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2282a;

    /* renamed from: b, reason: collision with root package name */
    public p.k f2283b;

    /* renamed from: c, reason: collision with root package name */
    public p.l f2284c;
    public final WeakHashMap d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f2285e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2286f;

    /* renamed from: g, reason: collision with root package name */
    public C0292t f2287g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final O0 f2281j = new O0(6);

    public static synchronized Q0 d() {
        try {
            if (f2280i == null) {
                Q0 q02 = new Q0();
                f2280i = q02;
                j(q02);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2280i;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        O0 o02 = f2281j;
        o02.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) o02.a(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(Q0 q02) {
        if (Build.VERSION.SDK_INT < 24) {
            q02.a("vector", new P0(3));
            q02.a("animated-vector", new P0(2));
            q02.a("animated-selector", new P0(1));
            q02.a("drawable", new P0(0));
        }
    }

    public final void a(String str, P0 p02) {
        if (this.f2283b == null) {
            this.f2283b = new p.k(0);
        }
        this.f2283b.put(str, p02);
    }

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                p.h hVar = (p.h) this.d.get(context);
                if (hVar == null) {
                    hVar = new p.h();
                    this.d.put(context, hVar);
                }
                hVar.d(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i2) throws Resources.NotFoundException {
        if (this.f2285e == null) {
            this.f2285e = new TypedValue();
        }
        TypedValue typedValue = this.f2285e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableC = null;
        if (this.f2287g != null) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawableC = C0292t.c(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = C0292t.c(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = C0292t.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC != null) {
            layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawableC);
        }
        return layerDrawableC;
    }

    public final synchronized Drawable e(Context context, long j2) {
        Object obj;
        p.h hVar = (p.h) this.d.get(context);
        if (hVar == null) {
            return null;
        }
        int iB = AbstractC0328a.b(hVar.f2587b, hVar.d, j2);
        if (iB < 0 || (obj = hVar.f2588c[iB]) == p.i.f2589a) {
            obj = null;
        }
        WeakReference weakReference = (WeakReference) obj;
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB2 = AbstractC0328a.b(hVar.f2587b, hVar.d, j2);
            if (iB2 >= 0) {
                Object[] objArr = hVar.f2588c;
                Object obj2 = objArr[iB2];
                Object obj3 = p.i.f2589a;
                if (obj2 != obj3) {
                    objArr[iB2] = obj3;
                    hVar.f2586a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    public final synchronized Drawable g(Context context, int i2, boolean z2) {
        Drawable drawableK;
        try {
            if (!this.f2286f) {
                this.f2286f = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof U.q) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f2286f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i2);
            if (drawableK == null) {
                drawableK = c(context, i2);
            }
            if (drawableK == null) {
                drawableK = context.getDrawable(i2);
            }
            if (drawableK != null) {
                drawableK = n(context, i2, z2, drawableK);
            }
            if (drawableK != null) {
                AbstractC0286p0.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        p.l lVar;
        Object obj;
        WeakHashMap weakHashMap = this.f2282a;
        ColorStateList colorStateListD = null;
        if (weakHashMap == null || (lVar = (p.l) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int iA = AbstractC0328a.a(lVar.f2600c, i2, lVar.f2598a);
            if (iA < 0 || (obj = lVar.f2599b[iA]) == p.i.f2590b) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            C0292t c0292t = this.f2287g;
            if (c0292t != null) {
                colorStateListD = c0292t.d(context, i2);
            }
            if (colorStateListD != null) {
                if (this.f2282a == null) {
                    this.f2282a = new WeakHashMap();
                }
                p.l lVar2 = (p.l) this.f2282a.get(context);
                if (lVar2 == null) {
                    lVar2 = new p.l();
                    this.f2282a.put(context, lVar2);
                }
                lVar2.a(i2, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        Object obj;
        p.k kVar = this.f2283b;
        if (kVar == null || kVar.isEmpty()) {
            return null;
        }
        p.l lVar = this.f2284c;
        if (lVar != null) {
            int iA = AbstractC0328a.a(lVar.f2600c, i2, lVar.f2598a);
            if (iA < 0 || (obj = lVar.f2599b[iA]) == p.i.f2590b) {
                obj = null;
            }
            String str = (String) obj;
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f2283b.get(str) == null)) {
                return null;
            }
        } else {
            this.f2284c = new p.l();
        }
        if (this.f2285e == null) {
            this.f2285e = new TypedValue();
        }
        TypedValue typedValue = this.f2285e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j2);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f2284c.a(i2, name);
                P0 p02 = (P0) this.f2283b.get(name);
                if (p02 != null) {
                    drawableE = p02.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j2, drawableE);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (drawableE == null) {
            this.f2284c.a(i2, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        p.h hVar = (p.h) this.d.get(context);
        if (hVar != null) {
            int i2 = hVar.d;
            Object[] objArr = hVar.f2588c;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            hVar.d = 0;
            hVar.f2586a = false;
        }
    }

    public final synchronized void m(C0292t c0292t) {
        this.f2287g = c0292t;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable n(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.Q0.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
