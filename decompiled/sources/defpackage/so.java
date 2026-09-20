package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* renamed from: so  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class so extends f1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ wo d;
    public final Object e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public so(wo woVar, Context context) {
        super(woVar);
        this.d = woVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public final IntentFilter d() {
        switch (this.c) {
            case b85.b:
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

    public final int f() {
        boolean z;
        Location location;
        long j;
        Location location2;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case b85.b:
                if (no.a((PowerManager) obj)) {
                    return 2;
                }
                return 1;
            default:
                cf4 cf4 = (cf4) obj;
                xh xhVar = (xh) cf4.z;
                LocationManager locationManager = (LocationManager) cf4.y;
                if (xhVar.b > System.currentTimeMillis()) {
                    z = xhVar.a;
                } else {
                    Context context = (Context) cf4.x;
                    Location location3 = null;
                    if (u55.d(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("network")) {
                                location2 = locationManager.getLastKnownLocation("network");
                                location = location2;
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (u55.d(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (ko7.e == null) {
                            ko7.e = new ko7();
                        }
                        ko7 ko7 = ko7.e;
                        ko7.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        ko7 ko72 = ko7;
                        ko72.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (ko72.b == 1) {
                            z = true;
                        }
                        long j2 = ko72.d;
                        long j3 = ko72.c;
                        ko72.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = ko72.d;
                        if (j2 == -1 || j3 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j3) {
                                j2 = j4;
                            } else if (currentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        xhVar.a = z;
                        xhVar.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    return 2;
                }
                return 1;
        }
    }

    public final void o() {
        int i = this.c;
        wo woVar = this.d;
        switch (i) {
            case b85.b:
                woVar.o(true, true);
                return;
            default:
                woVar.o(true, true);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public so(wo woVar, cf4 cf4) {
        super(woVar);
        this.d = woVar;
        this.e = cf4;
    }
}
