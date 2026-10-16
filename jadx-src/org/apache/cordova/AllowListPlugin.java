package org.apache.cordova;

import N0.C0051b;
import N0.C0052c;
import N0.o;
import android.content.Context;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class AllowListPlugin extends o {
    public static final String PLUGIN_NAME = "CordovaAllowListPlugin";

    /* renamed from: b, reason: collision with root package name */
    public C0051b f2521b;

    /* renamed from: c, reason: collision with root package name */
    public C0051b f2522c;
    public C0051b d;

    public AllowListPlugin() {
    }

    public C0051b getAllowedIntents() {
        return this.f2522c;
    }

    public C0051b getAllowedNavigations() {
        return this.f2521b;
    }

    public C0051b getAllowedRequests() {
        return this.d;
    }

    @Override // N0.o
    public void pluginInitialize() throws XmlPullParserException, IOException {
        if (this.f2521b == null) {
            this.f2521b = new C0051b();
            this.f2522c = new C0051b();
            this.d = new C0051b();
            new C0052c(this).c(this.webView.getContext());
        }
    }

    public void setAllowedIntents(C0051b c0051b) {
        this.f2522c = c0051b;
    }

    public void setAllowedNavigations(C0051b c0051b) {
        this.f2521b = c0051b;
    }

    public void setAllowedRequests(C0051b c0051b) {
        this.d = c0051b;
    }

    @Override // N0.o
    public Boolean shouldAllowNavigation(String str) {
        if (this.f2521b.b(str)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // N0.o
    public Boolean shouldAllowRequest(String str) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(shouldAllowNavigation(str)) || this.d.b(str)) {
            return bool;
        }
        return null;
    }

    @Override // N0.o
    public Boolean shouldOpenExternalUrl(String str) {
        if (this.f2522c.b(str)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public AllowListPlugin(C0051b c0051b, C0051b c0051b2, C0051b c0051b3) {
        if (c0051b3 == null) {
            c0051b3 = new C0051b();
            c0051b3.a("file:///*");
            c0051b3.a("data:*");
        }
        this.f2521b = c0051b;
        this.f2522c = c0051b2;
        this.d = c0051b3;
    }

    public AllowListPlugin(Context context) throws XmlPullParserException, IOException {
        this(new C0051b(), new C0051b(), null);
        new C0052c(this).c(context);
    }

    public AllowListPlugin(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this(new C0051b(), new C0051b(), null);
        new C0052c(this).d(xmlPullParser);
    }
}
