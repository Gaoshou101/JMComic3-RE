package E0;

/* loaded from: classes.dex */
public final class k extends x0.h implements w0.l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f76c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i2, Object obj) {
        super(1);
        this.f76c = i2;
        this.d = obj;
    }

    @Override // w0.l
    public final Object g(Object obj) {
        switch (this.f76c) {
            case 0:
                B0.c cVar = (B0.c) obj;
                x0.g.e("it", cVar);
                return ((String) this.d).subSequence(cVar.f0b, cVar.f1c + 1).toString();
            default:
                return obj == ((l0.d) this.d) ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
