package G;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class Y extends X {
    public Y(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
    }

    @Override // G.c0
    public e0 a() {
        return e0.g(this.f165c.consumeDisplayCutout(), null);
    }

    @Override // G.c0
    public C0034j e() {
        DisplayCutout displayCutout = this.f165c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0034j(displayCutout);
    }

    @Override // G.W, G.c0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y2 = (Y) obj;
        return Objects.equals(this.f165c, y2.f165c) && Objects.equals(this.f168g, y2.f168g);
    }

    @Override // G.c0
    public int hashCode() {
        return this.f165c.hashCode();
    }
}
