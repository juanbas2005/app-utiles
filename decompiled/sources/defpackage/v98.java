package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: v98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v98 implements Comparable {
    public static final Set x = qs.r1(new v98[]{new v98(0), new v98(1), new v98(2)});
    public static final List y;
    public final int w;

    static {
        List E = sg3.E(new v98(2), new v98(1), new v98(0));
        y = E;
        dt0.g1(E);
    }

    public /* synthetic */ v98(int i) {
        this.w = i;
    }

    public final int compareTo(Object obj) {
        return lx1.a(u55.c(this.w), u55.c(((v98) obj).w));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof v98) && this.w == ((v98) obj).w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.w);
    }

    public final String toString() {
        String str;
        int i = this.w;
        if (i == 0) {
            str = "Compact";
        } else if (i == 1) {
            str = "Medium";
        } else if (i == 2) {
            str = "Expanded";
        } else {
            str = "";
        }
        return "WindowHeightSizeClass.".concat(str);
    }
}
