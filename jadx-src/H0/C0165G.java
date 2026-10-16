package h0;

import a.AbstractC0062a;
import j0.C0224o;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;

/* renamed from: h0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165G extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public int f1756f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1757g;
    public final /* synthetic */ String h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j0.z f1758i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0165G(String str, j0.z zVar, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = str;
        this.f1758i = zVar;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0165G) i((I0.c) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        C0165G c0165g = new C0165G(this.h, this.f1758i, interfaceC0311d);
        c0165g.f1757g = obj;
        return c0165g;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) throws IllegalAccessException, C0224o, IOException, IllegalArgumentException, InvocationTargetException {
        Closeable closeable;
        EnumC0322a enumC0322a = EnumC0322a.f2519b;
        int i2 = this.f1756f;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (Closeable) this.f1757g;
            try {
                AbstractC0062a.X(obj);
                AbstractC0062a.k(closeable, null);
                return C0235h.f2029a;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC0062a.k(closeable, th);
                    throw th2;
                }
            }
        }
        AbstractC0062a.X(obj);
        I0.c cVar = (I0.c) this.f1757g;
        String str = this.h;
        File file = new File(str);
        if (!file.exists()) {
            throw new C0224o(str, null);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        j0.z zVar = this.f1758i;
        try {
            C0164F c0164f = new C0164F(cVar, null);
            this.f1757g = fileInputStream;
            this.f1756f = 1;
            if (P0.b.w(fileInputStream, zVar, 8192, c0164f, this) == enumC0322a) {
                return enumC0322a;
            }
            closeable = fileInputStream;
            AbstractC0062a.k(closeable, null);
            return C0235h.f2029a;
        } catch (Throwable th3) {
            th = th3;
            closeable = fileInputStream;
            throw th;
        }
    }
}
