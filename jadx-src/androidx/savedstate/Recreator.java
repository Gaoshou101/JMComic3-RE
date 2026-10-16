package androidx.savedstate;

import R.b;
import R.d;
import R.f;
import android.os.Bundle;
import androidx.lifecycle.EnumC0080l;
import androidx.lifecycle.EnumC0081m;
import androidx.lifecycle.I;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import x0.g;

/* loaded from: classes.dex */
public final class Recreator implements p {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1324b;

    public Recreator(f fVar) {
        this.f1324b = fVar;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [R.f, androidx.lifecycle.r, java.lang.Object] */
    @Override // androidx.lifecycle.p
    public final void b(r rVar, EnumC0080l enumC0080l) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj;
        if (enumC0080l != EnumC0080l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        rVar.d().f(this);
        ?? r8 = this.f1324b;
        Bundle bundleC = r8.a().c("androidx.savedstate.Restarter");
        if (bundleC == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleC.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(b.class);
                g.d("{\n                Class.…class.java)\n            }", clsAsSubclass);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        g.d("{\n                constr…wInstance()\n            }", objNewInstance);
                        if (!(r8 instanceof M)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        L lC = ((M) r8).c();
                        final d dVarA = r8.a();
                        LinkedHashMap linkedHashMap = lC.f1285a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            g.e("key", str2);
                            I i2 = (I) linkedHashMap.get(str2);
                            g.b(i2);
                            final t tVarD = r8.d();
                            g.e("registry", dVarA);
                            g.e("lifecycle", tVarD);
                            HashMap map = i2.f1281a;
                            if (map == null) {
                                obj = null;
                            } else {
                                synchronized (map) {
                                    obj = i2.f1281a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !savedStateHandleController.f1291b) {
                                savedStateHandleController.getClass();
                                g.e("registry", dVarA);
                                g.e("lifecycle", tVarD);
                                if (savedStateHandleController.f1291b) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f1291b = true;
                                tVarD.a(savedStateHandleController);
                                dVarA.e(null, null);
                                EnumC0081m enumC0081m = tVarD.f1311c;
                                if (enumC0081m == EnumC0081m.f1302c || enumC0081m.compareTo(EnumC0081m.f1303e) >= 0) {
                                    dVarA.f();
                                } else {
                                    tVarD.a(new p() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                                        @Override // androidx.lifecycle.p
                                        public final void b(r rVar2, EnumC0080l enumC0080l2) throws NoSuchMethodException, SecurityException {
                                            if (enumC0080l2 == EnumC0080l.ON_START) {
                                                tVarD.f(this);
                                                dVarA.f();
                                            }
                                        }
                                    });
                                }
                            }
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            dVarA.f();
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException("Failed to instantiate " + str, e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(Q.d.a("Class ", str, " wasn't found"), e4);
            }
        }
    }
}
