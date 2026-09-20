package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: lm2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lm2 extends f56 {
    public static final yh4 d = ie1.G("application/x-www-form-urlencoded");
    public final List b;
    public final List c;

    static {
        k26 k26 = yh4.e;
    }

    public lm2(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.b = fg8.j(arrayList);
        this.c = fg8.j(arrayList2);
    }

    public final long a() {
        return e((dd0) null, true);
    }

    public final yh4 b() {
        return d;
    }

    public final void d(dd0 dd0) {
        e(dd0, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: sc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: sc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: sc0} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final long e(dd0 dd0, boolean z) {
        sc0 sc0;
        if (z) {
            sc0 = new Object();
        } else {
            dd0.getClass();
            sc0 = dd0.c();
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sc0.a0(38);
            }
            sc0.o0((String) list.get(i));
            sc0.a0(61);
            sc0.o0((String) this.c.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = sc0.x;
        sc0.a();
        return j;
    }
}
