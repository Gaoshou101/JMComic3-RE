package M0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f466b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f467c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f468e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f469a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f467c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f460c) {
            f468e.incrementAndGet(this);
        }
        int i2 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f469a;
            if (atomicReferenceArray.get(i2) == null) {
                atomicReferenceArray.lazySet(i2, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - f467c.get(this) == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (iVar = (i) this.f469a.getAndSet(i3, null)) != null) {
                if (iVar.f460c) {
                    f468e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i2, boolean z2) {
        int i3 = i2 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f469a;
        i iVar = (i) atomicReferenceArray.get(i3);
        if (iVar != null && iVar.f460c == z2) {
            while (!atomicReferenceArray.compareAndSet(i3, iVar, null)) {
                if (atomicReferenceArray.get(i3) != iVar) {
                }
            }
            if (z2) {
                f468e.decrementAndGet(this);
            }
            return iVar;
        }
        return null;
    }
}
