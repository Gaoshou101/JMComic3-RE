package z;

import D.n;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import y.C0347e;

/* loaded from: classes.dex */
public final class l extends w.d {
    public static Font h(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iJ = j(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int iJ2 = j(fontStyle, font2.getStyle());
            if (iJ2 < iJ) {
                font = font2;
                iJ = iJ2;
            }
        }
        return font;
    }

    public static FontFamily i(n[] nVarArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (n nVar : nVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(nVar.f45a, "r", null);
            } catch (IOException e2) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(nVar.f47c).setSlant(nVar.d ? 1 : 0).setTtcIndex(nVar.f46b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int j(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // w.d
    public final Typeface b(Context context, C0347e c0347e, Resources resources, int i2) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (y.f fVar : c0347e.f2720a) {
                try {
                    Font fontBuild = new Font.Builder(resources, fVar.f2725f).setWeight(fVar.f2722b).setSlant(fVar.f2723c ? 1 : 0).setTtcIndex(fVar.f2724e).setFontVariationSettings(fVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(h(fontFamilyBuild, i2).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // w.d
    public final Typeface c(Context context, n[] nVarArr, int i2) {
        try {
            FontFamily fontFamilyI = i(nVarArr, context.getContentResolver());
            if (fontFamilyI == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyI).setStyle(h(fontFamilyI, i2).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // w.d
    public final Typeface d(Context context, List list, int i2) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyI = i((n[]) list.get(0), contentResolver);
            if (fontFamilyI == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyI);
            for (int i3 = 1; i3 < list.size(); i3++) {
                FontFamily fontFamilyI2 = i((n[]) list.get(i3), contentResolver);
                if (fontFamilyI2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyI2);
                }
            }
            return customFallbackBuilder.setStyle(h(fontFamilyI, i2).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // w.d
    public final Typeface e(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // w.d
    public final Typeface f(Context context, Resources resources, int i2, String str, int i3) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // w.d
    public final n g(n[] nVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
