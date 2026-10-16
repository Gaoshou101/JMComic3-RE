package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import m.N0;
import m.P;
import m.T;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0242d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2067b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0242d(int i2, Object obj) {
        this.f2066a = i2;
        this.f2067b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f2066a) {
            case 0:
                h hVar = (h) this.f2067b;
                if (hVar.a()) {
                    ArrayList arrayList = hVar.h;
                    if (arrayList.size() > 0 && !((g) arrayList.get(0)).f2073a.x) {
                        View view = hVar.f2087o;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((g) it.next()).f2073a.f();
                            }
                            break;
                        } else {
                            hVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                E e2 = (E) this.f2067b;
                if (e2.a()) {
                    N0 n02 = e2.h;
                    if (!n02.x) {
                        View view2 = e2.f2040m;
                        if (view2 != null && view2.isShown()) {
                            n02.f();
                            break;
                        } else {
                            e2.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                T t2 = (T) this.f2067b;
                if (!t2.getInternalPopup().a()) {
                    t2.f2299f.d(t2.getTextDirection(), t2.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = t2.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                P p2 = (P) this.f2067b;
                T t3 = p2.f2277G;
                p2.getClass();
                if (!t3.isAttachedToWindow() || !t3.getGlobalVisibleRect(p2.f2275E)) {
                    p2.dismiss();
                    break;
                } else {
                    p2.r();
                    p2.f();
                    break;
                }
                break;
        }
    }
}
