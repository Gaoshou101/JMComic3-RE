package y;

import android.graphics.Color;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343a {

    /* renamed from: a, reason: collision with root package name */
    public final float f2708a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2709b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2710c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2711e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2712f;

    public C0343a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f2708a = f2;
        this.f2709b = f3;
        this.f2710c = f4;
        this.d = f5;
        this.f2711e = f6;
        this.f2712f = f7;
    }

    public static C0343a a(int i2) {
        l lVar = l.f2738k;
        float fE = AbstractC0344b.e(Color.red(i2));
        float fE2 = AbstractC0344b.e(Color.green(i2));
        float fE3 = AbstractC0344b.e(Color.blue(i2));
        float[][] fArr = AbstractC0344b.d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * fE3) + (fArr2[1] * fE2) + (fArr2[0] * fE);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * fE3) + (fArr3[1] * fE2) + (fArr3[0] * fE);
        float[] fArr4 = fArr[2];
        float f4 = (fE3 * fArr4[2]) + (fE2 * fArr4[1]) + (fE * fArr4[0]);
        float[][] fArr5 = AbstractC0344b.f2713a;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f6 = (fArr7[2] * f4) + (fArr7[1] * f3) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f7 = (f4 * fArr8[2]) + (f3 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = lVar.f2744g;
        float f8 = fArr9[0] * f5;
        float f9 = fArr9[1] * f6;
        float f10 = fArr9[2] * f7;
        float fAbs = Math.abs(f8);
        float f11 = lVar.h;
        float fPow = (float) Math.pow((fAbs * f11) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f9) * f11) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f10) * f11) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f8) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f9) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f10) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f12 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d)) / 11.0f;
        float f13 = ((float) ((fSignum + fSignum2) - (d * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f14)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = fAtan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float f19 = f16 * lVar.f2740b;
        float f20 = lVar.f2739a;
        float f21 = lVar.d;
        float fPow4 = ((float) Math.pow(f19 / f20, lVar.f2746j * f21)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f22 = f20 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f2743f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f17) < 20.14d ? 360.0f + f17 : f17) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f2742e) * lVar.f2741c) * ((float) Math.sqrt((f13 * f13) + (f12 * f12)))) / (f15 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float f23 = lVar.f2745i * fPow5;
        Math.sqrt((r3 * f21) / f22);
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f18;
        return new C0343a(f17, fPow5, fPow4, f24, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static C0343a b(float f2, float f3, float f4) {
        l lVar = l.f2738k;
        float f5 = lVar.d;
        Math.sqrt(f2 / 100.0d);
        float f6 = lVar.f2739a + 4.0f;
        float f7 = lVar.f2745i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(r1))) * lVar.d) / f6);
        float f8 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((f7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f4) / 180.0f;
        return new C0343a(f4, f3, f2, f8, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(y.l r17) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C0343a.c(y.l):int");
    }
}
