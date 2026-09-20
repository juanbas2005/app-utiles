package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.ObjectIdentifier;
import dev.whyoleg.cryptography.serialization.asn1.modules.AlgorithmIdentifier;
import dev.whyoleg.cryptography.serialization.asn1.modules.EcParameters;

/* renamed from: k12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k12 implements AlgorithmIdentifier {
    public final String a;

    public k12(String str) {
        this.a = str;
    }

    /* renamed from: getAlgorithm-STa95mE  reason: not valid java name */
    public final String m52getAlgorithmSTa95mE() {
        ObjectIdentifier.Companion.getClass();
        return ObjectIdentifier.m20constructorimpl("1.2.840.10045.2.1");
    }

    public final Object getParameters() {
        String str = this.a;
        if (str != null) {
            return EcParameters.m27boximpl(str);
        }
        return null;
    }
}
