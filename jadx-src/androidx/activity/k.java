package androidx.activity;

import a.AbstractC0062a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import androidx.lifecycle.EnumC0080l;
import g.DialogC0135g;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import m.V;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import v.AbstractC0340c;
import v.C0339b;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f840c;

    public /* synthetic */ k(int i2, Object obj) {
        this.f839b = i2;
        this.f840c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f839b) {
            case 0:
                l lVar = (l) this.f840c;
                x0.g.e("this$0", lVar);
                Runnable runnable = lVar.f842c;
                if (runnable != null) {
                    runnable.run();
                    lVar.f842c = null;
                    return;
                }
                return;
            case 1:
                DialogC0135g.b((DialogC0135g) this.f840c);
                return;
            case 2:
                androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.f840c;
                synchronized (rVar.d) {
                    try {
                        if (rVar.h == null) {
                            return;
                        }
                        try {
                            D.n nVarD = rVar.d();
                            int i2 = nVarD.f48e;
                            if (i2 == 2) {
                                synchronized (rVar.d) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = C.k.f13a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                L.c cVar = rVar.f1131c;
                                Context context = rVar.f1129a;
                                cVar.getClass();
                                D.n[] nVarArr = {nVarD};
                                w.d dVar = z.g.f2755a;
                                AbstractC0062a.e("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceC = z.g.f2755a.c(context, nVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferI = z.f.i(rVar.f1129a, nVarD.f45a);
                                    if (mappedByteBufferI == null || typefaceC == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        androidx.emoji2.text.u uVar = new androidx.emoji2.text.u(typefaceC, AbstractC0062a.N(mappedByteBufferI));
                                        Trace.endSection();
                                        synchronized (rVar.d) {
                                            try {
                                                AbstractC0062a abstractC0062a = rVar.h;
                                                if (abstractC0062a != null) {
                                                    abstractC0062a.J(uVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        rVar.b();
                                        return;
                                    } finally {
                                        int i4 = C.k.f13a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (rVar.d) {
                                try {
                                    AbstractC0062a abstractC0062a2 = rVar.h;
                                    if (abstractC0062a2 != null) {
                                        abstractC0062a2.I(th);
                                    }
                                    rVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                Iterator it = ((androidx.fragment.app.q) this.f840c).f1224m.iterator();
                if (it.hasNext()) {
                    throw androidx.fragment.app.x.a(it);
                }
                return;
            case 4:
                androidx.lifecycle.y yVar = (androidx.lifecycle.y) this.f840c;
                x0.g.e("this$0", yVar);
                int i5 = yVar.f1319b;
                androidx.lifecycle.t tVar = yVar.f1322f;
                if (i5 == 0) {
                    yVar.f1320c = true;
                    tVar.d(EnumC0080l.ON_PAUSE);
                }
                if (yVar.f1318a == 0 && yVar.f1320c) {
                    tVar.d(EnumC0080l.ON_STOP);
                    yVar.d = true;
                    return;
                }
                return;
            case 5:
                Activity activity = (Activity) this.f840c;
                if (activity.isFinishing()) {
                    return;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    Class cls = AbstractC0340c.f2680a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0340c.f2680a;
                boolean z2 = i6 == 26 || i6 == 27;
                Method method = AbstractC0340c.f2684f;
                if ((!z2 || method != null) && (AbstractC0340c.f2683e != null || AbstractC0340c.d != null)) {
                    try {
                        Object obj2 = AbstractC0340c.f2682c.get(activity);
                        if (obj2 != null && (obj = AbstractC0340c.f2681b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0339b c0339b = new C0339b(activity);
                            application.registerActivityLifecycleCallbacks(c0339b);
                            Handler handler = AbstractC0340c.f2685g;
                            handler.post(new D.a(c0339b, 7, obj2));
                            try {
                                if (i6 == 26 || i6 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new D.a(application, 8, c0339b));
                                return;
                            } catch (Throwable th2) {
                                handler.post(new D.a(application, 8, c0339b));
                                throw th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            default:
                ((V) this.f840c).getClass();
                return;
        }
    }
}
