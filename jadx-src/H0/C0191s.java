package h0;

import a.AbstractC0062a;
import j0.C0224o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191s extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1831g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191s(String str, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1831g = str;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0191s) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        C0191s c0191s = new C0191s(this.f1831g, interfaceC0311d);
        c0191s.f1830f = obj;
        return c0191s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [k0.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        Object objM;
        File file;
        int length;
        AbstractC0062a.X(obj);
        String str = this.f1831g;
        try {
            file = new File(str);
        } catch (Throwable th) {
            objM = AbstractC0062a.m(th);
        }
        if (!file.exists() || !file.isDirectory()) {
            throw new C0224o(str, null);
        }
        File[] fileArrListFiles = file.listFiles();
        Iterable arrayList = (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) ? l0.p.f2191b : length != 1 ? new ArrayList(new l0.e(fileArrListFiles)) : P0.b.s(fileArrListFiles[0]);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 != null) {
                arrayList2.add(obj2);
            }
        }
        objM = new ArrayList(l0.j.L(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            objM.add(AbstractC0062a.y((File) it.next()));
        }
        return new C0232e(objM);
    }
}
