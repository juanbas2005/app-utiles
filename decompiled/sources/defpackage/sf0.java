package defpackage;

/* renamed from: sf0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sf0 implements zr3 {
    public static final sf0 a = new Object();
    public static final po5 b = new po5("kotlin.Byte", no5.m);

    public final Object deserialize(ok1 ok1) {
        return Byte.valueOf(ok1.A());
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        j42.k(((Number) obj).byteValue());
    }
}
