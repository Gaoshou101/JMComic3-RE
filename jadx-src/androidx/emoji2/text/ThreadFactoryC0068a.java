package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.emoji2.text.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0068a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1101a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f1101a);
        thread.setPriority(10);
        return thread;
    }
}
