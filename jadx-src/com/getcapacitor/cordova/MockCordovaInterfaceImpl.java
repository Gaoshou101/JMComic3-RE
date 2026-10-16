package com.getcapacitor.cordova;

import N0.o;
import android.util.Pair;
import g.AbstractActivityC0137i;
import java.util.concurrent.Executors;
import org.apache.cordova.CordovaInterfaceImpl;

/* loaded from: classes.dex */
public class MockCordovaInterfaceImpl extends CordovaInterfaceImpl {
    public MockCordovaInterfaceImpl(AbstractActivityC0137i abstractActivityC0137i) {
        super(abstractActivityC0137i, Executors.newCachedThreadPool());
    }

    public o getActivityResultCallback() {
        return this.f2529f;
    }

    public boolean handlePermissionResult(int i2, String[] strArr, int[] iArr) {
        Pair pairC = this.f2528e.c(i2);
        if (pairC == null) {
            return false;
        }
        ((o) pairC.first).onRequestPermissionResult(((Integer) pairC.second).intValue(), strArr, iArr);
        return true;
    }
}
