package dev.whyoleg.cryptography.serialization.asn1.modules;

import dev.whyoleg.cryptography.serialization.asn1.BitArray;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002)*B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010$\u0012\u0004\b'\u0010 \u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Ldev/whyoleg/cryptography/serialization/asn1/modules/PrivateKeyInfo;", "", "", "version", "Ldev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;", "privateKeyAlgorithm", "", "privateKey", "Ldev/whyoleg/cryptography/serialization/asn1/BitArray;", "publicKey", "<init>", "(ILdev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;[BLdev/whyoleg/cryptography/serialization/asn1/BitArray;)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(IILdev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;[BLdev/whyoleg/cryptography/serialization/asn1/BitArray;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$cryptography_serialization_asn1_modules", "(Ldev/whyoleg/cryptography/serialization/asn1/modules/PrivateKeyInfo;Lhy0;Lll6;)V", "write$Self", "I", "getVersion", "()I", "Ldev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;", "getPrivateKeyAlgorithm", "()Ldev/whyoleg/cryptography/serialization/asn1/modules/AlgorithmIdentifier;", "getPrivateKeyAlgorithm$annotations", "()V", "[B", "getPrivateKey", "()[B", "Ldev/whyoleg/cryptography/serialization/asn1/BitArray;", "getPublicKey", "()Ldev/whyoleg/cryptography/serialization/asn1/BitArray;", "getPublicKey$annotations", "Companion", "yo5", "zo5", "cryptography-serialization-asn1-modules"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class PrivateKeyInfo {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers = {null, rg3.y(i44.w, new jk4(29)), null, null};
    public static final zo5 Companion = new Object();
    private final byte[] privateKey;
    private final AlgorithmIdentifier privateKeyAlgorithm;
    private final BitArray publicKey;
    private final int version;

    public /* synthetic */ PrivateKeyInfo(int i, int i2, AlgorithmIdentifier algorithmIdentifier, byte[] bArr, BitArray bitArray, rl6 rl6) {
        if (7 == (i & 7)) {
            this.version = i2;
            this.privateKeyAlgorithm = algorithmIdentifier;
            this.privateKey = bArr;
            if ((i & 8) == 0) {
                this.publicKey = null;
            } else {
                this.publicKey = bitArray;
            }
        } else {
            wn6.x(i, 7, yo5.a.getDescriptor());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final zr3 _childSerializers$_anonymous_() {
        return new e61(b26.a.b(AlgorithmIdentifier.class), (zr3) bl1.d, new zr3[0]);
    }

    public static final /* synthetic */ void write$Self$cryptography_serialization_asn1_modules(PrivateKeyInfo privateKeyInfo, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        hy0.w(0, privateKeyInfo.version, ll6);
        hy0.o(ll6, 1, (zr3) nz3Arr[1].getValue(), privateKeyInfo.privateKeyAlgorithm);
        hy0.o(ll6, 2, oe0.c, privateKeyInfo.privateKey);
        if (hy0.f(ll6) || privateKeyInfo.publicKey != null) {
            hy0.A(ll6, 3, g90.a, privateKeyInfo.publicKey);
        }
    }

    public final byte[] getPrivateKey() {
        return this.privateKey;
    }

    public final AlgorithmIdentifier getPrivateKeyAlgorithm() {
        return this.privateKeyAlgorithm;
    }

    public final BitArray getPublicKey() {
        return this.publicKey;
    }

    public final int getVersion() {
        return this.version;
    }

    public static /* synthetic */ void getPrivateKeyAlgorithm$annotations() {
    }

    @c61(classIndex = 1, type = b61.w)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public PrivateKeyInfo(int i, AlgorithmIdentifier algorithmIdentifier, byte[] bArr, BitArray bitArray) {
        algorithmIdentifier.getClass();
        bArr.getClass();
        this.version = i;
        this.privateKeyAlgorithm = algorithmIdentifier;
        this.privateKey = bArr;
        this.publicKey = bitArray;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrivateKeyInfo(int i, AlgorithmIdentifier algorithmIdentifier, byte[] bArr, BitArray bitArray, int i2, hl1 hl1) {
        this(i, algorithmIdentifier, bArr, (i2 & 8) != 0 ? null : bitArray);
    }
}
