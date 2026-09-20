package defpackage;

/* renamed from: jr7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jr7 implements zr3 {
    public static final jr7 a = new Object();
    public static final ub3 b = b96.a(sf0.a, "kotlin.UByte");

    public final Object deserialize(ok1 ok1) {
        return new fr7(ok1.q(b).A());
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        j42.m(b).k(((fr7) obj).w);
    }
}
