package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class A implements Spannable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1097b = false;

    /* renamed from: c, reason: collision with root package name */
    public Spannable f1098c;

    public A(Spannable spannable) {
        this.f1098c = spannable;
    }

    public final void a() {
        Spannable spannable = this.f1098c;
        if (!this.f1097b) {
            if ((Build.VERSION.SDK_INT < 28 ? new L.c(12) : new z(12)).w(spannable)) {
                this.f1098c = new SpannableString(spannable);
            }
        }
        this.f1097b = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f1098c.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1098c.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1098c.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1098c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1098c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1098c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f1098c.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1098c.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f1098c.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1098c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        a();
        this.f1098c.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f1098c.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1098c.toString();
    }
}
