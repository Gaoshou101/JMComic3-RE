package D;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f34c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f35e;

    public /* synthetic */ i(String str, Context context, Object obj, int i2, int i3) {
        this.f32a = i3;
        this.f33b = str;
        this.f34c = context;
        this.f35e = obj;
        this.d = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i2 = this.d;
        Object obj = this.f35e;
        Context context = this.f34c;
        String str = this.f33b;
        switch (this.f32a) {
            case 0:
                Object[] objArr = {(h) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return l.b(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return l.b(str, context, (List) obj, i2);
                } catch (Throwable unused) {
                    return new k(-3);
                }
        }
    }
}
