package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: yo1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yo1 implements ep1, y97 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ yo1(z00 z00, Iterable iterable, u10 u10, long j) {
        this.w = 2;
        this.x = z00;
        this.A = iterable;
        this.z = u10;
        this.y = j;
    }

    public ScheduledFuture a(ji8 ji8) {
        int i = this.w;
        Object obj = this.z;
        long j = this.y;
        Object obj2 = this.A;
        dp1 dp1 = (dp1) this.x;
        switch (i) {
            case b85.b:
                return dp1.x.schedule(new bp1(dp1, (Runnable) obj2, ji8, 1), j, (TimeUnit) obj);
            default:
                return dp1.x.schedule(new cp1(dp1, (Callable) obj2, ji8, 0), j, (TimeUnit) obj);
        }
    }

    public Object f() {
        Cursor rawQuery;
        z00 z00 = (z00) this.x;
        Iterable iterable = (Iterable) this.A;
        u10 u10 = (u10) this.z;
        za6 za6 = (za6) z00.c;
        za6.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(za6.B(iterable));
            SQLiteDatabase a = za6.a();
            a.beginTransaction();
            try {
                a.compileStatement(concat).execute();
                rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (String[]) null);
                while (rawQuery.moveToNext()) {
                    int i = rawQuery.getInt(0);
                    za6.u((long) i, sb4.B, rawQuery.getString(1));
                }
                rawQuery.close();
                a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a.setTransactionSuccessful();
                a.endTransaction();
            } catch (Throwable th) {
                a.endTransaction();
                throw th;
            }
        }
        za6.l(new wa6(((es0) z00.g).b() + this.y, u10));
        return null;
    }

    public /* synthetic */ yo1(dp1 dp1, Object obj, long j, TimeUnit timeUnit, int i) {
        this.w = i;
        this.x = dp1;
        this.A = obj;
        this.y = j;
        this.z = timeUnit;
    }
}
