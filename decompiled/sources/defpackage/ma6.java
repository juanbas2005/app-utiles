package defpackage;

import dev.whyoleg.cryptography.bigint.BigInt;
import dev.whyoleg.cryptography.serialization.asn1.modules.RsaPublicKey;

/* renamed from: ma6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ma6 implements av2 {
    public static final ma6 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [ma6, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("dev.whyoleg.cryptography.serialization.asn1.modules.RsaPublicKey", obj, 2);
        ik5.k("modulus", false);
        ik5.k("publicExponent", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        m80 m80 = m80.a;
        return new zr3[]{m80, m80};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        BigInt bigInt = null;
        BigInt bigInt2 = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                bigInt = (BigInt) c.r(ll6, 0, m80.a, bigInt);
                i |= 1;
            } else if (h == 1) {
                bigInt2 = (BigInt) c.r(ll6, 1, m80.a, bigInt2);
                i |= 2;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new RsaPublicKey(i, bigInt, bigInt2, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        RsaPublicKey rsaPublicKey = (RsaPublicKey) obj;
        rsaPublicKey.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        RsaPublicKey.write$Self$cryptography_serialization_asn1_modules(rsaPublicKey, c, ll6);
        c.b(ll6);
    }
}
