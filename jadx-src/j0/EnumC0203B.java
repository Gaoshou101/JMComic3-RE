package j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0203B {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0203B f1922b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0203B f1923c;
    public static final /* synthetic */ EnumC0203B[] d;

    static {
        EnumC0203B enumC0203B = new EnumC0203B("WRITE", 0);
        f1922b = enumC0203B;
        EnumC0203B enumC0203B2 = new EnumC0203B("APPEND", 1);
        f1923c = enumC0203B2;
        d = new EnumC0203B[]{enumC0203B, enumC0203B2};
    }

    public static EnumC0203B valueOf(String str) {
        return (EnumC0203B) Enum.valueOf(EnumC0203B.class, str);
    }

    public static EnumC0203B[] values() {
        return (EnumC0203B[]) d.clone();
    }
}
