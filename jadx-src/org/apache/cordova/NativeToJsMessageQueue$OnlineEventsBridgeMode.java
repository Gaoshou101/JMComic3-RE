package org.apache.cordova;

import N0.E;
import N0.G;
import N0.H;
import X.i;
import org.apache.cordova.engine.SystemWebViewEngine;

/* loaded from: classes.dex */
public class NativeToJsMessageQueue$OnlineEventsBridgeMode extends E {

    /* renamed from: a, reason: collision with root package name */
    public final G f2554a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2555b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2556c;

    public NativeToJsMessageQueue$OnlineEventsBridgeMode(G g2) {
        this.f2554a = g2;
    }

    @Override // N0.E
    public void notifyOfFlush(H h, boolean z2) {
        if (!z2 || this.f2556c) {
            return;
        }
        this.f2555b = !this.f2555b;
    }

    @Override // N0.E
    public void onNativeToJsMessageAvailable(H h) {
        ((SystemWebViewEngine) ((i) this.f2554a).f715b).f2568g.getActivity().runOnUiThread(new D.a(this, h, 6, false));
    }

    @Override // N0.E
    public void reset() {
        ((SystemWebViewEngine) ((i) this.f2554a).f715b).f2568g.getActivity().runOnUiThread(new D.b(2, this));
    }
}
