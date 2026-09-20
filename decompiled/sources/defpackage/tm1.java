package defpackage;

import io.ktor.http.Url;
import java.util.List;

/* renamed from: tm1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class tm1 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ List x;

    public /* synthetic */ tm1(int i, List list) {
        this.w = i;
        this.x = list;
    }

    public final Object b() {
        int i = this.w;
        List list = this.x;
        switch (i) {
            case b85.b:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            case 1:
                return list;
            case 2:
                return Integer.valueOf(list.size());
            case 3:
                return Integer.valueOf(list.size());
            case 4:
                return ((as3) list.get(0)).J();
            case 5:
                return ((as3) list.get(0)).J();
            default:
                return Url.segments_delegate$lambda$0(list);
        }
    }
}
