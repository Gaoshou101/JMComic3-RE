package M;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends P0.b {

    /* renamed from: m, reason: collision with root package name */
    public final f f429m;

    public g(TextView textView) {
        this.f429m = new f(textView);
    }

    @Override // P0.b
    public final void A(boolean z2) {
        if (androidx.emoji2.text.j.f1111k != null) {
            this.f429m.A(z2);
        }
    }

    @Override // P0.b
    public final void B(boolean z2) {
        boolean z3 = androidx.emoji2.text.j.f1111k != null;
        f fVar = this.f429m;
        if (z3) {
            fVar.B(z2);
        } else {
            fVar.f428o = z2;
        }
    }

    @Override // P0.b
    public final InputFilter[] o(InputFilter[] inputFilterArr) {
        return !(androidx.emoji2.text.j.f1111k != null) ? inputFilterArr : this.f429m.o(inputFilterArr);
    }
}
