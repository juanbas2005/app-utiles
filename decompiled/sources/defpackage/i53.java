package defpackage;

import java.util.List;

/* renamed from: i53  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i53 {
    public static final i53 b;
    public static final i53 c;
    public static final i53 d;
    public static final i53 e;
    public static final i53 f;
    public static final i53 g;
    public static final i53 h;
    public static final i53 i = new i53("TRACE");
    public static final List j;
    public final String a;

    static {
        i53 i53 = new i53("GET");
        b = i53;
        i53 i532 = new i53("POST");
        c = i532;
        i53 i533 = new i53("PUT");
        d = i533;
        i53 i534 = new i53("PATCH");
        e = i534;
        i53 i535 = new i53("DELETE");
        f = i535;
        i53 i536 = new i53("HEAD");
        g = i536;
        i53 i537 = new i53("OPTIONS");
        h = i537;
        j = sg3.E(i53, i532, i533, i534, i535, i536, i537);
    }

    public i53(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i53) && this.a.equals(((i53) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
