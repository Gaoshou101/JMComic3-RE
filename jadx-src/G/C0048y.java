package G;

import android.text.TextUtils;
import android.view.View;

/* renamed from: G.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048y extends A {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f209e;

    public C0048y(int i2, Class cls, int i3, int i4, int i5) {
        this.f209e = i5;
        this.f137a = i2;
        this.d = cls;
        this.f139c = i3;
        this.f138b = i4;
    }

    @Override // G.A
    public final Object b(View view) {
        switch (this.f209e) {
            case 0:
                return Boolean.valueOf(F.c(view));
            case 1:
                return F.a(view);
            default:
                return Boolean.valueOf(F.b(view));
        }
    }

    @Override // G.A
    public final void c(View view, Object obj) {
        switch (this.f209e) {
            case 0:
                F.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                F.e(view, (CharSequence) obj);
                break;
            default:
                F.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // G.A
    public final boolean e(Object obj, Object obj2) {
        switch (this.f209e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
