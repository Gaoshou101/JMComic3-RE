package U;

import android.animation.TypeEvaluator;

/* loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public z.e[] f637a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f2, Object obj, Object obj2) {
        z.e[] eVarArr = (z.e[]) obj;
        z.e[] eVarArr2 = (z.e[]) obj2;
        if (!z.f.a(eVarArr, eVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!z.f.a(this.f637a, eVarArr)) {
            this.f637a = z.f.g(eVarArr);
        }
        for (int i2 = 0; i2 < eVarArr.length; i2++) {
            z.e eVar = this.f637a[i2];
            z.e eVar2 = eVarArr[i2];
            z.e eVar3 = eVarArr2[i2];
            eVar.getClass();
            eVar.f2753a = eVar2.f2753a;
            int i3 = 0;
            while (true) {
                float[] fArr = eVar2.f2754b;
                if (i3 < fArr.length) {
                    eVar.f2754b[i3] = (eVar3.f2754b[i3] * f2) + ((1.0f - f2) * fArr[i3]);
                    i3++;
                }
            }
        }
        return this.f637a;
    }
}
