package com.getcapacitor;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class N extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final M f1383b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f1384c = null;
    public final WebResourceRequest d;

    public N(M m2, WebResourceRequest webResourceRequest) {
        this.f1383b = m2;
        this.d = webResourceRequest;
    }

    public final InputStream a() throws IOException {
        InputStream inputStreamOpen;
        if (this.f1384c == null) {
            M m2 = this.f1383b;
            m2.getClass();
            Uri url = this.d.getUrl();
            String path = url.getPath();
            O o2 = m2.f1382c;
            o2.h.getClass();
            try {
                boolean zStartsWith = path.startsWith("/_capacitor_content_");
                androidx.emoji2.text.m mVar = o2.f1387c;
                if (zStartsWith) {
                    inputStreamOpen = mVar.b(url);
                } else if (path.startsWith("/_capacitor_file_")) {
                    mVar.getClass();
                    inputStreamOpen = androidx.emoji2.text.m.c(path);
                } else if (o2.f1388e) {
                    inputStreamOpen = mVar.f1123a.getAssets().open(m2.f1381b + path, 2);
                } else {
                    String str = o2.f1385a + url.getPath();
                    mVar.getClass();
                    inputStreamOpen = androidx.emoji2.text.m.c(str);
                }
            } catch (IOException unused) {
                L.c.o("Unable to open asset URL: " + url);
                inputStreamOpen = null;
            }
            this.f1384c = inputStreamOpen;
        }
        return this.f1384c;
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStreamA = a();
        if (inputStreamA != null) {
            return inputStreamA.available();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        InputStream inputStreamA = a();
        if (inputStreamA != null) {
            return inputStreamA.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final long skip(long j2) throws IOException {
        InputStream inputStreamA = a();
        if (inputStreamA != null) {
            return inputStreamA.skip(j2);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        InputStream inputStreamA = a();
        if (inputStreamA != null) {
            return inputStreamA.read(bArr);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        InputStream inputStreamA = a();
        if (inputStreamA != null) {
            return inputStreamA.read(bArr, i2, i3);
        }
        return -1;
    }
}
