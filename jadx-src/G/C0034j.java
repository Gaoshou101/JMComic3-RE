package G;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: G.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f194a;

    public C0034j(DisplayCutout displayCutout) {
        this.f194a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0034j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f194a, ((C0034j) obj).f194a);
    }

    public final int hashCode() {
        return this.f194a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f194a + "}";
    }
}
