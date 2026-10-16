package G;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: G.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e implements InterfaceC0028d, InterfaceC0030f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180a = 0;

    /* renamed from: b, reason: collision with root package name */
    public ClipData f181b;

    /* renamed from: c, reason: collision with root package name */
    public int f182c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f183e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f184f;

    public /* synthetic */ C0029e() {
    }

    @Override // G.InterfaceC0030f
    public ClipData c() {
        return this.f181b;
    }

    @Override // G.InterfaceC0028d
    public C0031g f() {
        return new C0031g(new C0029e(this));
    }

    @Override // G.InterfaceC0030f
    public int i() {
        return this.d;
    }

    @Override // G.InterfaceC0030f
    public ContentInfo n() {
        return null;
    }

    @Override // G.InterfaceC0028d
    public void q(Bundle bundle) {
        this.f184f = bundle;
    }

    @Override // G.InterfaceC0028d
    public void s(Uri uri) {
        this.f183e = uri;
    }

    public String toString() {
        String str;
        switch (this.f180a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f181b.getDescription());
                sb.append(", source=");
                int i2 = this.f182c;
                sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i3 = this.d;
                sb.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
                Uri uri = this.f183e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(this.f184f != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // G.InterfaceC0030f
    public int u() {
        return this.f182c;
    }

    @Override // G.InterfaceC0028d
    public void x(int i2) {
        this.d = i2;
    }

    public C0029e(C0029e c0029e) {
        ClipData clipData = c0029e.f181b;
        clipData.getClass();
        this.f181b = clipData;
        int i2 = c0029e.f182c;
        if (i2 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i2 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f182c = i2;
        int i3 = c0029e.d;
        if ((i3 & 1) == i3) {
            this.d = i3;
            this.f183e = c0029e.f183e;
            this.f184f = c0029e.f184f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
