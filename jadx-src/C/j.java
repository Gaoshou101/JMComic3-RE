package C;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f12a;

    public j(Object obj) {
        this.f12a = i.f(obj);
    }

    @Override // C.h
    public final Object a() {
        return this.f12a;
    }

    @Override // C.h
    public final String b() {
        return this.f12a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return this.f12a.equals(((h) obj).a());
    }

    @Override // C.h
    public final Locale get(int i2) {
        return this.f12a.get(i2);
    }

    public final int hashCode() {
        return this.f12a.hashCode();
    }

    @Override // C.h
    public final boolean isEmpty() {
        return this.f12a.isEmpty();
    }

    @Override // C.h
    public final int size() {
        return this.f12a.size();
    }

    public final String toString() {
        return this.f12a.toString();
    }
}
