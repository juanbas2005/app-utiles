package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: z46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z46 implements Runnable {
    public final /* synthetic */ int w;
    public Object x;
    public Object y;
    public Object z;

    public z46(r69 r69, AtomicReference atomicReference, z99 z99) {
        this.w = 9;
        this.x = atomicReference;
        this.y = z99;
        Objects.requireNonNull(r69);
        this.z = r69;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: gt8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: x89} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: x89} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v7, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v8, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v9, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: x89} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0429  */
    public final void run() {
        Object obj;
        yb9 yb9;
        Integer num;
        int i;
        gt8 gt8;
        ur8 ur8;
        Cursor cursor;
        x89 x89;
        int i2;
        long j;
        Cursor cursor2;
        AtomicReference atomicReference;
        d99 d99;
        String str = null;
        switch (this.w) {
            case b85.b:
                a56 a56 = (a56) this.z;
                dz dzVar = (dz) this.x;
                a56.b(dzVar, (xb7) this.y);
                ((AtomicInteger) a56.i.x).set(0);
                double min = Math.min(3600000.0d, Math.pow(a56.b, (double) a56.a()) * (60000.0d / a56.a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(min / 1000.0d)}) + " s for report: " + dzVar.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, (Throwable) null);
                }
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 1:
                try {
                    obj = ((nl2) this.x).call();
                } catch (Exception unused2) {
                    obj = null;
                }
                ((Handler) this.z).post(new nt2(9, (Object) (ol2) this.y, obj));
                return;
            case 2:
                kk0 kk0 = (kk0) this.x;
                try {
                    ar7.U(kk0.A.L(hz2.z), new ng((Object) (a96) this.y, (Object) kk0, (Object) (k05) this.z, (f61) null, 17));
                    return;
                } catch (Throwable th) {
                    kk0.a(th);
                    return;
                }
            case 3:
                ns0 ns0 = (ns0) this.y;
                Intent intent = ns0.w;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    yb9 = b35.l((Object) null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = ns0.w;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = ns0.w;
                    if (intent3.hasExtra("google.product_id")) {
                        num = Integer.valueOf(intent3.getIntExtra("google.product_id", 0));
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        bundle.putInt("google.product_id", num.intValue());
                    }
                    bundle.putBoolean("supports_message_handled", true);
                    kb9 s = kb9.s((Context) this.x);
                    synchronized (s) {
                        i = s.x;
                        s.x = i + 1;
                    }
                    yb9 = s.t(new ba9(i, 2, bundle, 0));
                }
                yb9.c(gv1.A, new aj8((CountDownLatch) this.z));
                return;
            case 4:
                v89 v89 = ((w29) this.z).d;
                v89.T();
                xn8 xn8 = (xn8) this.x;
                Object f = xn8.y.f();
                z99 z99 = (z99) this.y;
                if (f == null) {
                    v89.Y(xn8, z99);
                    return;
                } else {
                    v89.X(xn8, z99);
                    return;
                }
            case 5:
                zr8 zr8 = (zr8) this.x;
                z99 z992 = (z99) this.y;
                w29 w29 = (w29) this.z;
                w29.getClass();
                v89 v892 = w29.d;
                if ("_cmp".equals(zr8.w) && (ur8 = zr8.x) != null) {
                    Bundle bundle2 = ur8.w;
                    if (bundle2.size() != 0) {
                        String string = bundle2.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            v892.G().H.b("Event has been filtered ", zr8.toString());
                            zr8 = new zr8("_cmpx", ur8, zr8.y, zr8.z, zr8.A);
                        }
                    }
                }
                String str3 = zr8.w;
                j19 j19 = v892.w;
                y89 y89 = v892.C;
                v89.R(j19);
                String str4 = z992.w;
                if (TextUtils.isEmpty(str4)) {
                    gt8 = null;
                } else {
                    gt8 = j19.G.h(str4);
                }
                if (gt8 != null) {
                    try {
                        cf4 cf4 = gt8.c;
                        v89.R(y89);
                        HashMap Q1 = y89.Q1(zr8.x.l(), true);
                        String G = b35.G(str3, r16.Y, r16.T);
                        if (G == null) {
                            G = str3;
                        }
                        if (gt8.a(new wi8(G, zr8.z, Q1))) {
                            if (!((wi8) cf4.y).equals((wi8) cf4.x)) {
                                v892.G().J.b("EES edited event", str3);
                                v89.R(y89);
                                zr8 g1 = y89.g1((wi8) cf4.y);
                                v892.T();
                                v892.e(g1, z992);
                            } else {
                                v892.T();
                                v892.e(zr8, z992);
                            }
                            if (!((ArrayList) cf4.z).isEmpty()) {
                                Iterator it = ((ArrayList) cf4.z).iterator();
                                while (it.hasNext()) {
                                    wi8 wi8 = (wi8) it.next();
                                    v892.G().J.b("EES logging created event", wi8.a);
                                    v89.R(y89);
                                    zr8 g12 = y89.g1(wi8);
                                    v892.T();
                                    v892.e(g12, z992);
                                }
                                return;
                            }
                            return;
                        }
                    } catch (zzd unused3) {
                        v892.G().B.c(z992.x, str3, "EES error. appId, eventName");
                    }
                    v892.G().J.b("EES was not applied to event", str3);
                    v892.T();
                    v892.e(zr8, z992);
                    return;
                }
                v892.G().J.b("EES not loaded for", z992.w);
                v892.T();
                v892.e(zr8, z992);
                return;
            case 6:
                w29 w292 = (w29) this.z;
                w292.d.T();
                w292.d.c((String) this.y, (zr8) this.x);
                return;
            case 7:
                v89 v893 = ((w29) this.z).d;
                v893.T();
                z89 z89 = (z89) this.x;
                Object f2 = z89.f();
                z99 z993 = (z99) this.y;
                if (f2 == null) {
                    v893.V(z89.x, z993);
                    return;
                } else {
                    v893.U(z89, z993);
                    return;
                }
            case 8:
                lm8 lm8 = (lm8) this.z;
                v89 v894 = ((w29) this.x).d;
                v894.T();
                String str5 = ((z99) this.y).w;
                z65.k(str5);
                HashMap hashMap = v894.a0;
                v894.n0().b1();
                v894.j0();
                uq8 uq8 = v894.y;
                v89.R(uq8);
                long j2 = lm8.w;
                long j3 = lm8.y;
                uq8.b1();
                uq8.d1();
                try {
                    cursor2 = null;
                    try {
                        cursor = uq8.T1().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, (String) null, (String) null, (String) null, "1");
                        try {
                            if (!cursor.moveToFirst()) {
                                i2 = 4;
                                j = j3;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                x89 = cursor2;
                                if (x89 != 0) {
                                    v894.G().E.c(str5, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                                    return;
                                }
                                String str6 = x89.c;
                                int i3 = lm8.x;
                                if (i3 == 1) {
                                    if (hashMap.containsKey(str6)) {
                                        hashMap.remove(str6);
                                    }
                                    uq8 uq82 = v894.y;
                                    v89.R(uq82);
                                    Long valueOf = Long.valueOf(j2);
                                    uq82.j1(valueOf);
                                    v894.G().J.c(str5, valueOf, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                                    if (j > 0) {
                                        uq8 uq83 = v894.y;
                                        v89.R(uq83);
                                        y19 y19 = (y19) uq83.w;
                                        uq83.b1();
                                        uq83.d1();
                                        Long valueOf2 = Long.valueOf(j);
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("upload_type", 1);
                                        xb4 xb4 = y19.G;
                                        pz8 pz8 = y19.B;
                                        xb4.getClass();
                                        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                        try {
                                            if (((long) uq83.T1().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str5, String.valueOf(i2)})) != 1) {
                                                y19.g(pz8);
                                                pz8.E.c(str5, valueOf2, "Google Signal pending batch not updated. appId, rowId");
                                            }
                                            v894.G().J.c(str5, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                                            v894.o(str5);
                                            return;
                                        } catch (SQLiteException e) {
                                            y19.g(pz8);
                                            pz8.B.d("Failed to update google Signal pending batch. appid, rowId", str5, Long.valueOf(j), e);
                                            throw e;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    if (i3 == 3) {
                                        u89 u89 = (u89) hashMap.get(str6);
                                        if (u89 == null) {
                                            u89 = new u89(v894);
                                            hashMap.put(str6, u89);
                                        } else {
                                            u89.b++;
                                            u89.c = u89.a();
                                        }
                                        v894.Q().getClass();
                                        v894.G().J.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str5, str6, Long.valueOf((u89.c - System.currentTimeMillis()) / 1000));
                                    }
                                    uq8 uq84 = v894.y;
                                    v89.R(uq84);
                                    Long valueOf3 = Long.valueOf(lm8.w);
                                    uq84.o1(valueOf3);
                                    v894.G().J.c(str5, valueOf3, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                                    return;
                                }
                            } else {
                                String string2 = cursor.getString(1);
                                z65.k(string2);
                                long j4 = j3;
                                try {
                                    long j5 = j4;
                                    try {
                                        long j6 = j5;
                                        try {
                                            try {
                                                j = j6;
                                                i2 = 4;
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                j = j6;
                                                i2 = 4;
                                                try {
                                                    pz8 pz82 = ((y19) uq8.w).B;
                                                    y19.g(pz82);
                                                    pz82.B.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                                    if (cursor != null) {
                                                    }
                                                    x89 = cursor2;
                                                    if (x89 != 0) {
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    if (cursor != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            try {
                                                x89 F1 = uq8.F1(string2, j2, cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                                                cursor.close();
                                                x89 = F1;
                                            } catch (SQLiteException e3) {
                                                e = e3;
                                                pz8 pz822 = ((y19) uq8.w).B;
                                                y19.g(pz822);
                                                pz822.B.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                                if (cursor != null) {
                                                }
                                                x89 = cursor2;
                                                if (x89 != 0) {
                                                }
                                            }
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            i2 = 4;
                                            j = j6;
                                            pz8 pz8222 = ((y19) uq8.w).B;
                                            y19.g(pz8222);
                                            pz8222.B.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                            if (cursor != null) {
                                            }
                                            x89 = cursor2;
                                            if (x89 != 0) {
                                            }
                                        }
                                    } catch (SQLiteException e5) {
                                        e = e5;
                                        i2 = 4;
                                        j = j5;
                                        pz8 pz82222 = ((y19) uq8.w).B;
                                        y19.g(pz82222);
                                        pz82222.B.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                        if (cursor != null) {
                                        }
                                        x89 = cursor2;
                                        if (x89 != 0) {
                                        }
                                    }
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    i2 = 4;
                                    j = j4;
                                    pz8 pz822222 = ((y19) uq8.w).B;
                                    y19.g(pz822222);
                                    pz822222.B.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                    if (cursor != null) {
                                    }
                                    x89 = cursor2;
                                    if (x89 != 0) {
                                    }
                                }
                                if (x89 != 0) {
                                }
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            i2 = 4;
                            j = j3;
                            pz8 pz8222222 = ((y19) uq8.w).B;
                            y19.g(pz8222222);
                            pz8222222.B.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                            if (cursor != null) {
                            }
                            x89 = cursor2;
                            if (x89 != 0) {
                            }
                        }
                    } catch (SQLiteException e8) {
                        e = e8;
                        i2 = 4;
                        j = j3;
                        cursor = cursor2;
                        pz8 pz82222222 = ((y19) uq8.w).B;
                        y19.g(pz82222222);
                        pz82222222.B.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                        if (cursor != null) {
                        }
                        x89 = cursor2;
                        if (x89 != 0) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e9) {
                    e = e9;
                    cursor2 = null;
                    i2 = 4;
                    j = j3;
                    cursor = cursor2;
                    pz8 pz822222222 = ((y19) uq8.w).B;
                    y19.g(pz822222222);
                    pz822222222.B.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                    if (cursor != null) {
                    }
                    x89 = cursor2;
                    if (x89 != 0) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor2 = null;
                    cursor = cursor2;
                    if (cursor != null) {
                    }
                    throw th;
                }
            case 9:
                AtomicReference atomicReference2 = (AtomicReference) this.x;
                synchronized (atomicReference2) {
                    try {
                        r69 r69 = (r69) this.z;
                        y19 y192 = (y19) r69.w;
                        q09 q09 = y192.A;
                        y19.e(q09);
                        if (!q09.j1().i(f39.ANALYTICS_STORAGE)) {
                            pz8 pz83 = y192.B;
                            y19.g(pz83);
                            pz83.G.a("Analytics storage consent denied; will not get app instance id");
                            v49 v49 = ((y19) r69.w).I;
                            y19.f(v49);
                            v49.C.set((Object) null);
                            q09 q092 = y192.A;
                            y19.e(q092);
                            q092.C.k((String) null);
                            atomicReference2.set((Object) null);
                        } else {
                            iy8 iy8 = r69.z;
                            if (iy8 == null) {
                                pz8 pz84 = y192.B;
                                y19.g(pz84);
                                pz84.B.a("Failed to get app instance id");
                            } else {
                                atomicReference2.set(iy8.s((z99) this.y));
                                String str7 = (String) atomicReference2.get();
                                if (str7 != null) {
                                    v49 v492 = ((y19) r69.w).I;
                                    y19.f(v492);
                                    v492.C.set(str7);
                                    q09 q093 = y192.A;
                                    y19.e(q093);
                                    q093.C.k(str7);
                                }
                                r69.p1();
                                atomicReference = (AtomicReference) this.x;
                                atomicReference.notify();
                                return;
                            }
                        }
                        atomicReference2.notify();
                        return;
                    } catch (RemoteException e10) {
                        try {
                            pz8 pz85 = ((y19) ((r69) this.z).w).B;
                            y19.g(pz85);
                            pz85.B.b("Failed to get app instance id", e10);
                            atomicReference = (AtomicReference) this.x;
                        } catch (Throwable th5) {
                            ((AtomicReference) this.x).notify();
                            throw th5;
                        }
                    }
                }
            case 10:
                ju8 ju8 = (ju8) this.y;
                r69 r692 = (r69) this.z;
                try {
                    y19 y193 = (y19) r692.w;
                    q09 q094 = y193.A;
                    pz8 pz86 = y193.B;
                    y19.e(q094);
                    if (!q094.j1().i(f39.ANALYTICS_STORAGE)) {
                        y19.g(pz86);
                        pz86.G.a("Analytics storage consent denied; will not get app instance id");
                        v49 v493 = y193.I;
                        y19.f(v493);
                        v493.C.set((Object) null);
                        y19.e(q094);
                        q094.C.k((String) null);
                    } else {
                        iy8 iy82 = r692.z;
                        if (iy82 == null) {
                            y19.g(pz86);
                            pz86.B.a("Failed to get app instance id");
                        } else {
                            str = iy82.s((z99) this.x);
                            if (str != null) {
                                v49 v494 = y193.I;
                                y19.f(v494);
                                v494.C.set(str);
                                y19.e(q094);
                                q094.C.k(str);
                            }
                            r692.p1();
                            d99 = ((y19) r692.w).E;
                            y19.e(d99);
                            d99.P1(str, ju8);
                            return;
                        }
                    }
                    d99 = y193.E;
                } catch (RemoteException e11) {
                    pz8 pz87 = ((y19) r692.w).B;
                    y19.g(pz87);
                    pz87.B.b("Failed to get app instance id", e11);
                } catch (Throwable th6) {
                    d99 d992 = ((y19) r692.w).E;
                    y19.e(d992);
                    d992.P1((String) null, ju8);
                    throw th6;
                }
                y19.e(d99);
                d99.P1(str, ju8);
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                r69 r693 = (r69) this.x;
                z99 z994 = (z99) this.y;
                lm8 lm82 = (lm8) this.z;
                y19 y194 = (y19) r693.w;
                iy8 iy83 = r693.z;
                if (iy83 == null) {
                    pz8 pz88 = y194.B;
                    y19.g(pz88);
                    pz88.B.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    iy83.w(z994, lm82);
                    r693.p1();
                    return;
                } catch (RemoteException e12) {
                    pz8 pz89 = y194.B;
                    y19.g(pz89);
                    pz89.B.c(Long.valueOf(lm82.w), e12, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            case 12:
                ((pz8) this.y).J.a("AppMeasurementJobService processed last upload request.");
                ((x69) ((Service) ((n49) this.x).x)).c((JobParameters) this.z);
                return;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                kd6 kd6 = (kd6) this.x;
                xn6 xn6 = (xn6) this.y;
                ob9 ob9 = (ob9) this.z;
                try {
                    Object b = pt2.b(xn6);
                    xn6 xn62 = (xn6) kd6.C;
                    xn62.l(b);
                    ob9.n(xn62);
                    return;
                } catch (Throwable unused4) {
                    ob9.n(xn6);
                    return;
                }
            default:
                if (((h06) this.x).w == null) {
                    yl0 yl0 = (yl0) this.z;
                    ic9 c = vb9.c();
                    jc9 b2 = vb9.b(c, (jc9) this.y);
                    try {
                        yl0.run();
                        vb9.b(c, b2);
                        return;
                    } catch (Throwable th7) {
                        vb9.b(c, b2);
                        throw th7;
                    }
                } else {
                    ku4.a();
                    return;
                }
        }
    }

    public String toString() {
        switch (this.w) {
            case 14:
                yl0 yl0 = (yl0) this.z;
                StringBuilder sb = new StringBuilder(yl0.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(yl0);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ z46(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.z = obj;
        this.x = obj2;
        this.y = obj3;
    }

    public /* synthetic */ z46(Object obj, Object obj2, boolean z2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    public /* synthetic */ z46() {
        this.w = 1;
    }
}
