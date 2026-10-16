package androidx.emoji2.text;

import F0.C0011l;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Environment;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import h0.AbstractC0170L;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k.AbstractC0225a;
import l.MenuC0238C;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1140a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1141b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1142c;
    public Object d;

    public u(Context context) {
        this.f1140a = context.getCacheDir();
        this.f1141b = context.getFilesDir();
        this.f1142c = context.getExternalCacheDir();
        this.d = context.getExternalFilesDir(null);
    }

    public void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((p.k) this.f1141b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                a(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void b() {
        Iterator it = ((HashMap) this.f1141b).values().iterator();
        while (it.hasNext()) {
            androidx.fragment.app.x.b(it.next());
        }
    }

    public k.e c(AbstractC0225a abstractC0225a) {
        ArrayList arrayList = (ArrayList) this.f1142c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            k.e eVar = (k.e) arrayList.get(i2);
            if (eVar != null && eVar.f1977b == abstractC0225a) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f1141b, abstractC0225a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashMap) this.f1141b).values().iterator();
        while (it.hasNext()) {
            androidx.fragment.app.x.b(it.next());
        }
        return arrayList;
    }

    public File e(j0.x xVar) {
        switch (xVar == null ? -1 : AbstractC0170L.f1775a[xVar.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new C0011l();
            case 1:
                return (File) this.f1140a;
            case 2:
                return (File) this.f1141b;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return (File) this.f1142c;
            case 4:
                return (File) this.d;
            case 5:
                return Environment.getExternalStorageDirectory();
            case 6:
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
        }
    }

    public List f() {
        ArrayList arrayList;
        if (((ArrayList) this.f1140a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f1140a)) {
            arrayList = new ArrayList((ArrayList) this.f1140a);
        }
        return arrayList;
    }

    public boolean g(AbstractC0225a abstractC0225a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1140a).onActionItemClicked(c(abstractC0225a), new l.u((Context) this.f1141b, (B.a) menuItem));
    }

    public boolean h(AbstractC0225a abstractC0225a, l.n nVar) {
        k.e eVarC = c(abstractC0225a);
        p.k kVar = (p.k) this.d;
        Menu menuC0238C = (Menu) kVar.get(nVar);
        if (menuC0238C == null) {
            menuC0238C = new MenuC0238C((Context) this.f1141b, nVar);
            kVar.put(nVar, menuC0238C);
        }
        return ((ActionMode.Callback) this.f1140a).onCreateActionMode(eVarC, menuC0238C);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(j0.C0208G r15, p0.c r16) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.u.i(j0.G, p0.c):java.lang.Object");
    }

    public u(int i2) {
        switch (i2) {
            case 4:
                this.f1140a = new D.m(10);
                this.f1141b = new p.k(0);
                this.f1142c = new ArrayList();
                this.d = new HashSet();
                break;
            default:
                this.f1140a = new ArrayList();
                this.f1141b = new HashMap();
                this.f1142c = new HashMap();
                break;
        }
    }

    public u(Typeface typeface, L.b bVar) {
        int i2;
        int i3;
        this.d = typeface;
        this.f1140a = bVar;
        this.f1142c = new t(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i4 = iA + bVar.f137a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        this.f1141b = new char[i2 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i5 = iA2 + bVar.f137a;
            i3 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            x xVar = new x(this, i6);
            L.a aVarC = xVar.c();
            int iA3 = aVarC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarC.d).getInt(iA3 + aVarC.f137a) : 0, (char[]) this.f1141b, i6 * 2);
            if (xVar.b() > 0) {
                ((t) this.f1142c).a(xVar, 0, xVar.b() - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public u(Context context, ActionMode.Callback callback) {
        this.f1141b = context;
        this.f1140a = callback;
        this.f1142c = new ArrayList();
        this.d = new p.k(0);
    }
}
