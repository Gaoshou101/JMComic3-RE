package M;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends androidx.emoji2.text.g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f430a;

    public h(EditText editText) {
        this.f430a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.g
    public final void a() {
        i.a((EditText) this.f430a.get(), 1);
    }
}
