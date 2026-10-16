package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172N extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.emoji2.text.u f1780f;

    /* renamed from: g, reason: collision with root package name */
    public int f1781g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0172N(androidx.emoji2.text.u uVar, p0.c cVar) {
        super(cVar);
        this.f1780f = uVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1779e = obj;
        this.f1781g |= Integer.MIN_VALUE;
        Object objI = this.f1780f.i(null, this);
        return objI == EnumC0322a.f2519b ? objI : new C0232e(objI);
    }
}
