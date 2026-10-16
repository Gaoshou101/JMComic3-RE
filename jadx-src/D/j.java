package D;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements F.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37b;

    public /* synthetic */ j(int i2, Object obj) {
        this.f36a = i2;
        this.f37b = obj;
    }

    @Override // F.a
    public final void a(Object obj) {
        switch (this.f36a) {
            case 0:
                k kVar = (k) obj;
                if (kVar == null) {
                    kVar = new k(-3);
                }
                ((c) this.f37b).e(kVar);
                return;
            default:
                k kVar2 = (k) obj;
                synchronized (l.f42c) {
                    try {
                        p.k kVar3 = l.d;
                        ArrayList arrayList = (ArrayList) kVar3.get((String) this.f37b);
                        if (arrayList == null) {
                            return;
                        }
                        kVar3.remove((String) this.f37b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((F.a) arrayList.get(i2)).a(kVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
