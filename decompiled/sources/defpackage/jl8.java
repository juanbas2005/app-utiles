package defpackage;

/* renamed from: jl8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum jl8 {
    DOUBLE_LIST_PACKED(35, 3, r6),
    SINT64_LIST_PACKED(48, 3, r19);
    
    public static final jl8[] z = null;
    public final int w;

    static {
        z = new jl8[r1];
        for (jl8 jl8 : values()) {
            z[jl8.w] = jl8;
        }
    }

    /* access modifiers changed from: public */
    jl8(int i, int i2, am8 am8) {
        this.w = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            am8.getClass();
        } else if (i3 == 3) {
            am8.getClass();
        }
        if (i2 == 1) {
            am8 am82 = am8.w;
            am8.ordinal();
        }
    }
}
