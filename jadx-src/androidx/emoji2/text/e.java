package androidx.emoji2.text;

import G.C0037m;
import a.AbstractC0062a;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends AbstractC0062a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f1104c;

    public e(f fVar) {
        this.f1104c = fVar;
    }

    @Override // a.AbstractC0062a
    public final void I(Throwable th) {
        this.f1104c.f1105a.d(th);
    }

    @Override // a.AbstractC0062a
    public final void J(u uVar) {
        f fVar = this.f1104c;
        fVar.f1107c = uVar;
        u uVar2 = fVar.f1107c;
        j jVar = fVar.f1105a;
        fVar.f1106b = new C0037m(uVar2, jVar.f1117g, jVar.f1118i, Build.VERSION.SDK_INT >= 34 ? o.a() : P0.b.n());
        j jVar2 = fVar.f1105a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f1112a.writeLock().lock();
        try {
            jVar2.f1114c = 1;
            arrayList.addAll(jVar2.f1113b);
            jVar2.f1113b.clear();
            jVar2.f1112a.writeLock().unlock();
            jVar2.d.post(new h(arrayList, jVar2.f1114c, null));
        } catch (Throwable th) {
            jVar2.f1112a.writeLock().unlock();
            throw th;
        }
    }
}
