package defpackage;

/* renamed from: ue3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ue3 implements zr3 {
    public static final ue3 a = new Object();
    public static final po5 b = new po5("kotlin.Int", no5.q);

    public final Object deserialize(ok1 ok1) {
        return Integer.valueOf(ok1.o());
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        j42.z(((Number) obj).intValue());
    }
}
