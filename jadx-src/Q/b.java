package Q;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f570a;

    /* renamed from: b, reason: collision with root package name */
    public final f f571b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f572c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f573e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f574f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f575g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, f fVar, String str, File file) {
        this.f570a = executor;
        this.f571b = fVar;
        this.f573e = str;
        this.d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 >= 24 && i2 <= 34) {
            switch (i2) {
                case 24:
                case 25:
                    bArr = g.h;
                    break;
                case 26:
                    bArr = g.f589g;
                    break;
                case 27:
                    bArr = g.f588f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.f587e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = g.d;
                    break;
            }
        }
        this.f572c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f571b.k();
            }
            return null;
        }
    }

    public final void b(int i2, Serializable serializable) {
        this.f570a.execute(new a(this, i2, serializable, 0));
    }
}
