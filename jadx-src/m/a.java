package M;

import android.text.Editable;
import androidx.emoji2.text.w;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f415a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f416b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f417c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f417c;
        return cls != null ? new w(cls, charSequence) : super.newEditable(charSequence);
    }
}
