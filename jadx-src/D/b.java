package D;

import G.K;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import i.C0198e;
import java.util.WeakHashMap;
import m.C0275k;
import m.C0297v0;
import org.apache.cordova.NativeToJsMessageQueue$OnlineEventsBridgeMode;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewEngine;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17c;

    public /* synthetic */ b(int i2, Object obj) {
        this.f16b = i2;
        this.f17c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0275k c0275k;
        Object obj = this.f17c;
        switch (this.f16b) {
            case 0:
                Object obj2 = ((X.i) obj).f715b;
                return;
            case 1:
                J.d dVar = (J.d) obj;
                if (dVar.f329o) {
                    boolean z2 = dVar.f327m;
                    J.a aVar = dVar.f317a;
                    if (z2) {
                        dVar.f327m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f312e = jCurrentAnimationTimeMillis;
                        aVar.f314g = -1L;
                        aVar.f313f = jCurrentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f314g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f314g + aVar.f315i) || !dVar.e()) {
                        dVar.f329o = false;
                        return;
                    }
                    boolean z3 = dVar.f328n;
                    ListView listView = dVar.f319c;
                    if (z3) {
                        dVar.f328n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f313f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j2 = jCurrentAnimationTimeMillis2 - aVar.f313f;
                    aVar.f313f = jCurrentAnimationTimeMillis2;
                    dVar.f331q.scrollListBy((int) (j2 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.d));
                    WeakHashMap weakHashMap = K.f146a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                NativeToJsMessageQueue$OnlineEventsBridgeMode nativeToJsMessageQueue$OnlineEventsBridgeMode = (NativeToJsMessageQueue$OnlineEventsBridgeMode) obj;
                nativeToJsMessageQueue$OnlineEventsBridgeMode.f2555b = false;
                nativeToJsMessageQueue$OnlineEventsBridgeMode.f2556c = true;
                SystemWebView systemWebView = ((SystemWebViewEngine) ((X.i) nativeToJsMessageQueue$OnlineEventsBridgeMode.f2554a).f715b).f2563a;
                if (systemWebView != null) {
                    systemWebView.setNetworkAvailable(true);
                    return;
                }
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((androidx.fragment.app.q) obj).h(true);
                return;
            case 4:
                C0198e c0198e = (C0198e) obj;
                c0198e.a(true);
                c0198e.invalidateSelf();
                return;
            case 5:
                C0297v0 c0297v0 = (C0297v0) obj;
                c0297v0.f2474l = null;
                c0297v0.drawableStateChanged();
                return;
            case 6:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.f987f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f987f = false;
                    return;
                }
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) obj).f1006a;
                if (actionMenuView == null || (c0275k = actionMenuView.f970t) == null) {
                    return;
                }
                c0275k.l();
                return;
        }
    }

    public b(X.i iVar, int i2) {
        this.f16b = 0;
        this.f17c = iVar;
    }
}
