package l;

import G.L;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class n implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2110y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2111a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2112b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2113c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public l f2114e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2115f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2116g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2117i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2118j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2119k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2121m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2122n;

    /* renamed from: o, reason: collision with root package name */
    public View f2123o;

    /* renamed from: v, reason: collision with root package name */
    public p f2130v;
    public boolean x;

    /* renamed from: l, reason: collision with root package name */
    public int f2120l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2124p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2125q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2126r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2127s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2128t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2129u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2131w = false;

    public n(Context context) {
        boolean zK;
        boolean z2 = false;
        this.f2111a = context;
        Resources resources = context.getResources();
        this.f2112b = resources;
        this.f2115f = new ArrayList();
        this.f2116g = new ArrayList();
        this.h = true;
        this.f2117i = new ArrayList();
        this.f2118j = new ArrayList();
        this.f2119k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i2 = L.f150a;
            if (Build.VERSION.SDK_INT >= 28) {
                zK = A.a.k(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zK = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zK) {
                z2 = true;
            }
        }
        this.d = z2;
    }

    public final p a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f2110y[i6] << 16) | (65535 & i4);
        p pVar = new p(this, i2, i3, i4, i7, charSequence, this.f2120l);
        ArrayList arrayList = this.f2115f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((p) arrayList.get(size)).d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, pVar);
        p(true);
        return pVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f2111a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            p pVarA = a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            pVarA.setIcon(resolveInfo.loadIcon(packageManager));
            pVarA.f2143g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = pVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(z zVar, Context context) {
        this.f2129u.add(new WeakReference(zVar));
        zVar.c(context, this);
        this.f2119k = true;
    }

    public final void c(boolean z2) {
        if (this.f2127s) {
            return;
        }
        this.f2127s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2129u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zVar.b(this, z2);
            }
        }
        this.f2127s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        p pVar = this.f2130v;
        if (pVar != null) {
            d(pVar);
        }
        this.f2115f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2122n = null;
        this.f2121m = null;
        this.f2123o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(p pVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2129u;
        boolean zK = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2130v == pVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zK = zVar.k(pVar);
                    if (zK) {
                        break;
                    }
                }
            }
            v();
            if (zK) {
                this.f2130v = null;
            }
        }
        return zK;
    }

    public boolean e(n nVar, MenuItem menuItem) {
        l lVar = this.f2114e;
        return lVar != null && lVar.j(nVar, menuItem);
    }

    public boolean f(p pVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2129u;
        boolean zI = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zI = zVar.i(pVar);
                if (zI) {
                    break;
                }
            }
        }
        v();
        if (zI) {
            this.f2130v = pVar;
        }
        return zI;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f2115f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3);
            if (pVar.f2138a == i2) {
                return pVar;
            }
            if (pVar.hasSubMenu() && (menuItemFindItem = pVar.f2150o.findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final p g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2128t;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (p) arrayList.get(0);
        }
        boolean zN = n();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3);
            char c2 = zN ? pVar.f2145j : pVar.h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zN && c2 == '\b' && i2 == 67))) {
                return pVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f2115f.get(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.util.ArrayList r17, int r18, android.view.KeyEvent r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r16.n()
            int r4 = r19.getModifiers()
            android.view.KeyCharacterMap$KeyData r5 = new android.view.KeyCharacterMap$KeyData
            r5.<init>()
            boolean r6 = r2.getKeyData(r5)
            r7 = 67
            if (r6 != 0) goto L1e
            if (r1 == r7) goto L1e
            return
        L1e:
            r6 = r16
            java.util.ArrayList r8 = r6.f2115f
            int r9 = r8.size()
            r10 = 0
            r11 = r10
        L28:
            if (r11 >= r9) goto L7a
            java.lang.Object r12 = r8.get(r11)
            l.p r12 = (l.p) r12
            boolean r13 = r12.hasSubMenu()
            if (r13 == 0) goto L3b
            l.F r13 = r12.f2150o
            r13.h(r0, r1, r2)
        L3b:
            if (r3 == 0) goto L40
            char r13 = r12.f2145j
            goto L42
        L40:
            char r13 = r12.h
        L42:
            if (r3 == 0) goto L47
            int r14 = r12.f2146k
            goto L49
        L47:
            int r14 = r12.f2144i
        L49:
            r15 = 69647(0x1100f, float:9.7596E-41)
            r7 = r4 & r15
            r14 = r14 & r15
            if (r7 != r14) goto L69
            if (r13 == 0) goto L69
            char[] r7 = r5.meta
            char r14 = r7[r10]
            if (r13 == r14) goto L6c
            r14 = 2
            char r7 = r7[r14]
            if (r13 == r7) goto L6c
            if (r3 == 0) goto L69
            r7 = 8
            if (r13 != r7) goto L69
            r7 = 67
            if (r1 != r7) goto L77
            goto L6e
        L69:
            r7 = 67
            goto L77
        L6c:
            r7 = 67
        L6e:
            boolean r13 = r12.isEnabled()
            if (r13 == 0) goto L77
            r0.add(r12)
        L77:
            int r11 = r11 + 1
            goto L28
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.n.h(java.util.ArrayList, int, android.view.KeyEvent):void");
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f2115f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((p) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f2119k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2129u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zD = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= zVar.d();
                }
            }
            ArrayList arrayList = this.f2117i;
            ArrayList arrayList2 = this.f2118j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i2 = 0; i2 < size; i2++) {
                    p pVar = (p) arrayListL.get(i2);
                    if (pVar.f()) {
                        arrayList.add(pVar);
                    } else {
                        arrayList2.add(pVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f2119k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z2 = this.h;
        ArrayList arrayList = this.f2116g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2115f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            p pVar = (p) arrayList2.get(i2);
            if (pVar.isVisible()) {
                arrayList.add(pVar);
            }
        }
        this.h = false;
        this.f2119k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2131w;
    }

    public boolean n() {
        return this.f2113c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z2) {
        if (this.f2124p) {
            this.f2125q = true;
            if (z2) {
                this.f2126r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.f2119k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2129u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zVar.e();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return q(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        p pVarG = g(i2, keyEvent);
        boolean zQ = pVarG != null ? q(pVarG, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, l.z r8, int r9) {
        /*
            r6 = this;
            l.p r7 = (l.p) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f2151p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            l.n r1 = r7.f2149n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f2143g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f2111a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            l.q r1 = r7.f2135A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f2162b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            l.q r3 = r7.f2135A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f2162b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            l.F r9 = new l.F
            android.content.Context r5 = r6.f2111a
            r9.<init>(r5, r6, r7)
            r7.f2150o = r9
            java.lang.CharSequence r5 = r7.f2141e
            r9.setHeaderTitle(r5)
        L90:
            l.F r7 = r7.f2150o
            if (r4 == 0) goto L9e
            l.u r9 = r3.f2163c
            r9.getClass()
            android.view.ActionProvider r9 = r3.f2162b
            r9.onPrepareSubMenu(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f2129u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La7
            goto Ld0
        La7:
            if (r8 == 0) goto Lad
            boolean r0 = r8.g(r7)
        Lad:
            java.util.Iterator r8 = r9.iterator()
        Lb1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            l.z r4 = (l.z) r4
            if (r4 != 0) goto Lc9
            r9.remove(r3)
            goto Lb1
        Lc9:
            if (r0 != 0) goto Lb1
            boolean r0 = r4.g(r7)
            goto Lb1
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
            r6.c(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.n.q(android.view.MenuItem, l.z, int):boolean");
    }

    public final void r(z zVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2129u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar2 = (z) weakReference.get();
            if (zVar2 == null || zVar2 == zVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f2115f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((p) arrayList.get(i4)).f2139b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((p) arrayList.get(i4)).f2139b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f2115f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f2115f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((p) arrayList.get(i3)).f2138a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f2115f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f2115f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((F) item.getSubMenu()).s(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f2115f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3);
            if (pVar.f2139b == i2) {
                pVar.x = (pVar.x & (-5)) | (z3 ? 4 : 0);
                pVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f2131w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f2115f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3);
            if (pVar.f2139b == i2) {
                pVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f2115f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3);
            if (pVar.f2139b == i2) {
                int i4 = pVar.x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                pVar.x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f2113c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2115f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f2115f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((F) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        if (view != null) {
            this.f2123o = view;
            this.f2121m = null;
            this.f2122n = null;
        } else {
            if (i2 > 0) {
                this.f2121m = this.f2112b.getText(i2);
            } else if (charSequence != null) {
                this.f2121m = charSequence;
            }
            if (i3 > 0) {
                this.f2122n = this.f2111a.getDrawable(i3);
            } else if (drawable != null) {
                this.f2122n = drawable;
            }
            this.f2123o = null;
        }
        p(false);
    }

    public final void v() {
        this.f2124p = false;
        if (this.f2125q) {
            this.f2125q = false;
            p(this.f2126r);
        }
    }

    public final void w() {
        if (this.f2124p) {
            return;
        }
        this.f2124p = true;
        this.f2125q = false;
        this.f2126r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f2112b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f2112b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        p pVarA = a(i2, i3, i4, charSequence);
        F f2 = new F(this.f2111a, this, pVarA);
        pVarA.f2150o = f2;
        f2.setHeaderTitle(pVarA.f2141e);
        return f2;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f2112b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f2112b.getString(i5));
    }

    public n k() {
        return this;
    }
}
