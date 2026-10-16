package D;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentProviderClient f22b;

    public e(Context context, Uri uri, int i2) {
        this.f21a = i2;
        switch (i2) {
            case 1:
                this.f22b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.f22b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    public final void a() {
        switch (this.f21a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f22b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    break;
                }
                break;
            default:
                ContentProviderClient contentProviderClient2 = this.f22b;
                if (contentProviderClient2 != null) {
                    contentProviderClient2.release();
                    break;
                }
                break;
        }
    }
}
