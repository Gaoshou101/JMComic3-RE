package N0;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.cordova.AllowListPlugin;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: N0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0054e {

    /* renamed from: a, reason: collision with root package name */
    public final q f501a = new q();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f502b = new ArrayList(20);

    /* renamed from: c, reason: collision with root package name */
    public boolean f503c = false;
    public String d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f504e = "";

    /* renamed from: f, reason: collision with root package name */
    public String f505f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f506g = false;

    public void a(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getName().equals("feature")) {
            this.f502b.add(new I(this.d, this.f504e, this.f506g));
            this.d = "";
            this.f504e = "";
            this.f503c = false;
            this.f506g = false;
        }
    }

    public void b(XmlPullParser xmlPullParser) {
        String name = xmlPullParser.getName();
        if (name.equals("feature")) {
            this.f503c = true;
            this.d = xmlPullParser.getAttributeValue(null, "name");
            return;
        }
        if (!this.f503c || !name.equals("param")) {
            if (!name.equals("preference")) {
                if (name.equals("content")) {
                    xmlPullParser.getAttributeValue(null, "src");
                    return;
                }
                return;
            } else {
                String attributeValue = xmlPullParser.getAttributeValue(null, "name");
                Locale locale = Locale.ENGLISH;
                String lowerCase = attributeValue.toLowerCase(locale);
                this.f501a.f524a.put(lowerCase.toLowerCase(locale), xmlPullParser.getAttributeValue(null, "value"));
                return;
            }
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "name");
        this.f505f = attributeValue2;
        if (attributeValue2.equals("service")) {
            this.d = xmlPullParser.getAttributeValue(null, "value");
            return;
        }
        if (this.f505f.equals("package") || this.f505f.equals("android-package")) {
            this.f504e = xmlPullParser.getAttributeValue(null, "value");
        } else if (this.f505f.equals("onload")) {
            this.f506g = "true".equals(xmlPullParser.getAttributeValue(null, "value"));
        }
    }

    public final void c(Context context) throws XmlPullParserException, IOException {
        int identifier = context.getResources().getIdentifier("config", "xml", context.getClass().getPackage().getName());
        if (identifier == 0 && (identifier = context.getResources().getIdentifier("config", "xml", context.getPackageName())) == 0) {
            Log.e("ConfigXmlParser", "res/xml/config.xml is missing!");
        } else {
            this.f502b.add(new I(AllowListPlugin.PLUGIN_NAME, "org.apache.cordova.AllowListPlugin", true));
            d(context.getResources().getXml(identifier));
        }
    }

    public final void d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = -1;
        while (next != 1) {
            if (next == 2) {
                b(xmlPullParser);
            } else if (next == 3) {
                a(xmlPullParser);
            }
            try {
                next = xmlPullParser.next();
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (XmlPullParserException e3) {
                e3.printStackTrace();
            }
        }
    }
}
