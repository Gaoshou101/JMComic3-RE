package u0;

import java.io.File;

/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f2659b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f2660c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2661e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, File file) {
        super(file);
        this.f2661e = hVar;
    }

    @Override // u0.i
    public final File a() throws p {
        n nVar;
        boolean z2 = this.f2659b;
        File file = this.f2665a;
        h hVar = this.f2661e;
        if (!z2) {
            hVar.f2664e.getClass();
            this.f2659b = true;
            return file;
        }
        File[] fileArr = this.f2660c;
        if (fileArr != null && this.d >= fileArr.length) {
            hVar.f2664e.getClass();
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f2660c = fileArrListFiles;
            if (fileArrListFiles == null && (nVar = hVar.f2664e.f2668c) != null) {
                nVar.f(file, new a(file, null, "Cannot list files in a directory"));
            }
            File[] fileArr2 = this.f2660c;
            if (fileArr2 == null || fileArr2.length == 0) {
                hVar.f2664e.getClass();
                return null;
            }
        }
        File[] fileArr3 = this.f2660c;
        x0.g.b(fileArr3);
        int i2 = this.d;
        this.d = i2 + 1;
        return fileArr3[i2];
    }
}
