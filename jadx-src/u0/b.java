package u0;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final File f2652a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2653b;

    public b(File file, List list) {
        this.f2652a = file;
        this.f2653b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2652a.equals(bVar.f2652a) && this.f2653b.equals(bVar.f2653b);
    }

    public final int hashCode() {
        return this.f2653b.hashCode() + (this.f2652a.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f2652a + ", segments=" + this.f2653b + ')';
    }
}
