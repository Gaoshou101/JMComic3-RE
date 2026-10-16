package androidx.activity;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import k0.C0235h;

/* loaded from: classes.dex */
public final class u extends x0.h implements w0.l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f875c;
    public final /* synthetic */ C d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(C c2, int i2) {
        super(1);
        this.f875c = i2;
        this.d = c2;
    }

    @Override // w0.l
    public final Object g(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f875c) {
            case 0:
                C0066b c0066b = (C0066b) obj;
                x0.g.e("backEvent", c0066b);
                C c2 = this.d;
                l0.f fVar = c2.f812b;
                fVar.getClass();
                ListIterator listIterator = fVar.listIterator(fVar.d);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((Z.b) objPrevious).f725a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                Z.b bVar = (Z.b) objPrevious;
                if (c2.f813c != null) {
                    c2.b();
                }
                c2.f813c = bVar;
                if (bVar != null) {
                    switch (bVar.d) {
                        case 1:
                            boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
                            androidx.fragment.app.q qVar = (androidx.fragment.app.q) bVar.f728e;
                            if (zIsLoggable) {
                                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + qVar);
                            }
                            qVar.e();
                            qVar.f(new androidx.fragment.app.p(qVar));
                            break;
                        default:
                            x0.g.e("backEvent", c0066b);
                            break;
                    }
                }
                return C0235h.f2029a;
            default:
                C0066b c0066b2 = (C0066b) obj;
                x0.g.e("backEvent", c0066b2);
                C c3 = this.d;
                Z.b bVar2 = c3.f813c;
                if (bVar2 == null) {
                    l0.f fVar2 = c3.f812b;
                    fVar2.getClass();
                    ListIterator listIterator2 = fVar2.listIterator(fVar2.d);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((Z.b) objPrevious2).f725a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                    bVar2 = (Z.b) objPrevious2;
                }
                if (bVar2 != null) {
                    switch (bVar2.d) {
                        case 1:
                            boolean zIsLoggable2 = Log.isLoggable("FragmentManager", 2);
                            androidx.fragment.app.q qVar2 = (androidx.fragment.app.q) bVar2.f728e;
                            if (zIsLoggable2) {
                                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + qVar2);
                            }
                            if (qVar2.f1219g != null) {
                                Iterator it = androidx.fragment.app.q.c(new ArrayList(Collections.singletonList(qVar2.f1219g)), 0, 1).iterator();
                                if (it.hasNext()) {
                                    ((androidx.fragment.app.y) it.next()).getClass();
                                    x0.g.e("backEvent", c0066b2);
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + c0066b2.f826c);
                                    }
                                    new ArrayList();
                                    throw null;
                                }
                                Iterator it2 = qVar2.f1224m.iterator();
                                if (it2.hasNext()) {
                                    throw androidx.fragment.app.x.a(it2);
                                }
                            }
                            break;
                        default:
                            x0.g.e("backEvent", c0066b2);
                            break;
                    }
                }
                return C0235h.f2029a;
        }
    }
}
