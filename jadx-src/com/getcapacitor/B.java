package com.getcapacitor;

/* loaded from: classes.dex */
public enum B {
    f1353c("granted"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("denied"),
    d("prompt"),
    /* JADX INFO: Fake field, exist only in values array */
    EF41("prompt-with-rationale");


    /* renamed from: b, reason: collision with root package name */
    public final String f1355b;

    B(String str) {
        this.f1355b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f1355b;
    }
}
