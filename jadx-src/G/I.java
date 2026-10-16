package G;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class I {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0031g b(View view, C0031g c0031g) {
        ContentInfo contentInfoN = c0031g.f187a.n();
        Objects.requireNonNull(contentInfoN);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoN);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoN ? c0031g : new C0031g(new X.i(contentInfoPerformReceiveContent));
    }
}
