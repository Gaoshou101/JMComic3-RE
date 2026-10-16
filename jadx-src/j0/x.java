package j0;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {
    public static final L.c d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f1948e;

    /* renamed from: f, reason: collision with root package name */
    public static final x f1949f;

    /* renamed from: g, reason: collision with root package name */
    public static final x f1950g;
    public static final x h;

    /* renamed from: i, reason: collision with root package name */
    public static final x f1951i;

    /* renamed from: j, reason: collision with root package name */
    public static final x f1952j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ x[] f1953k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ q0.a f1954l;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1955b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1956c;

    static {
        x xVar = new x("INTERNAL_CACHE", 0, false, l0.i.K("CACHE", "TEMPORARY"), 1);
        f1948e = xVar;
        boolean z2 = false;
        x xVar2 = new x("INTERNAL_FILES", 1, z2, l0.i.K("DATA", "LIBRARY", "FILES", "LIBRARY_NO_CLOUD"), 1);
        f1949f = xVar2;
        x xVar3 = new x("EXTERNAL_CACHE", 2, false, P0.b.s("CACHE_EXTERNAL"), 1);
        f1950g = xVar3;
        x xVar4 = new x("EXTERNAL_FILES", 3, z2, l0.i.K("EXTERNAL", "FILES_EXTERNAL"), 1 == true ? 1 : 0);
        h = xVar4;
        x xVar5 = new x("EXTERNAL_STORAGE", 4, true, P0.b.s("sdcard"));
        f1951i = xVar5;
        x xVar6 = new x("DOCUMENTS", 5, 1 == true ? 1 : 0, null, 2);
        f1952j = xVar6;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5, xVar6};
        f1953k = xVarArr;
        f1954l = new q0.a(xVarArr);
        d = new L.c(18);
    }

    public x(String str, int i2, boolean z2, List list) {
        this.f1955b = z2;
        this.f1956c = list;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f1953k.clone();
    }

    public /* synthetic */ x(String str, int i2, boolean z2, List list, int i3) {
        this(str, i2, (i3 & 1) != 0 ? false : z2, (i3 & 2) != 0 ? l0.p.f2191b : list);
    }
}
