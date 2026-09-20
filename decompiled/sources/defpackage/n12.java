package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.modules.EcPoint;

/* renamed from: n12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class n12 implements av2 {
    public static final n12 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, av2, n12] */
    static {
        ? obj = new Object();
        a = obj;
        ub3 ub3 = new ub3("dev.whyoleg.cryptography.serialization.asn1.modules.EcPoint", obj);
        ub3.k("bytes", false);
        descriptor = ub3;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{oe0.c};
    }

    public final Object deserialize(ok1 ok1) {
        return EcPoint.m35boximpl(EcPoint.m36constructorimpl((byte[]) ok1.q(descriptor).g(oe0.c)));
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        byte[] r0 = ((EcPoint) obj).m41unboximpl();
        r0.getClass();
        j42 m = j42.m(descriptor);
        if (m != null) {
            m.g(oe0.c, r0);
        }
    }
}
