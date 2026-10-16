package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f224b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f225c;
    public static final a d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f226e;

    static {
        a aVar = new a("SUSPEND", 0);
        f224b = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f225c = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        d = aVar3;
        f226e = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f226e.clone();
    }
}
