package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.ObjectIdentifier;

/* renamed from: t25  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class t25 implements av2 {
    public static final t25 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [t25, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ub3 ub3 = new ub3("dev.whyoleg.cryptography.serialization.asn1.ObjectIdentifier", obj);
        ub3.k("value", false);
        descriptor = ub3;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{t47.a};
    }

    public final Object deserialize(ok1 ok1) {
        return ObjectIdentifier.m19boximpl(ObjectIdentifier.m20constructorimpl(ok1.q(descriptor).t()));
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        String r0 = ((ObjectIdentifier) obj).m25unboximpl();
        r0.getClass();
        j42 m = j42.m(descriptor);
        if (m != null) {
            m.D(r0);
        }
    }
}
