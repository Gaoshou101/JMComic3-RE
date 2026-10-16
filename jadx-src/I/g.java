package I;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f272a;

    public g(Object obj) {
        this.f272a = (InputContentInfo) obj;
    }

    @Override // I.h
    public final void a() {
        this.f272a.requestPermission();
    }

    @Override // I.h
    public final Uri b() {
        return this.f272a.getLinkUri();
    }

    @Override // I.h
    public final Object c() {
        return this.f272a;
    }

    @Override // I.h
    public final Uri d() {
        return this.f272a.getContentUri();
    }

    @Override // I.h
    public final ClipDescription getDescription() {
        return this.f272a.getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f272a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
