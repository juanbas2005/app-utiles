package defpackage;

import java.util.Iterator;

/* renamed from: cv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cv2 implements al6 {
    public final /* synthetic */ int a = 1;
    public final ds2 b;
    public final Object c;

    public cv2(al6 al6, vr2 vr2) {
        al6.getClass();
        this.c = al6;
        this.b = vr2;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case b85.b:
                return new bv2(this);
            case 1:
                return new zd2(this);
            default:
                return new bv2(this, (byte) 0);
        }
    }

    public cv2(xg2 xg2, l61 l61) {
        this.c = xg2;
        this.b = l61;
    }

    public cv2(sr2 sr2, vr2 vr2) {
        vr2.getClass();
        this.c = sr2;
        this.b = vr2;
    }
}
