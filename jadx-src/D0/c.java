package D0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f58b;

    public /* synthetic */ c(int i2, Object obj) {
        this.f57a = i2;
        this.f58b = obj;
    }

    @Override // D0.d
    public final Iterator iterator() {
        switch (this.f57a) {
            case 0:
                return new b(this);
            default:
                return (Iterator) this.f58b;
        }
    }
}
