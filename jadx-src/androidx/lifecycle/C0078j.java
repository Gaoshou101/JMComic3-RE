package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078j {
    public static EnumC0080l a(EnumC0081m enumC0081m) {
        x0.g.e("state", enumC0081m);
        int iOrdinal = enumC0081m.ordinal();
        if (iOrdinal == 1) {
            return EnumC0080l.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC0080l.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC0080l.ON_RESUME;
    }
}
