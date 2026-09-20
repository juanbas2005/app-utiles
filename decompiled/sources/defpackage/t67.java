package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.BitArray;
import dev.whyoleg.cryptography.serialization.asn1.modules.AlgorithmIdentifier;
import dev.whyoleg.cryptography.serialization.asn1.modules.SubjectPublicKeyInfo;

/* renamed from: t67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class t67 implements av2 {
    public static final t67 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [t67, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("dev.whyoleg.cryptography.serialization.asn1.modules.SubjectPublicKeyInfo", obj, 2);
        ik5.k("algorithm", false);
        ik5.k("subjectPublicKey", false);
        descriptor = ik5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        return new zr3[]{SubjectPublicKeyInfo.$childSerializers[0].getValue(), g90.a};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = SubjectPublicKeyInfo.$childSerializers;
        boolean z = true;
        int i = 0;
        AlgorithmIdentifier algorithmIdentifier = null;
        BitArray bitArray = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                algorithmIdentifier = (AlgorithmIdentifier) c.r(ll6, 0, (zr3) access$get$childSerializers$cp[0].getValue(), algorithmIdentifier);
                i |= 1;
            } else if (h == 1) {
                bitArray = (BitArray) c.r(ll6, 1, g90.a, bitArray);
                i |= 2;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new SubjectPublicKeyInfo(i, algorithmIdentifier, bitArray, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        SubjectPublicKeyInfo subjectPublicKeyInfo = (SubjectPublicKeyInfo) obj;
        subjectPublicKeyInfo.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        SubjectPublicKeyInfo.write$Self$cryptography_serialization_asn1_modules(subjectPublicKeyInfo, c, ll6);
        c.b(ll6);
    }
}
