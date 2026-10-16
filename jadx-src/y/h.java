package y;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f2730a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f2731b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2732c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f2730a = colorStateList;
        this.f2731b = configuration;
        this.f2732c = theme == null ? 0 : theme.hashCode();
    }
}
