package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tb0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class tb0 {
    public static final z97 a = new z97(new o(11));
    public static final z97 b = new z97(new o(12));
    public static final z97 c = new z97(new o(13));
    public static final z97 d = new z97(new o(14));

    static {
        new z97(new o(15));
    }

    public static x83 a(String str, String str2) {
        w83 w83 = new w83(str, 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 224);
        int i = e38.a;
        xy1 xy1 = new xy1(1);
        ArrayList arrayList = xy1.a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            xy1.a = arrayList;
        } else {
            arrayList.clear();
        }
        xy1.b(str2, arrayList);
        List list = xy1.a;
        if (list == null) {
            list = a42.w;
        }
        w83.a(w83, list, new ky6(jt0.b), 16374);
        return w83.b();
    }
}
