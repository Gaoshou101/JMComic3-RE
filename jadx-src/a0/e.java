package a0;

import G.C0037m;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.E;
import androidx.lifecycle.G;
import androidx.lifecycle.InterfaceC0076h;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class e extends x0.h implements w0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f742c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, Object obj) {
        super(0);
        this.f742c = i2;
        this.d = obj;
    }

    @Override // w0.a
    public final Object a() {
        O.b cVar;
        switch (this.f742c) {
            case 0:
                Context applicationContext = ((FilesystemPlugin) this.d).getContext().getApplicationContext();
                x0.g.d("getApplicationContext(...)", applicationContext);
                return new g0.k(applicationContext);
            default:
                androidx.activity.o oVar = (androidx.activity.o) this.d;
                ArrayList arrayList = new ArrayList();
                x0.k.f2707a.getClass();
                Class clsA = new x0.d(G.class).a();
                x0.g.c("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", clsA);
                arrayList.add(new O.d(clsA));
                O.d[] dVarArr = (O.d[]) arrayList.toArray(new O.d[0]);
                X.i iVar = new X.i((O.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
                L lC = oVar.c();
                if (oVar instanceof InterfaceC0076h) {
                    androidx.activity.o oVar2 = oVar;
                    cVar = new O.c(O.a.f540b);
                    Application application = oVar2.getApplication();
                    LinkedHashMap linkedHashMap = cVar.f541a;
                    if (application != null) {
                        J j2 = J.f1283a;
                        Application application2 = oVar2.getApplication();
                        x0.g.d("application", application2);
                        linkedHashMap.put(j2, application2);
                    }
                    linkedHashMap.put(E.f1275b, oVar2);
                    linkedHashMap.put(E.f1276c, oVar2);
                    Intent intent = oVar2.getIntent();
                    Bundle extras = intent != null ? intent.getExtras() : null;
                    if (extras != null) {
                        linkedHashMap.put(E.d, extras);
                    }
                } else {
                    cVar = O.a.f540b;
                }
                return (G) new C0037m(lC, (K) iVar, cVar).g("androidx.lifecycle.internal.SavedStateHandlesVM", G.class);
        }
    }
}
