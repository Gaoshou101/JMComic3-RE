package N0;

import android.content.DialogInterface;

/* renamed from: N0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0057h implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f511b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0057h(int i2, Object obj) {
        this.f510a = i2;
        this.f511b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.f510a) {
            case 0:
                ((O0.b) this.f511b).a(null, true);
                break;
            default:
                ((X.i) this.f511b).F(null, false);
                break;
        }
    }
}
