package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: jt2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jt2 {
    public static final jt2 b = new jt2(sg3.E(dt2.d, gt2.d, et2.d, ft2.d));
    public final LinkedHashMap a;

    public jt2(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            up2 up2 = ((ht2) next).a;
            Object obj = linkedHashMap.get(up2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(up2, obj);
            }
            ((List) obj).add(next);
        }
        this.a = linkedHashMap;
    }

    public final it2 a(up2 up2, String str) {
        Integer num;
        up2.getClass();
        str.getClass();
        List<ht2> list = (List) this.a.get(up2);
        if (list == null) {
            return null;
        }
        for (ht2 ht2 : list) {
            int i = 0;
            if (k57.u0(str, ht2.b, false)) {
                String substring = str.substring(ht2.b.length());
                if (substring.length() != 0) {
                    int length = substring.length();
                    int i2 = 0;
                    while (true) {
                        if (i < length) {
                            int charAt = substring.charAt(i) - '0';
                            if (charAt < 0 || charAt >= 10) {
                                break;
                            }
                            i2 = (i2 * 10) + charAt;
                            i++;
                        } else {
                            num = Integer.valueOf(i2);
                            break;
                        }
                    }
                }
                num = null;
                if (num != null) {
                    return new it2(ht2, num.intValue());
                }
            }
        }
        return null;
    }
}
