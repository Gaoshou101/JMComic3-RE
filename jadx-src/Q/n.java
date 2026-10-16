package Q;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f597a;

    /* renamed from: b, reason: collision with root package name */
    public final int f598b;

    /* renamed from: c, reason: collision with root package name */
    public final long f599c;
    public final long d;

    public n(int i2, int i3, long j2, long j3) {
        this.f597a = i2;
        this.f598b = i3;
        this.f599c = j2;
        this.d = j3;
    }

    public static n a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            n nVar = new n(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return nVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f597a);
            dataOutputStream.writeInt(this.f598b);
            dataOutputStream.writeLong(this.f599c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f598b == nVar.f598b && this.f599c == nVar.f599c && this.f597a == nVar.f597a && this.d == nVar.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f598b), Long.valueOf(this.f599c), Integer.valueOf(this.f597a), Long.valueOf(this.d));
    }
}
