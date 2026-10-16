package androidx.emoji2.text;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1138a;

    /* renamed from: b, reason: collision with root package name */
    public x f1139b;

    public t(int i2) {
        this.f1138a = new SparseArray(i2);
    }

    public final void a(x xVar, int i2, int i3) {
        int iA = xVar.a(i2);
        SparseArray sparseArray = this.f1138a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(iA);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(xVar.a(i2), tVar);
        }
        if (i3 > i2) {
            tVar.a(xVar, i2 + 1, i3);
        } else {
            tVar.f1139b = xVar;
        }
    }
}
