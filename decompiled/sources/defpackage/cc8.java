package defpackage;

import java.util.Set;

/* renamed from: cc8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cc8 {
    public final int a;
    public final int b;

    public cc8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cc8.class == obj.getClass()) {
            cc8 cc8 = (cc8) obj;
            int i = cc8.a;
            Set set = dc8.x;
            if (this.a == i) {
                int i2 = cc8.b;
                Set set2 = v98.x;
                if (this.b == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Set set = dc8.x;
        Set set2 = v98.x;
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        Set set = dc8.x;
        String str2 = "";
        int i = this.a;
        if (i == 0) {
            str = "Compact";
        } else if (i == 1) {
            str = "Medium";
        } else if (i == 2) {
            str = "Expanded";
        } else {
            str = str2;
        }
        String concat = "WindowWidthSizeClass.".concat(str);
        Set set2 = v98.x;
        int i2 = this.b;
        if (i2 == 0) {
            str2 = "Compact";
        } else if (i2 == 1) {
            str2 = "Medium";
        } else if (i2 == 2) {
            str2 = "Expanded";
        }
        return pb4.m("WindowSizeClass(", concat, ", ", "WindowHeightSizeClass.".concat(str2), ")");
    }
}
