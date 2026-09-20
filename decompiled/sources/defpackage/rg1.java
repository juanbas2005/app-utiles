package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: rg1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rg1 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final String a(Long l, Locale locale, boolean z) {
        String str;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        if (z) {
            str = "yMMMMEEEEd";
        } else {
            str = "yMMMd";
        }
        return rg3.s(longValue, str, locale, this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rg1)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 436998964;
    }
}
