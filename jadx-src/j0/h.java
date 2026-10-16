package J0;

import F0.C0012m;
import F0.C0016q;
import F0.L;
import F0.T;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k0.C0232e;
import k0.C0235h;
import n0.C0317j;
import n0.InterfaceC0311d;
import n0.InterfaceC0316i;
import o0.EnumC0322a;
import w0.p;

/* loaded from: classes.dex */
public final class h extends p0.c implements I0.c {

    /* renamed from: e, reason: collision with root package name */
    public final I0.c f353e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0316i f354f;

    /* renamed from: g, reason: collision with root package name */
    public final int f355g;
    public InterfaceC0316i h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0311d f356i;

    public h(I0.c cVar, InterfaceC0316i interfaceC0316i) {
        super(f.f351b, C0317j.f2507b);
        this.f353e = cVar;
        this.f354f = interfaceC0316i;
        this.f355g = ((Number) interfaceC0316i.j(0, new C0012m(3))).intValue();
    }

    @Override // I0.c
    public final Object c(Object obj, InterfaceC0311d interfaceC0311d) {
        try {
            Object objM = m(interfaceC0311d, obj);
            return objM == EnumC0322a.f2519b ? objM : C0235h.f2029a;
        } catch (Throwable th) {
            this.h = new e(th, interfaceC0311d.getContext());
            throw th;
        }
    }

    @Override // p0.AbstractC0326a, p0.d
    public final p0.d d() {
        InterfaceC0311d interfaceC0311d = this.f356i;
        if (interfaceC0311d instanceof p0.d) {
            return (p0.d) interfaceC0311d;
        }
        return null;
    }

    @Override // p0.c, n0.InterfaceC0311d
    public final InterfaceC0316i getContext() {
        InterfaceC0316i interfaceC0316i = this.h;
        return interfaceC0316i == null ? C0317j.f2507b : interfaceC0316i;
    }

    @Override // p0.AbstractC0326a
    public final StackTraceElement j() {
        return null;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        Throwable thA = C0232e.a(obj);
        if (thA != null) {
            this.h = new e(thA, getContext());
        }
        InterfaceC0311d interfaceC0311d = this.f356i;
        if (interfaceC0311d != null) {
            interfaceC0311d.h(obj);
        }
        return EnumC0322a.f2519b;
    }

    public final Object m(InterfaceC0311d interfaceC0311d, Object obj) {
        Comparable comparable;
        String strSubstring;
        InterfaceC0316i context = interfaceC0311d.getContext();
        L l2 = (L) context.g(C0016q.f123c);
        if (l2 != null && !l2.b()) {
            throw ((T) l2).t();
        }
        InterfaceC0316i interfaceC0316i = this.h;
        if (interfaceC0316i != context) {
            int i2 = 0;
            if (interfaceC0316i instanceof e) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((e) interfaceC0316i).f350c + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                x0.g.e("<this>", str);
                List listAsList = Arrays.asList("\r\n", "\n", "\r");
                x0.g.d("asList(...)", listAsList);
                List listK = D0.e.K(new D0.i(new E0.c(str, 0, 0, new E0.j(listAsList, false)), new E0.k(0, str)));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listK) {
                    if (!E0.l.Q((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(l0.j.L(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                            break;
                        }
                        char cCharAt = str2.charAt(length2);
                        if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                            break;
                        }
                        length2++;
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(length2));
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                listK.size();
                int size = listK.size() - 1;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listK) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str3 = (String) obj3;
                    if ((i2 == 0 || i2 == size) && E0.l.Q(str3)) {
                        strSubstring = null;
                    } else {
                        x0.g.e("<this>", str3);
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(("Requested character count " + iIntValue + " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        strSubstring = str3.substring(length4);
                        x0.g.d("substring(...)", strSubstring);
                    }
                    if (strSubstring != null) {
                        arrayList3.add(strSubstring);
                    }
                    i2 = i3;
                }
                StringBuilder sb = new StringBuilder(length3);
                l0.h.M(arrayList3, sb, "\n", "", "", -1, "...", null);
                String string = sb.toString();
                x0.g.d("toString(...)", string);
                throw new IllegalStateException(string.toString());
            }
            if (((Number) context.j(0, new p() { // from class: J0.k
                /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
                @Override // w0.p
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(java.lang.Object r4, java.lang.Object r5) {
                    /*
                        r3 = this;
                        java.lang.Integer r4 = (java.lang.Integer) r4
                        int r4 = r4.intValue()
                        n0.g r5 = (n0.InterfaceC0314g) r5
                        n0.h r0 = r5.getKey()
                        J0.h r1 = r3.f359b
                        n0.i r1 = r1.f354f
                        n0.g r1 = r1.g(r0)
                        F0.q r2 = F0.C0016q.f123c
                        if (r0 == r2) goto L20
                        if (r5 == r1) goto L1d
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        goto L34
                    L1d:
                        int r4 = r4 + 1
                        goto L34
                    L20:
                        F0.L r1 = (F0.L) r1
                        F0.L r5 = (F0.L) r5
                    L24:
                        r0 = 0
                        if (r5 != 0) goto L29
                        r5 = r0
                        goto L30
                    L29:
                        if (r5 != r1) goto L2c
                        goto L30
                    L2c:
                        boolean r2 = r5 instanceof K0.r
                        if (r2 != 0) goto L5e
                    L30:
                        if (r5 != r1) goto L39
                        if (r1 != 0) goto L1d
                    L34:
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                        return r4
                    L39:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
                        r0.<init>(r2)
                        r0.append(r5)
                        java.lang.String r5 = ", expected child of "
                        r0.append(r5)
                        r0.append(r1)
                        java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
                        r0.append(r5)
                        java.lang.String r5 = r0.toString()
                        java.lang.String r5 = r5.toString()
                        r4.<init>(r5)
                        throw r4
                    L5e:
                        K0.r r5 = (K0.r) r5
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = F0.T.f98c
                        java.lang.Object r5 = r2.get(r5)
                        F0.h r5 = (F0.InterfaceC0007h) r5
                        if (r5 == 0) goto L6f
                        F0.L r5 = r5.getParent()
                        goto L24
                    L6f:
                        r5 = r0
                        goto L24
                    */
                    throw new UnsupportedOperationException("Method not decompiled: J0.k.f(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            })).intValue() != this.f355g) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f354f + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.h = context;
        }
        this.f356i = interfaceC0311d;
        i iVar = j.f358a;
        I0.c cVar = this.f353e;
        x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>", cVar);
        iVar.getClass();
        Object objC = cVar.c(obj, this);
        if (!x0.g.a(objC, EnumC0322a.f2519b)) {
            this.f356i = null;
        }
        return objC;
    }
}
