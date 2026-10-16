package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0081m {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0081m f1301b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0081m f1302c;
    public static final EnumC0081m d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0081m f1303e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0081m f1304f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0081m[] f1305g;

    static {
        EnumC0081m enumC0081m = new EnumC0081m("DESTROYED", 0);
        f1301b = enumC0081m;
        EnumC0081m enumC0081m2 = new EnumC0081m("INITIALIZED", 1);
        f1302c = enumC0081m2;
        EnumC0081m enumC0081m3 = new EnumC0081m("CREATED", 2);
        d = enumC0081m3;
        EnumC0081m enumC0081m4 = new EnumC0081m("STARTED", 3);
        f1303e = enumC0081m4;
        EnumC0081m enumC0081m5 = new EnumC0081m("RESUMED", 4);
        f1304f = enumC0081m5;
        f1305g = new EnumC0081m[]{enumC0081m, enumC0081m2, enumC0081m3, enumC0081m4, enumC0081m5};
    }

    public static EnumC0081m valueOf(String str) {
        return (EnumC0081m) Enum.valueOf(EnumC0081m.class, str);
    }

    public static EnumC0081m[] values() {
        return (EnumC0081m[]) f1305g.clone();
    }
}
