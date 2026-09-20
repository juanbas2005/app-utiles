package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: yl0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yl0 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public yl0(v49 v49, AtomicReference atomicReference, String str, String str2) {
        this.w = 5;
        this.x = atomicReference;
        this.y = str;
        this.z = str2;
        Objects.requireNonNull(v49);
        this.A = v49;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0441, code lost:
        if (java.lang.System.currentTimeMillis() >= (r5 + r9)) goto L_0x0443;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final void run() {
        hd9 hd9;
        long j;
        byte[] bArr = null;
        switch (this.w) {
            case b85.b:
                am0 am0 = (am0) ((f96) this.A).x;
                yi4 yi4 = (yi4) this.y;
                zl0 zl0 = (zl0) this.x;
                if (zl0 != null) {
                    am0.V = true;
                    zl0.b.c(false);
                    am0.V = false;
                }
                if (yi4.isEnabled() && yi4.hasSubMenu()) {
                    ((ti4) this.z).q(yi4, (rj4) null, 4);
                    return;
                }
                return;
            case 1:
                da8.h((View) this.x, (ha8) this.y, (k68) this.z);
                ((ValueAnimator) this.A).start();
                return;
            case 2:
                String str = (String) this.y;
                uy8 uy8 = (uy8) this.A;
                v89 v89 = ((w29) this.x).d;
                v89.T();
                v89.n0().b1();
                v89.j0();
                uq8 uq8 = v89.y;
                v89.R(uq8);
                List<x89> h1 = uq8.h1(str, (c89) this.z, ((Integer) by8.B.a((Object) null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (x89 x89 : h1) {
                    String str2 = x89.c;
                    long j2 = x89.h;
                    long j3 = x89.a;
                    if (!v89.n(str, str2)) {
                        v89.G().J.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j3), x89.c);
                    } else {
                        int i = x89.i;
                        if (i > 0) {
                            if (i <= ((Integer) by8.z.a(bArr)).intValue()) {
                                long min = Math.min(((Long) by8.x.a(bArr)).longValue() * (1 << (i - 1)), ((Long) by8.y.a(bArr)).longValue());
                                v89.Q().getClass();
                                break;
                            }
                            v89.G().J.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j3), Long.valueOf(j2));
                            bArr = null;
                        }
                        Bundle bundle = new Bundle();
                        for (Map.Entry entry : x89.d.entrySet()) {
                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        long j4 = x89.a;
                        w19 w19 = x89.b;
                        String str3 = x89.c;
                        e59 e59 = x89.e;
                        long j5 = j4;
                        String str4 = str3;
                        a89 a89 = new a89(j5, w19.a(), str4, bundle, e59.w, x89.g, "");
                        try {
                            s19 s19 = (s19) y89.N1(w19.A(), a89.x);
                            for (int i2 = 0; i2 < ((w19) s19.x).u(); i2++) {
                                x19 x19 = (x19) ((w19) s19.x).v(i2).k();
                                v89.Q().getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                x19.b();
                                ((b29) x19.x).j0(currentTimeMillis);
                                s19.b();
                                ((w19) s19.x).C(i2, (b29) x19.d());
                            }
                            a89.x = ((w19) s19.d()).a();
                            if (Log.isLoggable(v89.G().m1(), 2)) {
                                y89 y89 = v89.C;
                                v89.R(y89);
                                a89.C = y89.D1((w19) s19.d());
                            }
                            arrayList.add(a89);
                        } catch (zzaeh unused) {
                            v89.G().E.b("Failed to parse queued batch. appId", str);
                        }
                        bArr = null;
                    }
                }
                try {
                    uy8.B(new f89(arrayList));
                    v89.G().J.c(str, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e) {
                    v89.G().B.c(str, e, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 3:
                r69 j6 = ((AppMeasurementDynamiteService) this.A).d.j();
                ju8 ju8 = (ju8) this.x;
                zr8 zr8 = (zr8) this.y;
                String str5 = (String) this.z;
                j6.b1();
                j6.d1();
                y19 y19 = (y19) j6.w;
                d99 d99 = y19.E;
                y19.e(d99);
                if (mw2.b.b(((y19) d99.w).w, 12451000) != 0) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.E.a("Not bundling data. Service unavailable or out of date");
                    d99 d992 = y19.E;
                    y19.e(d992);
                    d992.S1(ju8, new byte[0]);
                    return;
                }
                j6.q1(new yl0(j6, zr8, str5, ju8, 9));
                return;
            case 4:
                Bundle bundle2 = (Bundle) this.y;
                String str6 = (String) this.z;
                z99 z99 = (z99) this.A;
                boolean isEmpty = bundle2.isEmpty();
                v89 v892 = ((w29) this.x).d;
                if (isEmpty) {
                    uq8 uq82 = v892.y;
                    v89.R(uq82);
                    uq82.b1();
                    uq82.d1();
                    try {
                        uq82.T1().execSQL("delete from default_event_params where app_id=?", new String[]{str6});
                        return;
                    } catch (SQLiteException e2) {
                        pz8 pz82 = ((y19) uq82.w).B;
                        y19.g(pz82);
                        pz82.B.b("Error clearing default event params", e2);
                        return;
                    }
                } else {
                    uq8 uq83 = v892.y;
                    v89.R(uq83);
                    uq83.b1();
                    uq83.d1();
                    or8 or8 = new or8((y19) uq83.w, "", str6, "dep", 0, 0, 0, bundle2);
                    Bundle bundle3 = bundle2;
                    y89 y892 = uq83.x.C;
                    v89.R(y892);
                    byte[] a = y892.C1(or8).a();
                    pz8 pz83 = ((y19) uq83.w).B;
                    y19.g(pz83);
                    pz83.J.c(str6, Integer.valueOf(a.length), "Saving default event parameters, appId, data size");
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str6);
                    contentValues.put("parameters", a);
                    try {
                        if (uq83.T1().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                            y19.g(pz83);
                            pz83.B.b("Failed to insert default event parameters (got -1). appId", pz8.k1(str6));
                        }
                    } catch (SQLiteException e3) {
                        y19.g(pz83);
                        pz83.B.c(pz8.k1(str6), e3, "Error storing default event parameters. appId");
                    }
                    uq8 uq84 = v892.y;
                    v89.R(uq84);
                    long j7 = z99.Z;
                    try {
                        if (uq84.z1("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str6, String.valueOf(j7)}, 0) <= 0) {
                            if (uq84.z1("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str6, String.valueOf(j7)}, 0) > 0) {
                                uq8 uq85 = v892.y;
                                v89.R(uq85);
                                uq85.v1(str6, Long.valueOf(j7), (String) null, bundle3);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (SQLiteException e4) {
                        pz8 pz84 = ((y19) uq84.w).B;
                        y19.g(pz84);
                        pz84.B.b("Error checking backfill conditions", e4);
                        return;
                    }
                }
            case 5:
                r69 j8 = ((y19) ((v49) this.A).w).j();
                AtomicReference atomicReference = (AtomicReference) this.x;
                j8.b1();
                j8.d1();
                j8.q1(new p29(j8, atomicReference, (String) this.y, (String) this.z, j8.s1(false)));
                return;
            case 6:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.y;
                Context context = (Context) this.z;
                g49 g49 = (g49) this.A;
                if ((((xn6) this.x).w instanceof i1) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(g49);
                        return;
                    } catch (IllegalArgumentException e5) {
                        Log.w("DirectBootUtils", "Failed to unregister receiver", e5);
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                ji8 ji8 = j59.a;
                Level level = (Level) this.x;
                f76 f76 = (f76) ji8.x;
                boolean a2 = f76.a(level);
                String str7 = f76.a;
                ((ij8) dj8.a).getClass();
                nj8.b.a(str7, level, a2);
                if (!a2) {
                    hd9 = ji8.E;
                } else {
                    hd9 = new uc9(ji8, level);
                }
                ((tc9) ((tc9) hd9.c((Throwable) this.y)).a()).b((String) this.z, (Object[]) this.A);
                return;
            case 8:
                r69 j9 = ((AppMeasurementDynamiteService) this.A).d.j();
                String str8 = (String) this.y;
                String str9 = (String) this.z;
                j9.b1();
                j9.d1();
                j9.q1(new p29(j9, str8, str9, j9.s1(false), (ju8) this.x));
                return;
            case 9:
                ju8 ju82 = (ju8) this.z;
                r69 r69 = (r69) this.A;
                try {
                    iy8 iy8 = r69.z;
                    if (iy8 == null) {
                        y19 y192 = (y19) r69.w;
                        pz8 pz85 = y192.B;
                        y19.g(pz85);
                        pz85.B.a("Discarding data. Failed to send event to service to bundle");
                        d99 d993 = y192.E;
                        y19.e(d993);
                        d993.S1(ju82, (byte[]) null);
                        return;
                    }
                    bArr = iy8.v((String) this.y, (zr8) this.x);
                    r69.p1();
                    d99 d994 = ((y19) r69.w).E;
                    y19.e(d994);
                    d994.S1(ju82, bArr);
                    return;
                } catch (RemoteException e6) {
                    pz8 pz86 = ((y19) r69.w).B;
                    y19.g(pz86);
                    pz86.B.b("Failed to send event to the service to bundle", e6);
                } catch (Throwable th) {
                    d99 d995 = ((y19) r69.w).E;
                    y19.e(d995);
                    d995.S1(ju82, bArr);
                    throw th;
                }
            case 10:
                r69 r692 = (r69) this.x;
                AtomicReference atomicReference2 = (AtomicReference) this.y;
                z99 z992 = (z99) this.z;
                Bundle bundle4 = (Bundle) this.A;
                synchronized (atomicReference2) {
                    try {
                        iy8 iy82 = r692.z;
                        if (iy82 != null) {
                            iy82.n(z992, bundle4, new q59(r692, atomicReference2));
                            r692.p1();
                            break;
                        } else {
                            pz8 pz87 = ((y19) r692.w).B;
                            y19.g(pz87);
                            pz87.B.a("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e7) {
                        pz8 pz88 = ((y19) r692.w).B;
                        y19.g(pz88);
                        pz88.B.b("Failed to request trigger URIs; remote exception", e7);
                        atomicReference2.notifyAll();
                        break;
                    }
                }
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                r69 r693 = (r69) this.x;
                AtomicReference atomicReference3 = (AtomicReference) this.y;
                z99 z993 = (z99) this.z;
                c89 c89 = (c89) this.A;
                synchronized (atomicReference3) {
                    try {
                        iy8 iy83 = r693.z;
                        if (iy83 != null) {
                            iy83.E(z993, c89, new s59(r693, atomicReference3));
                            r693.p1();
                            break;
                        } else {
                            pz8 pz89 = ((y19) r693.w).B;
                            y19.g(pz89);
                            pz89.B.a("[sgtm] Failed to get upload batches; not connected to service");
                            return;
                        }
                    } catch (RemoteException e8) {
                        pz8 pz810 = ((y19) r693.w).B;
                        y19.g(pz810);
                        pz810.B.b("[sgtm] Failed to get upload batches; remote exception", e8);
                        atomicReference3.notifyAll();
                        break;
                    }
                }
            default:
                v89 v893 = (v89) ((n49) this.A).x;
                d99 i0 = v893.i0();
                v893.Q().getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (v893.c0().n1((String) null, by8.e1)) {
                    v893.Q().getClass();
                    j = SystemClock.elapsedRealtime();
                } else {
                    j = 0;
                }
                zr8 J1 = i0.J1((String) this.y, (Bundle) this.z, "auto", currentTimeMillis2, j, false);
                z65.k(J1);
                v893.c((String) this.x, J1);
                return;
        }
    }

    public /* synthetic */ yl0(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    public /* synthetic */ yl0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.w = i;
        this.A = obj;
        this.x = obj2;
        this.y = obj3;
        this.z = obj4;
    }
}
