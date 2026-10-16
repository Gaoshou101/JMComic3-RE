package u0;

import java.io.File;
import java.io.IOException;
import k0.C0235h;

/* loaded from: classes.dex */
public final class n extends x0.h implements w0.p {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0.p f2672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w0.p pVar) {
        super(2);
        this.f2672c = pVar;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) throws p {
        File file = (File) obj;
        IOException iOException = (IOException) obj2;
        x0.g.e("f", file);
        x0.g.e("e", iOException);
        if (this.f2672c.f(file, iOException) != o.f2673b) {
            return C0235h.f2029a;
        }
        throw new p(file, null, null);
    }
}
