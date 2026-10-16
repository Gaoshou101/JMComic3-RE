package m;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class W implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f2310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Typeface f2311c;
    public final /* synthetic */ int d;

    public W(TextView textView, Typeface typeface, int i2) {
        this.f2310b = textView;
        this.f2311c = typeface;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2310b.setTypeface(this.f2311c, this.d);
    }
}
