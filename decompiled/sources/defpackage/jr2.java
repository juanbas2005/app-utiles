package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* renamed from: jr2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class jr2 implements DatabaseErrorHandler {
    public final /* synthetic */ qa a;
    public final /* synthetic */ ji8 b;

    public /* synthetic */ jr2(qa qaVar, ji8 ji8) {
        this.a = qaVar;
        this.b = ji8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r3 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r3.hasNext() != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r4 = ((android.util.Pair) r3.next()).second;
        r4.getClass();
        defpackage.qa.f((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        r3 = r4.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r3 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        defpackage.qa.f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0053 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051 A[ExcHandler: all (r0v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v9 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r3v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r3v6 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r3v6 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:12:0x004c, B:15:0x0053, B:16:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:12:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        int i = mr2.D;
        sQLiteDatabase.getClass();
        ji8 ji8 = this.b;
        ir2 ir2 = (ir2) ji8.x;
        if (ir2 == null || !ir2.w.equals(sQLiteDatabase)) {
            ir2 = new ir2(sQLiteDatabase);
            ji8.x = ir2;
        }
        SQLiteDatabase sQLiteDatabase2 = ir2.w;
        this.a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ir2 + ".path");
        if (!sQLiteDatabase2.isOpen()) {
            String path = sQLiteDatabase2.getPath();
            if (path != null) {
                qa.f(path);
                return;
            }
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            list = sQLiteDatabase2.getAttachedDbs();
            ir2.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
        }
        if (list == null) {
            for (Pair pair : list) {
                Object obj = pair.second;
                obj.getClass();
                qa.f((String) obj);
            }
            return;
        }
        String path2 = sQLiteDatabase2.getPath();
        if (path2 != null) {
            qa.f(path2);
        }
    }
}
