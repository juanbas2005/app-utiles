package defpackage;

/* renamed from: m  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class m extends f1 {
    public final void s(int i, StringBuilder sb) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        t(sb, i, length);
    }

    public final void t(StringBuilder sb, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            int C = wr0.C((i4 * 10) + i, 10, (i90) ((wr0) this.b).x);
            if (C / 100 == 0) {
                sb.append('0');
            }
            if (C / 10 == 0) {
                sb.append('0');
            }
            sb.append(C);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 13; i6++) {
            int charAt = sb.charAt(i6 + i2) - '0';
            if ((i6 & 1) == 0) {
                charAt *= 3;
            }
            i5 += charAt;
        }
        int i7 = 10 - (i5 % 10);
        if (i7 != 10) {
            i3 = i7;
        }
        sb.append(i3);
    }
}
