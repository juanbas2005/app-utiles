package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;

/* renamed from: ch  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ch implements is2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ch(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.w;
        int i2 = 2;
        boolean z = true;
        vs7 vs7 = vs7.a;
        Object obj5 = this.x;
        switch (i) {
            case b85.b:
                dh dhVar = (dh) obj5;
                wq7 b = ((el2) dhVar.A).b((ea7) obj, (am2) obj2, ((yl2) obj3).a, ((zl2) obj4).a);
                if (!(b instanceof wq7)) {
                    cf4 cf4 = new cf4(b, dhVar.F);
                    dhVar.F = cf4;
                    Object obj6 = cf4.z;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                Object obj7 = b.w;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                pr2 pr2 = new pr2(sQLiteQuery);
                n87 n87 = (n87) ((br4) obj5).x;
                int length = n87.z.length;
                for (int i3 = 1; i3 < length; i3++) {
                    int i4 = n87.z[i3];
                    if (i4 == 1) {
                        pr2.f(n87.A[i3], i3);
                    } else if (i4 == 2) {
                        pr2.W(n87.B[i3], i3);
                    } else if (i4 == 3) {
                        String str2 = n87.C[i3];
                        str2.getClass();
                        pr2.r(i3, str2);
                    } else if (i4 == 4) {
                        byte[] bArr = n87.D[i3];
                        bArr.getClass();
                        pr2.h(i3, bArr);
                    } else if (i4 == 5) {
                        pr2.m(i3);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            case 2:
                fw0 fw0 = (fw0) obj5;
                r04 r04 = (r04) obj;
                ((Integer) obj2).getClass();
                yt2 yt2 = (yt2) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    if (yt2.g(r04)) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 131) == 130) {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    fw0.u(r04, yt2, Integer.valueOf(intValue & 14));
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                str3.getClass();
                str4.getClass();
                ((vs4) obj5).g(str3, str4, booleanValue, booleanValue2);
                return vs7;
        }
    }
}
