package N0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f527a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f528b;

    /* renamed from: c, reason: collision with root package name */
    public final K f529c;

    public s(Context context, K k2) {
        this.f528b = context.getContentResolver();
        this.f527a = context.getAssets();
        this.f529c = k2;
    }

    public static String b(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            str = str.substring(iLastIndexOf + 1);
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.equals("3ga") ? "audio/3gpp" : lowerCase.equals("js") ? "text/javascript" : MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
    }

    public static int c(Uri uri) {
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("Relative URIs are not supported.");
        }
        String scheme = uri.getScheme();
        if ("content".equalsIgnoreCase(scheme)) {
            return 2;
        }
        if ("android.resource".equalsIgnoreCase(scheme)) {
            return 3;
        }
        if ("file".equalsIgnoreCase(scheme)) {
            return uri.getPath().startsWith("/android_asset/") ? 1 : 0;
        }
        if ("data".equalsIgnoreCase(scheme)) {
            return 4;
        }
        if ("http".equalsIgnoreCase(scheme)) {
            return 5;
        }
        if ("https".equalsIgnoreCase(scheme)) {
            return 6;
        }
        return "cdvplugin".equalsIgnoreCase(scheme) ? 7 : -1;
    }

    public final String a(Uri uri) throws ProtocolException {
        switch (c(uri)) {
            case 0:
            case 1:
                return b(uri.getPath());
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return this.f528b.getType(uri);
            case 4:
                String schemeSpecificPart = uri.getSchemeSpecificPart();
                int iIndexOf = schemeSpecificPart.indexOf(44);
                if (iIndexOf == -1) {
                    return null;
                }
                String[] strArrSplit = schemeSpecificPart.substring(0, iIndexOf).split(";");
                if (strArrSplit.length > 0) {
                    return strArrSplit[0];
                }
                return null;
            case 5:
            case 6:
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
                    httpURLConnection.setDoInput(false);
                    httpURLConnection.setRequestMethod("HEAD");
                    String headerField = httpURLConnection.getHeaderField("Content-Type");
                    return headerField != null ? headerField.split(";")[0] : headerField;
                } catch (IOException unused) {
                }
            default:
                return null;
        }
    }

    public final r d(Uri uri) throws IOException {
        InputStream inputStreamOpen;
        byte[] bytes;
        AssetManager assetManager = this.f527a;
        switch (c(uri)) {
            case 0:
                FileInputStream fileInputStream = new FileInputStream(uri.getPath());
                String strB = b(uri.getPath());
                fileInputStream.getChannel().size();
                return new r(fileInputStream, strB);
            case 1:
                String strSubstring = uri.getPath().substring(15);
                try {
                    AssetFileDescriptor assetFileDescriptorOpenFd = assetManager.openFd(strSubstring);
                    inputStreamOpen = assetFileDescriptorOpenFd.createInputStream();
                    assetFileDescriptorOpenFd.getLength();
                } catch (FileNotFoundException unused) {
                    inputStreamOpen = assetManager.open(strSubstring);
                    inputStreamOpen.available();
                }
                return new r(inputStreamOpen, b(strSubstring));
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ContentResolver contentResolver = this.f528b;
                String type = contentResolver.getType(uri);
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                assetFileDescriptorOpenAssetFileDescriptor.getLength();
                return new r(fileInputStreamCreateInputStream, type);
            case 4:
                String schemeSpecificPart = uri.getSchemeSpecificPart();
                int iIndexOf = schemeSpecificPart.indexOf(44);
                r rVar = null;
                if (iIndexOf != -1) {
                    String[] strArrSplit = schemeSpecificPart.substring(0, iIndexOf).split(";");
                    String str = strArrSplit.length > 0 ? strArrSplit[0] : null;
                    int i2 = 1;
                    boolean z2 = false;
                    while (i2 < strArrSplit.length) {
                        if ("base64".equalsIgnoreCase(strArrSplit[i2])) {
                            z2 = true;
                        }
                        i2++;
                        z2 = z2;
                    }
                    String strSubstring2 = schemeSpecificPart.substring(iIndexOf + 1);
                    if (z2) {
                        bytes = Base64.decode(strSubstring2, 0);
                    } else {
                        try {
                            bytes = strSubstring2.getBytes("UTF-8");
                        } catch (UnsupportedEncodingException unused2) {
                            bytes = strSubstring2.getBytes();
                        }
                    }
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                    int length = bytes.length;
                    rVar = new r(byteArrayInputStream, str);
                }
                if (rVar != null) {
                    return rVar;
                }
                break;
            case 5:
            case 6:
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.setDoInput(true);
                String headerField = httpURLConnection.getHeaderField("Content-Type");
                if (headerField != null) {
                    headerField = headerField.split(";")[0];
                }
                httpURLConnection.getContentLength();
                return new r("gzip".equals(httpURLConnection.getContentEncoding()) ? new GZIPInputStream(httpURLConnection.getInputStream()) : httpURLConnection.getInputStream(), headerField);
            case 7:
                o oVarC = this.f529c.c(uri.getHost());
                if (oVarC != null) {
                    return oVarC.handleOpenForRead(uri);
                }
                throw new FileNotFoundException("Invalid plugin ID in URI: " + uri);
        }
        throw new FileNotFoundException("URI not supported by CordovaResourceApi: " + uri);
    }

    public final Uri e(Uri uri) {
        Uri uriRemapUri;
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("Relative URIs are not supported.");
        }
        K k2 = this.f529c;
        synchronized (k2.f484a) {
            try {
                Iterator it = k2.f484a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        uriRemapUri = null;
                        break;
                    }
                    o oVar = (o) it.next();
                    if (oVar == null || (uriRemapUri = oVar.remapUri(uri)) == null) {
                    }
                }
            } finally {
            }
        }
        return uriRemapUri != null ? uriRemapUri : uri;
    }
}
