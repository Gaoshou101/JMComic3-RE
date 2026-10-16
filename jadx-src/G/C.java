package G;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class C implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public e0 f140a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0042s f142c;

    public C(View view, InterfaceC0042s interfaceC0042s) {
        this.f141b = view;
        this.f142c = interfaceC0042s;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        e0 e0VarG = e0.g(windowInsets, view);
        int i2 = Build.VERSION.SDK_INT;
        InterfaceC0042s interfaceC0042s = this.f142c;
        if (i2 < 30) {
            D.a(windowInsets, this.f141b);
            if (e0VarG.equals(this.f140a)) {
                return interfaceC0042s.h(view, e0VarG).f();
            }
        }
        this.f140a = e0VarG;
        e0 e0VarH = interfaceC0042s.h(view, e0VarG);
        if (i2 >= 30) {
            return e0VarH.f();
        }
        WeakHashMap weakHashMap = K.f146a;
        B.c(view);
        return e0VarH.f();
    }
}
