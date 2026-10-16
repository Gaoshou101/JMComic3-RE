package org.apache.cordova;

import N0.E;
import N0.H;
import N0.m;
import N0.v;

/* loaded from: classes.dex */
public class NativeToJsMessageQueue$LoadUrlBridgeMode extends E {

    /* renamed from: a, reason: collision with root package name */
    public final v f2552a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2553b;

    public NativeToJsMessageQueue$LoadUrlBridgeMode(v vVar, m mVar) {
        this.f2552a = vVar;
        this.f2553b = mVar;
    }

    @Override // N0.E
    public void onNativeToJsMessageAvailable(H h) {
        this.f2553b.getActivity().runOnUiThread(new D.a(this, h, 5, false));
    }
}
