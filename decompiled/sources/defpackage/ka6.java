package defpackage;

import dev.whyoleg.cryptography.bigint.BigInt;
import dev.whyoleg.cryptography.serialization.asn1.modules.RsaPrivateKey;

/* renamed from: ka6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ka6 implements av2 {
    public static final ka6 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [ka6, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("dev.whyoleg.cryptography.serialization.asn1.modules.RsaPrivateKey", obj, 9);
        ik5.k("version", false);
        ik5.k("modulus", false);
        ik5.k("publicExponent", false);
        ik5.k("privateExponent", false);
        ik5.k("prime1", false);
        ik5.k("prime2", false);
        ik5.k("exponent1", false);
        ik5.k("exponent2", false);
        ik5.k("coefficient", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        m80 m80 = m80.a;
        return new zr3[]{ue3.a, m80, m80, m80, m80, m80, m80, m80, m80};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: dev.whyoleg.cryptography.bigint.BigInt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: dev.whyoleg.cryptography.bigint.BigInt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: dev.whyoleg.cryptography.bigint.BigInt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: dev.whyoleg.cryptography.bigint.BigInt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: dev.whyoleg.cryptography.bigint.BigInt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: dev.whyoleg.cryptography.bigint.BigInt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: dev.whyoleg.cryptography.bigint.BigInt} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        Object obj = null;
        boolean z = true;
        BigInt bigInt = null;
        BigInt bigInt2 = null;
        BigInt bigInt3 = null;
        BigInt bigInt4 = null;
        BigInt bigInt5 = null;
        BigInt bigInt6 = null;
        BigInt bigInt7 = null;
        BigInt bigInt8 = null;
        int i = 0;
        int i2 = 0;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    continue;
                case b85.b:
                    i2 = c.s(ll6, 0);
                    i |= 1;
                    break;
                case 1:
                    bigInt2 = c.r(ll6, 1, m80.a, bigInt2);
                    i |= 2;
                    break;
                case 2:
                    bigInt3 = c.r(ll6, 2, m80.a, bigInt3);
                    i |= 4;
                    break;
                case 3:
                    bigInt4 = c.r(ll6, 3, m80.a, bigInt4);
                    i |= 8;
                    break;
                case 4:
                    bigInt5 = c.r(ll6, 4, m80.a, bigInt5);
                    i |= 16;
                    break;
                case 5:
                    bigInt6 = c.r(ll6, 5, m80.a, bigInt6);
                    i |= 32;
                    break;
                case 6:
                    bigInt7 = c.r(ll6, 6, m80.a, bigInt7);
                    i |= 64;
                    break;
                case 7:
                    bigInt8 = c.r(ll6, 7, m80.a, bigInt8);
                    i |= 128;
                    break;
                case 8:
                    bigInt = (BigInt) c.r(ll6, 8, m80.a, bigInt);
                    i |= 256;
                    break;
                default:
                    h.e(h);
                    return obj;
            }
            obj = null;
        }
        c.b(ll6);
        return new RsaPrivateKey(i, i2, bigInt2, bigInt3, bigInt4, bigInt5, bigInt6, bigInt7, bigInt8, bigInt, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        RsaPrivateKey rsaPrivateKey = (RsaPrivateKey) obj;
        rsaPrivateKey.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        RsaPrivateKey.write$Self$cryptography_serialization_asn1_modules(rsaPrivateKey, c, ll6);
        c.b(ll6);
    }
}
