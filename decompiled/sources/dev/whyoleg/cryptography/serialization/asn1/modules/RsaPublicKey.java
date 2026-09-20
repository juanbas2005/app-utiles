package dev.whyoleg.cryptography.serialization.asn1.modules;

import dev.whyoleg.cryptography.bigint.BigInt;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001c"}, d2 = {"Ldev/whyoleg/cryptography/serialization/asn1/modules/RsaPublicKey;", "", "Ldev/whyoleg/cryptography/bigint/BigInt;", "modulus", "publicExponent", "<init>", "(Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILdev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$cryptography_serialization_asn1_modules", "(Ldev/whyoleg/cryptography/serialization/asn1/modules/RsaPublicKey;Lhy0;Lll6;)V", "write$Self", "Ldev/whyoleg/cryptography/bigint/BigInt;", "getModulus", "()Ldev/whyoleg/cryptography/bigint/BigInt;", "getPublicExponent", "Companion", "ma6", "na6", "cryptography-serialization-asn1-modules"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class RsaPublicKey {
    public static final na6 Companion = new Object();
    private final BigInt modulus;
    private final BigInt publicExponent;

    public /* synthetic */ RsaPublicKey(int i, BigInt bigInt, BigInt bigInt2, rl6 rl6) {
        if (3 == (i & 3)) {
            this.modulus = bigInt;
            this.publicExponent = bigInt2;
            return;
        }
        wn6.x(i, 3, ma6.a.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ void write$Self$cryptography_serialization_asn1_modules(RsaPublicKey rsaPublicKey, hy0 hy0, ll6 ll6) {
        m80 m80 = m80.a;
        hy0.o(ll6, 0, m80, rsaPublicKey.modulus);
        hy0.o(ll6, 1, m80, rsaPublicKey.publicExponent);
    }

    public final BigInt getModulus() {
        return this.modulus;
    }

    public final BigInt getPublicExponent() {
        return this.publicExponent;
    }

    public RsaPublicKey(BigInt bigInt, BigInt bigInt2) {
        bigInt.getClass();
        bigInt2.getClass();
        this.modulus = bigInt;
        this.publicExponent = bigInt2;
    }
}
