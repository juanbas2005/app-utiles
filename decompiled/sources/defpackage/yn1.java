package defpackage;

/* renamed from: yn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yn1 implements hs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ yn1(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.w;
        vs7 vs7 = vs7.a;
        boolean z = false;
        Object obj4 = this.x;
        switch (i2) {
            case b85.b:
                long j = ((jt0) obj).a;
                yt2 yt2 = (yt2) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (yt2.f(j)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                if (yt2.V(intValue & 1, z)) {
                    zn1.b(((hd7) obj4).c, j, yt2, (intValue << 3) & 112);
                } else {
                    yt2.Y();
                }
                return vs7;
            default:
                Void voidR = (Void) obj;
                ((Number) obj3).intValue();
                ((fw0) obj4).H((yt2) obj2, 0);
                return vs7;
        }
    }
}
