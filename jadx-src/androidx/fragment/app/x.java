package androidx.fragment.app;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1268a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static ClassCastException a(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static /* synthetic */ void b(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ int c(int i2) {
        if (i2 != 0) {
            return i2 - 1;
        }
        throw null;
    }
}
