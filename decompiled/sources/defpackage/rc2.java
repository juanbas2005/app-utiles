package defpackage;

/* renamed from: rc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum rc2 {
    DOUBLE_LIST_PACKED(35, 3, r6),
    SINT64_LIST_PACKED(48, 3, r24);
    
    public static final rc2[] z = null;
    public final int w;

    static {
        rc2[] values = values();
        z = new rc2[values.length];
        for (rc2 rc2 : values) {
            z[rc2.w] = rc2;
        }
    }

    /* access modifiers changed from: public */
    rc2(int i, int i2, uj3 uj3) {
        this.w = i;
        int B = b81.B(i2);
        if (B == 1) {
            uj3.getClass();
        } else if (B == 3) {
            uj3.getClass();
        }
        if (i2 == 1) {
            uj3.ordinal();
        }
    }
}
