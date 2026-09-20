package dev.whyoleg.cryptography.serialization.asn1.modules;

import dev.whyoleg.cryptography.bigint.BigInt;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002*+BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eBs\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b&\u0010!R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b(\u0010!¨\u0006,"}, d2 = {"Ldev/whyoleg/cryptography/serialization/asn1/modules/RsaPrivateKey;", "", "", "version", "Ldev/whyoleg/cryptography/bigint/BigInt;", "modulus", "publicExponent", "privateExponent", "prime1", "prime2", "exponent1", "exponent2", "coefficient", "<init>", "(ILdev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(IILdev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Ldev/whyoleg/cryptography/bigint/BigInt;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$cryptography_serialization_asn1_modules", "(Ldev/whyoleg/cryptography/serialization/asn1/modules/RsaPrivateKey;Lhy0;Lll6;)V", "write$Self", "I", "getVersion", "()I", "Ldev/whyoleg/cryptography/bigint/BigInt;", "getModulus", "()Ldev/whyoleg/cryptography/bigint/BigInt;", "getPublicExponent", "getPrivateExponent", "getPrime1", "getPrime2", "getExponent1", "getExponent2", "getCoefficient", "Companion", "ka6", "la6", "cryptography-serialization-asn1-modules"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class RsaPrivateKey {
    public static final la6 Companion = new Object();
    private final BigInt coefficient;
    private final BigInt exponent1;
    private final BigInt exponent2;
    private final BigInt modulus;
    private final BigInt prime1;
    private final BigInt prime2;
    private final BigInt privateExponent;
    private final BigInt publicExponent;
    private final int version;

    public RsaPrivateKey(int i, BigInt bigInt, BigInt bigInt2, BigInt bigInt3, BigInt bigInt4, BigInt bigInt5, BigInt bigInt6, BigInt bigInt7, BigInt bigInt8) {
        bigInt.getClass();
        bigInt2.getClass();
        bigInt3.getClass();
        bigInt4.getClass();
        bigInt5.getClass();
        bigInt6.getClass();
        bigInt7.getClass();
        bigInt8.getClass();
        this.version = i;
        this.modulus = bigInt;
        this.publicExponent = bigInt2;
        this.privateExponent = bigInt3;
        this.prime1 = bigInt4;
        this.prime2 = bigInt5;
        this.exponent1 = bigInt6;
        this.exponent2 = bigInt7;
        this.coefficient = bigInt8;
    }

    public static final /* synthetic */ void write$Self$cryptography_serialization_asn1_modules(RsaPrivateKey rsaPrivateKey, hy0 hy0, ll6 ll6) {
        hy0.w(0, rsaPrivateKey.version, ll6);
        m80 m80 = m80.a;
        hy0.o(ll6, 1, m80, rsaPrivateKey.modulus);
        hy0.o(ll6, 2, m80, rsaPrivateKey.publicExponent);
        hy0.o(ll6, 3, m80, rsaPrivateKey.privateExponent);
        hy0.o(ll6, 4, m80, rsaPrivateKey.prime1);
        hy0.o(ll6, 5, m80, rsaPrivateKey.prime2);
        hy0.o(ll6, 6, m80, rsaPrivateKey.exponent1);
        hy0.o(ll6, 7, m80, rsaPrivateKey.exponent2);
        hy0.o(ll6, 8, m80, rsaPrivateKey.coefficient);
    }

    public final BigInt getCoefficient() {
        return this.coefficient;
    }

    public final BigInt getExponent1() {
        return this.exponent1;
    }

    public final BigInt getExponent2() {
        return this.exponent2;
    }

    public final BigInt getModulus() {
        return this.modulus;
    }

    public final BigInt getPrime1() {
        return this.prime1;
    }

    public final BigInt getPrime2() {
        return this.prime2;
    }

    public final BigInt getPrivateExponent() {
        return this.privateExponent;
    }

    public final BigInt getPublicExponent() {
        return this.publicExponent;
    }

    public final int getVersion() {
        return this.version;
    }

    public /* synthetic */ RsaPrivateKey(int i, int i2, BigInt bigInt, BigInt bigInt2, BigInt bigInt3, BigInt bigInt4, BigInt bigInt5, BigInt bigInt6, BigInt bigInt7, BigInt bigInt8, rl6 rl6) {
        if (511 == (i & 511)) {
            this.version = i2;
            this.modulus = bigInt;
            this.publicExponent = bigInt2;
            this.privateExponent = bigInt3;
            this.prime1 = bigInt4;
            this.prime2 = bigInt5;
            this.exponent1 = bigInt6;
            this.exponent2 = bigInt7;
            this.coefficient = bigInt8;
            return;
        }
        wn6.x(i, 511, ka6.a.getDescriptor());
        throw null;
    }
}
