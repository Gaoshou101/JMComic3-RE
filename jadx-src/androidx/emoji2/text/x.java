package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class x {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f1147a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1148b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1149c = 0;

    public x(u uVar, int i2) {
        this.f1148b = uVar;
        this.f1147a = i2;
    }

    public final int a(int i2) {
        L.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarC.d;
        int i3 = iA + aVarC.f137a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    public final int b() {
        L.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i2 = iA + aVarC.f137a;
        return ((ByteBuffer) aVarC.d).getInt(((ByteBuffer) aVarC.d).getInt(i2) + i2);
    }

    public final L.a c() {
        ThreadLocal threadLocal = d;
        L.a aVar = (L.a) threadLocal.get();
        if (aVar == null) {
            aVar = new L.a();
            threadLocal.set(aVar);
        }
        L.b bVar = (L.b) this.f1148b.f1140a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i2 = iA + bVar.f137a;
            int i3 = (this.f1147a * 4) + ((ByteBuffer) bVar.d).getInt(i2) + i2 + 4;
            int i4 = ((ByteBuffer) bVar.d).getInt(i3) + i3;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.d;
            aVar.d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f137a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                aVar.f138b = i5;
                aVar.f139c = ((ByteBuffer) aVar.d).getShort(i5);
            } else {
                aVar.f137a = 0;
                aVar.f138b = 0;
                aVar.f139c = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        L.a aVarC = c();
        int iA = aVarC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarC.d).getInt(iA + aVarC.f137a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i2 = 0; i2 < iB; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
