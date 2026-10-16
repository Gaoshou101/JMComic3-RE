package k;

import G.AbstractC0038n;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l.p;
import l.q;
import l.u;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f1981A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f1982B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f1985E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f1986a;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f1992i;

    /* renamed from: j, reason: collision with root package name */
    public int f1993j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1994k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1995l;

    /* renamed from: m, reason: collision with root package name */
    public int f1996m;

    /* renamed from: n, reason: collision with root package name */
    public char f1997n;

    /* renamed from: o, reason: collision with root package name */
    public int f1998o;

    /* renamed from: p, reason: collision with root package name */
    public char f1999p;

    /* renamed from: q, reason: collision with root package name */
    public int f2000q;

    /* renamed from: r, reason: collision with root package name */
    public int f2001r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2002s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2003t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2004u;

    /* renamed from: v, reason: collision with root package name */
    public int f2005v;

    /* renamed from: w, reason: collision with root package name */
    public int f2006w;
    public String x;

    /* renamed from: y, reason: collision with root package name */
    public String f2007y;

    /* renamed from: z, reason: collision with root package name */
    public q f2008z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1983C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f1984D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f1987b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1988c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f1989e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1990f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1991g = true;

    public g(h hVar, Menu menu) {
        this.f1985E = hVar;
        this.f1986a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f1985E.f2013c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2 = false;
        menuItem.setChecked(this.f2002s).setVisible(this.f2003t).setEnabled(this.f2004u).setCheckable(this.f2001r >= 1).setTitleCondensed(this.f1995l).setIcon(this.f1996m);
        int i2 = this.f2005v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f2007y;
        h hVar = this.f1985E;
        if (str != null) {
            if (hVar.f2013c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.d == null) {
                hVar.d = h.a(hVar.f2013c);
            }
            Object obj = hVar.d;
            String str2 = this.f2007y;
            f fVar = new f();
            fVar.f1979a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f1980b = cls.getMethod(str2, f.f1978c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f2001r >= 2) {
            if (menuItem instanceof p) {
                p pVar = (p) menuItem;
                pVar.x = (pVar.x & (-5)) | 4;
            } else if (menuItem instanceof u) {
                u uVar = (u) menuItem;
                try {
                    Method method = uVar.d;
                    B.a aVar = uVar.f2169c;
                    if (method == null) {
                        uVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    uVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f2009e, hVar.f2011a));
            z2 = true;
        }
        int i3 = this.f2006w;
        if (i3 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        q qVar = this.f2008z;
        if (qVar != null) {
            if (menuItem instanceof B.a) {
                ((B.a) menuItem).b(qVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f1981A;
        boolean z3 = menuItem instanceof B.a;
        if (z3) {
            ((B.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0038n.b(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f1982B;
        if (z3) {
            ((B.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0038n.f(menuItem, charSequence2);
        }
        char c2 = this.f1997n;
        int i4 = this.f1998o;
        if (z3) {
            ((B.a) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0038n.a(menuItem, c2, i4);
        }
        char c3 = this.f1999p;
        int i5 = this.f2000q;
        if (z3) {
            ((B.a) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0038n.e(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.f1984D;
        if (mode != null) {
            if (z3) {
                ((B.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0038n.d(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f1983C;
        if (colorStateList != null) {
            if (z3) {
                ((B.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0038n.c(menuItem, colorStateList);
            }
        }
    }
}
