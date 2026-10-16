package K0;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class u implements androidx.emoji2.text.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f406a;

    /* renamed from: b, reason: collision with root package name */
    public final String f407b;

    public /* synthetic */ u(String str, int i2) {
        this.f406a = i2;
        this.f407b = str;
    }

    @Override // androidx.emoji2.text.p
    public boolean b(CharSequence charSequence, int i2, int i3, androidx.emoji2.text.x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i2, i3), this.f407b)) {
            return true;
        }
        xVar.f1149c = (xVar.f1149c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f406a) {
            case 0:
                return "<" + this.f407b + '>';
            default:
                return super.toString();
        }
    }

    @Override // androidx.emoji2.text.p
    public Object a() {
        return this;
    }
}
