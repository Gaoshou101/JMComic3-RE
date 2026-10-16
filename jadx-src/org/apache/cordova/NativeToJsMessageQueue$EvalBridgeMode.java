package org.apache.cordova;

import N0.E;
import N0.H;
import N0.m;
import N0.v;

/* loaded from: classes.dex */
public class NativeToJsMessageQueue$EvalBridgeMode extends E {

    /* renamed from: a, reason: collision with root package name */
    public final v f2550a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2551b;

    public NativeToJsMessageQueue$EvalBridgeMode(v vVar, m mVar) {
        this.f2550a = vVar;
        this.f2551b = mVar;
    }

    @Override // N0.E
    public void onNativeToJsMessageAvailable(H h) {
        this.f2551b.getActivity().runOnUiThread(new D.a(this, h, 4, false));
    }
}
