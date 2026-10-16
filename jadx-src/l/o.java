package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import g.DialogC0135g;

/* loaded from: classes.dex */
public final class o implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, y {

    /* renamed from: a, reason: collision with root package name */
    public F f2132a;

    /* renamed from: b, reason: collision with root package name */
    public DialogC0135g f2133b;

    /* renamed from: c, reason: collision with root package name */
    public j f2134c;

    @Override // l.y
    public final void b(n nVar, boolean z2) {
        DialogC0135g dialogC0135g;
        if ((z2 || nVar == this.f2132a) && (dialogC0135g = this.f2133b) != null) {
            dialogC0135g.dismiss();
        }
    }

    @Override // l.y
    public final boolean d(n nVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        j jVar = this.f2134c;
        if (jVar.f2104f == null) {
            jVar.f2104f = new i(jVar);
        }
        this.f2132a.q(jVar.f2104f.getItem(i2), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f2134c.b(this.f2132a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        F f2 = this.f2132a;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2133b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2133b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                f2.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return f2.performShortcut(i2, keyEvent, 0);
    }
}
