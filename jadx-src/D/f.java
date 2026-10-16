package D;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public String f23a;

    /* renamed from: b, reason: collision with root package name */
    public String f24b;

    /* renamed from: c, reason: collision with root package name */
    public List f25c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.f23a, fVar.f23a) && Objects.equals(this.f24b, fVar.f24b) && Objects.equals(this.f25c, fVar.f25c);
    }

    public final int hashCode() {
        return Objects.hash(this.f23a, this.f24b, this.f25c);
    }
}
