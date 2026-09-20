package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: gr2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gr2 implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ ch a;

    public /* synthetic */ gr2(ch chVar) {
        this.a = chVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) this.a.C(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
