package X;

/* loaded from: classes.dex */
public final class k extends b {
    @Override // X.c
    public final boolean b() {
        if (!super.b() || !P0.b.r("MULTI_PROCESS")) {
            return false;
        }
        int i2 = W.b.f705a;
        if (l.f717b.b()) {
            return m.f719a.getStatics().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
