package E0;

import a.AbstractC0062a;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class l extends i {
    public static boolean K(CharSequence charSequence, String str) {
        return O(0, 2, charSequence, str, false) >= 0;
    }

    public static final int L(CharSequence charSequence) {
        x0.g.e("<this>", charSequence);
        return charSequence.length() - 1;
    }

    public static final int M(CharSequence charSequence, String str, int i2, boolean z2) {
        x0.g.e("<this>", charSequence);
        x0.g.e("string", str);
        return (z2 || !(charSequence instanceof String)) ? N(charSequence, str, i2, charSequence.length(), z2, false) : ((String) charSequence).indexOf(str, i2);
    }

    public static final int N(CharSequence charSequence, String str, int i2, int i3, boolean z2, boolean z3) {
        B0.a aVar;
        if (z3) {
            int iL = L(charSequence);
            if (i2 > iL) {
                i2 = iL;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            aVar = new B0.a(i2, i3, -1);
        } else {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i3 > length) {
                i3 = length;
            }
            aVar = new B0.c(i2, i3, 1);
        }
        boolean z4 = charSequence instanceof String;
        int i4 = aVar.d;
        int i5 = aVar.f1c;
        int i6 = aVar.f0b;
        if (z4 && (str instanceof String)) {
            if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
                while (!S(0, i6, str.length(), str, (String) charSequence, z2)) {
                    if (i6 != i5) {
                        i6 += i4;
                    }
                }
                return i6;
            }
        } else if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
            while (!T(i6, str.length(), charSequence, str, z2)) {
                if (i6 != i5) {
                    i6 += i4;
                }
            }
            return i6;
        }
        return -1;
    }

    public static /* synthetic */ int O(int i2, int i3, CharSequence charSequence, String str, boolean z2) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return M(charSequence, str, i2, z2);
    }

    public static int P(String str, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return str.indexOf(c2, i2);
    }

    public static boolean Q(String str) {
        x0.g.e("<this>", str);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static int R(CharSequence charSequence) {
        int iL = L(charSequence);
        x0.g.e("<this>", charSequence);
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(46, iL);
        }
        char[] cArr = {'.'};
        if (charSequence instanceof String) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length == 1) {
                return ((String) charSequence).lastIndexOf(cArr[0], iL);
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        int iL2 = L(charSequence);
        if (iL > iL2) {
            iL = iL2;
        }
        while (-1 < iL) {
            if (AbstractC0062a.o(cArr[0], charSequence.charAt(iL), false)) {
                return iL;
            }
            iL--;
        }
        return -1;
    }

    public static final boolean S(int i2, int i3, int i4, String str, String str2, boolean z2) {
        x0.g.e("<this>", str);
        x0.g.e("other", str2);
        return !z2 ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z2, i2, str2, i3, i4);
    }

    public static final boolean T(int i2, int i3, CharSequence charSequence, String str, boolean z2) {
        x0.g.e("<this>", str);
        x0.g.e("other", charSequence);
        if (i2 < 0 || str.length() - i3 < 0 || i2 > charSequence.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC0062a.o(str.charAt(i4), charSequence.charAt(i2 + i4), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String U(String str, String str2) {
        x0.g.e("delimiter", str2);
        int iO = O(0, 6, str, str2, false);
        if (iO == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iO, str.length());
        x0.g.d("substring(...)", strSubstring);
        return strSubstring;
    }

    public static String V(String str, String str2) {
        x0.g.e("<this>", str);
        x0.g.e("missingDelimiterValue", str2);
        int iR = R(str);
        if (iR == -1) {
            return str2;
        }
        String strSubstring = str.substring(iR + 1, str.length());
        x0.g.d("substring(...)", strSubstring);
        return strSubstring;
    }

    public static Long W(String str) {
        boolean z2;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        long j2 = -9223372036854775807L;
        if (cCharAt < '0') {
            z2 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j2 = Long.MIN_VALUE;
                i2 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z2 = false;
                i2 = 1;
            }
        } else {
            z2 = false;
        }
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 != -256204778801521550L) {
                    return null;
                }
                j4 = j2 / 10;
                if (j3 < j4) {
                    return null;
                }
            }
            long j5 = j3 * 10;
            long j6 = iDigit;
            if (j5 < j2 + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
        }
        return z2 ? Long.valueOf(j3) : Long.valueOf(-j3);
    }
}
