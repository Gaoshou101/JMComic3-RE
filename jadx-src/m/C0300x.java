package m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import f.AbstractC0113a;

/* renamed from: m.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300x {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2480a;

    /* renamed from: b, reason: collision with root package name */
    public final X.i f2481b;

    public C0300x(TextView textView) {
        this.f2480a = textView;
        this.f2481b = new X.i(textView);
    }

    public final void a(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f2480a.getContext().obtainStyledAttributes(attributeSet, AbstractC0113a.f1503i, i2, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z2) {
        ((P0.b) this.f2481b.f715b).A(z2);
    }

    public final void c(boolean z2) {
        ((P0.b) this.f2481b.f715b).B(z2);
    }
}
