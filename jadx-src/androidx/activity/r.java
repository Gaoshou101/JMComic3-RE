package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class r extends x0.h implements w0.a {

    /* renamed from: c, reason: collision with root package name */
    public static final r f870c = new r(0);

    @Override // w0.a
    public final Object a() throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new t(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return s.f871a;
        }
    }
}
