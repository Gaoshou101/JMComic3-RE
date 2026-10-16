package j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0209H {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0209H f1932b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0209H f1933c;
    public static final EnumC0209H d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0209H[] f1934e;

    static {
        EnumC0209H enumC0209H = new EnumC0209H("FILE", 0);
        f1932b = enumC0209H;
        EnumC0209H enumC0209H2 = new EnumC0209H("DIRECTORY", 1);
        f1933c = enumC0209H2;
        EnumC0209H enumC0209H3 = new EnumC0209H("UNKNOWN", 2);
        d = enumC0209H3;
        f1934e = new EnumC0209H[]{enumC0209H, enumC0209H2, enumC0209H3};
    }

    public static EnumC0209H valueOf(String str) {
        return (EnumC0209H) Enum.valueOf(EnumC0209H.class, str);
    }

    public static EnumC0209H[] values() {
        return (EnumC0209H[]) f1934e.clone();
    }
}
