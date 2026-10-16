package p;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325a extends AbstractSet {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2571b;

    public C0325a(f fVar) {
        this.f2571b = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this.f2571b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2571b.d;
    }
}
