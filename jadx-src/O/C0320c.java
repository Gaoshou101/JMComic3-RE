package o;

import java.util.Map;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320c implements Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public final Object f2511b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2512c;
    public C0320c d;

    /* renamed from: e, reason: collision with root package name */
    public C0320c f2513e;

    public C0320c(Object obj, Object obj2) {
        this.f2511b = obj;
        this.f2512c = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0320c)) {
            return false;
        }
        C0320c c0320c = (C0320c) obj;
        return this.f2511b.equals(c0320c.f2511b) && this.f2512c.equals(c0320c.f2512c);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2511b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2512c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2511b.hashCode() ^ this.f2512c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2511b + "=" + this.f2512c;
    }
}
