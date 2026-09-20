package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: zt7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class zt7 {
    public static final Set a;
    public static final HashMap b = new HashMap();
    public static final HashMap c = new HashMap();
    public static final LinkedHashSet d;

    static {
        yt7[] values = yt7.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (yt7 yt7 : values) {
            arrayList.add(yt7.x);
        }
        a = dt0.g1(arrayList);
        ut7[] values2 = ut7.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (ut7 ut7 : values2) {
            arrayList2.add(ut7.w);
        }
        dt0.g1(arrayList2);
        sf4.Y(new HashMap(tf4.F(4)), new yb5[]{new yb5(ut7.UBYTEARRAY, uq4.e("ubyteArrayOf")), new yb5(ut7.USHORTARRAY, uq4.e("ushortArrayOf")), new yb5(ut7.UINTARRAY, uq4.e("uintArrayOf")), new yb5(ut7.ULONGARRAY, uq4.e("ulongArrayOf"))});
        yt7[] values3 = yt7.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (yt7 yt72 : values3) {
            linkedHashSet.add(yt72.y.f());
        }
        d = linkedHashSet;
        for (yt7 yt73 : yt7.values()) {
            HashMap hashMap = b;
            gq0 gq0 = yt73.y;
            gq0 gq02 = yt73.w;
            hashMap.put(gq0, gq02);
            c.put(gq02, yt73.y);
        }
    }

    public static final boolean a(vw3 vw3) {
        vq0 u;
        if (iq7.l(vw3) || (u = vw3.L().u()) == null) {
            return false;
        }
        vj1 r = u.r();
        if (!(r instanceof x95) || !sg3.e(((y95) ((x95) r)).A, n27.k) || !a.contains(u.getName())) {
            return false;
        }
        return true;
    }
}
