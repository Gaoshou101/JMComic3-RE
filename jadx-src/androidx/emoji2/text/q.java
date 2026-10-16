package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f1124a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f1125b;

    /* renamed from: c, reason: collision with root package name */
    public t f1126c;
    public t d;

    /* renamed from: e, reason: collision with root package name */
    public int f1127e;

    /* renamed from: f, reason: collision with root package name */
    public int f1128f;

    public q(t tVar) {
        this.f1125b = tVar;
        this.f1126c = tVar;
    }

    public final void a() {
        this.f1124a = 1;
        this.f1126c = this.f1125b;
        this.f1128f = 0;
    }

    public final boolean b() {
        L.a aVarC = this.f1126c.f1139b.c();
        int iA = aVarC.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarC.d).get(iA + aVarC.f137a) == 0) || this.f1127e == 65039;
    }
}
