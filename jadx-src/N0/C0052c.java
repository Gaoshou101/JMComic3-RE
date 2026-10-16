package N0;

import java.util.HashMap;
import org.apache.cordova.AllowListPlugin;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: N0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052c extends C0054e {
    public final /* synthetic */ AllowListPlugin h;

    public C0052c(AllowListPlugin allowListPlugin) {
        this.h = allowListPlugin;
        new HashMap(20);
    }

    @Override // N0.C0054e
    public final void b(XmlPullParser xmlPullParser) {
        String attributeValue;
        String name = xmlPullParser.getName();
        boolean zEquals = name.equals("content");
        AllowListPlugin allowListPlugin = this.h;
        if (zEquals) {
            allowListPlugin.f2521b.a(xmlPullParser.getAttributeValue(null, "src"));
            return;
        }
        if (name.equals("allow-navigation")) {
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "href");
            if (!"*".equals(attributeValue2)) {
                allowListPlugin.f2521b.a(attributeValue2);
                return;
            }
            allowListPlugin.f2521b.a("http://*/*");
            allowListPlugin.f2521b.a("https://*/*");
            allowListPlugin.f2521b.a("data:*");
            return;
        }
        if (name.equals("allow-intent")) {
            allowListPlugin.f2522c.a(xmlPullParser.getAttributeValue(null, "href"));
            return;
        }
        if (!name.equals("access") || (attributeValue = xmlPullParser.getAttributeValue(null, "origin")) == null) {
            return;
        }
        if ("*".equals(attributeValue)) {
            allowListPlugin.d.a("http://*/*");
            allowListPlugin.d.a("https://*/*");
            return;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "subdomains");
        C0051b c0051b = allowListPlugin.d;
        if (attributeValue3 != null) {
            attributeValue3.compareToIgnoreCase("true");
        }
        c0051b.a(attributeValue);
    }

    @Override // N0.C0054e
    public final void a(XmlPullParser xmlPullParser) {
    }
}
