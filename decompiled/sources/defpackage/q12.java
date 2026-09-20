package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.BitArray;
import dev.whyoleg.cryptography.serialization.asn1.modules.EcParameters;
import dev.whyoleg.cryptography.serialization.asn1.modules.EcPrivateKey;

/* renamed from: q12  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class q12 implements av2 {
    public static final q12 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [q12, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("dev.whyoleg.cryptography.serialization.asn1.modules.EcPrivateKey", obj, 4);
        ik5.k("version", false);
        ik5.k("privateKey", false);
        ik5.k("parameters", true);
        ik5.l(new p12((byte) 0));
        ik5.k("publicKey", true);
        ik5.l(new p12((byte) 1));
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{ue3.a, oe0.c, hj8.x(l12.a), hj8.x(g90.a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: dev.whyoleg.cryptography.serialization.asn1.BitArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        EcParameters ecParameters;
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        byte[] bArr = null;
        String str = null;
        BitArray bitArray = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                i2 = c.s(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                bArr = c.r(ll6, 1, oe0.c, bArr);
                i |= 2;
            } else if (h == 2) {
                l12 l12 = l12.a;
                if (str != null) {
                    ecParameters = EcParameters.m27boximpl(str);
                } else {
                    ecParameters = null;
                }
                EcParameters ecParameters2 = (EcParameters) c.x(ll6, 2, l12, ecParameters);
                if (ecParameters2 != null) {
                    str = ecParameters2.m34unboximpl();
                } else {
                    str = null;
                }
                i |= 4;
            } else if (h == 3) {
                bitArray = c.x(ll6, 3, g90.a, bitArray);
                i |= 8;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new EcPrivateKey(i, i2, bArr, str, bitArray, (rl6) null, (hl1) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        EcPrivateKey ecPrivateKey = (EcPrivateKey) obj;
        ecPrivateKey.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        EcPrivateKey.write$Self$cryptography_serialization_asn1_modules(ecPrivateKey, c, ll6);
        c.b(ll6);
    }
}
