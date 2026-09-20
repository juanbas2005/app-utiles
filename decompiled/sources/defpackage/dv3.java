package defpackage;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

/* renamed from: dv3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dv3 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ fv3 x;

    public /* synthetic */ dv3(fv3 fv3, int i) {
        this.w = i;
        this.x = fv3;
    }

    public final Object b() {
        int i = this.w;
        fv3 fv3 = this.x;
        switch (i) {
            case b85.b:
                return Arrays.asList(new v34[]{fv3.l().k0(n27.k), fv3.l().k0(n27.m), fv3.l().k0(n27.n), fv3.l().k0(n27.l)});
            default:
                EnumMap enumMap = new EnumMap(ro5.class);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                ro5[] values = ro5.values();
                int length = values.length;
                int i2 = 0;
                while (i2 < length) {
                    ro5 ro5 = values[i2];
                    String b = ro5.w.b();
                    if (b != null) {
                        fu6 g0 = fv3.k(b).g0();
                        if (g0 != null) {
                            String b2 = ro5.x.b();
                            if (b2 != null) {
                                fu6 g02 = fv3.k(b2).g0();
                                if (g02 != null) {
                                    enumMap.put(ro5, g02);
                                    hashMap.put(g0, g02);
                                    hashMap2.put(g02, g0);
                                    i2++;
                                } else {
                                    fv3.a(48);
                                    throw null;
                                }
                            } else {
                                fv3.a(47);
                                throw null;
                            }
                        } else {
                            fv3.a(48);
                            throw null;
                        }
                    } else {
                        fv3.a(47);
                        throw null;
                    }
                }
                return new ev3(enumMap, hashMap, hashMap2);
        }
    }
}
