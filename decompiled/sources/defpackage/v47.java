package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: v47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v47 implements pd5 {
    public final br4 a;
    public final String b;
    public final u47 c = new u47();

    public v47(Collection collection, br4 br4, String str) {
        int i;
        this.a = br4;
        this.b = str;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.length() > 0) {
                u47 u47 = this.c;
                int length = str2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str2.charAt(i2);
                    List list = u47.a;
                    String valueOf = String.valueOf(charAt);
                    int size = list.size();
                    sg3.R(list.size(), size);
                    int i3 = size - 1;
                    int i4 = 0;
                    while (true) {
                        if (i4 > i3) {
                            i = -(i4 + 1);
                            break;
                        }
                        i = (i4 + i3) >>> 1;
                        int k = pd8.k((String) ((yb5) list.get(i)).w, valueOf);
                        if (k >= 0) {
                            if (k <= 0) {
                                break;
                            }
                            i3 = i - 1;
                        } else {
                            i4 = i + 1;
                        }
                    }
                    if (i < 0) {
                        u47 u472 = new u47();
                        list.add((-i) - 1, new yb5(String.valueOf(charAt), u472));
                        u47 = u472;
                    } else {
                        u47 = (u47) ((yb5) list.get(i)).x;
                    }
                }
                if (!u47.b) {
                    u47.b = true;
                } else {
                    h.j(f21.h("The string '", str2, "' was passed several times"));
                    throw null;
                }
            } else {
                h.j("Found an empty string in ".concat(this.b));
                throw null;
            }
        }
        b(this.c);
    }

    public static final void b(u47 u47) {
        List<yb5> list = u47.a;
        for (yb5 yb5 : list) {
            b((u47) yb5.x);
        }
        ArrayList arrayList = new ArrayList();
        for (yb5 yb52 : list) {
            String str = (String) yb52.w;
            u47 u472 = (u47) yb52.x;
            boolean z = u472.b;
            List list2 = u472.a;
            if (z || list2.size() != 1) {
                arrayList.add(new yb5(str, u472));
            } else {
                yb5 yb53 = (yb5) dt0.Q0(list2);
                arrayList.add(new yb5(b81.n(str, (String) yb53.w), (u47) yb53.x));
            }
        }
        list.clear();
        list.addAll(dt0.U0(arrayList, new a91(26)));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, f06] */
    public final Object a(d71 d71, CharSequence charSequence, int i) {
        charSequence.getClass();
        ? obj = new Object();
        obj.w = i;
        u47 u47 = this.c;
        Integer num = null;
        loop0:
        while (obj.w <= charSequence.length()) {
            if (u47.b) {
                num = Integer.valueOf(obj.w);
            }
            for (yb5 yb5 : u47.a) {
                String str = (String) yb5.w;
                u47 u472 = (u47) yb5.x;
                if (d57.Y0(charSequence, str, obj.w, false)) {
                    obj.w = str.length() + obj.w;
                    u47 = u472;
                }
            }
        }
        if (num != null) {
            String obj2 = charSequence.subSequence(i, num.intValue()).toString();
            br4 br4 = this.a;
            Object v = br4.v(d71, obj2);
            if (v == null) {
                return num;
            }
            return new ld5(i, new g20(v, obj2, br4, 16));
        }
        int i2 = i;
        return new ld5(i2, new l92(i2, 2, this, charSequence, obj));
    }
}
