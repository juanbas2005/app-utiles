package defpackage;

/* renamed from: ns6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ns6 implements zr3 {
    public static final ns6 a = new Object();
    public static final po5 b = new po5("kotlin.Short", no5.s);

    public final Object deserialize(ok1 ok1) {
        return Short.valueOf(ok1.B());
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        j42.i(((Number) obj).shortValue());
    }
}
