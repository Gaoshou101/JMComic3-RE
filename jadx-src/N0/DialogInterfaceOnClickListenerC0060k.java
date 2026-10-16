package N0;

import android.content.DialogInterface;

/* renamed from: N0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0060k implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O0.b f517b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0060k(O0.b bVar, int i2) {
        this.f516a = i2;
        this.f517b = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.f516a) {
            case 0:
                this.f517b.a(null, true);
                break;
            default:
                this.f517b.a(null, false);
                break;
        }
    }
}
