package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class AppMeasurementDynamiteService extends bu8 {
    public y19 d = null;
    public final js e = new zt6(0);

    /* JADX WARNING: type inference failed for: r0v2, types: [js, zt6] */
    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void b() {
        if (this.d == null) {
            h.s("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j) {
        b();
        ev8 ev8 = this.d.J;
        y19.d(ev8);
        ev8.d1(j, str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        v49.q1(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        v49.d1();
        r19 r19 = ((y19) v49.w).C;
        y19.g(r19);
        r19.l1(new nt2(v49, false, (Object) null, 29));
    }

    public final void e(String str, ju8 ju8) {
        b();
        d99 d99 = this.d.E;
        y19.e(d99);
        d99.P1(str, ju8);
    }

    public void endAdUnitExposure(String str, long j) {
        b();
        ev8 ev8 = this.d.J;
        y19.d(ev8);
        ev8.e1(j, str);
    }

    public void generateEventId(ju8 ju8) {
        b();
        d99 d99 = this.d.E;
        y19.e(d99);
        long a2 = d99.a2();
        b();
        d99 d992 = this.d.E;
        y19.e(d992);
        d992.Q1(ju8, a2);
    }

    public void getAppInstanceId(ju8 ju8) {
        b();
        r19 r19 = this.d.C;
        y19.g(r19);
        r19.l1(new u19(this, ju8, 0));
    }

    public void getCachedAppInstanceId(ju8 ju8) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        e((String) v49.C.get(), ju8);
    }

    public void getConditionalUserProperties(String str, String str2, ju8 ju8) {
        b();
        r19 r19 = this.d.C;
        y19.g(r19);
        r19.l1(new yl0(this, ju8, str, str2, 8));
    }

    public void getCurrentScreenClass(ju8 ju8) {
        String str;
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        l59 l59 = ((y19) v49.w).H;
        y19.f(l59);
        f59 f59 = l59.y;
        if (f59 != null) {
            str = f59.b;
        } else {
            str = null;
        }
        e(str, ju8);
    }

    public void getCurrentScreenName(ju8 ju8) {
        String str;
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        l59 l59 = ((y19) v49.w).H;
        y19.f(l59);
        f59 f59 = l59.y;
        if (f59 != null) {
            str = f59.a;
        } else {
            str = null;
        }
        e(str, ju8);
    }

    public void getGmpAppId(ju8 ju8) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        e(v49.r1(), ju8);
    }

    public void getMaxUserProperties(String str, ju8 ju8) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        z65.h(str);
        ((y19) v49.w).getClass();
        b();
        d99 d99 = this.d.E;
        y19.e(d99);
        d99.R1(ju8, 25);
    }

    public void getSessionId(ju8 ju8) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        r19 r19 = ((y19) v49.w).C;
        y19.g(r19);
        r19.l1(new nt2(v49, ju8));
    }

    public void getTestFlag(ju8 ju8, int i) {
        b();
        if (i == 0) {
            d99 d99 = this.d.E;
            y19.e(d99);
            v49 v49 = this.d.I;
            y19.f(v49);
            AtomicReference atomicReference = new AtomicReference();
            r19 r19 = ((y19) v49.w).C;
            y19.g(r19);
            d99.P1((String) r19.m1(atomicReference, 15000, "String test flag value", new z39(v49, atomicReference, 1)), ju8);
        } else if (i == 1) {
            d99 d992 = this.d.E;
            y19.e(d992);
            v49 v492 = this.d.I;
            y19.f(v492);
            AtomicReference atomicReference2 = new AtomicReference();
            r19 r192 = ((y19) v492.w).C;
            y19.g(r192);
            d992.Q1(ju8, ((Long) r192.m1(atomicReference2, 15000, "long test flag value", new z39(v492, atomicReference2, 2))).longValue());
        } else if (i == 2) {
            d99 d993 = this.d.E;
            y19.e(d993);
            v49 v493 = this.d.I;
            y19.f(v493);
            AtomicReference atomicReference3 = new AtomicReference();
            r19 r193 = ((y19) v493.w).C;
            y19.g(r193);
            double doubleValue = ((Double) r193.m1(atomicReference3, 15000, "double test flag value", new z39(v493, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                ju8.z(bundle);
            } catch (RemoteException e2) {
                pz8 pz8 = ((y19) d993.w).B;
                y19.g(pz8);
                pz8.E.b("Error returning double value to wrapper", e2);
            }
        } else if (i == 3) {
            d99 d994 = this.d.E;
            y19.e(d994);
            v49 v494 = this.d.I;
            y19.f(v494);
            AtomicReference atomicReference4 = new AtomicReference();
            r19 r194 = ((y19) v494.w).C;
            y19.g(r194);
            d994.R1(ju8, ((Integer) r194.m1(atomicReference4, 15000, "int test flag value", new z39(v494, atomicReference4, 3))).intValue());
        } else if (i == 4) {
            d99 d995 = this.d.E;
            y19.e(d995);
            v49 v495 = this.d.I;
            y19.f(v495);
            AtomicReference atomicReference5 = new AtomicReference();
            r19 r195 = ((y19) v495.w).C;
            y19.g(r195);
            d995.T1(ju8, ((Boolean) r195.m1(atomicReference5, 15000, "boolean test flag value", new z39(v495, atomicReference5, 0))).booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, ju8 ju8) {
        b();
        r19 r19 = this.d.C;
        y19.g(r19);
        r19.l1(new w39(this, ju8, str, str2, z));
    }

    public void initForTests(Map map) {
        b();
    }

    public void initialize(y73 y73, iv8 iv8, long j) {
        y19 y19 = this.d;
        if (y19 == null) {
            Context context = (Context) z25.M(y73);
            z65.k(context);
            this.d = y19.m(context, iv8, Long.valueOf(j), (Long) null);
            return;
        }
        pz8 pz8 = y19.B;
        y19.g(pz8);
        pz8.E.a("Attempting to initialize multiple times");
    }

    public void initializeWithElapsedTime(y73 y73, iv8 iv8, long j, long j2) {
        y19 y19 = this.d;
        if (y19 == null) {
            Context context = (Context) z25.M(y73);
            z65.k(context);
            this.d = y19.m(context, iv8, Long.valueOf(j), Long.valueOf(j2));
            return;
        }
        pz8 pz8 = y19.B;
        y19.g(pz8);
        pz8.E.a("Attempting to initialize multiple times");
    }

    public void isDataCollectionEnabled(ju8 ju8) {
        b();
        r19 r19 = this.d.C;
        y19.g(r19);
        r19.l1(new u19(this, ju8, 1));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        v49.h1(str, str2, bundle, z, z2, j, 0);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, ju8 ju8, long j) {
        String str3;
        Bundle bundle2;
        b();
        z65.h(str2);
        if (true != this.d.z.n1((String) null, by8.f1)) {
            str3 = "app";
        } else {
            str3 = "auto";
        }
        String str4 = str3;
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", str4);
        String str5 = str2;
        r19 r19 = this.d.C;
        y19.g(r19);
        ju8 ju82 = ju8;
        String str6 = str;
        r19.l1(new yl0(this, ju82, new zr8(str5, new ur8(bundle), str4, j, 0), str6, 3));
    }

    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        v49.h1(str, str2, bundle, z, z2, j, j2);
    }

    public void logHealthData(int i, String str, y73 y73, y73 y732, y73 y733) {
        Object obj;
        Object obj2;
        b();
        Object obj3 = null;
        if (y73 == null) {
            obj = null;
        } else {
            obj = z25.M(y73);
        }
        if (y732 == null) {
            obj2 = null;
        } else {
            obj2 = z25.M(y732);
        }
        if (y733 != null) {
            obj3 = z25.M(y733);
        }
        Object obj4 = obj3;
        pz8 pz8 = this.d.B;
        y19.g(pz8);
        pz8.l1(i, true, false, str, obj, obj2, obj4);
    }

    public void onActivityCreated(y73 y73, Bundle bundle, long j) {
        b();
        Activity activity = (Activity) z25.M(y73);
        z65.k(activity);
        onActivityCreatedByScionActivityInfo(jv8.f(activity), bundle, j);
    }

    public void onActivityCreatedByScionActivityInfo(jv8 jv8, Bundle bundle, long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        zb2 zb2 = v49.y;
        if (zb2 != null) {
            v49 v492 = this.d.I;
            y19.f(v492);
            v492.v1();
            zb2.j(jv8, bundle);
        }
    }

    public void onActivityDestroyed(y73 y73, long j) {
        b();
        Activity activity = (Activity) z25.M(y73);
        z65.k(activity);
        onActivityDestroyedByScionActivityInfo(jv8.f(activity), j);
    }

    public void onActivityDestroyedByScionActivityInfo(jv8 jv8, long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        zb2 zb2 = v49.y;
        if (zb2 != null) {
            v49 v492 = this.d.I;
            y19.f(v492);
            v492.v1();
            zb2.k(jv8);
        }
    }

    public void onActivityPaused(y73 y73, long j) {
        b();
        Activity activity = (Activity) z25.M(y73);
        z65.k(activity);
        onActivityPausedByScionActivityInfo(jv8.f(activity), j);
    }

    public void onActivityPausedByScionActivityInfo(jv8 jv8, long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        zb2 zb2 = v49.y;
        if (zb2 != null) {
            v49 v492 = this.d.I;
            y19.f(v492);
            v492.v1();
            zb2.l(jv8);
        }
    }

    public void onActivityResumed(y73 y73, long j) {
        b();
        Activity activity = (Activity) z25.M(y73);
        z65.k(activity);
        onActivityResumedByScionActivityInfo(jv8.f(activity), j);
    }

    public void onActivityResumedByScionActivityInfo(jv8 jv8, long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        zb2 zb2 = v49.y;
        if (zb2 != null) {
            v49 v492 = this.d.I;
            y19.f(v492);
            v492.v1();
            zb2.m(jv8);
        }
    }

    public void onActivitySaveInstanceState(y73 y73, ju8 ju8, long j) {
        b();
        Activity activity = (Activity) z25.M(y73);
        z65.k(activity);
        onActivitySaveInstanceStateByScionActivityInfo(jv8.f(activity), ju8, j);
    }

    public void onActivitySaveInstanceStateByScionActivityInfo(jv8 jv8, ju8 ju8, long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        zb2 zb2 = v49.y;
        Bundle bundle = new Bundle();
        if (zb2 != null) {
            v49 v492 = this.d.I;
            y19.f(v492);
            v492.v1();
            zb2.n(jv8, bundle);
        }
        try {
            ju8.z(bundle);
        } catch (RemoteException e2) {
            pz8 pz8 = this.d.B;
            y19.g(pz8);
            pz8.E.b("Error returning bundle value to wrapper", e2);
        }
    }

    public void onActivityStarted(y73 y73, long j) {
        b();
        Activity activity = (Activity) z25.M(y73);
        z65.k(activity);
        onActivityStartedByScionActivityInfo(jv8.f(activity), j);
    }

    public void onActivityStartedByScionActivityInfo(jv8 jv8, long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        if (v49.y != null) {
            v49 v492 = this.d.I;
            y19.f(v492);
            v492.v1();
        }
    }

    public void onActivityStopped(y73 y73, long j) {
        b();
        Activity activity = (Activity) z25.M(y73);
        z65.k(activity);
        onActivityStoppedByScionActivityInfo(jv8.f(activity), j);
    }

    public void onActivityStoppedByScionActivityInfo(jv8 jv8, long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        if (v49.y != null) {
            v49 v492 = this.d.I;
            y19.f(v492);
            v492.v1();
        }
    }

    public void performAction(Bundle bundle, ju8 ju8, long j) {
        b();
        ju8.z((Bundle) null);
    }

    public void registerOnMeasurementEventListener(tu8 tu8) {
        Object obj;
        b();
        js jsVar = this.e;
        synchronized (jsVar) {
            try {
                obj = (k39) jsVar.get(Integer.valueOf(tu8.d()));
                if (obj == null) {
                    obj = new j99(this, tu8);
                    jsVar.put(Integer.valueOf(tu8.d()), obj);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        v49 v49 = this.d.I;
        y19.f(v49);
        v49.d1();
        if (!v49.A.add(obj)) {
            pz8 pz8 = ((y19) v49.w).B;
            y19.g(pz8);
            pz8.E.a("OnEventListener already registered");
        }
    }

    @Deprecated
    public void resetAnalyticsData(long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        v49.C.set((Object) null);
        r19 r19 = ((y19) v49.w).C;
        y19.g(r19);
        r19.l1(new x39(v49, j, 1));
    }

    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        v49.C.set((Object) null);
        r19 r19 = ((y19) v49.w).C;
        y19.g(r19);
        r19.l1(new x39(v49, j, 1));
    }

    public void retrieveAndUploadBatches(pu8 pu8) {
        int i;
        d59 d59;
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        v49.d1();
        y19 y19 = (y19) v49.w;
        r19 r19 = y19.C;
        y19.g(r19);
        if (!r19.i1()) {
            r19 r192 = y19.C;
            y19.g(r192);
            if (Thread.currentThread() == r192.z) {
                pz8 pz8 = y19.B;
                y19.g(pz8);
                pz8.B.a("Cannot retrieve and upload batches from analytics network thread");
                return;
            }
            boolean o = ts2.o();
            pz8 pz82 = y19.B;
            if (!o) {
                y19.g(pz82);
                pz82.J.a("[sgtm] Started client-side batch upload work.");
                boolean z = false;
                boolean z2 = false;
                int i2 = 0;
                int i3 = 0;
                while (!z2) {
                    pz8 pz83 = y19.B;
                    y19.g(pz83);
                    pz83.J.a("[sgtm] Getting upload batches from service (FE)");
                    AtomicReference atomicReference = new AtomicReference();
                    r19 r193 = y19.C;
                    y19.g(r193);
                    r193.m1(atomicReference, 10000, "[sgtm] Getting upload batches", new z39(v49, atomicReference, 6, z));
                    f89 f89 = (f89) atomicReference.get();
                    if (f89 == null) {
                        break;
                    }
                    List list = f89.w;
                    if (list.isEmpty()) {
                        break;
                    }
                    pz8 pz84 = y19.B;
                    y19.g(pz84);
                    pz84.J.b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                    i2 += list.size();
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            int i4 = i2;
                            z2 = false;
                            break;
                        }
                        a89 a89 = (a89) it.next();
                        try {
                            URL url = new URI(a89.y).toURL();
                            AtomicReference atomicReference2 = new AtomicReference();
                            vy8 l = ((y19) v49.w).l();
                            l.d1();
                            z65.k(l.C);
                            String str = l.C;
                            y19 y192 = (y19) v49.w;
                            pz8 pz85 = y192.B;
                            y19.g(pz85);
                            mz8 mz8 = pz85.J;
                            i = i2;
                            Long valueOf = Long.valueOf(a89.w);
                            mz8.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, a89.y, Integer.valueOf(a89.x.length));
                            if (!TextUtils.isEmpty(a89.C)) {
                                pz8 pz86 = y192.B;
                                y19.g(pz86);
                                pz86.J.c(valueOf, a89.C, "[sgtm] Uploading data from app. row_id");
                            }
                            HashMap hashMap = new HashMap();
                            Bundle bundle = a89.z;
                            for (String next : bundle.keySet()) {
                                String string = bundle.getString(next);
                                if (!TextUtils.isEmpty(string)) {
                                    hashMap.put(next, string);
                                }
                            }
                            b59 b59 = y192.K;
                            y19.g(b59);
                            byte[] bArr = a89.x;
                            fm8 fm8 = new fm8((Object) v49, (Serializable) atomicReference2, (Object) a89, 6);
                            b59.e1();
                            z65.k(url);
                            z65.k(bArr);
                            r19 r194 = ((y19) b59.w).C;
                            y19.g(r194);
                            r194.o1(new vz8(b59, str, url, bArr, hashMap, (y49) fm8));
                            try {
                                d99 d99 = y192.E;
                                y19.e(d99);
                                y19 y193 = (y19) d99.w;
                                y193.G.getClass();
                                long j = 60000;
                                long currentTimeMillis = System.currentTimeMillis() + 60000;
                                synchronized (atomicReference2) {
                                    while (atomicReference2.get() == null && j > 0) {
                                        atomicReference2.wait(j);
                                        y193.G.getClass();
                                        j = currentTimeMillis - System.currentTimeMillis();
                                    }
                                }
                            } catch (InterruptedException unused) {
                                pz8 pz87 = ((y19) v49.w).B;
                                y19.g(pz87);
                                pz87.E.a("[sgtm] Interrupted waiting for uploading batch");
                            } catch (Throwable th) {
                                throw th;
                            }
                            if (atomicReference2.get() == null) {
                                d59 = d59.x;
                            } else {
                                d59 = (d59) atomicReference2.get();
                            }
                        } catch (MalformedURLException | URISyntaxException e2) {
                            i = i2;
                            pz8 pz88 = ((y19) v49.w).B;
                            y19.g(pz88);
                            pz88.B.d("[sgtm] Bad upload url for row_id", a89.y, Long.valueOf(a89.w), e2);
                            d59 = d59.z;
                        }
                        if (d59 == d59.y) {
                            i3++;
                        } else if (d59 == d59.A) {
                            z2 = true;
                            i2 = i;
                            break;
                        }
                        i2 = i;
                    }
                    z = false;
                }
                pz8 pz89 = y19.B;
                y19.g(pz89);
                pz89.J.c(Integer.valueOf(i2), Integer.valueOf(i3), "[sgtm] Completed client-side batch upload work. total, success");
                try {
                    pu8.f();
                } catch (RemoteException e3) {
                    y19 y194 = this.d;
                    z65.k(y194);
                    pz8 pz810 = y194.B;
                    y19.g(pz810);
                    pz810.E.b("Failed to call IDynamiteUploadBatchesCallback", e3);
                }
            } else {
                y19.g(pz82);
                pz82.B.a("Cannot retrieve and upload batches from main thread");
            }
        } else {
            pz8 pz811 = y19.B;
            y19.g(pz811);
            pz811.B.a("Cannot retrieve and upload batches from analytics worker thread");
        }
    }

    public void setConditionalUserProperty(Bundle bundle, long j) {
        b();
        y19 y19 = this.d;
        if (bundle == null) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.a("Conditional user property must not be null");
            return;
        }
        v49 v49 = y19.I;
        y19.f(v49);
        v49.p1(bundle, j);
    }

    public void setConsentThirdParty(Bundle bundle, long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        v49.w1(bundle, -20, j);
    }

    public void setCurrentScreen(y73 y73, String str, String str2, long j) {
        b();
        Activity activity = (Activity) z25.M(y73);
        z65.k(activity);
        setCurrentScreenByScionActivityInfo(jv8.f(activity), str, str2, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (r2 > 500) goto L_0x0089;
     */
    public void setCurrentScreenByScionActivityInfo(jv8 jv8, String str, String str2, long j) {
        String str3;
        b();
        l59 l59 = this.d.H;
        y19.f(l59);
        y19 y19 = (y19) l59.w;
        if (!y19.z.r1()) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.G.a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        f59 f59 = l59.y;
        if (f59 == null) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.G.a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = l59.B;
        Integer valueOf = Integer.valueOf(jv8.w);
        if (concurrentHashMap.get(valueOf) == null) {
            pz8 pz83 = y19.B;
            y19.g(pz83);
            pz83.G.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = l59.h1(jv8.x);
        }
        String str4 = f59.b;
        String str5 = f59.a;
        boolean equals = Objects.equals(str4, str2);
        boolean equals2 = Objects.equals(str5, str);
        if (!equals || !equals2) {
            if (str != null) {
                if (str.length() > 0) {
                    int length = str.length();
                    y19.z.getClass();
                }
                pz8 pz84 = y19.B;
                y19.g(pz84);
                pz84.G.b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
                return;
            }
            if (str2.length() > 0) {
                int length2 = str2.length();
                y19.z.getClass();
                if (length2 <= 500) {
                    pz8 pz85 = y19.B;
                    y19.g(pz85);
                    mz8 mz8 = pz85.J;
                    if (str == null) {
                        str3 = "null";
                    } else {
                        str3 = str;
                    }
                    mz8.c(str3, str2, "Setting current screen to name, class");
                    d99 d99 = y19.E;
                    y19.e(d99);
                    f59 f592 = new f59(d99.a2(), str, str2);
                    concurrentHashMap.put(valueOf, f592);
                    l59.k1(jv8.x, f592, true);
                    return;
                }
            }
            pz8 pz86 = y19.B;
            y19.g(pz86);
            pz86.G.b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        pz8 pz87 = y19.B;
        y19.g(pz87);
        pz87.G.a("setCurrentScreen cannot be called with the same class and name");
    }

    public void setDataCollectionEnabled(boolean z) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        v49.d1();
        r19 r19 = ((y19) v49.w).C;
        y19.g(r19);
        r19.l1(new s39(v49, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        r19 r19 = ((y19) v49.w).C;
        y19.g(r19);
        r19.l1(new a49(v49, bundle2, 2));
    }

    public void setEventInterceptor(tu8 tu8) {
        b();
        boolean z = false;
        k68 k68 = new k68(this, false, tu8, 23);
        r19 r19 = this.d.C;
        y19.g(r19);
        boolean i1 = r19.i1();
        y19 y19 = this.d;
        if (i1) {
            v49 v49 = y19.I;
            y19.f(v49);
            v49.b1();
            v49.d1();
            k68 k682 = v49.z;
            if (k68 != k682) {
                if (k682 == null) {
                    z = true;
                }
                z65.m("EventInterceptor already set.", z);
            }
            v49.z = k68;
            return;
        }
        r19 r192 = y19.C;
        y19.g(r192);
        r192.l1(new c49(1, (Object) this, (Object) k68));
    }

    public void setInstanceIdProvider(hv8 hv8) {
        b();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        Boolean valueOf = Boolean.valueOf(z);
        v49.d1();
        r19 r19 = ((y19) v49.w).C;
        y19.g(r19);
        r19.l1(new nt2(v49, false, valueOf, 29));
    }

    public void setMinimumSessionDuration(long j) {
        b();
    }

    public void setSessionTimeoutDuration(long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        r19 r19 = ((y19) v49.w).C;
        y19.g(r19);
        r19.l1(new x39(v49, j, 0));
    }

    public void setSgtmDebugInfo(Intent intent) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        y19 y19 = (y19) v49.w;
        Uri data = intent.getData();
        if (data == null) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.H.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.H.a("[sgtm] Preview Mode was not enabled.");
            y19.z.y = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (!TextUtils.isEmpty(queryParameter2)) {
            pz8 pz83 = y19.B;
            y19.g(pz83);
            pz83.H.b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            y19.z.y = queryParameter2;
        }
    }

    public void setUserId(String str, long j) {
        b();
        v49 v49 = this.d.I;
        y19.f(v49);
        y19 y19 = (y19) v49.w;
        if (str == null || !TextUtils.isEmpty(str)) {
            r19 r19 = y19.C;
            y19.g(r19);
            r19.l1(new c49(3, (Object) v49, (Object) str));
            v49.m1((String) null, "_id", str, true, j);
            return;
        }
        pz8 pz8 = y19.B;
        y19.g(pz8);
        pz8.E.a("User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, y73 y73, boolean z, long j) {
        b();
        Object M = z25.M(y73);
        v49 v49 = this.d.I;
        y19.f(v49);
        v49.m1(str, str2, M, z, j);
    }

    public void unregisterOnMeasurementEventListener(tu8 tu8) {
        Object obj;
        b();
        js jsVar = this.e;
        synchronized (jsVar) {
            obj = (k39) jsVar.remove(Integer.valueOf(tu8.d()));
        }
        if (obj == null) {
            obj = new j99(this, tu8);
        }
        v49 v49 = this.d.I;
        y19.f(v49);
        v49.d1();
        if (!v49.A.remove(obj)) {
            pz8 pz8 = ((y19) v49.w).B;
            y19.g(pz8);
            pz8.E.a("OnEventListener had not been registered");
        }
    }

    public void setConsent(Bundle bundle, long j) {
    }
}
