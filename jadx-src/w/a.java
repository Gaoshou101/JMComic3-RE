package W;

import O0.e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f702a;

    /* renamed from: b, reason: collision with root package name */
    public final String f703b;

    /* renamed from: c, reason: collision with root package name */
    public final String f704c;
    public final e d;

    public a(String str, String str2, e eVar) {
        if (str2.isEmpty() || str2.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (!str2.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        this.f703b = str;
        this.f704c = str2;
        this.f702a = true;
        this.d = eVar;
    }
}
