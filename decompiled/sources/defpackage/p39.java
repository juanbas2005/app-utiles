package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: p39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p39 extends xq8 {
    public final /* synthetic */ int e;
    public final /* synthetic */ v49 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p39(v49 v49, a39 a39, int i) {
        super(a39);
        this.e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(v49);
                this.f = v49;
                super(a39);
                return;
            case 2:
                Objects.requireNonNull(v49);
                this.f = v49;
                super(a39);
                return;
            case 3:
                this.f = v49;
                super(a39);
                return;
            default:
                Objects.requireNonNull(v49);
                this.f = v49;
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0125, code lost:
        if (r0.N1() >= 234200) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02f7  */
    public final void a() {
        Pair pair;
        NetworkInfo networkInfo;
        URL url;
        dq8 dq8;
        Bundle bundle;
        String str;
        int i = this.e;
        boolean z = false;
        v49 v49 = this.f;
        switch (i) {
            case b85.b:
                v49 v492 = ((y19) v49.w).I;
                y19.f(v492);
                new Thread(new o39(v492, 0)).start();
                return;
            case 1:
                v49.B1();
                return;
            case 2:
                v49.i1();
                return;
            default:
                y19 y19 = (y19) v49.w;
                q09 q09 = y19.A;
                pz8 pz8 = y19.B;
                r19 r19 = y19.C;
                y19.g(r19);
                r19.b1();
                b59 b59 = y19.K;
                y19.g(b59);
                y19 y192 = (y19) b59.w;
                y19.g(b59);
                String i1 = y19.l().i1();
                Boolean p1 = y19.z.p1("google_analytics_adid_collection_enabled");
                if (p1 == null || p1.booleanValue()) {
                    y19.e(q09);
                    y19 y193 = (y19) q09.w;
                    q09.b1();
                    if (q09.j1().i(f39.AD_STORAGE)) {
                        y193.G.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String str2 = q09.D;
                        if (str2 == null || elapsedRealtime >= q09.F) {
                            q09.F = y193.z.k1(i1, by8.b) + elapsedRealtime;
                            try {
                                ca a = da.a(y193.w);
                                q09.D = "";
                                String str3 = a.c;
                                if (str3 != null) {
                                    q09.D = str3;
                                }
                                q09.E = a.b;
                            } catch (Exception e2) {
                                pz8 pz82 = y193.B;
                                y19.g(pz82);
                                pz82.I.b("Unable to get advertising id", e2);
                                q09.D = "";
                            }
                            pair = new Pair(q09.D, Boolean.valueOf(q09.E));
                        } else {
                            pair = new Pair(str2, Boolean.valueOf(q09.E));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                        y19.g(pz8);
                        pz8.J.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    } else {
                        y19.g(b59);
                        b59.e1();
                        ConnectivityManager connectivityManager = (ConnectivityManager) y192.w.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                networkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                            }
                            if (networkInfo == null || !networkInfo.isConnected()) {
                                y19.g(pz8);
                                pz8.E.a("Network is not available for Deferred Deep Link request. Skipping");
                            } else {
                                StringBuilder sb = new StringBuilder();
                                r69 j = y19.j();
                                j.b1();
                                j.d1();
                                if (j.j1()) {
                                    d99 d99 = ((y19) j.w).E;
                                    y19.e(d99);
                                    break;
                                }
                                v49 v493 = y19.I;
                                y19.f(v493);
                                v493.b1();
                                r69 j2 = ((y19) v493.w).j();
                                y19 y194 = (y19) j2.w;
                                j2.b1();
                                j2.d1();
                                iy8 iy8 = j2.z;
                                if (iy8 == null) {
                                    j2.i1();
                                    pz8 pz83 = y194.B;
                                    y19.g(pz83);
                                    pz83.I.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        dq8 = iy8.u(j2.s1(false));
                                        j2.p1();
                                    } catch (RemoteException e3) {
                                        pz8 pz84 = y194.B;
                                        y19.g(pz84);
                                        pz84.B.b("Failed to get consents; remote exception", e3);
                                    }
                                    if (dq8 == null) {
                                        bundle = dq8.w;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle != null) {
                                        int i2 = y19.X;
                                        y19.X = i2 + 1;
                                        if (i2 < 10) {
                                            z = true;
                                        }
                                        y19.g(pz8);
                                        mz8 mz8 = pz8.I;
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        if (i2 < 10) {
                                            str = "Retrying.";
                                        } else {
                                            str = "Skipping.";
                                        }
                                        mz8.b(f21.l(sb2, str, " retryCount"), Integer.valueOf(y19.X));
                                    } else {
                                        h39 b = h39.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(b.f());
                                        ir8 c = ir8.c(100, bundle);
                                        String str4 = c.d;
                                        sb.append("&dma=");
                                        Boolean bool = c.c;
                                        Boolean bool2 = Boolean.FALSE;
                                        sb.append(Objects.equals(bool, bool2) ^ true ? 1 : 0);
                                        if (!TextUtils.isEmpty(str4)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str4);
                                        }
                                        int ordinal = h39.d(bundle.getString("ad_personalization")).ordinal();
                                        if (ordinal != 2) {
                                            if (ordinal != 3) {
                                                bool2 = null;
                                            } else {
                                                bool2 = Boolean.TRUE;
                                            }
                                        }
                                        sb.append("&npa=");
                                        sb.append(Objects.equals(bool2, Boolean.TRUE) ^ true ? 1 : 0);
                                        y19.g(pz8);
                                        pz8.J.b("Consent query parameters to Bow", sb);
                                        d99 d992 = y19.E;
                                        y19.e(d992);
                                        ((y19) y19.l().w).z.i1();
                                        String str5 = (String) pair.first;
                                        long a2 = q09.Q.a() - 1;
                                        String sb3 = sb.toString();
                                        y19 y195 = (y19) d992.w;
                                        try {
                                            z65.h(str5);
                                            z65.h(i1);
                                            String str6 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + d992.N1()) + "&rdid=" + str5 + "&bundleid=" + i1 + "&retry=" + a2;
                                            if (i1.equals(y195.z.g1("debug.deferred.deeplink"))) {
                                                str6 = str6.concat("&ddl_test=1");
                                            }
                                            if (!sb3.isEmpty()) {
                                                if (sb3.charAt(0) != '&') {
                                                    str6 = str6.concat("&");
                                                }
                                                str6 = str6.concat(sb3);
                                            }
                                            url = new URL(str6);
                                        } catch (MalformedURLException e4) {
                                            e = e4;
                                            pz8 pz85 = y195.B;
                                            y19.g(pz85);
                                            pz85.B.b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (z) {
                                            }
                                        } catch (IllegalArgumentException e5) {
                                            e = e5;
                                            pz8 pz852 = y195.B;
                                            y19.g(pz852);
                                            pz852.B.b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
                                            url = null;
                                            if (url != null) {
                                            }
                                            if (z) {
                                            }
                                        }
                                        if (url != null) {
                                            y19.g(b59);
                                            v09 v09 = new v09(y19);
                                            b59.e1();
                                            r19 r192 = y192.C;
                                            y19.g(r192);
                                            r192.o1(new vz8(b59, i1, url, (byte[]) null, (HashMap) null, (y49) v09));
                                        }
                                    }
                                }
                                dq8 = null;
                                if (dq8 == null) {
                                }
                                if (bundle != null) {
                                }
                            }
                        }
                        networkInfo = null;
                        if (networkInfo == null || !networkInfo.isConnected()) {
                        }
                    }
                } else {
                    y19.g(pz8);
                    pz8.J.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (z) {
                    v49.O.b(2000);
                    return;
                }
                return;
        }
    }
}
