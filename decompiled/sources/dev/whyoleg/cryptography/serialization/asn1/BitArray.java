package dev.whyoleg.cryptography.serialization.asn1;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Ldev/whyoleg/cryptography/serialization/asn1/BitArray;", "", "", "unusedBits", "", "byteArray", "<init>", "(I[B)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(II[BLrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$cryptography_serialization_asn1", "(Ldev/whyoleg/cryptography/serialization/asn1/BitArray;Lhy0;Lll6;)V", "write$Self", "I", "getUnusedBits", "()I", "[B", "getByteArray", "()[B", "Companion", "g90", "h90", "cryptography-serialization-asn1"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class BitArray {
    public static final h90 Companion = new Object();
    private final byte[] byteArray;
    private final int unusedBits;

    public BitArray(int i, int i2, byte[] bArr, rl6 rl6) {
        if (3 == (i & 3)) {
            this.unusedBits = i2;
            this.byteArray = bArr;
            if (bArr.length == 0) {
                if (i2 != 0) {
                    h.s("empty array couldn't have unused bits");
                    throw null;
                }
            } else if (bArr.length == 0) {
                kj6.i("Array is empty.");
                throw null;
            } else if (i2 > Integer.numberOfTrailingZeros(bArr[bArr.length - 1] | 256)) {
                ku4.g(pb4.i(i2, "At least ", " last bits should be unused"));
                throw null;
            }
        } else {
            wn6.x(i, 3, g90.a.getDescriptor());
            throw null;
        }
    }

    public static final /* synthetic */ void write$Self$cryptography_serialization_asn1(BitArray bitArray, hy0 hy0, ll6 ll6) {
        hy0.w(0, bitArray.unusedBits, ll6);
        hy0.o(ll6, 1, oe0.c, bitArray.byteArray);
    }

    public final byte[] getByteArray() {
        return this.byteArray;
    }

    public final int getUnusedBits() {
        return this.unusedBits;
    }

    public BitArray(int i, byte[] bArr) {
        bArr.getClass();
        this.unusedBits = i;
        this.byteArray = bArr;
        if (bArr.length == 0) {
            if (i != 0) {
                h.s("empty array couldn't have unused bits");
                throw null;
            }
        } else if (bArr.length == 0) {
            kj6.i("Array is empty.");
            throw null;
        } else if (i > Integer.numberOfTrailingZeros(bArr[bArr.length - 1] | 256)) {
            ku4.g(pb4.i(i, "At least ", " last bits should be unused"));
            throw null;
        }
    }
}
