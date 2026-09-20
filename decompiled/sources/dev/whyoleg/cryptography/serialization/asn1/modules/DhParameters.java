package dev.whyoleg.cryptography.serialization.asn1.modules;

import dev.whyoleg.cryptography.bigint.BigInt;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Ldev/whyoleg/cryptography/serialization/asn1/modules/DhParameters;", "", "Ldev/whyoleg/cryptography/bigint/BigInt;", "prime", "base", "", "privateValueLength", "<init>", "(Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ljava/lang/Integer;)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILdev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ljava/lang/Integer;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$cryptography_serialization_asn1_modules", "(Ldev/whyoleg/cryptography/serialization/asn1/modules/DhParameters;Lhy0;Lll6;)V", "write$Self", "Ldev/whyoleg/cryptography/bigint/BigInt;", "getPrime", "()Ldev/whyoleg/cryptography/bigint/BigInt;", "getBase", "Ljava/lang/Integer;", "getPrivateValueLength", "()Ljava/lang/Integer;", "Companion", "du1", "eu1", "cryptography-serialization-asn1-modules"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class DhParameters {
    public static final eu1 Companion = new Object();
    private final BigInt base;
    private final BigInt prime;
    private final Integer privateValueLength;

    public /* synthetic */ DhParameters(int i, BigInt bigInt, BigInt bigInt2, Integer num, rl6 rl6) {
        if (3 == (i & 3)) {
            this.prime = bigInt;
            this.base = bigInt2;
            if ((i & 4) == 0) {
                this.privateValueLength = null;
            } else {
                this.privateValueLength = num;
            }
        } else {
            wn6.x(i, 3, du1.a.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ void write$Self$cryptography_serialization_asn1_modules(DhParameters dhParameters, hy0 hy0, ll6 ll6) {
        m80 m80 = m80.a;
        hy0.o(ll6, 0, m80, dhParameters.prime);
        hy0.o(ll6, 1, m80, dhParameters.base);
        if (hy0.f(ll6) || dhParameters.privateValueLength != null) {
            hy0.A(ll6, 2, ue3.a, dhParameters.privateValueLength);
        }
    }

    public final BigInt getBase() {
        return this.base;
    }

    public final BigInt getPrime() {
        return this.prime;
    }

    public final Integer getPrivateValueLength() {
        return this.privateValueLength;
    }

    public DhParameters(BigInt bigInt, BigInt bigInt2, Integer num) {
        bigInt.getClass();
        bigInt2.getClass();
        this.prime = bigInt;
        this.base = bigInt2;
        this.privateValueLength = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DhParameters(BigInt bigInt, BigInt bigInt2, Integer num, int i, hl1 hl1) {
        this(bigInt, bigInt2, (i & 4) != 0 ? null : num);
    }
}
