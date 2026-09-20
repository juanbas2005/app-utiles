package defpackage;

/* renamed from: ny1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ny1 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ float x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ny1(float f, d06 d06) {
        this.w = 0;
        this.x = f;
        this.y = d06;
    }

    public final Object y(Object obj) {
        boolean z;
        int i = this.w;
        boolean z2 = false;
        float f = this.x;
        Object obj2 = this.y;
        switch (i) {
            case b85.b:
                d06 d06 = (d06) obj2;
                yy1 yy1 = (yy1) obj;
                boolean e = sg3.e(yy1.O(), "waiting");
                if (yy1.W() != null) {
                    z75 W = yy1.W();
                    W.getClass();
                    int i2 = az1.a;
                    if (W != z75.x ? !(f <= 30.0f || f > 90.0f) : f <= 30.0f) {
                        z = true;
                        if (d06.w || (e && z)) {
                            z2 = true;
                        }
                        d06.w = z2;
                        return Boolean.valueOf(!z2);
                    }
                }
                z = false;
                z2 = true;
                d06.w = z2;
                return Boolean.valueOf(!z2);
            case 1:
                vr2 vr2 = (vr2) obj2;
                gk gkVar = (gk) obj;
                return new k51(((k51) vr2.y(gkVar)).a, ((k51) vr2.y(gkVar)).b, f, (bv6) null);
            default:
                mm7 mm7 = (mm7) obj2;
                long longValue = ((Long) obj).longValue();
                boolean h = mm7.h();
                cd5 cd5 = mm7.h;
                if (!h) {
                    if (cd5.d() == Long.MIN_VALUE) {
                        cd5.e(longValue);
                        ((ed5) mm7.a.w).setValue(Boolean.TRUE);
                    }
                    long d = longValue - cd5.d();
                    int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                    if (i3 != 0) {
                        d = dh4.D(((double) d) / ((double) f));
                    }
                    mm7.o(d);
                    if (i3 == 0) {
                        z2 = true;
                    }
                    mm7.i(z2, d);
                }
                return vs7.a;
        }
    }

    public /* synthetic */ ny1(Object obj, float f, int i) {
        this.w = i;
        this.y = obj;
        this.x = f;
    }
}
