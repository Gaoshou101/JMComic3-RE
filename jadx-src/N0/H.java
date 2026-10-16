package N0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public boolean f476a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f477b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f478c = new ArrayList();
    public E d;

    public static void c(F f2, StringBuilder sb) {
        sb.append(f2.b());
        sb.append(' ');
        String str = f2.f474a;
        L l2 = f2.f475b;
        if (l2 == null) {
            sb.append('J');
            sb.append(str);
            return;
        }
        int i2 = l2.f489a;
        boolean z2 = i2 == 0;
        boolean z3 = i2 == 1;
        boolean z4 = l2.f491c;
        sb.append((z2 || z3) ? 'S' : 'F');
        sb.append(z4 ? '1' : '0');
        sb.append(i2);
        sb.append(' ');
        sb.append(str);
        sb.append(' ');
        F.e(sb, l2);
    }

    public final void a(L l2, String str) {
        if (str == null) {
            Log.e("JsMessageQueue", "Got plugin result with no callbackId", new Throwable());
            return;
        }
        boolean z2 = l2.f489a == 0;
        boolean z3 = l2.f491c;
        if (z2 && z3) {
            return;
        }
        b(new F(l2, str));
    }

    public final void b(F f2) {
        synchronized (this) {
            try {
                if (this.d == null) {
                    return;
                }
                this.f477b.add(f2);
                if (!this.f476a) {
                    this.d.onNativeToJsMessageAvailable(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String d(boolean z2) {
        synchronized (this) {
            try {
                E e2 = this.d;
                if (e2 == null) {
                    return null;
                }
                e2.notifyOfFlush(this, z2);
                if (this.f477b.isEmpty()) {
                    return null;
                }
                Iterator it = this.f477b.iterator();
                int i2 = 0;
                int i3 = 0;
                while (it.hasNext()) {
                    int iB = ((F) it.next()).b();
                    int length = String.valueOf(iB).length() + iB + 1;
                    if (i2 > 0 && i3 + length > 16777216) {
                        break;
                    }
                    i3 += length;
                    i2++;
                }
                StringBuilder sb = new StringBuilder(i3);
                for (int i4 = 0; i4 < i2; i4++) {
                    c((F) this.f477b.removeFirst(), sb);
                }
                if (!this.f477b.isEmpty()) {
                    sb.append('*');
                }
                return sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e() {
        synchronized (this) {
            try {
                if (this.f477b.size() == 0) {
                    return null;
                }
                Iterator it = this.f477b.iterator();
                int i2 = 0;
                int i3 = 0;
                while (it.hasNext()) {
                    int iB = ((F) it.next()).b() + 50;
                    if (i2 > 0 && i3 + iB > 16777216) {
                        break;
                    }
                    i3 += iB;
                    i2++;
                }
                int i4 = i2 == this.f477b.size() ? 1 : 0;
                StringBuilder sb = new StringBuilder(i3 + (i4 != 0 ? 0 : 100));
                for (int i5 = 0; i5 < i2; i5++) {
                    F f2 = (F) this.f477b.removeFirst();
                    if (i4 == 0 || i5 + 1 != i2) {
                        sb.append("try{");
                        f2.d(sb);
                        sb.append("}finally{");
                    } else {
                        f2.d(sb);
                    }
                }
                if (i4 == 0) {
                    sb.append("window.setTimeout(function(){cordova.require('cordova/plugin/android/polling').pollOnce();},0);");
                }
                while (i4 < i2) {
                    sb.append('}');
                    i4++;
                }
                return sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(int i2) {
        if (i2 < -1 || i2 >= this.f478c.size()) {
            return;
        }
        E e2 = i2 < 0 ? null : (E) this.f478c.get(i2);
        if (e2 != this.d) {
            synchronized (this) {
                try {
                    this.d = e2;
                    if (e2 != null) {
                        e2.reset();
                        if (!this.f476a && !this.f477b.isEmpty()) {
                            e2.onNativeToJsMessageAvailable(this);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void g(boolean z2) {
        E e2;
        if (this.f476a && z2) {
            Log.e("JsMessageQueue", "nested call to setPaused detected.", new Throwable());
        }
        this.f476a = z2;
        if (z2) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f477b.isEmpty() && (e2 = this.d) != null) {
                    e2.onNativeToJsMessageAvailable(this);
                }
            } finally {
            }
        }
    }
}
