package h0;

import a.AbstractC0062a;
import android.content.ContentResolver;
import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;

/* renamed from: h0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182j extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public int f1806f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1807g;
    public final /* synthetic */ X.i h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Uri f1808i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0.z f1809j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0182j(X.i iVar, Uri uri, j0.z zVar, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = iVar;
        this.f1808i = uri;
        this.f1809j = zVar;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0182j) i((I0.c) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        C0182j c0182j = new C0182j(this.h, this.f1808i, this.f1809j, interfaceC0311d);
        c0182j.f1807g = obj;
        return c0182j;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) throws IllegalAccessException, IOException, j0.s, IllegalArgumentException, InvocationTargetException {
        C0235h c0235h;
        Closeable closeable;
        EnumC0322a enumC0322a = EnumC0322a.f2519b;
        int i2 = this.f1806f;
        C0235h c0235h2 = C0235h.f2029a;
        if (i2 == 0) {
            AbstractC0062a.X(obj);
            I0.c cVar = (I0.c) this.f1807g;
            InputStream inputStreamOpenInputStream = ((ContentResolver) this.h.f715b).openInputStream(this.f1808i);
            if (inputStreamOpenInputStream != null) {
                j0.z zVar = this.f1809j;
                try {
                    C0181i c0181i = new C0181i(cVar, null);
                    this.f1807g = inputStreamOpenInputStream;
                    this.f1806f = 1;
                    if (P0.b.w(inputStreamOpenInputStream, zVar, 8192, c0181i, this) == enumC0322a) {
                        return enumC0322a;
                    }
                    closeable = inputStreamOpenInputStream;
                    AbstractC0062a.k(closeable, null);
                    c0235h = c0235h2;
                } catch (Throwable th) {
                    th = th;
                    closeable = inputStreamOpenInputStream;
                    throw th;
                }
            } else {
                c0235h = null;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (Closeable) this.f1807g;
            try {
                AbstractC0062a.X(obj);
                AbstractC0062a.k(closeable, null);
                c0235h = c0235h2;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    AbstractC0062a.k(closeable, th);
                    throw th3;
                }
            }
        }
        if (c0235h != null) {
            return c0235h2;
        }
        throw new j0.s(null);
    }
}
