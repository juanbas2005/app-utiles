package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: wa6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wa6 implements xa6 {
    public final /* synthetic */ long w;
    public final /* synthetic */ u10 x;

    public /* synthetic */ wa6(long j, u10 u10) {
        this.w = j;
        this.x = u10;
    }

    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.w));
        u10 u10 = this.x;
        String str = u10.a;
        to5 to5 = u10.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(vo5.a(to5))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(vo5.a(to5)));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
