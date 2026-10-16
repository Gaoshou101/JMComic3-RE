package j0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0214e f1963a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1964b;

    public z(AbstractC0214e abstractC0214e, int i2) {
        x0.g.e("encoding", abstractC0214e);
        this.f1963a = abstractC0214e;
        this.f1964b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return x0.g.a(this.f1963a, zVar.f1963a) && this.f1964b == zVar.f1964b;
    }

    public final int hashCode() {
        return (this.f1963a.hashCode() * 31) + this.f1964b;
    }

    public final String toString() {
        return "IONFILEReadInChunksOptions(encoding=" + this.f1963a + ", chunkSize=" + this.f1964b + ")";
    }
}
