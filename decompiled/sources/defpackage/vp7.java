package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: vp7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vp7 {
    public static final vp7 d = new vp7(a42.w, b42.w, (vp7) null);
    public final List a;
    public final Map b;
    public final vp7 c;

    public vp7(List list, Map map, vp7 vp7) {
        this.a = list;
        this.b = map;
        this.c = vp7;
    }

    public final cs3 a(int i) {
        cs3 cs3 = (cs3) this.b.get(Integer.valueOf(i));
        if (cs3 != null) {
            return cs3;
        }
        vp7 vp7 = this.c;
        if (vp7 != null) {
            return vp7.a(i);
        }
        return null;
    }
}
