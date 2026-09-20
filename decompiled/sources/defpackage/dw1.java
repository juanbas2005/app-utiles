package defpackage;

import java.util.Objects;

/* renamed from: dw1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dw1 {
    public final String a;
    public final int b;
    public final int c;

    public dw1(int i, int i2, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw1)) {
            return false;
        }
        dw1 dw1 = (dw1) obj;
        if (this.a.equals(dw1.a) && this.b == dw1.b && this.c == dw1.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(this.c);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(new Object[]{this.a, valueOf, valueOf2, valueOf3, 0, null, null, valueOf3});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.a.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.b);
        sb.append(" displayHeight=");
        return hl6.n(sb, this.c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
    }
}
