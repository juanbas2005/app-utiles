package defpackage;

/* renamed from: z30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class z30 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ aq4 x;
    public final /* synthetic */ aq4 y;

    public /* synthetic */ z30(aq4 aq4, aq4 aq42, int i) {
        this.w = i;
        this.x = aq4;
        this.y = aq42;
    }

    public final Object y(Object obj) {
        long j;
        int i = this.w;
        aq4 aq4 = this.y;
        aq4 aq42 = this.x;
        switch (i) {
            case b85.b:
                ch0 ch0 = (ch0) obj;
                ch0.getClass();
                float intBitsToFloat = (Float.intBitsToFloat((int) (ch0.w.e() & 4294967295L)) * ((float) Math.tan((double) ((float) Math.toRadians(11.06d))))) / 2.0f;
                long floatToRawIntBits = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (ch0.w.e() >> 32)) / 2.0f) + intBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                long floatToRawIntBits2 = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (ch0.w.e() >> 32)) / 2.0f) - intBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ch0.w.e() & 4294967295L)))));
                Float valueOf = Float.valueOf(0.0f);
                long j2 = ((jt0) aq42.getValue()).a;
                long j3 = jt0.g;
                if (jt0.c(j2, j3)) {
                    j = jt0.f;
                } else {
                    j = ((jt0) aq42.getValue()).a;
                }
                yb5 yb5 = new yb5(valueOf, new jt0(j));
                Float valueOf2 = Float.valueOf(0.724f);
                long j4 = jt0.f;
                p64 k = kw5.k(new yb5[]{yb5, new yb5(valueOf2, new jt0(j4))}, floatToRawIntBits, floatToRawIntBits2, 8);
                yb5 yb52 = new yb5(Float.valueOf(0.2552f), new jt0(j4));
                Float valueOf3 = Float.valueOf(1.0f);
                if (!jt0.c(((jt0) aq4.getValue()).a, j3)) {
                    j4 = ((jt0) aq4.getValue()).a;
                }
                return ch0.a(new pb(6, new m0(7, k, kw5.k(new yb5[]{yb52, new yb5(valueOf3, new jt0(j4))}, floatToRawIntBits, floatToRawIntBits2, 8))));
            default:
                yb5 yb53 = (yb5) obj;
                yb53.getClass();
                aq42.setValue((String) yb53.w);
                aq4.setValue((String) yb53.x);
                return vs7.a;
        }
    }
}
