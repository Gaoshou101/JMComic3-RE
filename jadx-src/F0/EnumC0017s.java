package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: F0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0017s {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0017s f124b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0017s f125c;
    public static final /* synthetic */ EnumC0017s[] d;

    static {
        EnumC0017s enumC0017s = new EnumC0017s("DEFAULT", 0);
        f124b = enumC0017s;
        EnumC0017s enumC0017s2 = new EnumC0017s("LAZY", 1);
        EnumC0017s enumC0017s3 = new EnumC0017s("ATOMIC", 2);
        f125c = enumC0017s3;
        d = new EnumC0017s[]{enumC0017s, enumC0017s2, enumC0017s3, new EnumC0017s("UNDISPATCHED", 3)};
    }

    public static EnumC0017s valueOf(String str) {
        return (EnumC0017s) Enum.valueOf(EnumC0017s.class, str);
    }

    public static EnumC0017s[] values() {
        return (EnumC0017s[]) d.clone();
    }
}
