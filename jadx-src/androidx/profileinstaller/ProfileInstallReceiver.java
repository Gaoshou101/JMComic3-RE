package androidx.profileinstaller;

import Q.e;
import Q.g;
import X.i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            g.s(context, new e(), new i(12, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                i iVar = new i(12, this);
                try {
                    g.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    iVar.g(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e2) {
                    iVar.g(7, e2);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            i iVar2 = new i(12, this);
            if (Build.VERSION.SDK_INT < 24) {
                iVar2.g(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                iVar2.g(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        i iVar3 = new i(12, this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            iVar3.g(16, null);
            return;
        }
        if (g.c(Build.VERSION.SDK_INT >= 24 ? context.createDeviceProtectedStorageContext().getCodeCacheDir() : context.getCodeCacheDir())) {
            iVar3.g(14, null);
        } else {
            iVar3.g(15, null);
        }
    }
}
