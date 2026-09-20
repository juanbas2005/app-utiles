package defpackage;

import dev.whyoleg.cryptography.bigint.BigInt;
import java.math.BigInteger;

/* renamed from: m80  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m80 implements zr3 {
    public static final m80 a = new Object();
    public static final po5 b = b85.b("BigInt");

    public final Object deserialize(ok1 ok1) {
        String t = ok1.t();
        t.getClass();
        return new BigInt(new BigInteger(t));
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        BigInt bigInt = (BigInt) obj;
        bigInt.getClass();
        j42.D(bigInt.toString());
    }
}
