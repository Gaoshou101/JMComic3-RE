package U;

/* loaded from: classes.dex */
public abstract class m extends l {

    /* renamed from: a, reason: collision with root package name */
    public z.e[] f658a;

    /* renamed from: b, reason: collision with root package name */
    public String f659b;

    /* renamed from: c, reason: collision with root package name */
    public int f660c;

    public m() {
        this.f658a = null;
        this.f660c = 0;
    }

    public z.e[] getPathData() {
        return this.f658a;
    }

    public String getPathName() {
        return this.f659b;
    }

    public void setPathData(z.e[] eVarArr) {
        if (!z.f.a(this.f658a, eVarArr)) {
            this.f658a = z.f.g(eVarArr);
            return;
        }
        z.e[] eVarArr2 = this.f658a;
        for (int i2 = 0; i2 < eVarArr.length; i2++) {
            eVarArr2[i2].f2753a = eVarArr[i2].f2753a;
            int i3 = 0;
            while (true) {
                float[] fArr = eVarArr[i2].f2754b;
                if (i3 < fArr.length) {
                    eVarArr2[i2].f2754b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f658a = null;
        this.f660c = 0;
        this.f659b = mVar.f659b;
        this.f658a = z.f.g(mVar.f658a);
    }
}
