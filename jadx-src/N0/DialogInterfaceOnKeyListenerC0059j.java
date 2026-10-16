package N0;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: N0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0059j implements DialogInterface.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f515b;

    public /* synthetic */ DialogInterfaceOnKeyListenerC0059j(int i2, Object obj) {
        this.f514a = i2;
        this.f515b = obj;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        switch (this.f514a) {
            case 0:
                if (i2 == 4) {
                    ((O0.b) this.f515b).a(null, true);
                    break;
                }
                break;
            default:
                if (i2 == 4) {
                    ((O0.b) this.f515b).a(null, false);
                    break;
                }
                break;
        }
        return false;
    }
}
