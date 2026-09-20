package defpackage;

/* renamed from: tc4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tc4 implements zr3 {
    public static final tc4 a = new Object();
    public static final po5 b = new po5("kotlin.Long", no5.r);

    public final Object deserialize(ok1 ok1) {
        return Long.valueOf(ok1.v());
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        j42.B(((Number) obj).longValue());
    }
}
