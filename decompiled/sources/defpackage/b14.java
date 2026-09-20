package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b14  reason: default package */
public final class b14 implements sr2 {
    public final /* synthetic */ int w;
    public final c14 x;

    public /* synthetic */ b14(c14 c14, int i) {
        this.w = i;
        this.x = c14;
    }

    public final Object b() {
        int i = this.w;
        c14 c14 = this.x;
        switch (i) {
            case b85.b /*0*/:
                hz2 hz2 = ((pj3) c14.D.x).l;
                String str = c14.A.a.a;
                hz2.getClass();
                str.getClass();
                return sf4.a0(new ArrayList());
            case 1:
                c14.C.getClass();
                return new ArrayList(et0.e0(a42.w, 10));
            default:
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) p25.q(c14.E, c14.I[0])).entrySet()) {
                    co3 b = co3.b((String) entry.getKey());
                    hv3 hv3 = ((v16) entry.getValue()).b;
                    gv3 gv3 = hv3.a;
                    int ordinal = gv3.ordinal();
                    if (ordinal == 2) {
                        hashMap.put(b, b);
                    } else if (ordinal == 5) {
                        String str2 = hv3.f;
                        if (gv3 != gv3.E) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            hashMap.put(b, co3.b(str2));
                        }
                    }
                }
                return hashMap;
        }
    }
}
