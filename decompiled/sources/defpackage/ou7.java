package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: ou7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ou7 implements y97 {
    public final /* synthetic */ int w;
    public final /* synthetic */ z00 x;
    public final /* synthetic */ u10 y;

    public /* synthetic */ ou7(z00 z00, u10 u10, int i) {
        this.w = i;
        this.x = z00;
        this.y = u10;
    }

    public final Object f() {
        Boolean bool;
        Cursor rawQuery;
        int i = this.w;
        u10 u10 = this.y;
        z00 z00 = this.x;
        switch (i) {
            case b85.b:
                za6 za6 = (za6) z00.c;
                SQLiteDatabase a = za6.a();
                a.beginTransaction();
                try {
                    Long k = za6.k(a, u10);
                    if (k == null) {
                        bool = Boolean.FALSE;
                    } else {
                        rawQuery = za6.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{k.toString()});
                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                        rawQuery.close();
                        bool = valueOf;
                    }
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    return bool;
                } catch (Throwable th) {
                    a.endTransaction();
                    throw th;
                }
            default:
                za6 za62 = (za6) z00.c;
                za62.getClass();
                return (Iterable) za62.l(new yv0(14, (Object) za62, (Object) u10));
        }
    }
}
