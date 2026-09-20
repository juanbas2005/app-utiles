package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: wy4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wy4 {
    public static final String a = bc4.p("NetworkStateTracker");

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025 A[Catch:{ SecurityException -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040 A[SYNTHETIC, Splitter:B:22:0x0040] */
    public static final vy4 a(ConnectivityManager connectivityManager, boolean z) {
        SecurityException securityException;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        NetworkCapabilities networkCapabilities;
        String str = a;
        connectivityManager.getClass();
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z6 = true;
            if (activeNetworkInfo != null) {
                try {
                    if (activeNetworkInfo.isConnected()) {
                        z3 = true;
                        networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        if (networkCapabilities != null) {
                            z4 = networkCapabilities.hasCapability(16);
                            boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                            if (activeNetworkInfo != null) {
                                if (!activeNetworkInfo.isRoaming()) {
                                    z5 = z3;
                                    z2 = z;
                                    return new vy4(z6, z4, isActiveNetworkMetered, z5, z2);
                                }
                            }
                            z5 = false;
                            z2 = z;
                            return new vy4(z6, z4, isActiveNetworkMetered, z5, z2);
                        }
                        z4 = false;
                        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
                        if (activeNetworkInfo != null) {
                        }
                        z5 = false;
                        z2 = z;
                        return new vy4(z6, z4, isActiveNetworkMetered2, z5, z2);
                    }
                } catch (SecurityException e) {
                    securityException = e;
                    z2 = z;
                    bc4.k().i(str, "Unable to get active network state", securityException);
                    return new vy4(false, false, false, true, z2);
                }
            }
            z3 = true;
            z6 = false;
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                }
            } catch (SecurityException e2) {
                bc4.k().i(str, "Unable to validate active network", e2);
            }
            z4 = false;
            boolean isActiveNetworkMetered22 = connectivityManager.isActiveNetworkMetered();
            if (activeNetworkInfo != null) {
            }
            z5 = false;
            z2 = z;
            try {
                return new vy4(z6, z4, isActiveNetworkMetered22, z5, z2);
            } catch (SecurityException e3) {
                e = e3;
                securityException = e;
                bc4.k().i(str, "Unable to get active network state", securityException);
                return new vy4(false, false, false, true, z2);
            }
        } catch (SecurityException e4) {
            e = e4;
            z2 = z;
            securityException = e;
            bc4.k().i(str, "Unable to get active network state", securityException);
            return new vy4(false, false, false, true, z2);
        }
    }
}
