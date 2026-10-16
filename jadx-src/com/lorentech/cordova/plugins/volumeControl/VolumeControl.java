package com.lorentech.cordova.plugins.volumeControl;

import N0.C0053d;
import N0.o;
import android.media.AudioManager;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class VolumeControl extends o {
    public static final String GET = "getVolume";
    public static final String ISM = "isMuted";
    public static final String MUT = "toggleMute";
    public static final String SET = "setVolume";

    /* renamed from: b, reason: collision with root package name */
    public AudioManager f1495b;

    public final int a() {
        try {
            return Math.round((this.f1495b.getStreamVolume(3) * 100) / this.f1495b.getStreamMaxVolume(3));
        } catch (Exception e2) {
            e2.toString();
            return 1;
        }
    }

    public final int b(int i2) {
        try {
            return Math.round((i2 * this.f1495b.getStreamMaxVolume(3)) / 100);
        } catch (Exception e2) {
            e2.toString();
            return 1;
        }
    }

    @Override // N0.o
    public boolean execute(String str, JSONArray jSONArray, C0053d c0053d) {
        this.f1495b = (AudioManager) this.cordova.getActivity().getApplicationContext().getSystemService("audio");
        int i2 = 4;
        if (SET.equals(str)) {
            try {
                int iB = b((int) Math.round(jSONArray.getDouble(0) * 100.0d));
                boolean z2 = (jSONArray.length() <= 1 || jSONArray.isNull(1)) ? true : jSONArray.getBoolean(1);
                AudioManager audioManager = this.f1495b;
                if (!z2) {
                    i2 = 0;
                }
                audioManager.setStreamVolume(3, iB, i2);
                c0053d.success();
            } catch (Exception e2) {
                e2.toString();
                return false;
            }
        } else if (GET.equals(str)) {
            try {
                c0053d.success(String.valueOf(a() / 100.0f));
            } catch (Exception e3) {
                e3.toString();
                return false;
            }
        } else if (MUT.equals(str)) {
            try {
                int iB2 = a() > 1 ? 0 : b(Math.round(((float) jSONArray.getDouble(0)) * 100.0f));
                this.f1495b.setStreamVolume(3, iB2, 4);
                c0053d.success(iB2);
            } catch (Exception e4) {
                e4.toString();
                return false;
            }
        } else {
            if (!ISM.equals(str)) {
                return false;
            }
            try {
                c0053d.success(a() == 0 ? 0 : 1);
            } catch (Exception e5) {
                e5.toString();
                return false;
            }
        }
        return true;
    }
}
