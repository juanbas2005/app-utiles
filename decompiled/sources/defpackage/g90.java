package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.BitArray;

/* renamed from: g90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class g90 implements av2 {
    public static final g90 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, av2, g90] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("dev.whyoleg.cryptography.serialization.asn1.BitArray", obj, 2);
        ik5.k("unusedBits", false);
        ik5.k("byteArray", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{ue3.a, oe0.c};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        byte[] bArr = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                i2 = c.s(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                bArr = (byte[]) c.r(ll6, 1, oe0.c, bArr);
                i |= 2;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new BitArray(i, i2, bArr, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        BitArray bitArray = (BitArray) obj;
        bitArray.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        BitArray.write$Self$cryptography_serialization_asn1(bitArray, c, ll6);
        c.b(ll6);
    }
}
