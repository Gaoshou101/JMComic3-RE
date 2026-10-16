package o0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0322a {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0322a f2519b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0322a[] f2520c;

    static {
        EnumC0322a enumC0322a = new EnumC0322a("COROUTINE_SUSPENDED", 0);
        f2519b = enumC0322a;
        f2520c = new EnumC0322a[]{enumC0322a, new EnumC0322a("UNDECIDED", 1), new EnumC0322a("RESUMED", 2)};
    }

    public static EnumC0322a valueOf(String str) {
        return (EnumC0322a) Enum.valueOf(EnumC0322a.class, str);
    }

    public static EnumC0322a[] values() {
        return (EnumC0322a[]) f2520c.clone();
    }
}
