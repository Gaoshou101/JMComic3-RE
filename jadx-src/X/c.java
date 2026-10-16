package X;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f707c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f708a;

    /* renamed from: b, reason: collision with root package name */
    public final String f709b;

    public c(String str, String str2) {
        this.f708a = str;
        this.f709b = str2;
        f707c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f706a;
        String str = this.f709b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ((!"eng".equals(str2) && !"userdebug".equals(str2)) || !hashSet.contains(str.concat(":dev"))) {
                return false;
            }
        }
        return true;
    }
}
