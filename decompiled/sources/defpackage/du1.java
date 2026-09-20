package defpackage;

import dev.whyoleg.cryptography.bigint.BigInt;
import dev.whyoleg.cryptography.serialization.asn1.modules.DhParameters;

/* renamed from: du1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class du1 implements av2 {
    public static final du1 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [du1, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("dev.whyoleg.cryptography.serialization.asn1.modules.DhParameters", obj, 3);
        ik5.k("prime", false);
        ik5.k("base", false);
        ik5.k("privateValueLength", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        zr3 x = hj8.x(ue3.a);
        m80 m80 = m80.a;
        return new zr3[]{m80, m80, x};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: dev.whyoleg.cryptography.bigint.BigInt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: dev.whyoleg.cryptography.bigint.BigInt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        BigInt bigInt = null;
        BigInt bigInt2 = null;
        Integer num = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                bigInt = c.r(ll6, 0, m80.a, bigInt);
                i |= 1;
            } else if (h == 1) {
                bigInt2 = c.r(ll6, 1, m80.a, bigInt2);
                i |= 2;
            } else if (h == 2) {
                num = c.x(ll6, 2, ue3.a, num);
                i |= 4;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new DhParameters(i, bigInt, bigInt2, num, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        DhParameters dhParameters = (DhParameters) obj;
        dhParameters.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        DhParameters.write$Self$cryptography_serialization_asn1_modules(dhParameters, c, ll6);
        c.b(ll6);
    }
}
