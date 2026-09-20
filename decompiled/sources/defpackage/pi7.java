package defpackage;

import java.time.ZoneId;
import kotlinx.datetime.UtcOffset;

/* renamed from: pi7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class pi7 {
    public static final /* synthetic */ int b = 0;
    public final ZoneId a;

    static {
        UtcOffset.Companion.getClass();
        UtcOffset access$getZERO$cp = UtcOffset.ZERO;
        ZoneId m = ZoneId.of("UTC");
        m.getClass();
        new hg2(access$getZERO$cp, m);
    }

    public pi7(ZoneId zoneId) {
        zoneId.getClass();
        this.a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi7) || !sg3.e(this.a, ((pi7) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String m = this.a.toString();
        m.getClass();
        return m;
    }
}
