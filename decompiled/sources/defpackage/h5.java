package defpackage;

import java.util.Iterator;

/* renamed from: h5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class h5 implements q54 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ h5(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final void o(t54 t54, j54 j54) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                ((vr2) obj).y(j54);
                return;
            case 1:
                ht4 ht4 = (ht4) obj;
                ht4.q = j54.a();
                if (ht4.c != null) {
                    Iterator it = dt0.d1(ht4.f).iterator();
                    while (it.hasNext()) {
                        zs4 zs4 = (zs4) it.next();
                        zs4.getClass();
                        bt4 bt4 = zs4.D;
                        bt4.getClass();
                        bt4.a.z = j54.a();
                        bt4.d = j54.a();
                        bt4.b();
                    }
                    return;
                }
                return;
            case 2:
                cx0 cx0 = (cx0) obj;
                cx0.getClass();
                cx0.x = j54.a();
                cx0.a();
                return;
            default:
                hf6 hf6 = (hf6) obj;
                if (j54 == j54.ON_START) {
                    hf6.h = true;
                    return;
                } else if (j54 == j54.ON_STOP) {
                    hf6.h = false;
                    return;
                } else {
                    return;
                }
        }
    }
}
