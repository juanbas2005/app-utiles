package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.ObjectIdentifier;
import dev.whyoleg.cryptography.serialization.asn1.modules.EcParameters;

/* renamed from: l12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class l12 implements av2 {
    public static final l12 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, l12, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ub3 ub3 = new ub3("dev.whyoleg.cryptography.serialization.asn1.modules.EcParameters", obj);
        ub3.k("namedCurve", false);
        descriptor = ub3;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{t25.a};
    }

    public final Object deserialize(ok1 ok1) {
        return EcParameters.m27boximpl(EcParameters.m28constructorimpl(((ObjectIdentifier) ok1.q(descriptor).g(t25.a)).m25unboximpl()));
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        String r0 = ((EcParameters) obj).m34unboximpl();
        r0.getClass();
        j42 m = j42.m(descriptor);
        if (m != null) {
            m.g(t25.a, ObjectIdentifier.m19boximpl(r0));
        }
    }
}
