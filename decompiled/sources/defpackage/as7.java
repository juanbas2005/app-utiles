package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: as7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class as7 implements Serializable {
    public static final as7 y;
    public static final LinkedHashMap z;
    public final String w;
    public final int x;

    static {
        as7 as7 = new as7("http", 80);
        y = as7;
        List E = sg3.E(as7, new as7("https", 443), new as7("ws", 80), new as7("wss", 443), new as7("socks", 1080));
        int F = tf4.F(et0.e0(E, 10));
        if (F < 16) {
            F = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F);
        for (Object next : E) {
            linkedHashMap.put(((as7) next).w, next);
        }
        z = linkedHashMap;
    }

    public as7(String str, int i) {
        this.w = str;
        this.x = i;
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if (Character.toLowerCase(charAt) == charAt) {
                i2++;
            } else {
                h.q("All characters should be lower case");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as7)) {
            return false;
        }
        as7 as7 = (as7) obj;
        if (this.w.equals(as7.w) && this.x == as7.x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.x) + (this.w.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.w);
        sb.append(", defaultPort=");
        return f21.j(sb, this.x, ')');
    }
}
