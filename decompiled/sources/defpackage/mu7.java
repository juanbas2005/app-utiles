package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: mu7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mu7 implements y97 {
    public final /* synthetic */ int w;
    public final /* synthetic */ za6 x;

    public /* synthetic */ mu7(za6 za6, int i) {
        this.w = i;
        this.x = za6;
    }

    public final Object f() {
        Cursor rawQuery;
        int i = this.w;
        za6 za6 = this.x;
        switch (i) {
            case b85.b:
                za6.getClass();
                int i2 = ur0.e;
                am6 am6 = new am6(6, false);
                am6.y = null;
                am6.z = new ArrayList();
                am6.A = null;
                am6.x = "";
                HashMap hashMap = new HashMap();
                SQLiteDatabase a = za6.a();
                a.beginTransaction();
                try {
                    ur0 ur0 = (ur0) za6.D(a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new yz0(za6, hashMap, am6, 8));
                    a.setTransactionSuccessful();
                    return ur0;
                } finally {
                    a.endTransaction();
                }
            default:
                long b = za6.x.b() - za6.z.d;
                SQLiteDatabase a2 = za6.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(b)};
                    rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i3 = rawQuery.getInt(0);
                        za6.u((long) i3, sb4.y, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } catch (Throwable th) {
                    a2.endTransaction();
                    throw th;
                }
        }
    }
}
