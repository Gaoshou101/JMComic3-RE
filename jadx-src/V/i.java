package v;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManager f2689a;

    static {
        new HashSet();
    }

    public i(Context context) {
        this.f2689a = (NotificationManager) context.getSystemService("notification");
    }
}
