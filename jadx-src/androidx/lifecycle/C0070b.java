package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1294a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1295b;

    public C0070b(int i2, Method method) throws SecurityException {
        this.f1294a = i2;
        this.f1295b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0070b)) {
            return false;
        }
        C0070b c0070b = (C0070b) obj;
        return this.f1294a == c0070b.f1294a && this.f1295b.getName().equals(c0070b.f1295b.getName());
    }

    public final int hashCode() {
        return this.f1295b.getName().hashCode() + (this.f1294a * 31);
    }
}
