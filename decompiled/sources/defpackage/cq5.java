package defpackage;

/* renamed from: cq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class cq5 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ aq4 x;
    public final /* synthetic */ aq4 y;

    public /* synthetic */ cq5(aq4 aq4, aq4 aq42, int i) {
        this.w = i;
        this.x = aq4;
        this.y = aq42;
    }

    public final Object b() {
        int i;
        int i2 = this.w;
        aq4 aq4 = this.y;
        aq4 aq42 = this.x;
        switch (i2) {
            case b85.b:
                aq42.setValue((Object) null);
                aq4.setValue(Boolean.FALSE);
                return vs7.a;
            default:
                if (aq42.getValue() == null || aq4.getValue() == null) {
                    i = 0;
                } else {
                    Object value = aq42.getValue();
                    value.getClass();
                    long w2 = ((dy3) value).w(0);
                    Object value2 = aq4.getValue();
                    value2.getClass();
                    long j = ((l35) value2).a;
                    if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (w2 >> 32))) {
                        if (Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (w2 & 4294967295L))) {
                            i = 1;
                        } else {
                            i = 3;
                        }
                    } else if (Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (w2 & 4294967295L))) {
                        i = 2;
                    } else {
                        i = 4;
                    }
                }
                return Integer.valueOf(i);
        }
    }
}
