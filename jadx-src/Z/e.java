package z;

import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public char f2753a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f2754b;

    public e(char c2, float[] fArr) {
        this.f2753a = c2;
        this.f2754b = fArr;
    }

    public static void a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z2, boolean z3) {
        double d;
        double d2;
        double radians = Math.toRadians(f8);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d3 = f2;
        double d4 = f3;
        double d5 = (d4 * dSin) + (d3 * dCos);
        double d6 = d3;
        double d7 = f6;
        double d8 = d5 / d7;
        double d9 = f7;
        double d10 = ((d4 * dCos) + ((-f2) * dSin)) / d9;
        double d11 = d4;
        double d12 = f5;
        double d13 = ((d12 * dSin) + (f4 * dCos)) / d7;
        double d14 = ((d12 * dCos) + ((-f4) * dSin)) / d9;
        double d15 = d8 - d13;
        double d16 = d10 - d14;
        double d17 = (d8 + d13) / 2.0d;
        double d18 = (d10 + d14) / 2.0d;
        double d19 = (d16 * d16) + (d15 * d15);
        if (d19 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d19);
            float fSqrt = (float) (Math.sqrt(d19) / 1.99999d);
            a(path, f2, f3, f4, f5, f6 * fSqrt, f7 * fSqrt, f8, z2, z3);
            return;
        }
        double dSqrt = Math.sqrt(d20);
        double d21 = d15 * dSqrt;
        double d22 = dSqrt * d16;
        if (z2 == z3) {
            d = d17 - d22;
            d2 = d18 + d21;
        } else {
            d = d17 + d22;
            d2 = d18 - d21;
        }
        double dAtan2 = Math.atan2(d10 - d2, d8 - d);
        double dAtan22 = Math.atan2(d14 - d2, d13 - d) - dAtan2;
        if (z3 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d23 = d * d7;
        double d24 = d2 * d9;
        double d25 = (d23 * dCos) - (d24 * dSin);
        double d26 = (d24 * dCos) + (d23 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d27 = -d7;
        double d28 = d27 * dCos2;
        double d29 = d9 * dSin2;
        double d30 = (d28 * dSin3) - (d29 * dCos3);
        double d31 = d27 * dSin2;
        double d32 = d9 * dCos2;
        double d33 = (dCos3 * d32) + (dSin3 * d31);
        double d34 = d32;
        double d35 = dAtan22 / iCeil;
        int i2 = 0;
        while (i2 < iCeil) {
            double d36 = dAtan2 + d35;
            double dSin4 = Math.sin(d36);
            double dCos4 = Math.cos(d36);
            double d37 = d35;
            double d38 = (((d7 * dCos2) * dCos4) + d25) - (d29 * dSin4);
            double d39 = d34;
            double d40 = d25;
            double d41 = (d39 * dSin4) + (d7 * dSin2 * dCos4) + d26;
            double d42 = (d28 * dSin4) - (d29 * dCos4);
            double d43 = (dCos4 * d39) + (dSin4 * d31);
            double d44 = d36 - dAtan2;
            double dTan = Math.tan(d44 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d44)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d30 * dSqrt2) + d6), (float) ((d33 * dSqrt2) + d11), (float) (d38 - (dSqrt2 * d42)), (float) (d41 - (dSqrt2 * d43)), (float) d38, (float) d41);
            i2++;
            dAtan2 = d36;
            d31 = d31;
            dCos2 = dCos2;
            iCeil = iCeil;
            d33 = d43;
            d7 = d7;
            d30 = d42;
            d6 = d38;
            d11 = d41;
            d25 = d40;
            d35 = d37;
            d34 = d39;
        }
    }

    public static void b(e[] eVarArr, Path path) {
        int i2;
        int i3;
        char c2;
        int i4;
        int i5;
        e eVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        e[] eVarArr2 = eVarArr;
        int i6 = 6;
        float[] fArr = new float[6];
        int length = eVarArr2.length;
        int i7 = 0;
        char c3 = 'm';
        while (i7 < length) {
            e eVar2 = eVarArr2[i7];
            char c4 = eVar2.f2753a;
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[2];
            float f17 = fArr[3];
            float f18 = fArr[4];
            float f19 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = i6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f18, f19);
                    f14 = f18;
                    f16 = f14;
                    f15 = f19;
                    f17 = f15;
                default:
                    i2 = 2;
                    break;
            }
            float f20 = f18;
            float f21 = f19;
            float f22 = f14;
            float f23 = f15;
            int i8 = 0;
            while (true) {
                float[] fArr2 = eVar2.f2754b;
                if (i8 < fArr2.length) {
                    if (c4 != 'A') {
                        if (c4 != 'C') {
                            if (c4 == 'H') {
                                i3 = i8;
                                c2 = c4;
                                i4 = i7;
                                i5 = length;
                                eVar = eVar2;
                                path.lineTo(fArr2[i3], f23);
                                f22 = fArr2[i3];
                            } else if (c4 == 'Q') {
                                i3 = i8;
                                c2 = c4;
                                i4 = i7;
                                i5 = length;
                                eVar = eVar2;
                                float f24 = fArr2[i3];
                                int i9 = i3 + 1;
                                float f25 = fArr2[i9];
                                int i10 = i3 + 2;
                                int i11 = i3 + 3;
                                path.quadTo(f24, f25, fArr2[i10], fArr2[i11]);
                                f2 = fArr2[i3];
                                f3 = fArr2[i9];
                                f22 = fArr2[i10];
                                f23 = fArr2[i11];
                            } else if (c4 == 'V') {
                                i3 = i8;
                                c2 = c4;
                                i4 = i7;
                                i5 = length;
                                eVar = eVar2;
                                path.lineTo(f22, fArr2[i3]);
                                f23 = fArr2[i3];
                            } else if (c4 != 'a') {
                                if (c4 != 'c') {
                                    if (c4 != 'h') {
                                        if (c4 == 'q') {
                                            i3 = i8;
                                            float f26 = f23;
                                            float f27 = f22;
                                            int i12 = i3 + 1;
                                            int i13 = i3 + 2;
                                            int i14 = i3 + 3;
                                            path.rQuadTo(fArr2[i3], fArr2[i12], fArr2[i13], fArr2[i14]);
                                            float f28 = f27 + fArr2[i3];
                                            float f29 = fArr2[i12] + f26;
                                            float f30 = f27 + fArr2[i13];
                                            f23 = f26 + fArr2[i14];
                                            f17 = f29;
                                            f16 = f28;
                                            c2 = c4;
                                            i4 = i7;
                                            i5 = length;
                                            f22 = f30;
                                        } else if (c4 == 'v') {
                                            i3 = i8;
                                            path.rLineTo(0.0f, fArr2[i3]);
                                            f23 += fArr2[i3];
                                        } else if (c4 == 'L') {
                                            i3 = i8;
                                            int i15 = i3 + 1;
                                            path.lineTo(fArr2[i3], fArr2[i15]);
                                            f22 = fArr2[i3];
                                            f23 = fArr2[i15];
                                        } else if (c4 == 'M') {
                                            i3 = i8;
                                            f22 = fArr2[i3];
                                            f23 = fArr2[i3 + 1];
                                            if (i3 > 0) {
                                                path.lineTo(f22, f23);
                                            } else {
                                                path.moveTo(f22, f23);
                                                f21 = f23;
                                                f20 = f22;
                                            }
                                        } else if (c4 == 'S') {
                                            i3 = i8;
                                            float f31 = f23;
                                            float f32 = f22;
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                f8 = (f31 * 2.0f) - f17;
                                                f9 = (f32 * 2.0f) - f16;
                                            } else {
                                                f9 = f32;
                                                f8 = f31;
                                            }
                                            int i16 = i3 + 1;
                                            int i17 = i3 + 2;
                                            int i18 = i3 + 3;
                                            path.cubicTo(f9, f8, fArr2[i3], fArr2[i16], fArr2[i17], fArr2[i18]);
                                            float f33 = fArr2[i3];
                                            float f34 = fArr2[i16];
                                            f22 = fArr2[i17];
                                            f23 = fArr2[i18];
                                            f17 = f34;
                                            f16 = f33;
                                        } else if (c4 == 'T') {
                                            i3 = i8;
                                            float f35 = f23;
                                            float f36 = f22;
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f4 = (f36 * 2.0f) - f16;
                                                f5 = (f35 * 2.0f) - f17;
                                            } else {
                                                f4 = f36;
                                                f5 = f35;
                                            }
                                            int i19 = i3 + 1;
                                            path.quadTo(f4, f5, fArr2[i3], fArr2[i19]);
                                            f6 = fArr2[i3];
                                            f7 = fArr2[i19];
                                        } else if (c4 == 'l') {
                                            i3 = i8;
                                            int i20 = i3 + 1;
                                            path.rLineTo(fArr2[i3], fArr2[i20]);
                                            f22 += fArr2[i3];
                                            f23 += fArr2[i20];
                                        } else if (c4 == 'm') {
                                            i3 = i8;
                                            float f37 = fArr2[i3];
                                            f22 += f37;
                                            float f38 = fArr2[i3 + 1];
                                            f23 += f38;
                                            if (i3 > 0) {
                                                path.rLineTo(f37, f38);
                                            } else {
                                                path.rMoveTo(f37, f38);
                                                f21 = f23;
                                                f20 = f22;
                                            }
                                        } else if (c4 == 's') {
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                float f39 = f22 - f16;
                                                f10 = f23 - f17;
                                                f11 = f39;
                                            } else {
                                                f10 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            int i21 = i8 + 1;
                                            int i22 = i8 + 2;
                                            int i23 = i8 + 3;
                                            i3 = i8;
                                            float f40 = f23;
                                            float f41 = f22;
                                            path.rCubicTo(f11, f10, fArr2[i8], fArr2[i21], fArr2[i22], fArr2[i23]);
                                            f4 = f41 + fArr2[i3];
                                            f5 = f40 + fArr2[i21];
                                            f6 = f41 + fArr2[i22];
                                            f7 = fArr2[i23] + f40;
                                        } else if (c4 != 't') {
                                            i3 = i8;
                                        } else {
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f12 = f22 - f16;
                                                f13 = f23 - f17;
                                            } else {
                                                f13 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            int i24 = i8 + 1;
                                            path.rQuadTo(f12, f13, fArr2[i8], fArr2[i24]);
                                            float f42 = f12 + f22;
                                            float f43 = f13 + f23;
                                            f22 += fArr2[i8];
                                            f23 += fArr2[i24];
                                            f17 = f43;
                                            i3 = i8;
                                            c2 = c4;
                                            i4 = i7;
                                            i5 = length;
                                            f16 = f42;
                                        }
                                        eVar = eVar2;
                                    } else {
                                        i3 = i8;
                                        path.rLineTo(fArr2[i3], 0.0f);
                                        f22 += fArr2[i3];
                                    }
                                    c2 = c4;
                                    i4 = i7;
                                    i5 = length;
                                    eVar = eVar2;
                                } else {
                                    i3 = i8;
                                    float f44 = f23;
                                    float f45 = f22;
                                    int i25 = i3 + 2;
                                    int i26 = i3 + 3;
                                    int i27 = i3 + 4;
                                    int i28 = i3 + 5;
                                    path.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                                    f4 = f45 + fArr2[i25];
                                    f5 = f44 + fArr2[i26];
                                    f6 = f45 + fArr2[i27];
                                    f7 = fArr2[i28] + f44;
                                }
                                f17 = f5;
                                f16 = f4;
                                c2 = c4;
                                i4 = i7;
                                i5 = length;
                                f22 = f6;
                                f23 = f7;
                                eVar = eVar2;
                            } else {
                                i3 = i8;
                                float f46 = f23;
                                float f47 = f22;
                                int i29 = i3 + 5;
                                int i30 = i3 + 6;
                                c2 = c4;
                                i5 = length;
                                eVar = eVar2;
                                i4 = i7;
                                a(path, f47, f46, fArr2[i29] + f47, fArr2[i30] + f46, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                                f22 = f47 + fArr2[i29];
                                f23 = f46 + fArr2[i30];
                            }
                            i8 = i3 + i2;
                            eVar2 = eVar;
                            length = i5;
                            c3 = c2;
                            c4 = c3;
                            i7 = i4;
                        } else {
                            i3 = i8;
                            c2 = c4;
                            i4 = i7;
                            i5 = length;
                            eVar = eVar2;
                            int i31 = i3 + 2;
                            int i32 = i3 + 3;
                            int i33 = i3 + 4;
                            int i34 = i3 + 5;
                            path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                            f22 = fArr2[i33];
                            f23 = fArr2[i34];
                            f2 = fArr2[i31];
                            f3 = fArr2[i32];
                        }
                        f16 = f2;
                        f17 = f3;
                        i8 = i3 + i2;
                        eVar2 = eVar;
                        length = i5;
                        c3 = c2;
                        c4 = c3;
                        i7 = i4;
                    } else {
                        i3 = i8;
                        c2 = c4;
                        i4 = i7;
                        i5 = length;
                        eVar = eVar2;
                        int i35 = i3 + 5;
                        int i36 = i3 + 6;
                        a(path, f22, f23, fArr2[i35], fArr2[i36], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f22 = fArr2[i35];
                        f23 = fArr2[i36];
                    }
                    f17 = f23;
                    f16 = f22;
                    i8 = i3 + i2;
                    eVar2 = eVar;
                    length = i5;
                    c3 = c2;
                    c4 = c3;
                    i7 = i4;
                }
            }
            fArr[0] = f22;
            fArr[1] = f23;
            fArr[2] = f16;
            fArr[3] = f17;
            fArr[4] = f20;
            fArr[5] = f21;
            c3 = eVar2.f2753a;
            i7++;
            eVarArr2 = eVarArr;
            length = length;
            i6 = 6;
        }
    }

    public e(e eVar) {
        this.f2753a = eVar.f2753a;
        float[] fArr = eVar.f2754b;
        this.f2754b = f.c(fArr, fArr.length);
    }
}
