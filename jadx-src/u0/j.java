package u0;

import java.io.File;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements D0.d {

    /* renamed from: a, reason: collision with root package name */
    public final File f2666a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2667b;

    /* renamed from: c, reason: collision with root package name */
    public final n f2668c;
    public final int d;

    public j(File file, k kVar, n nVar, int i2) {
        this.f2666a = file;
        this.f2667b = kVar;
        this.f2668c = nVar;
        this.d = i2;
    }

    @Override // D0.d
    public final Iterator iterator() {
        return new h(this);
    }
}
