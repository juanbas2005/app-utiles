package defpackage;

/* renamed from: ob3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ob3 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ob3(int i, int i2, String str) {
        this.w = 5;
        this.x = i;
        this.y = str;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.w;
        boolean z3 = false;
        vs7 vs7 = vs7.a;
        Object obj3 = this.y;
        int i2 = this.x;
        switch (i) {
            case b85.b:
                ((Integer) obj2).intValue();
                gr8.k((nb3) obj3, (yt2) obj, b85.v(i2 | 1));
                return vs7;
            case 1:
                wz3 wz3 = (wz3) obj3;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (yt2.V(intValue & 1, z3)) {
                    hg3 e = wz3.b.q.e(i2);
                    ((uz3) e.c).d.C(yz3.a, Integer.valueOf(i2 - e.a), yt2, 6);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 2:
                i34 i34 = (i34) obj3;
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt22.V(intValue2 & 1, z)) {
                    hg3 e2 = i34.b.p.e(i2);
                    ((f34) e2.c).c.C(i34.c, Integer.valueOf(i2 - e2.a), yt22, 0);
                } else {
                    yt22.Y();
                }
                return vs7;
            case 3:
                ((Integer) obj2).getClass();
                ((cu4) obj3).a(b85.v(i2 | 1), (yt2) obj);
                return vs7;
            case 4:
                bb5 bb5 = (bb5) obj3;
                yt2 yt23 = (yt2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt23.V(intValue3 & 1, z2)) {
                    hg3 e3 = bb5.b.x().e(i2);
                    ((va5) e3.c).b.C(eb5.a, Integer.valueOf(i2 - e3.a), yt23, 0);
                } else {
                    yt23.Y();
                }
                return vs7;
            case 5:
                ((Integer) obj2).getClass();
                mp7.J(i2, (String) obj3, (yt2) obj, b85.v(1));
                return vs7;
            default:
                a37 a37 = (a37) obj3;
                yt2 yt24 = (yt2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                }
                if (yt24.V(intValue4 & 1, z3)) {
                    mp7.l(su0.J(1454828237, new z26(i2, 1), yt24), (ml4) null, su0.J(1206860043, new xa7(19, (Object) a37), yt24), yt24, 390);
                } else {
                    yt24.Y();
                }
                return vs7;
        }
    }

    public /* synthetic */ ob3(int i, int i2, Object obj) {
        this.w = i2;
        this.y = obj;
        this.x = i;
    }

    public /* synthetic */ ob3(int i, a37 a37) {
        this.w = 6;
        this.x = i;
        this.y = a37;
    }
}
