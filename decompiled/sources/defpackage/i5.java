package defpackage;

import java.util.Map;

/* renamed from: i5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i5 implements jw1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i5(t54 t54, q54 q54, Object obj, int i) {
        this.a = i;
        this.c = t54;
        this.b = q54;
        this.d = obj;
    }

    public final void b() {
        in8 k;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case b85.b:
                ((sr2) obj3).b();
                ((t54) obj2).k().M0((h5) obj);
                return;
            case 1:
                ((yx6) obj3).remove(obj2);
                ((mk) obj).d.k(obj2);
                return;
            case 2:
                zs4 zs4 = (zs4) obj2;
                ((vu1) obj3).b().c(zs4);
                ((yx6) obj).remove((Object) zs4);
                return;
            case 3:
                ((t54) obj2).k().M0((o54) obj3);
                l30 l30 = (l30) ((h06) obj).w;
                if (l30 != null) {
                    l30.a();
                    return;
                }
                return;
            case 4:
                t54 t54 = (t54) obj2;
                if (!(t54 == null || (k = t54.k()) == null)) {
                    k.M0((h5) obj3);
                }
                cx0 cx0 = (cx0) obj;
                j54 j54 = j54.ON_DESTROY;
                cx0.getClass();
                cx0.x = j54.a();
                cx0.a();
                return;
            default:
                pe6 pe6 = (pe6) obj3;
                ue6 ue6 = (ue6) obj;
                if (pe6.x.k(obj2) == ue6) {
                    Map map = pe6.w;
                    Map d2 = ue6.d();
                    if (d2.isEmpty()) {
                        map.remove(obj2);
                        return;
                    } else {
                        map.put(obj2, d2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public /* synthetic */ i5(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
