package defpackage;

import com.wireguard.config.ParseException;
import java.net.Inet4Address;
import java.net.InetAddress;

/* renamed from: hb3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hb3 {
    public final InetAddress a;
    public final int b;

    public hb3(InetAddress inetAddress, int i) {
        this.a = inetAddress;
        this.b = i;
    }

    public static hb3 a(String str) {
        int i;
        String str2;
        int i2;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf >= 0) {
            str2 = str.substring(lastIndexOf + 1);
            try {
                i = Integer.parseInt(str2, 10);
                str = str.substring(0, lastIndexOf);
            } catch (NumberFormatException unused) {
                throw new ParseException(Integer.class, str2, (String) null, (Exception) null);
            }
        } else {
            str2 = "";
            i = -1;
        }
        InetAddress a2 = eb3.a(str);
        if (a2 instanceof Inet4Address) {
            i2 = 32;
        } else {
            i2 = 128;
        }
        if (i <= i2) {
            if (i < 0) {
                i = i2;
            }
            return new hb3(a2, i);
        }
        throw new ParseException(hb3.class, str2, "Invalid network mask", (Exception) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hb3)) {
            return false;
        }
        hb3 hb3 = (hb3) obj;
        if (!this.a.equals(hb3.a) || this.b != hb3.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b ^ this.a.hashCode();
    }

    public final String toString() {
        return this.a.getHostAddress() + '/' + this.b;
    }
}
