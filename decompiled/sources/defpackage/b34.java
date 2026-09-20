package defpackage;

/* renamed from: b34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class b34 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ d34 x;

    public /* synthetic */ b34(d34 d34, int i) {
        this.w = i;
        this.x = d34;
    }

    public final Object y(Object obj) {
        int i = this.w;
        d34 d34 = this.x;
        switch (i) {
            case b85.b /*0*/:
                h24 h24 = (h24) d34.K.b();
                int a = h24.a();
                int i2 = 0;
                while (true) {
                    if (i2 >= a) {
                        i2 = -1;
                    } else if (!h24.b(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Integer) obj).intValue();
                h24 h242 = (h24) d34.K.b();
                if (intValue < 0 || intValue >= h242.a()) {
                    int a2 = h242.a();
                    bc3.a("Can't scroll to index " + intValue + ", it is out of bounds [0, " + a2 + ")");
                }
                ar7.H(d34.J0(), (e81) null, (r81) null, new bi1(d34, intValue, (f61) null, 1), 3);
                return Boolean.TRUE;
        }
    }
}
