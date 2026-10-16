package E;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ PrecomputedText.Params.Builder f(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean q(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
