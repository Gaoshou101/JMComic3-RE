package N0;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: N0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0061l implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditText f518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X.i f519b;

    public DialogInterfaceOnClickListenerC0061l(EditText editText, X.i iVar) {
        this.f518a = editText;
        this.f519b = iVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f519b.F(this.f518a.getText().toString(), true);
    }
}
