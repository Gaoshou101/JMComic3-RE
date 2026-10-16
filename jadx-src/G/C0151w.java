package g;

import G.C0037m;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* renamed from: g.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151w extends AbstractC0152x {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1684c = 1;
    public final /* synthetic */ LayoutInflaterFactory2C0118A d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0151w(LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A, C0037m c0037m) {
        super(layoutInflaterFactory2C0118A);
        this.d = layoutInflaterFactory2C0118A;
        this.f1685e = c0037m;
    }

    @Override // g.AbstractC0152x
    public final IntentFilter d() {
        switch (this.f1684c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // g.AbstractC0152x
    public final int e() {
        Location location;
        boolean z2;
        long j2;
        switch (this.f1684c) {
            case 0:
                return AbstractC0147s.a((PowerManager) this.f1685e) ? 2 : 1;
            default:
                C0037m c0037m = (C0037m) this.f1685e;
                C0125H c0125h = (C0125H) c0037m.f197c;
                if (c0125h.f1589b > System.currentTimeMillis()) {
                    z2 = c0125h.f1588a;
                } else {
                    Context context = (Context) c0037m.f195a;
                    int iA = w.d.a(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation = null;
                    LocationManager locationManager = (LocationManager) c0037m.f196b;
                    if (iA == 0) {
                        try {
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (w.d.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C0124G.d == null) {
                            C0124G.d = new C0124G();
                        }
                        C0124G c0124g = C0124G.d;
                        c0124g.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0124g.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c0124g.f1587c == 1;
                        long j3 = c0124g.f1586b;
                        long j4 = c0124g.f1585a;
                        c0124g.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = c0124g.f1586b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j4) {
                                j5 = jCurrentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        c0125h.f1588a = z2;
                        c0125h.f1589b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z2 = true;
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // g.AbstractC0152x
    public final void g() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        switch (this.f1684c) {
            case 0:
                this.d.m(true, true);
                break;
            default:
                this.d.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0151w(LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A, Context context) {
        super(layoutInflaterFactory2C0118A);
        this.d = layoutInflaterFactory2C0118A;
        this.f1685e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
