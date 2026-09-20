package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: vz1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vz1 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ vr2 x;

    public /* synthetic */ vz1(int i, vr2 vr2) {
        this.w = i;
        this.x = vr2;
    }

    public final Object y(Object obj) {
        boolean z;
        int i = this.w;
        vr2 vr2 = this.x;
        switch (i) {
            case b85.b:
                return new xz1((yz1) obj, vr2);
            case 1:
                ln7 ln7 = (ln7) obj;
                iv2 iv2 = null;
                if (ln7 instanceof kv2) {
                    iv2 iv22 = ((kv2) ln7).K;
                    if (iv22 != null) {
                        iv2 = iv22;
                    }
                    if (iv2 == null) {
                        z = true;
                    } else {
                        z = ((Boolean) vr2.y(iv2)).booleanValue();
                    }
                    return Boolean.valueOf(z);
                }
                h.s("Node is not a GestureNode instance");
                return null;
            case 2:
                String str = (String) obj;
                str.getClass();
                Integer v0 = k57.v0(str);
                if (v0 != null) {
                    vr2.y(v0);
                }
                return vs7.a;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    vr2.y(Boolean.TRUE);
                }
                return vs7.a;
            case 4:
                Map map = (Map) obj;
                map.getClass();
                Iterable values = map.values();
                if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
                    Iterator it = values.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                            }
                        }
                    }
                }
                vr2.y(Boolean.TRUE);
                return vs7.a;
            case 5:
                ix6 ix6 = (ix6) vr2.y((mx6) obj);
                synchronized (nx6.c) {
                    nx6.d = nx6.d.n(ix6.g());
                }
                return ix6;
            default:
                Long l = (Long) obj;
                l.getClass();
                return vr2.y(l);
        }
    }
}
