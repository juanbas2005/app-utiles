package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.ObjectIdentifier;
import dev.whyoleg.cryptography.serialization.asn1.modules.AlgorithmIdentifier;
import dev.whyoleg.cryptography.serialization.asn1.modules.DhParameters;

/* renamed from: cu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cu1 implements AlgorithmIdentifier {
    public final DhParameters a;

    public cu1(DhParameters dhParameters) {
        this.a = dhParameters;
    }

    /* renamed from: getAlgorithm-STa95mE  reason: not valid java name */
    public final String m18getAlgorithmSTa95mE() {
        ObjectIdentifier.Companion.getClass();
        return ObjectIdentifier.m20constructorimpl("1.2.840.113549.1.3.1");
    }

    public final Object getParameters() {
        return this.a;
    }
}
