package U;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f661p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f662a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f663b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f664c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f665e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f666f;

    /* renamed from: g, reason: collision with root package name */
    public final k f667g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f668i;

    /* renamed from: j, reason: collision with root package name */
    public float f669j;

    /* renamed from: k, reason: collision with root package name */
    public float f670k;

    /* renamed from: l, reason: collision with root package name */
    public int f671l;

    /* renamed from: m, reason: collision with root package name */
    public String f672m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f673n;

    /* renamed from: o, reason: collision with root package name */
    public final p.f f674o;

    public n() {
        this.f664c = new Matrix();
        this.h = 0.0f;
        this.f668i = 0.0f;
        this.f669j = 0.0f;
        this.f670k = 0.0f;
        this.f671l = 255;
        this.f672m = null;
        this.f673n = null;
        this.f674o = new p.f(0);
        this.f667g = new k();
        this.f662a = new Path();
        this.f663b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(U.k r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U.n.a(U.k, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f671l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.f671l = i2;
    }

    public n(n nVar) {
        this.f664c = new Matrix();
        this.h = 0.0f;
        this.f668i = 0.0f;
        this.f669j = 0.0f;
        this.f670k = 0.0f;
        this.f671l = 255;
        this.f672m = null;
        this.f673n = null;
        p.f fVar = new p.f(0);
        this.f674o = fVar;
        this.f667g = new k(nVar.f667g, fVar);
        this.f662a = new Path(nVar.f662a);
        this.f663b = new Path(nVar.f663b);
        this.h = nVar.h;
        this.f668i = nVar.f668i;
        this.f669j = nVar.f669j;
        this.f670k = nVar.f670k;
        this.f671l = nVar.f671l;
        this.f672m = nVar.f672m;
        String str = nVar.f672m;
        if (str != null) {
            fVar.put(str, this);
        }
        this.f673n = nVar.f673n;
    }
}
