package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: yz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yz0 implements g61, y97, zi0, k55, xa6 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ yz0(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x007d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    public Object apply(Object obj) {
        long j;
        boolean z2;
        byte[] bArr;
        int i;
        m42 m42;
        Cursor cursor;
        za6 za6;
        m42 m422;
        Cursor rawQuery;
        sb4 sb4;
        int i2 = this.w;
        int i3 = 6;
        int i4 = 5;
        int i5 = 4;
        int i6 = 3;
        sb4 sb42 = sb4.z;
        int i7 = 2;
        int i8 = 1;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        int i9 = 0;
        switch (i2) {
            case 6:
                za6 za62 = (za6) obj4;
                p00 p00 = (p00) obj3;
                i42 i42 = p00.c;
                String str = p00.a;
                u10 u10 = (u10) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = za62.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                q00 q00 = za62.z;
                if (za62.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * simpleQueryForLong >= q00.a) {
                    za62.u(1, sb42, str);
                    return -1L;
                }
                Long k = za6.k(sQLiteDatabase, u10);
                if (k != null) {
                    j = k.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", u10.a);
                    contentValues.put("priority", Integer.valueOf(vo5.a(u10.c)));
                    contentValues.put("next_request_ms", 0);
                    byte[] bArr2 = u10.b;
                    if (bArr2 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr2, 0));
                    }
                    j = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
                }
                int i10 = q00.e;
                byte[] bArr3 = i42.b;
                if (bArr3.length <= i10) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(j));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(p00.d));
                contentValues2.put("uptime_ms", Long.valueOf(p00.e));
                contentValues2.put("payload_encoding", i42.a.a);
                contentValues2.put("code", p00.b);
                contentValues2.put("num_attempts", 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                if (z2) {
                    bArr = bArr3;
                } else {
                    bArr = new byte[0];
                }
                contentValues2.put("payload", bArr);
                contentValues2.put("product_id", p00.g);
                contentValues2.put("pseudonymous_id", p00.h);
                contentValues2.put("experiment_ids_clear_blob", p00.i);
                contentValues2.put("experiment_ids_encrypted_blob", p00.j);
                long insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
                if (!z2) {
                    int ceil = (int) Math.ceil(((double) bArr3.length) / ((double) i10));
                    for (int i11 = 1; i11 <= ceil; i11++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr3, (i11 - 1) * i10, Math.min(i11 * i10, bArr3.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert));
                        contentValues3.put("sequence_num", Integer.valueOf(i11));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(p00.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
                }
                return Long.valueOf(insert);
            case 7:
                za6 za63 = (za6) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                u10 u102 = (u10) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j2 = cursor2.getLong(0);
                    if (cursor2.getInt(7) != 0) {
                        i = i8;
                    } else {
                        i = 0;
                    }
                    o00 o00 = new o00();
                    o00.i = new HashMap();
                    String string = cursor2.getString(i8);
                    if (string != null) {
                        o00.b = string;
                        o00.g = Long.valueOf(cursor2.getLong(i7));
                        o00.h = Long.valueOf(cursor2.getLong(3));
                        if (i != 0) {
                            String string2 = cursor2.getString(4);
                            if (string2 == null) {
                                m422 = za6.B;
                            } else {
                                m422 = new m42(string2);
                            }
                            o00.f = new i42(m422, cursor2.getBlob(5));
                            za6 = za63;
                        } else {
                            String string3 = cursor2.getString(4);
                            if (string3 == null) {
                                m42 = za6.B;
                            } else {
                                m42 = new m42(string3);
                            }
                            Cursor query = za63.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, (String) null, (String) null, "sequence_num");
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                int i12 = 0;
                                while (query.moveToNext()) {
                                    byte[] blob = query.getBlob(0);
                                    arrayList2.add(blob);
                                    i12 += blob.length;
                                }
                                byte[] bArr4 = new byte[i12];
                                int i13 = 0;
                                int i14 = 0;
                                while (i13 < arrayList2.size()) {
                                    byte[] bArr5 = (byte[]) arrayList2.get(i13);
                                    za6 za64 = za63;
                                    cursor = query;
                                    try {
                                        System.arraycopy(bArr5, 0, bArr4, i14, bArr5.length);
                                        i14 += bArr5.length;
                                        i13++;
                                        query = cursor;
                                        za63 = za64;
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor.close();
                                        throw th;
                                    }
                                }
                                za6 = za63;
                                query.close();
                                o00.f = new i42(m42, bArr4);
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = query;
                                cursor.close();
                                throw th;
                            }
                        }
                        if (!cursor2.isNull(6)) {
                            o00.d = Integer.valueOf(cursor2.getInt(6));
                        }
                        if (!cursor2.isNull(8)) {
                            o00.e = Integer.valueOf(cursor2.getInt(8));
                        }
                        if (!cursor2.isNull(9)) {
                            o00.c = cursor2.getString(9);
                        }
                        if (!cursor2.isNull(10)) {
                            o00.j = cursor2.getBlob(10);
                        }
                        if (!cursor2.isNull(11)) {
                            o00.k = cursor2.getBlob(11);
                        }
                        arrayList.add(new e10(j2, u102, o00.c()));
                        za63 = za6;
                        i7 = 2;
                        i8 = 1;
                    } else {
                        ku4.j("Null transportName");
                        return null;
                    }
                }
                return null;
            default:
                za6 za65 = (za6) obj4;
                HashMap hashMap = (HashMap) obj3;
                am6 am6 = (am6) obj2;
                ArrayList arrayList3 = (ArrayList) am6.z;
                Cursor cursor3 = (Cursor) obj;
                za65.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i9);
                    int i15 = cursor3.getInt(1);
                    sb4 sb43 = sb4.x;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            sb43 = sb4.y;
                        } else if (i15 == 2) {
                            sb4 = sb42;
                            long j3 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new tb4(j3, sb4));
                            i3 = 6;
                            i4 = 5;
                            i5 = 4;
                            i6 = 3;
                            i9 = 0;
                        } else if (i15 == i6) {
                            sb43 = sb4.A;
                        } else if (i15 == i5) {
                            sb43 = sb4.B;
                        } else if (i15 == i4) {
                            sb43 = sb4.C;
                        } else if (i15 == i3) {
                            sb43 = sb4.D;
                        } else {
                            dh4.i("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i15));
                        }
                    }
                    sb4 = sb43;
                    long j32 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new tb4(j32, sb4));
                    i3 = 6;
                    i4 = 5;
                    i5 = 4;
                    i6 = 3;
                    i9 = 0;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i16 = wb4.c;
                    new ArrayList();
                    arrayList3.add(new wb4((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long b = za65.x.b();
                SQLiteDatabase a = za65.a();
                a.beginTransaction();
                try {
                    rawQuery = a.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    rawQuery.moveToNext();
                    oi7 oi7 = new oi7(rawQuery.getLong(0), b);
                    rawQuery.close();
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    am6.y = oi7;
                    am6.A = new zv2(new i47(za65.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * za65.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), q00.f.a));
                    am6.x = (String) za65.A.get();
                    return new ur0((oi7) am6.y, Collections.unmodifiableList(arrayList3), (zv2) am6.A, (String) am6.x);
                } catch (Throwable th3) {
                    a.endTransaction();
                    throw th3;
                }
        }
    }

    public Object b(yi0 yi0) {
        e81 e81 = (e81) this.x;
        r81 r81 = (r81) this.y;
        gs2 gs2 = (gs2) this.z;
        y0 y0Var = new y0(17, (el3) e81.a0(me6.E));
        m56 m56 = yi0.c;
        if (m56 != null) {
            m56.a(y0Var, ev1.w);
        }
        return ar7.H(gl0.E(e81), (e81) null, r81, new ii3((Object) gs2, (Object) yi0, (f61) null, 2), 1);
    }

    public Object c(yb9 yb9) {
        sz0 sz0;
        int i = this.w;
        URL url = null;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case b85.b:
                a01 a01 = (a01) obj3;
                yb9 yb92 = (yb9) obj2;
                yb9 yb93 = (yb9) obj;
                if (!yb92.k()) {
                    return b35.k(new FirebaseException("Firebase Installations failed to get installation auth token for config update listener connection.", yb92.h()));
                }
                if (!yb93.k()) {
                    return b35.k(new FirebaseException("Firebase Installations failed to get installation ID for config update listener connection.", yb93.h()));
                }
                try {
                    url = new URL(a01.c(a01.n));
                } catch (MalformedURLException unused) {
                    try {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                    } catch (IOException e) {
                        return b35.k(new FirebaseException("Failed to open HTTP stream connection", e));
                    }
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                a01.i(httpURLConnection, (String) yb93.i(), ((x00) yb92.i()).a);
                return b35.l(httpURLConnection);
            case 1:
                xb7 xb7 = (xb7) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                wv2 wv2 = (wv2) obj;
                if (yb9.k()) {
                    xb7.d(yb9.i());
                } else if (yb9.h() != null) {
                    xb7.c(yb9.h());
                } else if (atomicBoolean.getAndSet(true)) {
                    ((yb9) ((br4) wv2.x).x).n((Object) null);
                }
                return b35.l((Object) null);
            default:
                nf2 nf2 = (nf2) obj3;
                yb9 yb94 = (yb9) obj2;
                yb9 yb95 = (yb9) obj;
                nf2.getClass();
                if (!yb94.k() || yb94.i() == null) {
                    return b35.l(Boolean.FALSE);
                }
                sz0 sz02 = (sz0) yb94.i();
                if (yb95.k() && (sz0 = (sz0) yb95.i()) != null && sz02.c.equals(sz0.c)) {
                    return b35.l(Boolean.FALSE);
                }
                qz0 qz0 = nf2.d;
                Executor executor = qz0.a;
                return b35.d(executor, new pz0(0, qz0, sz02)).l(executor, new yv0(1, (Object) qz0, (Object) sz02)).f(nf2.b, new mf2(nf2));
        }
    }

    public Object f() {
        en1 en1 = (en1) this.x;
        u10 u10 = (u10) this.y;
        p00 p00 = (p00) this.z;
        za6 za6 = en1.d;
        za6.getClass();
        to5 to5 = u10.c;
        String str = p00.a;
        String str2 = u10.a;
        String r = dh4.r("SQLiteEventStore");
        if (Log.isLoggable(r, 3)) {
            Log.d(r, "Storing event with priority=" + to5 + ", name=" + str + " for destination " + str2);
        }
        ((Long) za6.l(new yz0(za6, p00, u10, 6))).getClass();
        en1.a.Z(u10, 1, false);
        return null;
    }

    public void g(Object obj) {
        am6 am6 = (am6) this.x;
        yb9 yb9 = (yb9) this.y;
        r91 r91 = (r91) this.z;
        sz0 sz0 = (sz0) obj;
        try {
            sz0 sz02 = (sz0) yb9.i();
            if (sz02 != null) {
                ((Executor) am6.z).execute(new w86(r91, ((kg5) am6.y).s(sz02), 1));
            }
        } catch (FirebaseRemoteConfigException e) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }
}
