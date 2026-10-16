package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1154a;

    /* renamed from: b, reason: collision with root package name */
    public int f1155b;

    /* renamed from: c, reason: collision with root package name */
    public int f1156c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1157e;

    /* renamed from: f, reason: collision with root package name */
    public int f1158f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1159g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public int f1160i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1161j;

    /* renamed from: k, reason: collision with root package name */
    public int f1162k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1163l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1164m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1165n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1166o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f1167p;

    /* renamed from: q, reason: collision with root package name */
    public final q f1168q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1169r;

    /* renamed from: s, reason: collision with root package name */
    public int f1170s;

    public a(q qVar) {
        l lVar = qVar.f1234w;
        f fVar = qVar.f1232u;
        if (fVar != null) {
            fVar.f1187a.getClassLoader();
        }
        this.f1154a = new ArrayList();
        this.f1166o = false;
        this.f1170s = -1;
        this.f1168q = qVar;
    }

    @Override // androidx.fragment.app.o
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1159g) {
            return true;
        }
        this.f1168q.d.add(this);
        return true;
    }

    public final void b(int i2) {
        if (this.f1159g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            ArrayList arrayList = this.f1154a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((u) arrayList.get(i3)).getClass();
            }
        }
    }

    public final int c(boolean z2) {
        if (this.f1169r) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new v());
            d("  ", printWriter, true);
            printWriter.close();
        }
        this.f1169r = true;
        boolean z3 = this.f1159g;
        q qVar = this.f1168q;
        if (z3) {
            this.f1170s = qVar.f1221j.getAndIncrement();
        } else {
            this.f1170s = -1;
        }
        if (z2) {
            qVar.f(this);
        }
        return this.f1170s;
    }

    public final void d(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1170s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1169r);
            if (this.f1158f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1158f));
            }
            if (this.f1155b != 0 || this.f1156c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1155b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1156c));
            }
            if (this.d != 0 || this.f1157e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1157e));
            }
            if (this.f1160i != 0 || this.f1161j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1160i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1161j);
            }
            if (this.f1162k != 0 || this.f1163l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1162k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1163l);
            }
        }
        ArrayList arrayList = this.f1154a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            u uVar = (u) arrayList.get(i2);
            switch (uVar.f1260a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + uVar.f1260a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println((Object) null);
            if (z2) {
                if (uVar.f1262c != 0 || uVar.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(uVar.f1262c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(uVar.d));
                }
                if (uVar.f1263e != 0 || uVar.f1264f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(uVar.f1263e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(uVar.f1264f));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1170s >= 0) {
            sb.append(" #");
            sb.append(this.f1170s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
