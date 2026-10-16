package k;

import a.AbstractC0062a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import f.AbstractC0113a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import l.n;
import l.q;
import m.AbstractC0286p0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2009e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2010f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2011a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2012b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2013c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f2009e = clsArr;
        f2010f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f2013c = context;
        Object[] objArr = {context};
        this.f2011a = objArr;
        this.f2012b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ?? r4;
        int i2;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType != 3) {
                    z2 = r4;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        z2 = r4;
                        z4 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            gVar.f1987b = 0;
                            gVar.f1988c = 0;
                            gVar.d = 0;
                            gVar.f1989e = 0;
                            gVar.f1990f = r4;
                            gVar.f1991g = r4;
                        } else if (name2.equals("item")) {
                            if (!gVar.h) {
                                q qVar = gVar.f2008z;
                                if (qVar == null || !qVar.f2162b.hasSubMenu()) {
                                    gVar.h = r4;
                                    gVar.b(gVar.f1986a.add(gVar.f1987b, gVar.f1992i, gVar.f1993j, gVar.f1994k));
                                } else {
                                    gVar.h = r4;
                                    gVar.b(gVar.f1986a.addSubMenu(gVar.f1987b, gVar.f1992i, gVar.f1993j, gVar.f1994k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z2 = r4;
                            z3 = z2;
                        }
                        z2 = r4;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = z2;
                i2 = 2;
                z4 = z4;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    h hVar = gVar.f1985E;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = hVar.f2013c.obtainStyledAttributes(attributeSet, AbstractC0113a.f1510p);
                        gVar.f1987b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                        gVar.f1988c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        gVar.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        gVar.f1989e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        gVar.f1990f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                        gVar.f1991g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = hVar.f2013c;
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0113a.f1511q);
                            gVar.f1992i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            gVar.f1993j = (typedArrayObtainStyledAttributes2.getInt(5, gVar.f1988c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                            gVar.f1994k = typedArrayObtainStyledAttributes2.getText(7);
                            gVar.f1995l = typedArrayObtainStyledAttributes2.getText(8);
                            gVar.f1996m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            gVar.f1997n = string == null ? (char) 0 : string.charAt(0);
                            gVar.f1998o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            gVar.f1999p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.f2000q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                gVar.f2001r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f2001r = gVar.f1989e;
                            }
                            gVar.f2002s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            gVar.f2003t = typedArrayObtainStyledAttributes2.getBoolean(4, gVar.f1990f);
                            gVar.f2004u = typedArrayObtainStyledAttributes2.getBoolean(1, gVar.f1991g);
                            gVar.f2005v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            gVar.f2007y = typedArrayObtainStyledAttributes2.getString(12);
                            gVar.f2006w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            gVar.x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && gVar.f2006w == 0 && gVar.x == null) {
                                gVar.f2008z = (q) gVar.a(string3, f2010f, hVar.f2012b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f2008z = null;
                            }
                            gVar.f1981A = typedArrayObtainStyledAttributes2.getText(17);
                            gVar.f1982B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                gVar.f1984D = AbstractC0286p0.b(typedArrayObtainStyledAttributes2.getInt(19, -1), gVar.f1984D);
                            } else {
                                gVar.f1984D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0062a.t(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.f1983C = colorStateList;
                            } else {
                                gVar.f1983C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            gVar.h = false;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            gVar.h = true;
                            SubMenu subMenuAddSubMenu = gVar.f1986a.addSubMenu(gVar.f1987b, gVar.f1992i, gVar.f1993j, gVar.f1994k);
                            gVar.b(subMenuAddSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                        } else {
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = z2;
                        i2 = 2;
                        z4 = z4;
                    }
                }
                z2 = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z2;
            i2 = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof n)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z2 = false;
        try {
            try {
                layout = this.f2013c.getResources().getLayout(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof n) {
                    n nVar = (n) menu;
                    if (!nVar.f2124p) {
                        nVar.w();
                        z2 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z2) {
                    ((n) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((n) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
