package androidx.emoji2.text;

import a.AbstractC0062a;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class y extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final x f1151b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f1153e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f1150a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f1152c = -1;
    public float d = 1.0f;

    public y(x xVar) {
        AbstractC0062a.j("rasterizer cannot be null", xVar);
        this.f1151b = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r14, java.lang.CharSequence r15, int r16, int r17, float r18, int r19, int r20, int r21, android.graphics.Paint r22) {
        /*
            r13 = this;
            r0 = r13
            r1 = r15
            r2 = r22
            boolean r3 = r1 instanceof android.text.Spanned
            r4 = 0
            if (r3 == 0) goto L46
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.CharacterStyle> r3 = android.text.style.CharacterStyle.class
            r5 = r16
            r6 = r17
            java.lang.Object[] r1 = r1.getSpans(r5, r6, r3)
            android.text.style.CharacterStyle[] r1 = (android.text.style.CharacterStyle[]) r1
            int r3 = r1.length
            if (r3 == 0) goto L3e
            int r3 = r1.length
            r5 = 1
            r6 = 0
            if (r3 != r5) goto L24
            r3 = r1[r6]
            if (r3 != r0) goto L24
            goto L3e
        L24:
            android.text.TextPaint r3 = r0.f1153e
            if (r3 != 0) goto L2f
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>()
            r0.f1153e = r3
        L2f:
            r4 = r3
            r4.set(r2)
        L33:
            int r3 = r1.length
            if (r6 >= r3) goto L4d
            r3 = r1[r6]
            r3.updateDrawState(r4)
            int r6 = r6 + 1
            goto L33
        L3e:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L4d
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L4d
        L46:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L4d
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
        L4d:
            if (r4 == 0) goto L7d
            int r1 = r4.bgColor
            if (r1 == 0) goto L7d
            short r1 = r0.f1152c
            float r1 = (float) r1
            float r8 = r18 + r1
            r1 = r19
            float r7 = (float) r1
            r1 = r21
            float r9 = (float) r1
            int r1 = r4.getColor()
            android.graphics.Paint$Style r3 = r4.getStyle()
            int r5 = r4.bgColor
            r4.setColor(r5)
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r4.setStyle(r5)
            r5 = r14
            r6 = r18
            r10 = r4
            r5.drawRect(r6, r7, r8, r9, r10)
            r4.setStyle(r3)
            r4.setColor(r1)
        L7d:
            androidx.emoji2.text.j r1 = androidx.emoji2.text.j.a()
            r1.getClass()
            r1 = r20
            float r10 = (float) r1
            if (r4 == 0) goto L8a
            r2 = r4
        L8a:
            androidx.emoji2.text.x r1 = r0.f1151b
            androidx.emoji2.text.u r3 = r1.f1148b
            java.lang.Object r4 = r3.d
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            android.graphics.Typeface r12 = r2.getTypeface()
            r2.setTypeface(r4)
            int r1 = r1.f1147a
            int r7 = r1 * 2
            r8 = 2
            java.lang.Object r1 = r3.f1141b
            r6 = r1
            char[] r6 = (char[]) r6
            r5 = r14
            r9 = r18
            r11 = r2
            r5.drawText(r6, r7, r8, r9, r10, r11)
            r2.setTypeface(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.y.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1150a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        x xVar = this.f1151b;
        this.d = fAbs / (xVar.c().a(14) != 0 ? ((ByteBuffer) r8.d).getShort(r1 + r8.f137a) : (short) 0);
        L.a aVarC = xVar.c();
        int iA = aVarC.a(14);
        if (iA != 0) {
            ((ByteBuffer) aVarC.d).getShort(iA + aVarC.f137a);
        }
        short s2 = (short) ((xVar.c().a(12) != 0 ? ((ByteBuffer) r5.d).getShort(r7 + r5.f137a) : (short) 0) * this.d);
        this.f1152c = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
