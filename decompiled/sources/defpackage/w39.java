package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: w39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w39 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ boolean z;

    public w39(v49 v49, AtomicReference atomicReference, String str, String str2, boolean z2) {
        this.A = atomicReference;
        this.x = str;
        this.y = str2;
        this.z = z2;
        Objects.requireNonNull(v49);
        this.B = v49;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0148 A[Catch:{ RuntimeException -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0151 A[Catch:{ RuntimeException -> 0x00e2 }] */
    public final void run() {
        zb2 zb2;
        Bundle bundle;
        CharSequence charSequence;
        String str;
        int i = this.w;
        boolean z2 = this.z;
        Object obj = this.y;
        Object obj2 = this.x;
        Object obj3 = this.A;
        Object obj4 = this.B;
        switch (i) {
            case b85.b:
                r69 j = ((AppMeasurementDynamiteService) obj4).d.j();
                j.b1();
                j.d1();
                j.q1(new n59(j, (String) obj2, (String) obj, j.s1(false), this.z, (ju8) obj3));
                return;
            case 1:
                r69 j2 = ((y19) ((v49) obj4).w).j();
                j2.b1();
                j2.d1();
                AtomicReference atomicReference = (AtomicReference) obj3;
                String str2 = (String) obj2;
                AtomicReference atomicReference2 = atomicReference;
                String str3 = (String) obj;
                r69 r69 = j2;
                r69.q1(new n59(r69, atomicReference2, str2, str3, j2.s1(false), this.z));
                return;
            case 2:
                zb2 zb22 = (zb2) obj4;
                v49 v49 = (v49) zb22.x;
                v49.b1();
                y19 y19 = (y19) v49.w;
                v09 v09 = v49.M;
                String str4 = (String) obj;
                Uri uri = (Uri) obj3;
                try {
                    d99 d99 = y19.E;
                    pz8 pz8 = y19.B;
                    y19.e(d99);
                    try {
                        boolean z3 = z2;
                        Object obj5 = obj2;
                        if (TextUtils.isEmpty(str4)) {
                            zb2 = zb22;
                        } else {
                            if (!str4.contains("gclid")) {
                                zb2 = zb22;
                                try {
                                    if (!str4.contains("gbraid") && !str4.contains("utm_campaign") && !str4.contains("utm_source") && !str4.contains("utm_medium") && !str4.contains("utm_id") && !str4.contains("dclid") && !str4.contains("srsltid") && !str4.contains("sfmc_id")) {
                                        pz8 pz82 = ((y19) d99.w).B;
                                        y19.g(pz82);
                                        pz82.I.a("Activity created with data 'referrer' without required params");
                                    }
                                } catch (RuntimeException e) {
                                    e = e;
                                    zb22 = zb2;
                                    pz8 pz83 = ((y19) ((v49) zb22.x).w).B;
                                    y19.g(pz83);
                                    pz83.B.b("Throwable caught in handleReferrerForOnActivityCreated", e);
                                    return;
                                }
                            } else {
                                zb2 = zb22;
                            }
                            bundle = d99.d2(Uri.parse("https://google.com/search?".concat(str4)));
                            if (bundle != null) {
                                bundle.putString("_cis", "referrer");
                            }
                            String str5 = (String) obj5;
                            if (!z3) {
                                str = "Activity created with data 'referrer' without required params";
                                d99 d992 = y19.E;
                                y19.e(d992);
                                Bundle d2 = d992.d2(uri);
                                if (d2 != null) {
                                    d2.putString("_cis", "intent");
                                    if (d2.containsKey("gclid") || bundle == null || !bundle.containsKey("gclid")) {
                                        charSequence = "utm_medium";
                                    } else {
                                        String string = bundle.getString("gclid");
                                        charSequence = "utm_medium";
                                        d2.putString("_cer", "gclid=" + string);
                                    }
                                    v49.j1(str5, "_cmp", d2);
                                    v09.c(str5, d2);
                                    if (!TextUtils.isEmpty(str4)) {
                                        y19.g(pz8);
                                        mz8 mz8 = pz8.I;
                                        mz8.b("Activity created with referrer", str4);
                                        if (y19.z.n1((String) null, by8.G0)) {
                                            if (bundle != null) {
                                                v49.j1(str5, "_cmp", bundle);
                                                v09.c(str5, bundle);
                                            } else {
                                                y19.g(pz8);
                                                mz8.b("Referrer does not contain valid parameters", str4);
                                            }
                                            y19.G.getClass();
                                            v49.m1("auto", "_ldl", (Object) null, true, System.currentTimeMillis());
                                            return;
                                        } else if (!str4.contains("gclid") || (!str4.contains("utm_campaign") && !str4.contains("utm_source") && !str4.contains(charSequence) && !str4.contains("utm_term") && !str4.contains("utm_content"))) {
                                            y19.g(pz8);
                                            mz8.a(str);
                                            return;
                                        } else if (!TextUtils.isEmpty(str4)) {
                                            y19.G.getClass();
                                            v49.m1("auto", "_ldl", str4, true, System.currentTimeMillis());
                                            return;
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                str = "Activity created with data 'referrer' without required params";
                            }
                            charSequence = "utm_medium";
                            if (!TextUtils.isEmpty(str4)) {
                            }
                        }
                        bundle = null;
                        String str52 = (String) obj5;
                        if (!z3) {
                        }
                        charSequence = "utm_medium";
                        if (!TextUtils.isEmpty(str4)) {
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        zb2 zb23 = zb22;
                        pz8 pz832 = ((y19) ((v49) zb22.x).w).B;
                        y19.g(pz832);
                        pz832.B.b("Throwable caught in handleReferrerForOnActivityCreated", e);
                        return;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    zb2 = zb22;
                    zb22 = zb2;
                    pz8 pz8322 = ((y19) ((v49) zb22.x).w).B;
                    y19.g(pz8322);
                    pz8322.B.b("Throwable caught in handleReferrerForOnActivityCreated", e);
                    return;
                }
                break;
            default:
                r69 r692 = (r69) obj4;
                iy8 iy8 = r692.z;
                y19 y192 = (y19) r692.w;
                if (iy8 == null) {
                    pz8 pz84 = y192.B;
                    y19.g(pz84);
                    pz84.B.a("Failed to send default event parameters to service");
                    return;
                }
                ur8 ur8 = null;
                z99 z99 = (z99) obj3;
                if (y192.z.n1((String) null, by8.W0)) {
                    if (!z2) {
                        ur8 = (ur8) obj2;
                    }
                    r692.u1(iy8, ur8, z99);
                    return;
                }
                try {
                    iy8.j((Bundle) obj, z99);
                    r692.p1();
                    return;
                } catch (RemoteException e4) {
                    pz8 pz85 = y192.B;
                    y19.g(pz85);
                    pz85.B.b("Failed to send default event parameters to service", e4);
                    return;
                }
        }
    }

    public w39(AppMeasurementDynamiteService appMeasurementDynamiteService, ju8 ju8, String str, String str2, boolean z2) {
        this.A = ju8;
        this.x = str;
        this.y = str2;
        this.z = z2;
        this.B = appMeasurementDynamiteService;
    }

    public w39(zb2 zb2, boolean z2, Uri uri, String str, String str2) {
        this.z = z2;
        this.A = uri;
        this.x = str;
        this.y = str2;
        this.B = zb2;
    }

    public w39(r69 r69, z99 z99, boolean z2, ur8 ur8, Bundle bundle) {
        this.A = z99;
        this.z = z2;
        this.x = ur8;
        this.y = bundle;
        Objects.requireNonNull(r69);
        this.B = r69;
    }
}
