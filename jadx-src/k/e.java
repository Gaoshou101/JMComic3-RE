package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.MenuC0238C;

/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1976a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0225a f1977b;

    public e(Context context, AbstractC0225a abstractC0225a) {
        this.f1976a = context;
        this.f1977b = abstractC0225a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f1977b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f1977b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0238C(this.f1976a, this.f1977b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f1977b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f1977b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f1977b.f1965a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f1977b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f1977b.f1966b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f1977b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f1977b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f1977b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f1977b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f1977b.f1965a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f1977b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f1977b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i2) {
        this.f1977b.k(i2);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i2) {
        this.f1977b.n(i2);
    }
}
