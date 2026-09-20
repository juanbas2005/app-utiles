package defpackage;

/* renamed from: ho0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ho0 implements zr3 {
    public static final ho0 a = new Object();
    public static final po5 b = new po5("kotlin.Char", no5.n);

    public final Object deserialize(ok1 ok1) {
        return Character.valueOf(ok1.f());
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        j42.r(((Character) obj).charValue());
    }
}
