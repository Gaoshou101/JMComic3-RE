package E;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f63a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f64b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65c;
    public final int d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.f(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
        }
        this.f63a = textPaint;
        this.f64b = textDirectionHeuristic;
        this.f65c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        int i2 = Build.VERSION.SDK_INT;
        if (this.f65c == cVar.f65c && this.d == cVar.d) {
            TextPaint textPaint = this.f63a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = cVar.f63a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && (i2 < 24 ? textPaint.getTextLocale().equals(textPaint2.getTextLocale()) : textPaint.getTextLocales().equals(textPaint2.getTextLocales())) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f64b == cVar.f64b;
        }
        return false;
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.f64b;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.d;
        int i4 = this.f65c;
        TextPaint textPaint = this.f63a;
        return i2 >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i4), Integer.valueOf(i3)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i4), Integer.valueOf(i3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f63a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i2 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i2 >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i2 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f64b);
        sb.append(", breakStrategy=" + this.f65c);
        sb.append(", hyphenationFrequency=" + this.d);
        sb.append("}");
        return sb.toString();
    }

    public c(PrecomputedText.Params params) {
        this.f63a = params.getTextPaint();
        this.f64b = params.getTextDirection();
        this.f65c = params.getBreakStrategy();
        this.d = params.getHyphenationFrequency();
    }
}
