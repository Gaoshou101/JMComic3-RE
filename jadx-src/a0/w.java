package a0;

import G.C0037m;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.getcapacitor.C0101f;
import com.getcapacitor.E;
import m0.C0306a;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f801a;

    public w(Context context) {
        this.f801a = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r0.equals("LIBRARY") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
    
        if (r0.equals("DATA") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
    
        r0 = r14.getFilesDir();
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.getcapacitor.w a(a0.w r21, java.lang.String r22, com.getcapacitor.E r23, com.getcapacitor.C0101f r24, a0.d r25) throws org.json.JSONException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.w.a(a0.w, java.lang.String, com.getcapacitor.E, com.getcapacitor.f, a0.d):com.getcapacitor.w");
    }

    public final void b(E e2, C0101f c0101f, d dVar, C0037m c0037m) {
        x0.g.e("call", e2);
        x0.g.e("bridge", c0101f);
        new C0306a(new v(this, e2.e("url", ""), e2, c0101f, dVar, new Handler(Looper.getMainLooper()), c0037m)).start();
    }
}
