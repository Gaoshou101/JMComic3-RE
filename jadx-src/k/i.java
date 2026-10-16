package k;

import a.AbstractC0062a;
import m.h1;

/* loaded from: classes.dex */
public final class i extends AbstractC0062a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2014c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int f2015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2016f;

    public i(j jVar) {
        this.f2014c = 0;
        this.f2016f = jVar;
        this.d = false;
        this.f2015e = 0;
    }

    @Override // G.P
    public final void a() {
        switch (this.f2014c) {
            case 0:
                int i2 = this.f2015e + 1;
                this.f2015e = i2;
                j jVar = (j) this.f2016f;
                if (i2 == jVar.f2017a.size()) {
                    AbstractC0062a abstractC0062a = jVar.d;
                    if (abstractC0062a != null) {
                        abstractC0062a.a();
                    }
                    this.f2015e = 0;
                    this.d = false;
                    jVar.f2020e = false;
                    break;
                }
                break;
            default:
                if (!this.d) {
                    ((h1) this.f2016f).f2354a.setVisibility(this.f2015e);
                    break;
                }
                break;
        }
    }

    @Override // a.AbstractC0062a, G.P
    public void b() {
        switch (this.f2014c) {
            case 1:
                this.d = true;
                break;
        }
    }

    @Override // a.AbstractC0062a, G.P
    public final void c() {
        switch (this.f2014c) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    AbstractC0062a abstractC0062a = ((j) this.f2016f).d;
                    if (abstractC0062a != null) {
                        abstractC0062a.c();
                        break;
                    }
                }
                break;
            default:
                ((h1) this.f2016f).f2354a.setVisibility(0);
                break;
        }
    }

    public i(h1 h1Var, int i2) {
        this.f2014c = 1;
        this.f2016f = h1Var;
        this.f2015e = i2;
        this.d = false;
    }
}
