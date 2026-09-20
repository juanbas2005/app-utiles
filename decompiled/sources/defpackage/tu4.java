package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: tu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tu4 implements is2 {
    public final /* synthetic */ a37 A;
    public final /* synthetic */ oi6 w;
    public final /* synthetic */ zs4 x;
    public final /* synthetic */ oe6 y;
    public final /* synthetic */ aq4 z;

    public tu4(oi6 oi6, zs4 zs4, pe6 pe6, aq4 aq4, a37 a37) {
        this.w = oi6;
        this.x = zs4;
        this.y = pe6;
        this.z = aq4;
        this.A = a37;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: zs4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: zs4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: zs4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: zs4} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        zs4 zs4;
        fk fkVar = (fk) obj;
        zs4 zs42 = (zs4) obj2;
        yt2 yt2 = (yt2) obj3;
        ((Number) obj4).intValue();
        boolean e = sg3.e(this.w.y.getValue(), this.x);
        if (!((Boolean) this.z.getValue()).booleanValue() && !e) {
            List list = (List) this.A.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    zs4 = null;
                    break;
                }
                Object previous = listIterator.previous();
                if (sg3.e(zs42, previous)) {
                    zs4 = previous;
                    break;
                }
            }
            zs42 = zs4;
        }
        if (zs42 == null) {
            yt2.e0(105930796);
        } else {
            yt2.e0(-1520603531);
            x91.c(zs42, this.y, su0.J(-1263531443, new qq1(3, (Object) zs42, (Object) fkVar), yt2), yt2, 384);
        }
        yt2.r(false);
        return vs7.a;
    }
}
