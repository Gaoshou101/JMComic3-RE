package N0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.webkit.WebSettings;
import g.AbstractC0152x;
import org.apache.cordova.CoreAndroid;

/* loaded from: classes.dex */
public final class A extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f473b;

    public /* synthetic */ A(int i2, Object obj) {
        this.f472a = i2;
        this.f473b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f472a) {
            case 0:
                if (intent != null && intent.getAction().equals("android.intent.action.PHONE_STATE") && intent.hasExtra("state")) {
                    String stringExtra = intent.getStringExtra("state");
                    boolean zEquals = stringExtra.equals(TelephonyManager.EXTRA_STATE_RINGING);
                    CoreAndroid coreAndroid = (CoreAndroid) this.f473b;
                    if (!zEquals) {
                        if (!stringExtra.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                            if (stringExtra.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
                                coreAndroid.webView.getPluginManager().k("telephone", "idle");
                                break;
                            }
                        } else {
                            coreAndroid.webView.getPluginManager().k("telephone", "offhook");
                            break;
                        }
                    } else {
                        coreAndroid.webView.getPluginManager().k("telephone", "ringing");
                        break;
                    }
                }
                break;
            case 1:
                ((WebSettings) this.f473b).getUserAgentString();
                break;
            default:
                ((AbstractC0152x) this.f473b).g();
                break;
        }
    }
}
