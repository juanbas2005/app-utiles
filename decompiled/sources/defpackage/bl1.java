package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.ObjectIdentifier;
import dev.whyoleg.cryptography.serialization.asn1.modules.DhParameters;
import dev.whyoleg.cryptography.serialization.asn1.modules.DsaParameters;
import dev.whyoleg.cryptography.serialization.asn1.modules.EcParameters;

/* renamed from: bl1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bl1 extends hb {
    public static final bl1 d;

    /* JADX WARNING: type inference failed for: r0v0, types: [bl1, hb] */
    static {
        ? hbVar = new hb();
        d = hbVar;
        ObjectIdentifier.Companion.getClass();
        String r1 = ObjectIdentifier.m20constructorimpl("1.2.840.113549.1.1.1");
        c26 c26 = b26.a;
        hb.a(hbVar, r1, c26.b(ja6.class), ja6.a, true);
        hbVar.b(ObjectIdentifier.m20constructorimpl("1.2.840.10045.2.1"), c26.b(k12.class), hj8.x(EcParameters.Companion.serializer()), yk1.D);
        hbVar.b(ObjectIdentifier.m20constructorimpl("1.2.840.113549.1.3.1"), c26.b(cu1.class), hj8.x(DhParameters.Companion.serializer()), zk1.D);
        hbVar.b(ObjectIdentifier.m20constructorimpl("1.2.840.10040.4.1"), c26.b(o02.class), hj8.x(DsaParameters.Companion.serializer()), al1.D);
        hb.a(hbVar, ObjectIdentifier.m20constructorimpl("1.3.101.110"), c26.b(gf8.class), gf8.a, false);
        hb.a(hbVar, ObjectIdentifier.m20constructorimpl("1.3.101.111"), c26.b(hf8.class), hf8.a, false);
        hb.a(hbVar, ObjectIdentifier.m20constructorimpl("1.3.101.112"), c26.b(s12.class), s12.a, false);
        hb.a(hbVar, ObjectIdentifier.m20constructorimpl("1.3.101.113"), c26.b(t12.class), t12.a, false);
    }
}
