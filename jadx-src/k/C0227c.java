package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.a7m3p9xv.t6qk2z8.app.R;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f1967f;

    /* renamed from: a, reason: collision with root package name */
    public int f1968a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f1969b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f1970c;
    public Configuration d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f1971e;

    public C0227c(Context context, int i2) {
        super(context);
        this.f1968a = i2;
    }

    public final void a(Configuration configuration) {
        if (this.f1971e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f1969b == null) {
            this.f1969b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1969b.setTo(theme);
            }
        }
        this.f1969b.applyStyle(this.f1968a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f1971e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = k.C0227c.f1967f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            k.C0227c.f1967f = r1
        L1c:
            android.content.res.Configuration r1 = k.C0227c.f1967f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f1971e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f1971e = r0
        L38:
            android.content.res.Resources r0 = r3.f1971e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0227c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1970c == null) {
            this.f1970c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1970c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f1969b;
        if (theme != null) {
            return theme;
        }
        if (this.f1968a == 0) {
            this.f1968a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f1969b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        if (this.f1968a != i2) {
            this.f1968a = i2;
            b();
        }
    }
}
