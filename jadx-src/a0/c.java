package a0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f737a = new b(b(7), "Unable to do file operation, user denied permission request.");

    /* renamed from: b, reason: collision with root package name */
    public static final b f738b = new b(b(11), "Missing parent directory – possibly recursive=false was passed or parent directory creation failed.");

    /* renamed from: c, reason: collision with root package name */
    public static final b f739c = new b(b(12), "Cannot delete directory with children; received recursive=false but directory has contents.");

    public static b a(String str) {
        x0.g.e("path", str);
        return new b(b(10), Q.d.a("Directory ", !E0.l.Q(str) ? Q.d.a("at '", str, "' ") : "", "already exists, cannot be overwritten."));
    }

    public static String b(int i2) {
        CharSequence charSequenceSubSequence;
        String strValueOf = String.valueOf(i2);
        x0.g.e("<this>", strValueOf);
        if (4 <= strValueOf.length()) {
            charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
        } else {
            StringBuilder sb = new StringBuilder(4);
            int length = 4 - strValueOf.length();
            int i3 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            sb.append((CharSequence) strValueOf);
            charSequenceSubSequence = sb;
        }
        return "OS-PLUG-FILE-" + charSequenceSubSequence.toString();
    }

    public static b c(String str) {
        x0.g.e("methodName", str);
        return new b(b(5), Q.d.a("The '", str, "' input parameters aren't valid."));
    }

    public static b d(String str, String str2) {
        x0.g.e("methodName", str);
        return new b(b(9), "'" + str + "' not supported for " + str2 + ".");
    }

    public static b e(String str, String str2) {
        x0.g.e("methodName", str);
        return new b(b(13), "'" + str + "' failed with" + (!E0.l.Q(str2) ? ": ".concat(str2) : "an unknown error."));
    }
}
