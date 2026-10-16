package k;

import G.O;
import a.AbstractC0062a;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f2019c;
    public AbstractC0062a d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2020e;

    /* renamed from: b, reason: collision with root package name */
    public long f2018b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f2021f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2017a = new ArrayList();

    public final void a() {
        if (this.f2020e) {
            Iterator it = this.f2017a.iterator();
            while (it.hasNext()) {
                ((O) it.next()).b();
            }
            this.f2020e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f2020e) {
            return;
        }
        Iterator it = this.f2017a.iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            long j2 = this.f2018b;
            if (j2 >= 0) {
                o2.c(j2);
            }
            BaseInterpolator baseInterpolator = this.f2019c;
            if (baseInterpolator != null && (view = (View) o2.f154a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.d != null) {
                o2.d(this.f2021f);
            }
            View view2 = (View) o2.f154a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2020e = true;
    }
}
