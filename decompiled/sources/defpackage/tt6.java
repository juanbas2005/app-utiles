package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: tt6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tt6 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public yb5 c = new yb5("V", (Object) null);

    public tt6(kg5 kg5, String str, String str2) {
        this.a = str2;
    }

    public final void a(String str, zj3... zj3Arr) {
        cp7 cp7;
        str.getClass();
        if (zj3Arr.length == 0) {
            cp7 = null;
        } else {
            ss ssVar = new ss(1, new zh(2, (Object) zj3Arr));
            int F = tf4.F(et0.e0(ssVar, 10));
            if (F < 16) {
                F = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(F);
            Iterator it = ssVar.iterator();
            while (true) {
                f02 f02 = (f02) it;
                if (!f02.x.hasNext()) {
                    break;
                }
                ka3 ka3 = (ka3) f02.next();
                linkedHashMap.put(Integer.valueOf(ka3.a), (zj3) ka3.b);
            }
            cp7 = new cp7(linkedHashMap);
        }
        this.b.add(new yb5(str, cp7));
    }

    public final void b(zo3 zo3) {
        zo3.getClass();
        this.c = new yb5(zo3.y, (Object) null);
    }

    public final void c(String str, zj3... zj3Arr) {
        str.getClass();
        ss ssVar = new ss(1, new zh(2, (Object) zj3Arr));
        int F = tf4.F(et0.e0(ssVar, 10));
        if (F < 16) {
            F = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F);
        Iterator it = ssVar.iterator();
        while (true) {
            f02 f02 = (f02) it;
            if (f02.x.hasNext()) {
                ka3 ka3 = (ka3) f02.next();
                linkedHashMap.put(Integer.valueOf(ka3.a), (zj3) ka3.b);
            } else {
                this.c = new yb5(str, new cp7(linkedHashMap));
                return;
            }
        }
    }
}
