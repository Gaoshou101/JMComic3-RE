package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0131c;
import g.DialogC0135g;

/* loaded from: classes.dex */
public final class L implements S, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogC0135g f2259a;

    /* renamed from: b, reason: collision with root package name */
    public M f2260b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2261c;
    public final /* synthetic */ T d;

    public L(T t2) {
        this.d = t2;
    }

    @Override // m.S
    public final boolean a() {
        DialogC0135g dialogC0135g = this.f2259a;
        if (dialogC0135g != null) {
            return dialogC0135g.isShowing();
        }
        return false;
    }

    @Override // m.S
    public final void b(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // m.S
    public final int c() {
        return 0;
    }

    @Override // m.S
    public final void d(int i2, int i3) {
        if (this.f2260b == null) {
            return;
        }
        T t2 = this.d;
        D.m mVar = new D.m(t2.getPopupContext());
        CharSequence charSequence = this.f2261c;
        C0131c c0131c = (C0131c) mVar.f44b;
        if (charSequence != null) {
            c0131c.d = charSequence;
        }
        M m2 = this.f2260b;
        int selectedItemPosition = t2.getSelectedItemPosition();
        c0131c.f1629g = m2;
        c0131c.h = this;
        c0131c.f1631j = selectedItemPosition;
        c0131c.f1630i = true;
        DialogC0135g dialogC0135gB = mVar.b();
        this.f2259a = dialogC0135gB;
        AlertController$RecycleListView alertController$RecycleListView = dialogC0135gB.f1658f.f1636e;
        alertController$RecycleListView.setTextDirection(i2);
        alertController$RecycleListView.setTextAlignment(i3);
        this.f2259a.show();
    }

    @Override // m.S
    public final void dismiss() {
        DialogC0135g dialogC0135g = this.f2259a;
        if (dialogC0135g != null) {
            dialogC0135g.dismiss();
            this.f2259a = null;
        }
    }

    @Override // m.S
    public final int g() {
        return 0;
    }

    @Override // m.S
    public final Drawable h() {
        return null;
    }

    @Override // m.S
    public final CharSequence i() {
        return this.f2261c;
    }

    @Override // m.S
    public final void k(CharSequence charSequence) {
        this.f2261c = charSequence;
    }

    @Override // m.S
    public final void l(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // m.S
    public final void m(int i2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.S
    public final void n(ListAdapter listAdapter) {
        this.f2260b = (M) listAdapter;
    }

    @Override // m.S
    public final void o(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        T t2 = this.d;
        t2.setSelection(i2);
        if (t2.getOnItemClickListener() != null) {
            t2.performItemClick(null, i2, this.f2260b.getItemId(i2));
        }
        dismiss();
    }
}
