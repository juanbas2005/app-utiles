package defpackage;

import java.util.Arrays;

/* renamed from: ci8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ci8 implements ym {
    public static final ci8 y;
    public final boolean w;
    public final String x;

    static {
        k68 k68 = new k68(10, false);
        k68.x = Boolean.FALSE;
        y = new ci8(k68);
    }

    public ci8(k68 k68) {
        this.w = ((Boolean) k68.x).booleanValue();
        this.x = (String) k68.y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ci8)) {
            return false;
        }
        ci8 ci8 = (ci8) obj;
        if (!b35.j((Object) null, (Object) null) || this.w != ci8.w || !b35.j(this.x, ci8.x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.w), this.x});
    }
}
