package defpackage;

import com.wireguard.config.ParseException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.regex.Pattern;

/* renamed from: gb3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gb3 {
    public static final Pattern g = Pattern.compile("^[^\\[\\]]*:[^\\[\\]]*");
    public static final Pattern h = Pattern.compile("[/?#]");
    public final String a;
    public final boolean b;
    public final Object c = new Object();
    public final int d;
    public Instant e = Instant.EPOCH;
    public gb3 f;

    public gb3(int i, String str, boolean z) {
        this.a = str;
        this.b = z;
        this.d = i;
    }

    public static gb3 b(String str) {
        Class<gb3> cls = gb3.class;
        if (!h.matcher(str).find()) {
            try {
                URI uri = new URI("wg://" + str);
                if (uri.getPort() < 0 || uri.getPort() > 65535) {
                    throw new ParseException(cls, str, "Missing/invalid port number", (Exception) null);
                }
                try {
                    eb3.a(uri.getHost());
                    return new gb3(uri.getPort(), uri.getHost(), true);
                } catch (ParseException unused) {
                    return new gb3(uri.getPort(), uri.getHost(), false);
                }
            } catch (URISyntaxException e2) {
                throw new ParseException(cls, str, (String) null, e2);
            }
        } else {
            throw new ParseException(cls, str, "Forbidden characters", (Exception) null);
        }
    }

    public final Optional a() {
        Optional ofNullable;
        if (this.b) {
            return Optional.of(this);
        }
        synchronized (this.c) {
            try {
                if (Duration.between(this.e, Instant.now()).toMinutes() > 1) {
                    InetAddress[] allByName = InetAddress.getAllByName(this.a);
                    int i = 0;
                    InetAddress inetAddress = allByName[0];
                    int length = allByName.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        InetAddress inetAddress2 = allByName[i];
                        if (inetAddress2 instanceof Inet4Address) {
                            inetAddress = inetAddress2;
                            break;
                        }
                        i++;
                    }
                    this.f = new gb3(this.d, inetAddress.getHostAddress(), true);
                    this.e = Instant.now();
                }
            } catch (UnknownHostException unused) {
                this.f = null;
            } catch (Throwable th) {
                throw th;
            }
            ofNullable = Optional.ofNullable(this.f);
        }
        return ofNullable;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gb3)) {
            return false;
        }
        gb3 gb3 = (gb3) obj;
        if (!this.a.equals(gb3.a) || this.d != gb3.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d ^ this.a.hashCode();
    }

    public final String toString() {
        boolean z;
        boolean z2 = this.b;
        String str = this.a;
        if (!z2 || !g.matcher(str).matches()) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str = pb4.h(']', "[", str);
        }
        sb.append(str);
        sb.append(':');
        sb.append(this.d);
        return sb.toString();
    }
}
