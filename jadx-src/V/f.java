package v;

import G.InterfaceC0035k;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.B;
import androidx.lifecycle.EnumC0081m;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.z;

/* loaded from: classes.dex */
public abstract class f extends Activity implements r, InterfaceC0035k {

    /* renamed from: a, reason: collision with root package name */
    public final t f2687a = new t(this);

    @Override // G.InterfaceC0035k
    public final boolean b(KeyEvent keyEvent) {
        x0.g.e("event", keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        x0.g.e("event", keyEvent);
        View decorView = getWindow().getDecorView();
        x0.g.d("window.decorView", decorView);
        if (P0.b.i(decorView, keyEvent)) {
            return true;
        }
        return P0.b.j(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        x0.g.e("event", keyEvent);
        View decorView = getWindow().getDecorView();
        x0.g.d("window.decorView", decorView);
        if (P0.b.i(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = B.f1269b;
        z.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        x0.g.e("outState", bundle);
        EnumC0081m enumC0081m = EnumC0081m.d;
        t tVar = this.f2687a;
        tVar.c("setCurrentState");
        tVar.e(enumC0081m);
        super.onSaveInstanceState(bundle);
    }
}
