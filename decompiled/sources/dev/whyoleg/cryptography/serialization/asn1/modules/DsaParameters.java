package dev.whyoleg.cryptography.serialization.asn1.modules;

import dev.whyoleg.cryptography.bigint.BigInt;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Ldev/whyoleg/cryptography/serialization/asn1/modules/DsaParameters;", "", "Ldev/whyoleg/cryptography/bigint/BigInt;", "prime", "subprime", "generator", "<init>", "(Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILdev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$cryptography_serialization_asn1_modules", "(Ldev/whyoleg/cryptography/serialization/asn1/modules/DsaParameters;Lhy0;Lll6;)V", "write$Self", "Ldev/whyoleg/cryptography/bigint/BigInt;", "getPrime", "()Ldev/whyoleg/cryptography/bigint/BigInt;", "getSubprime", "getGenerator", "Companion", "p02", "q02", "cryptography-serialization-asn1-modules"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class DsaParameters {
    public static final q02 Companion = new Object();
    private final BigInt generator;
    private final BigInt prime;
    private final BigInt subprime;

    public /* synthetic */ DsaParameters(int i, BigInt bigInt, BigInt bigInt2, BigInt bigInt3, rl6 rl6) {
        if (7 == (i & 7)) {
            this.prime = bigInt;
            this.subprime = bigInt2;
            this.generator = bigInt3;
            return;
        }
        wn6.x(i, 7, p02.a.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ void write$Self$cryptography_serialization_asn1_modules(DsaParameters dsaParameters, hy0 hy0, ll6 ll6) {
        m80 m80 = m80.a;
        hy0.o(ll6, 0, m80, dsaParameters.prime);
        hy0.o(ll6, 1, m80, dsaParameters.subprime);
        hy0.o(ll6, 2, m80, dsaParameters.generator);
    }

    public final BigInt getGenerator() {
        return this.generator;
    }

    public final BigInt getPrime() {
        return this.prime;
    }

    public final BigInt getSubprime() {
        return this.subprime;
    }

    public DsaParameters(BigInt bigInt, BigInt bigInt2, BigInt bigInt3) {
        bigInt.getClass();
        bigInt2.getClass();
        bigInt3.getClass();
        this.prime = bigInt;
        this.subprime = bigInt2;
        this.generator = bigInt3;
    }
}
