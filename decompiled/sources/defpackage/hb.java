package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.ObjectIdentifier;
import dev.whyoleg.cryptography.serialization.asn1.modules.AlgorithmIdentifier;
import java.util.LinkedHashMap;

/* renamed from: hb  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class hb implements zr3 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final nl6 c = b85.f("AlgorithmIdentifier", yk5.l, new ll6[0], new j5(3));

    public static final void a(bl1 bl1, String str, gq3 gq3, AlgorithmIdentifier algorithmIdentifier, boolean z) {
        zr3 zr3;
        str.getClass();
        gq3.getClass();
        if (z) {
            zr3 = y05.a;
        } else {
            zr3 = z.a;
        }
        bl1.b(str, gq3, zr3, new b0(6, algorithmIdentifier));
    }

    public final void b(String str, gq3 gq3, zr3 zr3, vr2 vr2) {
        str.getClass();
        gq3.getClass();
        mp7.Q(1, vr2);
        gb gbVar = new gb(zr3, vr2);
        this.a.put(gq3, gbVar);
        this.b.put(ObjectIdentifier.m19boximpl(str), gbVar);
    }

    public final Object deserialize(ok1 ok1) {
        nl6 nl6 = this.c;
        gy0 c2 = ok1.c(nl6);
        Object obj = null;
        if (c2.h(nl6) == 0) {
            String r1 = ((ObjectIdentifier) c2.r(nl6, 0, ObjectIdentifier.Companion.serializer(), (Object) null)).m25unboximpl();
            gb gbVar = (gb) this.b.get(ObjectIdentifier.m19boximpl(r1));
            if (gbVar != null) {
                int h = c2.h(nl6);
                if (h != -1) {
                    if (h == 1) {
                        Object x = c2.x(nl6, 1, gbVar.a, (Object) null);
                        if (c2.h(nl6) == -1) {
                            obj = x;
                        } else {
                            h.s("Check failed.");
                            return null;
                        }
                    } else {
                        ku4.c(h, "Unexpected element index: ");
                        return null;
                    }
                }
                AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) gbVar.b.y(obj);
                c2.b(nl6);
                return algorithmIdentifier;
            }
            ku4.x("Unknown algorithm: ", ObjectIdentifier.m24toStringimpl(r1));
            return null;
        }
        h.s("Check failed.");
        return null;
    }

    public final ll6 getDescriptor() {
        return this.c;
    }

    public final void serialize(j42 j42, Object obj) {
        zr3 zr3;
        AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) obj;
        algorithmIdentifier.getClass();
        nl6 nl6 = this.c;
        hy0 c2 = j42.c(nl6);
        c2.o(nl6, 0, ObjectIdentifier.Companion.serializer(), ObjectIdentifier.m19boximpl(algorithmIdentifier.m26getAlgorithmSTa95mE()));
        Class<?> cls = algorithmIdentifier.getClass();
        c26 c26 = b26.a;
        gb gbVar = (gb) this.a.get(c26.b(cls));
        zr3 zr32 = null;
        if (gbVar != null) {
            zr3 = gbVar.a;
        } else {
            zr3 = null;
        }
        if (zr3 instanceof zr3) {
            zr32 = zr3;
        }
        if (zr32 != null) {
            c2.A(nl6, 1, zr32, algorithmIdentifier.getParameters());
            c2.b(nl6);
            return;
        }
        ku4.x("No serializer for ", c26.b(algorithmIdentifier.getClass()));
    }
}
