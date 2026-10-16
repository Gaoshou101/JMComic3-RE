package y;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f2733a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f2734b;

    public i(Resources resources, Resources.Theme theme) {
        this.f2733a = resources;
        this.f2734b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f2733a.equals(iVar.f2733a) && Objects.equals(this.f2734b, iVar.f2734b);
    }

    public final int hashCode() {
        return Objects.hash(this.f2733a, this.f2734b);
    }
}
