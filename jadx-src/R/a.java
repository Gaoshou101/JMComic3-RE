package R;

import android.os.Bundle;
import com.a7m3p9xv.t6qk2z8.app.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import x0.g;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f606a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f607b;

    public a(d dVar) {
        g.e("registry", dVar);
        this.f607b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // R.c
    public final Bundle a() {
        switch (this.f606a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f607b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((MainActivity) this.f607b).g().getClass();
                return bundle2;
        }
    }

    public a(MainActivity mainActivity) {
        this.f607b = mainActivity;
    }
}
