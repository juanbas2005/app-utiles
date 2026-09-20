package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.ObjectIdentifier;
import dev.whyoleg.cryptography.serialization.asn1.modules.AlgorithmIdentifier;
import dev.whyoleg.cryptography.serialization.asn1.modules.DsaParameters;

/* renamed from: o02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o02 implements AlgorithmIdentifier {
    public final DsaParameters a;

    public o02(DsaParameters dsaParameters) {
        this.a = dsaParameters;
    }

    /* renamed from: getAlgorithm-STa95mE  reason: not valid java name */
    public final String m67getAlgorithmSTa95mE() {
        ObjectIdentifier.Companion.getClass();
        return ObjectIdentifier.m20constructorimpl("1.2.840.10040.4.1");
    }

    public final Object getParameters() {
        return this.a;
    }
}
