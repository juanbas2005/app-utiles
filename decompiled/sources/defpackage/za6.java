package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: za6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class za6 implements Closeable {
    public static final m42 B = new m42("proto");
    public final mu5 A;
    public final rg6 w;
    public final es0 x;
    public final es0 y;
    public final q00 z;

    public za6(es0 es0, es0 es02, q00 q00, rg6 rg6, mu5 mu5) {
        this.w = rg6;
        this.x = es0;
        this.y = es02;
        this.z = q00;
        this.A = mu5;
    }

    public static String B(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((e10) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object D(Cursor cursor, xa6 xa6) {
        try {
            return xa6.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long k(SQLiteDatabase sQLiteDatabase, u10 u10) {
        Long l;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{u10.a, String.valueOf(vo5.a(u10.c))}));
        byte[] bArr = u10.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            if (!query.moveToNext()) {
                l = null;
            } else {
                l = Long.valueOf(query.getLong(0));
            }
            query.close();
            return l;
        } catch (Throwable th) {
            Throwable th2 = th;
            query.close();
            throw th2;
        }
    }

    public final SQLiteDatabase a() {
        rg6 rg6 = this.w;
        Objects.requireNonNull(rg6);
        es0 es0 = this.y;
        long b = es0.b();
        while (true) {
            try {
                return rg6.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (es0.b() < ((long) this.z.c) + b) {
                    SystemClock.sleep(50);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    public final void close() {
        this.w.close();
    }

    public final Object l(xa6 xa6) {
        SQLiteDatabase a = a();
        a.beginTransaction();
        try {
            Object apply = xa6.apply(a);
            a.setTransactionSuccessful();
            return apply;
        } finally {
            a.endTransaction();
        }
    }

    public final ArrayList o(SQLiteDatabase sQLiteDatabase, u10 u10, int i) {
        ArrayList arrayList = new ArrayList();
        Long k = k(sQLiteDatabase, u10);
        if (k == null) {
            return arrayList;
        }
        D(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{k.toString()}, (String) null, (String) null, (String) null, String.valueOf(i)), new yz0(this, arrayList, u10, 7));
        return arrayList;
    }

    public final void u(long j, sb4 sb4, String str) {
        l(new tz0((Object) str, (Object) sb4, j));
    }

    public final Object v(y97 y97) {
        SQLiteDatabase a = a();
        es0 es0 = this.y;
        long b = es0.b();
        while (true) {
            try {
                a.beginTransaction();
                try {
                    Object f = y97.f();
                    a.setTransactionSuccessful();
                    return f;
                } finally {
                    a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (es0.b() < ((long) this.z.c) + b) {
                    SystemClock.sleep(50);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }
}
