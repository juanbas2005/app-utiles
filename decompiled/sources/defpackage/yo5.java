package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.BitArray;
import dev.whyoleg.cryptography.serialization.asn1.modules.AlgorithmIdentifier;
import dev.whyoleg.cryptography.serialization.asn1.modules.PrivateKeyInfo;

/* renamed from: yo5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yo5 implements av2 {
    public static final yo5 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, av2, yo5] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.annotation.Annotation, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("dev.whyoleg.cryptography.serialization.asn1.modules.PrivateKeyInfo", obj, 4);
        ik5.k("version", false);
        ik5.k("privateKeyAlgorithm", false);
        ik5.k("privateKey", false);
        ik5.k("publicKey", true);
        ik5.l(new Object());
        descriptor = ik5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        return new zr3[]{ue3.a, PrivateKeyInfo.$childSerializers[1].getValue(), oe0.c, hj8.x(g90.a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: dev.whyoleg.cryptography.serialization.asn1.modules.AlgorithmIdentifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: dev.whyoleg.cryptography.serialization.asn1.BitArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = PrivateKeyInfo.$childSerializers;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        AlgorithmIdentifier algorithmIdentifier = null;
        byte[] bArr = null;
        BitArray bitArray = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                i2 = c.s(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                algorithmIdentifier = c.r(ll6, 1, (zr3) access$get$childSerializers$cp[1].getValue(), algorithmIdentifier);
                i |= 2;
            } else if (h == 2) {
                bArr = c.r(ll6, 2, oe0.c, bArr);
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
        return new PrivateKeyInfo(i, i2, algorithmIdentifier, bArr, bitArray, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) obj;
        privateKeyInfo.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        PrivateKeyInfo.write$Self$cryptography_serialization_asn1_modules(privateKeyInfo, c, ll6);
        c.b(ll6);
    }
}
