package defpackage;

import android.database.Cursor;
import android.net.Uri;
import cu.lestebang.utiletecsa.feature.settings.service.UssdAutoUpdaterService;

/* renamed from: ny7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ny7 implements vr2 {
    public final /* synthetic */ UssdAutoUpdaterService w;
    public final /* synthetic */ String[] x;
    public final /* synthetic */ long y;

    public /* synthetic */ ny7(UssdAutoUpdaterService ussdAutoUpdaterService, String[] strArr, long j) {
        this.w = ussdAutoUpdaterService;
        this.x = strArr;
        this.y = j;
    }

    public final Object y(Object obj) {
        Throwable th;
        Uri uri = (Uri) obj;
        d37 d37 = UssdAutoUpdaterService.T;
        uri.getClass();
        Cursor query = this.w.getContentResolver().query(uri, this.x, (String) null, (String[]) null, "date DESC");
        boolean z = false;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    if (this.y - query.getLong(query.getColumnIndexOrThrow("date")) < 10000) {
                        z = true;
                    }
                }
                query.close();
            } catch (Throwable th2) {
                ed1.i(query, th);
                throw th2;
            }
        }
        return Boolean.valueOf(z);
    }
}
