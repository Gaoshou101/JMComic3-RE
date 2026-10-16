package N0;

import android.content.DialogInterface;

/* renamed from: N0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0058i implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f513b;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0058i(int i2, Object obj) {
        this.f512a = i2;
        this.f513b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f512a) {
            case 0:
                ((O0.b) this.f513b).a(null, false);
                break;
            default:
                ((O0.b) this.f513b).a(null, false);
                break;
        }
    }
}
