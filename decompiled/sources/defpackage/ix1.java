package defpackage;

/* renamed from: ix1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ix1 implements zr3 {
    public static final ix1 a = new Object();
    public static final po5 b = new po5("kotlin.Double", no5.o);

    public final Object deserialize(ok1 ok1) {
        return Double.valueOf(ok1.E());
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        j42.h(((Number) obj).doubleValue());
    }
}
