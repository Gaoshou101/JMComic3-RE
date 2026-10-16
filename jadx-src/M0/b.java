package M0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f442b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f443c;
    public static final b d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f444e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f445f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f446g;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f442b = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f443c = bVar2;
        b bVar3 = new b("PARKING", 2);
        d = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f444e = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f445f = bVar5;
        f446g = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f446g.clone();
    }
}
