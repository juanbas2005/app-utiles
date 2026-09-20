package dev.whyoleg.cryptography.serialization.asn1.modules;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u0000 \t2\u00020\u0001:\u0001\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Ldev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;", "", "Ldev/whyoleg/cryptography/serialization/asn1/ObjectIdentifier;", "getAlgorithm-STa95mE", "()Ljava/lang/String;", "algorithm", "getParameters", "()Ljava/lang/Object;", "parameters", "Companion", "fb", "cryptography-serialization-asn1-modules"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable(with = bl1.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface AlgorithmIdentifier {
    public static final fb Companion = fb.a;

    /* renamed from: getAlgorithm-STa95mE  reason: not valid java name */
    String m26getAlgorithmSTa95mE();

    Object getParameters();
}
