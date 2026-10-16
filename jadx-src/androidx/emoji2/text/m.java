package androidx.emoji2.text;

import a.AbstractC0062a;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m implements i {

    /* renamed from: a, reason: collision with root package name */
    public Context f1123a;

    public static FileInputStream c(String str) {
        return new FileInputStream(new File(str.replace("/_capacitor_file_", "")));
    }

    @Override // androidx.emoji2.text.i
    public void a(AbstractC0062a abstractC0062a) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0068a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new k(this, abstractC0062a, threadPoolExecutor, 0));
    }

    public InputStream b(Uri uri) {
        int port = uri.getPort();
        Integer numValueOf = Integer.valueOf(port);
        String str = uri.getScheme() + "://" + uri.getHost();
        if (port != -1) {
            str = str + ":" + numValueOf;
        }
        try {
            return this.f1123a.getContentResolver().openInputStream(Uri.parse(uri.toString().replace(str + "/_capacitor_content_", "content:/")));
        } catch (SecurityException e2) {
            L.c.p("Unable to open content URL: " + uri, e2);
            return null;
        }
    }
}
