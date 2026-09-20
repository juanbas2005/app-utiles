package defpackage;

import java.util.List;

/* renamed from: e66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class e66 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ e66(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public final void run() {
        int i = this.w;
        Object obj = this.y;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                ((kb1) ((lb1) obj2)).b((ov2) obj);
                return;
            case 1:
                ((k68) ((am6) obj2).y).j((v27) obj, 3);
                return;
            case 2:
                ol6 ol6 = (ol6) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                    ol6.a();
                }
            case 3:
                hn7 hn7 = (hn7) obj2;
                kf5 kf5 = (kf5) obj;
                hn7.getClass();
                hn7.d(kf5.a, kf5.b);
                return;
            case 4:
                cw0 cw0 = (cw0) obj2;
                ((fk4) cw0.w).i((String) cw0.y, (List) obj);
                return;
            default:
                ve8 ve8 = (ve8) obj2;
                in8 in8 = (in8) obj;
                if (!ve8.y) {
                    ve8.z = in8;
                    in8.x0(ve8);
                    return;
                }
                return;
        }
    }
}
