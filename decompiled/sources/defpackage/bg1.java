package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bg1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bg1 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;

    public /* synthetic */ bg1(String str, String str2, int i) {
        this.w = i;
        this.x = str;
        this.y = str2;
    }

    public final Object y(Object obj) {
        LinkedHashMap linkedHashMap;
        int i = this.w;
        String str = this.y;
        String str2 = this.x;
        switch (i) {
            case b85.b:
                mk6.c((ok6) obj, str2 + ", " + str);
                return vs7.a;
            case 1:
                mo2 mo2 = (mo2) obj;
                Map map = mo2.l;
                yl5 yl5 = new yl5(str);
                map.getClass();
                if (map.isEmpty()) {
                    Map singletonMap = Collections.singletonMap(str2, yl5);
                    singletonMap.getClass();
                    linkedHashMap = singletonMap;
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                    linkedHashMap2.put(str2, yl5);
                    linkedHashMap = linkedHashMap2;
                }
                return mo2.a(mo2, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, linkedHashMap, false, false, 14335);
            default:
                ua6 ua6 = (ua6) obj;
                ua6.getClass();
                ab6 k0 = ua6.k0("SELECT value FROM ussd_responses WHERE ussd_code = ? AND field_name = ? LIMIT 1");
                try {
                    k0.F(1, str2);
                    k0.F(2, str);
                    String str3 = null;
                    if (k0.i0()) {
                        if (!k0.isNull(0)) {
                            str3 = k0.R(0);
                        }
                    }
                    return str3;
                } finally {
                    k0.close();
                }
        }
    }
}
