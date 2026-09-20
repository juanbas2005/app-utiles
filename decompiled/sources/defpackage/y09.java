package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: y09  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y09 extends d19 {
    public final int w;
    public final ut8 x;

    public y09(ut8 ut8) {
        ut8.getClass();
        this.x = ut8;
        at7 n = ut8.entrySet().n();
        int i = 0;
        while (n.hasNext()) {
            Map.Entry entry = (Map.Entry) n.next();
            int b = ((d19) entry.getKey()).b();
            i = i < b ? b : i;
            int b2 = ((d19) entry.getValue()).b();
            if (i < b2) {
                i = b2;
            }
        }
        int i2 = i + 1;
        this.w = i2;
        if (i2 > 8) {
            throw new IOException("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    public final int a() {
        return d19.d((byte) -96);
    }

    public final int b() {
        return this.w;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        d19 d19 = (d19) obj;
        int a = d19.a();
        int d = d19.d((byte) -96);
        if (d != a) {
            return d - d19.a();
        }
        ut8 ut8 = ((y09) d19).x;
        ut8 ut82 = this.x;
        if (ut82.z.size() != ut8.z.size()) {
            return ut82.z.size() - ut8.z.size();
        }
        at7 n = ut82.entrySet().n();
        at7 n2 = ut8.entrySet().n();
        do {
            if (!n.hasNext() && !n2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) n.next();
            Map.Entry entry2 = (Map.Entry) n2.next();
            int compareTo2 = ((d19) entry.getKey()).compareTo((d19) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((d19) entry.getValue()).compareTo((d19) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y09.class == obj.getClass()) {
            return this.x.equals(((y09) obj).x);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d19.d((byte) -96)), this.x});
    }

    public final String toString() {
        ut8 ut8 = this.x;
        if (ut8.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        at7 n = ut8.entrySet().n();
        while (n.hasNext()) {
            Map.Entry entry = (Map.Entry) n.next();
            linkedHashMap.put(((d19) entry.getKey()).toString().replace("\n", "\n  "), ((d19) entry.getValue()).toString().replace("\n", "\n  "));
        }
        tz2 tz2 = new tz2(17);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            f55.y(sb, linkedHashMap.entrySet().iterator(), tz2);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
