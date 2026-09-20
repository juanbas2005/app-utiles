package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;

/* renamed from: tz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class tz0 implements g61, ko1, xa6, y97 {
    public final /* synthetic */ long w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ tz0(Object obj, long j, Object obj2) {
        this.x = obj;
        this.w = j;
        this.y = obj2;
    }

    /* JADX INFO: finally extract failed */
    public Object apply(Object obj) {
        boolean z;
        String str = (String) this.x;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((sb4) this.y).w;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            if (rawQuery.getCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            rawQuery.close();
            long j = this.w;
            if (!z) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(f21.g(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public Object c(yb9 yb9) {
        return ((wz0) this.x).b(yb9, this.w, (HashMap) this.y);
    }

    public void e(nu5 nu5) {
        ((q91) nu5.get()).d((String) this.x, this.w, (p10) this.y);
    }

    public Object f() {
        z00 z00 = (z00) this.x;
        za6 za6 = (za6) z00.c;
        long b = ((es0) z00.g).b() + this.w;
        za6.getClass();
        za6.l(new wa6(b, (u10) this.y));
        return null;
    }

    public /* synthetic */ tz0(Object obj, Object obj2, long j) {
        this.x = obj;
        this.y = obj2;
        this.w = j;
    }
}
