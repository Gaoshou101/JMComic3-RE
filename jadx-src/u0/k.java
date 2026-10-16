package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f2669b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f2670c;
    public static final /* synthetic */ k[] d;

    static {
        k kVar = new k("TOP_DOWN", 0);
        f2669b = kVar;
        k kVar2 = new k("BOTTOM_UP", 1);
        f2670c = kVar2;
        d = new k[]{kVar, kVar2};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) d.clone();
    }
}
