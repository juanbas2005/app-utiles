package dev.whyoleg.cryptography.serialization.asn1.modules;

import dev.whyoleg.cryptography.serialization.asn1.BitArray;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Ldev/whyoleg/cryptography/serialization/asn1/modules/SubjectPublicKeyInfo;", "", "Ldev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;", "algorithm", "Ldev/whyoleg/cryptography/serialization/asn1/BitArray;", "subjectPublicKey", "<init>", "(Ldev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;Ldev/whyoleg/cryptography/serialization/asn1/BitArray;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILdev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;Ldev/whyoleg/cryptography/serialization/asn1/BitArray;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$cryptography_serialization_asn1_modules", "(Ldev/whyoleg/cryptography/serialization/asn1/modules/SubjectPublicKeyInfo;Lhy0;Lll6;)V", "write$Self", "Ldev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;", "getAlgorithm", "()Ldev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;", "getAlgorithm$annotations", "()V", "Ldev/whyoleg/cryptography/serialization/asn1/BitArray;", "getSubjectPublicKey", "()Ldev/whyoleg/cryptography/serialization/asn1/BitArray;", "Companion", "t67", "u67", "cryptography-serialization-asn1-modules"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class SubjectPublicKeyInfo {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers = {rg3.y(i44.w, new pp5(21)), null};
    public static final u67 Companion = new Object();
    private final AlgorithmIdentifier algorithm;
    private final BitArray subjectPublicKey;

    public /* synthetic */ SubjectPublicKeyInfo(int i, AlgorithmIdentifier algorithmIdentifier, BitArray bitArray, rl6 rl6) {
        if (3 == (i & 3)) {
            this.algorithm = algorithmIdentifier;
            this.subjectPublicKey = bitArray;
            return;
        }
        wn6.x(i, 3, t67.a.getDescriptor());
        throw null;
    }

    /* access modifiers changed from: private */
    public static final zr3 _childSerializers$_anonymous_() {
        return new e61(b26.a.b(AlgorithmIdentifier.class), (zr3) bl1.d, new zr3[0]);
    }

    public static final /* synthetic */ void write$Self$cryptography_serialization_asn1_modules(SubjectPublicKeyInfo subjectPublicKeyInfo, hy0 hy0, ll6 ll6) {
        hy0.o(ll6, 0, (zr3) $childSerializers[0].getValue(), subjectPublicKeyInfo.algorithm);
        hy0.o(ll6, 1, g90.a, subjectPublicKeyInfo.subjectPublicKey);
    }

    public final AlgorithmIdentifier getAlgorithm() {
        return this.algorithm;
    }

    public final BitArray getSubjectPublicKey() {
        return this.subjectPublicKey;
    }

    public static /* synthetic */ void getAlgorithm$annotations() {
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, BitArray bitArray) {
        algorithmIdentifier.getClass();
        bitArray.getClass();
        this.algorithm = algorithmIdentifier;
        this.subjectPublicKey = bitArray;
    }
}
