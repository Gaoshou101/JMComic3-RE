package C;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final Locale[] f9c = new Locale[0];

    /* renamed from: a, reason: collision with root package name */
    public final Locale[] f10a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public g(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f10a = f9c;
            this.f11b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < localeArr.length; i2++) {
            Locale locale = localeArr[i2];
            if (locale == null) {
                throw new NullPointerException("list[" + i2 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i2 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f10a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f11b = sb.toString();
    }

    @Override // C.h
    public final Object a() {
        return null;
    }

    @Override // C.h
    public final String b() {
        return this.f11b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Locale[] localeArr = ((g) obj).f10a;
        Locale[] localeArr2 = this.f10a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < localeArr2.length; i2++) {
            if (!localeArr2[i2].equals(localeArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // C.h
    public final Locale get(int i2) {
        if (i2 >= 0) {
            Locale[] localeArr = this.f10a;
            if (i2 < localeArr.length) {
                return localeArr[i2];
            }
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f10a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // C.h
    public final boolean isEmpty() {
        return this.f10a.length == 0;
    }

    @Override // C.h
    public final int size() {
        return this.f10a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f10a;
            if (i2 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i2]);
            if (i2 < localeArr.length - 1) {
                sb.append(',');
            }
            i2++;
        }
    }
}
