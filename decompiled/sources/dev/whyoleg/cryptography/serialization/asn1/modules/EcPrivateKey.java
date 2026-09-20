package dev.whyoleg.cryptography.serialization.asn1.modules;

import dev.whyoleg.cryptography.serialization.asn1.BitArray;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002)*B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Ldev/whyoleg/cryptography/serialization/asn1/modules/EcPrivateKey;", "", "", "version", "", "privateKey", "Ldev/whyoleg/cryptography/serialization/asn1/modules/EcParameters;", "parameters", "Ldev/whyoleg/cryptography/serialization/asn1/BitArray;", "publicKey", "<init>", "(I[BLjava/lang/String;Ldev/whyoleg/cryptography/serialization/asn1/BitArray;Lhl1;)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(II[BLjava/lang/String;Ldev/whyoleg/cryptography/serialization/asn1/BitArray;Lrl6;Lhl1;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$cryptography_serialization_asn1_modules", "(Ldev/whyoleg/cryptography/serialization/asn1/modules/EcPrivateKey;Lhy0;Lll6;)V", "write$Self", "I", "getVersion", "()I", "[B", "getPrivateKey", "()[B", "Ljava/lang/String;", "getParameters-g4m2kjQ", "()Ljava/lang/String;", "getParameters-g4m2kjQ$annotations", "()V", "Ldev/whyoleg/cryptography/serialization/asn1/BitArray;", "getPublicKey", "()Ldev/whyoleg/cryptography/serialization/asn1/BitArray;", "getPublicKey$annotations", "Companion", "q12", "r12", "cryptography-serialization-asn1-modules"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class EcPrivateKey {
    public static final r12 Companion = new Object();
    private final String parameters;
    private final byte[] privateKey;
    private final BitArray publicKey;
    private final int version;

    private /* synthetic */ EcPrivateKey(int i, int i2, byte[] bArr, String str, BitArray bitArray, rl6 rl6) {
        if (3 == (i & 3)) {
            this.version = i2;
            this.privateKey = bArr;
            if ((i & 4) == 0) {
                this.parameters = null;
            } else {
                this.parameters = str;
            }
            if ((i & 8) == 0) {
                this.publicKey = null;
            } else {
                this.publicKey = bitArray;
            }
        } else {
            wn6.x(i, 3, q12.a.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ void write$Self$cryptography_serialization_asn1_modules(EcPrivateKey ecPrivateKey, hy0 hy0, ll6 ll6) {
        EcParameters ecParameters;
        hy0.w(0, ecPrivateKey.version, ll6);
        hy0.o(ll6, 1, oe0.c, ecPrivateKey.privateKey);
        if (hy0.f(ll6) || ecPrivateKey.parameters != null) {
            l12 l12 = l12.a;
            String str = ecPrivateKey.parameters;
            if (str != null) {
                ecParameters = EcParameters.m27boximpl(str);
            } else {
                ecParameters = null;
            }
            hy0.A(ll6, 2, l12, ecParameters);
        }
        if (hy0.f(ll6) || ecPrivateKey.publicKey != null) {
            hy0.A(ll6, 3, g90.a, ecPrivateKey.publicKey);
        }
    }

    /* renamed from: getParameters-g4m2kjQ  reason: not valid java name */
    public final String m43getParametersg4m2kjQ() {
        return this.parameters;
    }

    public final byte[] getPrivateKey() {
        return this.privateKey;
    }

    public final BitArray getPublicKey() {
        return this.publicKey;
    }

    public final int getVersion() {
        return this.version;
    }

    @c61(classIndex = 0, type = b61.x)
    /* renamed from: getParameters-g4m2kjQ$annotations  reason: not valid java name */
    public static /* synthetic */ void m42getParametersg4m2kjQ$annotations() {
    }

    @c61(classIndex = 1, type = b61.x)
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public /* synthetic */ EcPrivateKey(int i, byte[] bArr, String str, BitArray bitArray, hl1 hl1) {
        this(i, bArr, str, bitArray);
    }

    public /* synthetic */ EcPrivateKey(int i, int i2, byte[] bArr, String str, BitArray bitArray, rl6 rl6, hl1 hl1) {
        this(i, i2, bArr, str, bitArray, rl6);
    }

    private EcPrivateKey(int i, byte[] bArr, String str, BitArray bitArray) {
        bArr.getClass();
        this.version = i;
        this.privateKey = bArr;
        this.parameters = str;
        this.publicKey = bitArray;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EcPrivateKey(int i, byte[] bArr, String str, BitArray bitArray, int i2, hl1 hl1) {
        this(i, bArr, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : bitArray, (hl1) null);
    }
}
