package androidx.emoji2.text;

import a.AbstractC0062a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1108b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1109c;

    public h(List list, int i2, Throwable th) {
        AbstractC0062a.j("initCallbacks cannot be null", list);
        this.f1108b = new ArrayList(list);
        this.f1109c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f1108b;
        int size = arrayList.size();
        int i2 = 0;
        if (this.f1109c != 1) {
            while (i2 < size) {
                ((g) arrayList.get(i2)).getClass();
                i2++;
            }
        } else {
            while (i2 < size) {
                ((g) arrayList.get(i2)).a();
                i2++;
            }
        }
    }
}
