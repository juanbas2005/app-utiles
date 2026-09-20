package defpackage;

/* renamed from: ew1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ew1 {
    public final dw1 a;

    static {
        new ew1(0, 0, "");
    }

    public ew1(int i, int i2, String str) {
        this.a = new dw1(i, i2, str);
    }

    public static ew1 a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String str;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder p = pb4.p("M0,", i8, " A", i7, ",");
            p.append(i8);
            p.append(" 0 1,1 ");
            p.append(i);
            p.append(",");
            p.append(i8);
            p.append(" A");
            p.append(i7);
            p.append(",");
            p.append(i8);
            p.append(" 0 1,1 0,");
            p.append(i8);
            p.append(" Z");
            str = p.toString();
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int min = Math.min(i / 2, i2 / 2);
            int min2 = Math.min(min, i3);
            int min3 = Math.min(min, i4);
            int min4 = Math.min(min, i5);
            int min5 = Math.min(min, i6);
            sb.append(min2);
            sb.append(",0 L ");
            sb.append(i - min3);
            sb.append(",0");
            if (min3 > 0) {
                sb.append(" A ");
                sb.append(min3);
                sb.append(",");
                sb.append(min3);
                sb.append(" 0 0,1 ");
                sb.append(i);
                sb.append(",");
                sb.append(min3);
            }
            sb.append(" L ");
            sb.append(i);
            sb.append(",");
            sb.append(i2 - min4);
            if (min4 > 0) {
                sb.append(" A ");
                sb.append(min4);
                sb.append(",");
                sb.append(min4);
                sb.append(" 0 0,1 ");
                sb.append(i - min4);
                sb.append(",");
                sb.append(i2);
            }
            sb.append(" L ");
            sb.append(min5);
            sb.append(",");
            sb.append(i2);
            if (min5 > 0) {
                sb.append(" A ");
                sb.append(min5);
                sb.append(",");
                sb.append(min5);
                sb.append(" 0 0,1 0,");
                sb.append(i2 - min5);
            }
            if (min2 > 0) {
                sb.append(" L 0,");
                sb.append(min2);
                sb.append(" A ");
                sb.append(min2);
                sb.append(",");
                sb.append(min2);
                sb.append(" 0 0,1 ");
                sb.append(min2);
                sb.append(",0");
            }
            sb.append(" Z");
            str = sb.toString();
        }
        return new ew1(i, i2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew1)) {
            return false;
        }
        return this.a.equals(((ew1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
