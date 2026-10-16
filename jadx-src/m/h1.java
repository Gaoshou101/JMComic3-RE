package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class h1 implements InterfaceC0284o0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f2354a;

    /* renamed from: b, reason: collision with root package name */
    public int f2355b;

    /* renamed from: c, reason: collision with root package name */
    public View f2356c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2357e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2358f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2359g;
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f2360i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2361j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2362k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2363l;

    /* renamed from: m, reason: collision with root package name */
    public C0275k f2364m;

    /* renamed from: n, reason: collision with root package name */
    public int f2365n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2366o;

    public final void a(int i2) {
        View view;
        int i3 = this.f2355b ^ i2;
        this.f2355b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i4 = this.f2355b & 4;
                Toolbar toolbar = this.f2354a;
                if (i4 != 0) {
                    Drawable drawable = this.f2358f;
                    if (drawable == null) {
                        drawable = this.f2366o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f2354a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.f2360i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f2356c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f2355b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f2361j);
            Toolbar toolbar = this.f2354a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f2365n);
            } else {
                toolbar.setNavigationContentDescription(this.f2361j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f2355b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f2357e) == null) {
            drawable = this.d;
        }
        this.f2354a.setLogo(drawable);
    }
}
