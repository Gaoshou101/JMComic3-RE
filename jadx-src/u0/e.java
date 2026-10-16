package u0;

import java.io.File;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f2654b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f2655c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f2657f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, File file) {
        super(file);
        this.f2657f = hVar;
    }

    @Override // u0.i
    public final File a() throws p {
        boolean z2 = this.f2656e;
        File file = this.f2665a;
        h hVar = this.f2657f;
        if (!z2 && this.f2655c == null) {
            hVar.f2664e.getClass();
            File[] fileArrListFiles = file.listFiles();
            this.f2655c = fileArrListFiles;
            if (fileArrListFiles == null) {
                n nVar = hVar.f2664e.f2668c;
                if (nVar != null) {
                    nVar.f(file, new a(file, null, "Cannot list files in a directory"));
                }
                this.f2656e = true;
            }
        }
        File[] fileArr = this.f2655c;
        if (fileArr != null && this.d < fileArr.length) {
            x0.g.b(fileArr);
            int i2 = this.d;
            this.d = i2 + 1;
            return fileArr[i2];
        }
        if (this.f2654b) {
            hVar.f2664e.getClass();
            return null;
        }
        this.f2654b = true;
        return file;
    }
}
