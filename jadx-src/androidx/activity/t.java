package androidx.activity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class t extends q {

    /* renamed from: a, reason: collision with root package name */
    public final Field f872a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f873b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f874c;

    public t(Field field, Field field2, Field field3) {
        this.f872a = field;
        this.f873b = field2;
        this.f874c = field3;
    }

    @Override // androidx.activity.q
    public final boolean a(InputMethodManager inputMethodManager) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.f874c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // androidx.activity.q
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.f872a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // androidx.activity.q
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f873b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
