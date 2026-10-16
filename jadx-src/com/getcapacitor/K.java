package com.getcapacitor;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final w f1375a;

    public K() {
        this(new w());
    }

    public final void a(String str, Object obj) {
        try {
            this.f1375a.d(str, obj);
        } catch (Exception e2) {
            L.c.q(L.c.F("Plugin"), "", e2);
        }
    }

    public final String toString() {
        return this.f1375a.toString();
    }

    public K(w wVar) {
        this.f1375a = wVar;
    }
}
