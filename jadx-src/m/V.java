package m;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2303c;
    public final /* synthetic */ C0258b0 d;

    public V(C0258b0 c0258b0, int i2, int i3, WeakReference weakReference) {
        this.d = c0258b0;
        this.f2301a = i2;
        this.f2302b = i3;
        this.f2303c = weakReference;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).post(new androidx.activity.k(6, this));
    }

    public final void b(Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f2301a) != -1) {
            typeface = AbstractC0256a0.a(typeface, i2, (this.f2302b & 2) != 0);
        }
        C0258b0 c0258b0 = this.d;
        if (c0258b0.f2333m) {
            c0258b0.f2332l = typeface;
            TextView textView = (TextView) this.f2303c.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new W(textView, typeface, c0258b0.f2330j));
                } else {
                    textView.setTypeface(typeface, c0258b0.f2330j);
                }
            }
        }
    }
}
