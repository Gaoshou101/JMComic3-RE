package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f2673b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ o[] f2674c;

    /* JADX INFO: Fake field, exist only in values array */
    o EF2;

    static {
        o oVar = new o("SKIP", 0);
        o oVar2 = new o("TERMINATE", 1);
        f2673b = oVar2;
        f2674c = new o[]{oVar, oVar2};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f2674c.clone();
    }
}
