package defpackage;

/* renamed from: sc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum sc2 {
    DOUBLE_LIST_PACKED(35, 3, r6),
    SINT64_LIST_PACKED(48, 3, r24);
    
    public static final sc2[] z = null;
    public final int w;

    static {
        sc2[] values = values();
        z = new sc2[values.length];
        for (sc2 sc2 : values) {
            z[sc2.w] = sc2;
        }
    }

    /* access modifiers changed from: public */
    sc2(int i, int i2, vj3 vj3) {
        this.w = i;
        int B = b81.B(i2);
        if (B == 1) {
            vj3.getClass();
        } else if (B == 3) {
            vj3.getClass();
        }
        if (i2 == 1) {
            vj3.ordinal();
        }
    }
}
